import org.antlr.v4.runtime.tree.*;
import java.util.Stack;

public class PromelaTranslator extends HashBaseVisitor<String> {
    
    private String indent = "    ";
    private int loopCounter = 0;
    private Stack<String> loopStack = new Stack<>();  // برای مدیریت edame و shekan
    private StringBuilder output = new StringBuilder();
    
    // ===== 1. کل برنامه =====
    @Override
    public String visitProgram(HashParser.ProgramContext ctx) {
        output.append("init {\n");
        for (HashParser.StatementContext stmt : ctx.statement()) {
            String result = visitStatement(stmt);
            if (result != null && !result.isEmpty()) {
                output.append(result);
            }
        }
        output.append("}\n");
        return output.toString();
    }
    
    // ===== 2. توزیع دستورات =====
    public String visitStatement(HashParser.StatementContext ctx) {
        if (ctx.assignment() != null) return visitAssignment(ctx.assignment());
        if (ctx.reassignment() != null) return visitReassignment(ctx.reassignment());
        if (ctx.ifStatement() != null) return visitIfStatement(ctx.ifStatement());
        if (ctx.whileLoop() != null) return visitWhileLoop(ctx.whileLoop());
        if (ctx.printStatement() != null) return visitPrintStatement(ctx.printStatement());
        if (ctx.edameStatement() != null) return visitEdameStatement(ctx.edameStatement());
        if (ctx.shekanStatement() != null) return visitShekanStatement(ctx.shekanStatement());
        return "";
    }
    
    // ===== 3. تعریف متغیر =====
    @Override
    public String visitAssignment(HashParser.AssignmentContext ctx) {
        String name = ctx.IDENTIFIER().getText();
        String type = ctx.type().getText();
        String value = visitExpression(ctx.expression());
        
        // تبدیل dorost/ghalat به true/false
        if (value.equals("dorost")) value = "true";
        if (value.equals("ghalat")) value = "false";
        
        if (type.equals("adad")) {
            return indent + "int " + name + " = " + value + ";\n";
        } else {
            return indent + "bool " + name + " = " + value + ";\n";
        }
    }
    
    // ===== 4. مقداردهی مجدد =====
    @Override
    public String visitReassignment(HashParser.ReassignmentContext ctx) {
        String name = ctx.IDENTIFIER().getText();
        String value = visitExpression(ctx.expression());
        
        // تبدیل dorost/ghalat به true/false
        if (value.equals("dorost")) value = "true";
        if (value.equals("ghalat")) value = "false";
        
        return indent + name + " = " + value + ";\n";
    }
    
    // ===== 5. شرط =====
    @Override
    public String visitIfStatement(HashParser.IfStatementContext ctx) {
        String cond = visitExpression(ctx.expression());
        
        // بدنه‌ی شرط
        String thenBody = "";
        for (HashParser.StatementContext stmt : ctx.statement()) {
            thenBody += visitStatement(stmt);
        }
        
        String result = "";
        result += indent + "if\n";
        result += indent + ":: (" + cond + ") ->\n";
        
        if (!thenBody.isEmpty()) {
            String[] lines = thenBody.split("\n");
            for (String line : lines) {
                if (!line.trim().isEmpty()) {
                    result += indent + "    " + line.trim() + "\n";
                }
            }
        } else {
            result += indent + "    skip\n";
        }
        
        result += indent + ":: else ->\n";
        result += indent + "    skip\n";
        result += indent + "fi\n";
        
        return result;
    }
    
    // ===== 6. حلقه =====
    @Override
    public String visitWhileLoop(HashParser.WhileLoopContext ctx) {
        String cond = visitExpression(ctx.expression());
        String loopLabel = "loop_" + loopCounter++;
        
        // ثبت حلقه در استک
        loopStack.push(loopLabel);
        
        // بدنه‌ی حلقه
        String body = "";
        for (HashParser.StatementContext stmt : ctx.statement()) {
            body += visitStatement(stmt);
        }
        
        // خارج شدن از استک
        loopStack.pop();
        
        String result = "";
        result += indent + loopLabel + ":\n";
        result += indent + "do\n";
        result += indent + ":: (" + cond + ") ->\n";
        
        if (!body.isEmpty()) {
            String[] lines = body.split("\n");
            for (String line : lines) {
                if (!line.trim().isEmpty()) {
                    result += indent + "    " + line.trim() + "\n";
                }
            }
        }
        
        result += indent + "    goto " + loopLabel + "\n";
        result += indent + ":: else -> break\n";
        result += indent + "od\n";
        
        return result;
    }
    
    // ===== 7. edame (continue) =====
    @Override
    public String visitEdameStatement(HashParser.EdameStatementContext ctx) {
        if (loopStack.isEmpty()) {
            return indent + "// ERROR: edame outside loop\n";
        }
        return indent + "    goto " + loopStack.peek() + "\n";
    }
    
    // ===== 8. shekan (break) =====
    @Override
    public String visitShekanStatement(HashParser.ShekanStatementContext ctx) {
        if (loopStack.isEmpty()) {
            return indent + "// ERROR: shekan outside loop\n";
        }
        return indent + "    break\n";
    }
    
    // ===== 9. print =====
    @Override
    public String visitPrintStatement(HashParser.PrintStatementContext ctx) {
        String expr = visitExpression(ctx.expression());
        return indent + "printf(\"%d\\n\", " + expr + ");\n";
    }
    
    // ===== 10. عبارت‌ها =====
    @Override
    public String visitExpression(HashParser.ExpressionContext ctx) {
        // عدد
        if (ctx.NUMBER() != null) {
            return ctx.NUMBER().getText();
        }
        // متغیر
        if (ctx.IDENTIFIER() != null) {
            return ctx.IDENTIFIER().getText();
        }
        // عملگر دودویی (مثل x + y)
        if (ctx.getChildCount() == 3) {
            String left = visitExpression(ctx.expression(0));
            String right = visitExpression(ctx.expression(1));
            String op = ctx.getChild(1).getText();
            return left + " " + op + " " + right;
        }
        // پرانتز
        if (ctx.getChildCount() == 3 && ctx.getChild(0).getText().equals("(")) {
            return "(" + visitExpression(ctx.expression(0)) + ")";
        }
        return "";
    }
}