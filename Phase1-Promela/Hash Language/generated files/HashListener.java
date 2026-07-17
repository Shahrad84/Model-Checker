// Generated from Hash.g4 by ANTLR 4.8
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link HashParser}.
 */
public interface HashListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link HashParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(HashParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link HashParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(HashParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link HashParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(HashParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link HashParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(HashParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link HashParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(HashParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link HashParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(HashParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link HashParser#reassignment}.
	 * @param ctx the parse tree
	 */
	void enterReassignment(HashParser.ReassignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link HashParser#reassignment}.
	 * @param ctx the parse tree
	 */
	void exitReassignment(HashParser.ReassignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link HashParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(HashParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link HashParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(HashParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link HashParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void enterIfStatement(HashParser.IfStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link HashParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void exitIfStatement(HashParser.IfStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link HashParser#whileLoop}.
	 * @param ctx the parse tree
	 */
	void enterWhileLoop(HashParser.WhileLoopContext ctx);
	/**
	 * Exit a parse tree produced by {@link HashParser#whileLoop}.
	 * @param ctx the parse tree
	 */
	void exitWhileLoop(HashParser.WhileLoopContext ctx);
	/**
	 * Enter a parse tree produced by {@link HashParser#edameStatement}.
	 * @param ctx the parse tree
	 */
	void enterEdameStatement(HashParser.EdameStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link HashParser#edameStatement}.
	 * @param ctx the parse tree
	 */
	void exitEdameStatement(HashParser.EdameStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link HashParser#shekanStatement}.
	 * @param ctx the parse tree
	 */
	void enterShekanStatement(HashParser.ShekanStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link HashParser#shekanStatement}.
	 * @param ctx the parse tree
	 */
	void exitShekanStatement(HashParser.ShekanStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link HashParser#printStatement}.
	 * @param ctx the parse tree
	 */
	void enterPrintStatement(HashParser.PrintStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link HashParser#printStatement}.
	 * @param ctx the parse tree
	 */
	void exitPrintStatement(HashParser.PrintStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link HashParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(HashParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link HashParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(HashParser.ExpressionContext ctx);
}