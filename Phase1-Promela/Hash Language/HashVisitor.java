// Generated from Hash.g4 by ANTLR 4.8
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link HashParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface HashVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link HashParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(HashParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link HashParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(HashParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link HashParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment(HashParser.AssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link HashParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(HashParser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link HashParser#ifStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStatement(HashParser.IfStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link HashParser#whileLoop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileLoop(HashParser.WhileLoopContext ctx);
	/**
	 * Visit a parse tree produced by {@link HashParser#edameStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEdameStatement(HashParser.EdameStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link HashParser#shekanStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShekanStatement(HashParser.ShekanStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link HashParser#printStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintStatement(HashParser.PrintStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link HashParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(HashParser.ExpressionContext ctx);
}