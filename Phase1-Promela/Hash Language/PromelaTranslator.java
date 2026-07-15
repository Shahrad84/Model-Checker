import org.antlr.v4.runtime.tree.*;

public class PromelaTranslator extends HashBaseVisitor<String> {
    
    private String indent = "    ";
    private int loopCounter = 0;
    private String currentLoopLabel = "";
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
        if (ctx.ifStatement() != null) return visitIfStatement(ctx.ifStatement());
        if (ctx.whileLoop() != null) return visitWhileLoop(ctx.whileLoop());
        if (ctx.printStatement() != null) return visitPrintStatement(ctx.printStatement());
        if (ctx.edameStatement() != null) return visitEdameStatement(ctx.edameStatement());
        if (ctx.shekanStatement() != null) return visitShekanStatement(ctx.shekanStatement());
        return "";
    }
    
    // ===== 3. متغیرها =====
    @Override
    public String visitAssignment(HashParser.AssignmentContext ctx) {
        String name = ctx.IDENTIFIER().getText();
        String type = ctx.type().getText();
        String value = visitExpression(ctx.expression());
        
        if (type.equals("adad")) {
            return indent + "int " + name + " = " + value + ";\n";
        } else {
            if (value.equals("dorost")) value = "true";
            if (value.equals("ghalat")) value = "false";
            return indent + "bool " + name + " = " + value + ";\n";
        }
    }
    
    // ===== 4. شرط =====
    @Override
    public String visitIfStatement(HashParser.IfStatementContext ctx) {
        String cond = visitExpression(ctx.expression());
        
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
    
    // ===== 5. حلقه =====
    @Override
    public String visitWhileLoop(HashParser.WhileLoopContext ctx) {
        String cond = visitExpression(ctx.expression());
        String loopLabel = "loop_" + loopCounter++;
        currentLoopLabel = loopLabel;
        
        String body = "";
        for (HashParser.StatementContext stmt : ctx.statement()) {
            body += visitStatement(stmt);
        }
        
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
        
        currentLoopLabel = "";
        return result;
    }
    
    // ===== 6. edame =====
    @Override
    public String visitEdameStatement(HashParser.EdameStatementContext ctx) {
        if (!currentLoopLabel.isEmpty()) {
            return indent + "    goto " + currentLoopLabel + "\n";
        }
        return indent + "// ERROR: edame outside loop\n";
    }
    
    // ===== 7. shekan =====
    @Override
    public String visitShekanStatement(HashParser.ShekanStatementContext ctx) {
        if (!currentLoopLabel.isEmpty()) {
            return indent + "    break\n";
        }
        return indent + "// ERROR: shekan outside loop\n";
    }
    
    // ===== 8. print =====
    @Override
    public String visitPrintStatement(HashParser.PrintStatementContext ctx) {
        String expr = visitExpression(ctx.expression());
        return indent + "printf(\"%d\\n\", " + expr + ");\n";
    }
    
    // ===== 9. عبارت‌ها =====
    @Override
    public String visitExpression(HashParser.ExpressionContext ctx) {
        if (ctx.NUMBER() != null) {
            return ctx.NUMBER().getText();
        }
        if (ctx.IDENTIFIER() != null) {
            return ctx.IDENTIFIER().getText();
        }
        if (ctx.getChildCount() == 3) {
            String left = visitExpression(ctx.expression(0));
            String right = visitExpression(ctx.expression(1));
            String op = ctx.getChild(1).getText();
            return left + " " + op + " " + right;
        }
        if (ctx.getChildCount() == 3 && ctx.getChild(0).getText().equals("(")) {
            return "(" + visitExpression(ctx.expression(0)) + ")";
        }
        return "";
    }
}