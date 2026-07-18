import java.util.Stack;

public class PromelaTranslator extends HashBaseVisitor<String> {

    // Simple string builders for code
    private StringBuilder globalVars = new StringBuilder();
    private StringBuilder bodyCode = new StringBuilder();
    
    // Indentation helper
    private String indent = "    ";
    private int indentLevel = 0;
    
    // Loop counters and tracking
    private int loopCounter = 0;
    private Stack<String> loopNames = new Stack<>();
    
    // Helper to add indentation
    private String getIndent() {
        String result = "";
        for (int i = 0; i < indentLevel; i++) {
            result += indent;
        }
        return result;
    }

    @Override
    public String visitProgram(HashParser.ProgramContext ctx) {
        // First, visit all statements and collect body code
        for (HashParser.StatementContext stmt : ctx.statement()) {
            bodyCode.append(visit(stmt));
        }
        
        // Build final output
        String output = "";
        output += globalVars.toString();
        output += "\n";
        output += "active proctype main() {\n";
        output += bodyCode.toString();
        output += "}\n";
        
        return output;
    }

    @Override
    public String visitStatement(HashParser.StatementContext ctx) {
        // Check what type of statement we have and handle it
        if (ctx.assignment() != null) {
            return visitAssignment(ctx.assignment());
        }
        if (ctx.reassignment() != null) {
            return visitReassignment(ctx.reassignment());
        }
        if (ctx.ifStatement() != null) {
            return visitIfStatement(ctx.ifStatement());
        }
        if (ctx.whileLoop() != null) {
            return visitWhileLoop(ctx.whileLoop());
        }
        if (ctx.printStatement() != null) {
            return visitPrintStatement(ctx.printStatement());
        }
        if (ctx.edameStatement() != null) {
            return visitEdameStatement(ctx.edameStatement());
        }
        if (ctx.shekanStatement() != null) {
            return visitShekanStatement(ctx.shekanStatement());
        }
        return "";
    }

    @Override
    public String visitAssignment(HashParser.AssignmentContext ctx) {
        // Get variable info
        String type = ctx.type().getText();
        String name = ctx.IDENTIFIER().getText();
        String value = visit(ctx.expression());
        
        // Convert Hash boolean words to Promela boolean words
        if (value.equals("dorost")) {
            value = "true";
        }
        if (value.equals("ghalat")) {
            value = "false";
        }
        
        // Add to global variables section
        if (type.equals("adad")) {
            globalVars.append("int " + name + " = " + value + ";\n");
        } else {
            globalVars.append("bool " + name + " = " + value + ";\n");
        }
        
        // Assignment doesn't generate code in the body
        return "";
    }

    @Override
    public String visitReassignment(HashParser.ReassignmentContext ctx) {
        String name = ctx.IDENTIFIER().getText();
        String value = visit(ctx.expression());
        
        // Convert boolean values
        if (value.equals("dorost")) {
            value = "true";
        }
        if (value.equals("ghalat")) {
            value = "false";
        }
        
        // Generate reassignment code with proper indentation
        return getIndent() + name + " = " + value + ";\n";
    }

    @Override
    public String visitIfStatement(HashParser.IfStatementContext ctx) {
        String result = "";
        String condition = visit(ctx.expression());
        
        // Start if statement
        result += getIndent() + "if\n";
        result += getIndent() + ":: (" + condition + ") ->\n";
        
        // Count how many statements are in the then branch
        int totalStmts = ctx.statement().size();
        int thenCount = totalStmts;
        
        // Check if there's an else branch
        boolean hasElse = (ctx.VAGARNA() != null);
        if (hasElse) {
            thenCount = totalStmts / 2;
        }
        
        // Process then branch statements
        indentLevel++;
        for (int i = 0; i < thenCount; i++) {
            result += visit(ctx.statement(i));
        }
        indentLevel--;
        
        // Process else branch
        result += getIndent() + ":: else ->\n";
        indentLevel++;
        if (hasElse) {
            // Process the rest of the statements (else branch)
            for (int i = thenCount; i < totalStmts; i++) {
                result += visit(ctx.statement(i));
            }
        } else {
            // No else branch, just skip
            result += getIndent() + "skip;\n";
        }
        indentLevel--;
        
        // End if statement
        result += getIndent() + "fi;\n";
        
        return result;
    }

    @Override
    public String visitWhileLoop(HashParser.WhileLoopContext ctx) {
        String result = "";
        String condition = visit(ctx.expression());
        
        // Create a unique name for this loop
        String loopName = "loop_" + loopCounter;
        loopCounter++;
        
        // Push loop name onto stack for edame/continue
        loopNames.push(loopName);
        
        // Generate loop code
        // The label MUST be before the do statement for edame to work
        result += getIndent() + loopName + "_start:\n";
        result += getIndent() + "do\n";
        result += getIndent() + ":: (" + condition + ") ->\n";
        
        // Process loop body with increased indent
        indentLevel++;
        for (HashParser.StatementContext stmt : ctx.statement()) {
            result += visit(stmt);
        }
        indentLevel--;
        
        // Add else branch to exit the loop
        result += getIndent() + ":: else -> break\n";
        result += getIndent() + "od;\n";
        
        // Remove loop name from stack
        loopNames.pop();
        
        return result;
    }

