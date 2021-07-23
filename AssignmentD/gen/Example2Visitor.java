// Generated from Example2.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link Example2Parser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface Example2Visitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link Example2Parser#start2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStart2(Example2Parser.Start2Context ctx);
	/**
	 * Visit a parse tree produced by {@link Example2Parser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStat(Example2Parser.StatContext ctx);
	/**
	 * Visit a parse tree produced by {@link Example2Parser#main}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMain(Example2Parser.MainContext ctx);
	/**
	 * Visit a parse tree produced by {@link Example2Parser#functionDef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionDef(Example2Parser.FunctionDefContext ctx);
	/**
	 * Visit a parse tree produced by {@link Example2Parser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(Example2Parser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link Example2Parser#formalPars}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormalPars(Example2Parser.FormalParsContext ctx);
	/**
	 * Visit a parse tree produced by {@link Example2Parser#actualPars}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitActualPars(Example2Parser.ActualParsContext ctx);
	/**
	 * Visit a parse tree produced by {@link Example2Parser#loop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLoop(Example2Parser.LoopContext ctx);
	/**
	 * Visit a parse tree produced by {@link Example2Parser#ifStat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStat(Example2Parser.IfStatContext ctx);
	/**
	 * Visit a parse tree produced by {@link Example2Parser#thenBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitThenBlock(Example2Parser.ThenBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link Example2Parser#elseBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElseBlock(Example2Parser.ElseBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link Example2Parser#print}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrint(Example2Parser.PrintContext ctx);
	/**
	 * Visit a parse tree produced by {@link Example2Parser#assign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssign(Example2Parser.AssignContext ctx);
	/**
	 * Visit a parse tree produced by {@link Example2Parser#rtrn}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRtrn(Example2Parser.RtrnContext ctx);
	/**
	 * Visit a parse tree produced by {@link Example2Parser#funcCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncCall(Example2Parser.FuncCallContext ctx);
	/**
	 * Visit a parse tree produced by the {@code parens}
	 * labeled alternative in {@link Example2Parser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParens(Example2Parser.ParensContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MulDiv}
	 * labeled alternative in {@link Example2Parser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMulDiv(Example2Parser.MulDivContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AddSub}
	 * labeled alternative in {@link Example2Parser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddSub(Example2Parser.AddSubContext ctx);
	/**
	 * Visit a parse tree produced by the {@code false}
	 * labeled alternative in {@link Example2Parser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFalse(Example2Parser.FalseContext ctx);
	/**
	 * Visit a parse tree produced by the {@code orExpr}
	 * labeled alternative in {@link Example2Parser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrExpr(Example2Parser.OrExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code int}
	 * labeled alternative in {@link Example2Parser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInt(Example2Parser.IntContext ctx);
	/**
	 * Visit a parse tree produced by the {@code true}
	 * labeled alternative in {@link Example2Parser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTrue(Example2Parser.TrueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FunctionCall}
	 * labeled alternative in {@link Example2Parser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionCall(Example2Parser.FunctionCallContext ctx);
	/**
	 * Visit a parse tree produced by the {@code text}
	 * labeled alternative in {@link Example2Parser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitText(Example2Parser.TextContext ctx);
	/**
	 * Visit a parse tree produced by the {@code id}
	 * labeled alternative in {@link Example2Parser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitId(Example2Parser.IdContext ctx);
	/**
	 * Visit a parse tree produced by the {@code equalCheckExpr}
	 * labeled alternative in {@link Example2Parser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqualCheckExpr(Example2Parser.EqualCheckExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code compareExpr}
	 * labeled alternative in {@link Example2Parser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompareExpr(Example2Parser.CompareExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code andExpr}
	 * labeled alternative in {@link Example2Parser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAndExpr(Example2Parser.AndExprContext ctx);
}