    @Override
    public String visitEdameStatement(HashParser.EdameStatementContext ctx) {
        // edame means "continue" - go to loop start
        if (loopNames.isEmpty()) {
            // This shouldn't happen if the code is correct
            throw new RuntimeException("Error: 'edame' used outside of a loop!");
        }
        
        // Get the current loop name from stack and generate goto
        String currentLoop = loopNames.peek();
        return getIndent() + "goto " + currentLoop + "_start;\n";
    }

    @Override
    public String visitShekanStatement(HashParser.ShekanStatementContext ctx) {
        // shekan means "break" - exit the loop
        if (loopNames.isEmpty()) {
            throw new RuntimeException("Error: 'shekan' used outside of a loop!");
        }
        
        // Just generate break statement
        return getIndent() + "break;\n";
    }

    @Override
    public String visitPrintStatement(HashParser.PrintStatementContext ctx) {
        String expr = visit(ctx.expression());
        return getIndent() + "printf(\"%d\\n\", " + expr + ");\n";
    }

    @Override
    public String visitExpression(HashParser.ExpressionContext ctx) {
        // Since expression just calls comparison, visit the comparison
        return visit(ctx.comparison());
    }

    // Helper method to convert expression to string
    private String exprToString(HashParser.ExpressionContext ctx) {
        if (ctx == null) return "";
        return visit(ctx);
    }

    @Override
    public String visitComparison(HashParser.ComparisonContext ctx) {
        // Get the first addition
        String result = visit(ctx.addition(0));
        
        // Process any comparisons (like a > b, x == 5, etc.)
        int numAdditions = ctx.addition().size();
        for (int i = 1; i < numAdditions; i++) {
            // Get the operator (LT, GT, LE, GE, EQ, NEQ)
            String op = "";
            // The operator is between addition i-1 and addition i
            // We need to find it in the children
            for (int j = 0; j < ctx.getChildCount(); j++) {
                String childText = ctx.getChild(j).getText();
                if (childText.equals("<") || childText.equals(">") || 
                    childText.equals("<=") || childText.equals(">=") ||
                    childText.equals("==") || childText.equals("!=")) {
                    if (j > 0 && j < ctx.getChildCount() - 1) {
                        op = childText;
                        break;
                    }
                }
            }
            String right = visit(ctx.addition(i));
            result = "(" + result + " " + op + " " + right + ")";
        }
        
        return result;
    }

    @Override
    public String visitAddition(HashParser.AdditionContext ctx) {
        // Get the first multiplication
        String result = visit(ctx.multiplication(0));
        
        // Process additions and subtractions
        int numMultiplications = ctx.multiplication().size();
        for (int i = 1; i < numMultiplications; i++) {
            // Find the operator (PLUS or MINUS)
            String op = "";
            for (int j = 0; j < ctx.getChildCount(); j++) {
                String childText = ctx.getChild(j).getText();
                if (childText.equals("+") || childText.equals("-")) {
                    if (j > 0 && j < ctx.getChildCount() - 1) {
                        op = childText;
                        break;
                    }
                }
            }
            String right = visit(ctx.multiplication(i));
            result = "(" + result + " " + op + " " + right + ")";
        }
        
        return result;
    }

    @Override
    public String visitMultiplication(HashParser.MultiplicationContext ctx) {
        // Get the first primary
        String result = visit(ctx.primary(0));
        
        // Process multiplications and divisions
        int numPrimaries = ctx.primary().size();
        for (int i = 1; i < numPrimaries; i++) {
            // Find the operator (MUL or DIV)
            String op = "";
            for (int j = 0; j < ctx.getChildCount(); j++) {
                String childText = ctx.getChild(j).getText();
                if (childText.equals("*") || childText.equals("/")) {
                    if (j > 0 && j < ctx.getChildCount() - 1) {
                        op = childText;
                        break;
                    }
                }
            }
            String right = visit(ctx.primary(i));
            result = "(" + result + " " + op + " " + right + ")";
        }
        
        return result;
    }

    @Override
    public String visitPrimary(HashParser.PrimaryContext ctx) {
        // Handle different primary types
        if (ctx.NUMBER() != null) {
            return ctx.NUMBER().getText();
        }
        if (ctx.TRUE() != null) {
            return "true";
        }
        if (ctx.FALSE() != null) {
            return "false";
        }
        if (ctx.IDENTIFIER() != null) {
            return ctx.IDENTIFIER().getText();
        }
        if (ctx.expression() != null) {
            return "(" + visit(ctx.expression()) + ")";
        }
        
        return ctx.getText();
    }
}