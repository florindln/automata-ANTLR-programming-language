// Generated from MyGrammar.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link MyGrammarParser}.
 */
public interface MyGrammarListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link MyGrammarParser#myStart}.
	 * @param ctx the parse tree
	 */
	void enterMyStart(MyGrammarParser.MyStartContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyGrammarParser#myStart}.
	 * @param ctx the parse tree
	 */
	void exitMyStart(MyGrammarParser.MyStartContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyGrammarParser#checkSatResponse}.
	 * @param ctx the parse tree
	 */
	void enterCheckSatResponse(MyGrammarParser.CheckSatResponseContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyGrammarParser#checkSatResponse}.
	 * @param ctx the parse tree
	 */
	void exitCheckSatResponse(MyGrammarParser.CheckSatResponseContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyGrammarParser#checkModelResponse}.
	 * @param ctx the parse tree
	 */
	void enterCheckModelResponse(MyGrammarParser.CheckModelResponseContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyGrammarParser#checkModelResponse}.
	 * @param ctx the parse tree
	 */
	void exitCheckModelResponse(MyGrammarParser.CheckModelResponseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code funcModResp}
	 * labeled alternative in {@link MyGrammarParser#modelResponse}.
	 * @param ctx the parse tree
	 */
	void enterFuncModResp(MyGrammarParser.FuncModRespContext ctx);
	/**
	 * Exit a parse tree produced by the {@code funcModResp}
	 * labeled alternative in {@link MyGrammarParser#modelResponse}.
	 * @param ctx the parse tree
	 */
	void exitFuncModResp(MyGrammarParser.FuncModRespContext ctx);
	/**
	 * Enter a parse tree produced by the {@code recFuncModResp}
	 * labeled alternative in {@link MyGrammarParser#modelResponse}.
	 * @param ctx the parse tree
	 */
	void enterRecFuncModResp(MyGrammarParser.RecFuncModRespContext ctx);
	/**
	 * Exit a parse tree produced by the {@code recFuncModResp}
	 * labeled alternative in {@link MyGrammarParser#modelResponse}.
	 * @param ctx the parse tree
	 */
	void exitRecFuncModResp(MyGrammarParser.RecFuncModRespContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyGrammarParser#functionDef}.
	 * @param ctx the parse tree
	 */
	void enterFunctionDef(MyGrammarParser.FunctionDefContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyGrammarParser#functionDef}.
	 * @param ctx the parse tree
	 */
	void exitFunctionDef(MyGrammarParser.FunctionDefContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyGrammarParser#fParams}.
	 * @param ctx the parse tree
	 */
	void enterFParams(MyGrammarParser.FParamsContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyGrammarParser#fParams}.
	 * @param ctx the parse tree
	 */
	void exitFParams(MyGrammarParser.FParamsContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyGrammarParser#fParam}.
	 * @param ctx the parse tree
	 */
	void enterFParam(MyGrammarParser.FParamContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyGrammarParser#fParam}.
	 * @param ctx the parse tree
	 */
	void exitFParam(MyGrammarParser.FParamContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyGrammarParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(MyGrammarParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyGrammarParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(MyGrammarParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyGrammarParser#fRetValue}.
	 * @param ctx the parse tree
	 */
	void enterFRetValue(MyGrammarParser.FRetValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyGrammarParser#fRetValue}.
	 * @param ctx the parse tree
	 */
	void exitFRetValue(MyGrammarParser.FRetValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyGrammarParser#fValues}.
	 * @param ctx the parse tree
	 */
	void enterFValues(MyGrammarParser.FValuesContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyGrammarParser#fValues}.
	 * @param ctx the parse tree
	 */
	void exitFValues(MyGrammarParser.FValuesContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyGrammarParser#value}.
	 * @param ctx the parse tree
	 */
	void enterValue(MyGrammarParser.ValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyGrammarParser#value}.
	 * @param ctx the parse tree
	 */
	void exitValue(MyGrammarParser.ValueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code geExpr}
	 * labeled alternative in {@link MyGrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterGeExpr(MyGrammarParser.GeExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code geExpr}
	 * labeled alternative in {@link MyGrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitGeExpr(MyGrammarParser.GeExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code eqExprLbl}
	 * labeled alternative in {@link MyGrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterEqExprLbl(MyGrammarParser.EqExprLblContext ctx);
	/**
	 * Exit a parse tree produced by the {@code eqExprLbl}
	 * labeled alternative in {@link MyGrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitEqExprLbl(MyGrammarParser.EqExprLblContext ctx);
	/**
	 * Enter a parse tree produced by the {@code funExpr}
	 * labeled alternative in {@link MyGrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterFunExpr(MyGrammarParser.FunExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code funExpr}
	 * labeled alternative in {@link MyGrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitFunExpr(MyGrammarParser.FunExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code moreExpr}
	 * labeled alternative in {@link MyGrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterMoreExpr(MyGrammarParser.MoreExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code moreExpr}
	 * labeled alternative in {@link MyGrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitMoreExpr(MyGrammarParser.MoreExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code doublePlusExpr}
	 * labeled alternative in {@link MyGrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterDoublePlusExpr(MyGrammarParser.DoublePlusExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code doublePlusExpr}
	 * labeled alternative in {@link MyGrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitDoublePlusExpr(MyGrammarParser.DoublePlusExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code orExpr}
	 * labeled alternative in {@link MyGrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterOrExpr(MyGrammarParser.OrExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code orExpr}
	 * labeled alternative in {@link MyGrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitOrExpr(MyGrammarParser.OrExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code minusExpr}
	 * labeled alternative in {@link MyGrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterMinusExpr(MyGrammarParser.MinusExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code minusExpr}
	 * labeled alternative in {@link MyGrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitMinusExpr(MyGrammarParser.MinusExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code letExpr}
	 * labeled alternative in {@link MyGrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterLetExpr(MyGrammarParser.LetExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code letExpr}
	 * labeled alternative in {@link MyGrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitLetExpr(MyGrammarParser.LetExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code plusExpr}
	 * labeled alternative in {@link MyGrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterPlusExpr(MyGrammarParser.PlusExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code plusExpr}
	 * labeled alternative in {@link MyGrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitPlusExpr(MyGrammarParser.PlusExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code valueExpr}
	 * labeled alternative in {@link MyGrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterValueExpr(MyGrammarParser.ValueExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code valueExpr}
	 * labeled alternative in {@link MyGrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitValueExpr(MyGrammarParser.ValueExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code notExpr}
	 * labeled alternative in {@link MyGrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterNotExpr(MyGrammarParser.NotExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code notExpr}
	 * labeled alternative in {@link MyGrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitNotExpr(MyGrammarParser.NotExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ITEexpr}
	 * labeled alternative in {@link MyGrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterITEexpr(MyGrammarParser.ITEexprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ITEexpr}
	 * labeled alternative in {@link MyGrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitITEexpr(MyGrammarParser.ITEexprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code leExpr}
	 * labeled alternative in {@link MyGrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterLeExpr(MyGrammarParser.LeExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code leExpr}
	 * labeled alternative in {@link MyGrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitLeExpr(MyGrammarParser.LeExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code andExpr}
	 * labeled alternative in {@link MyGrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterAndExpr(MyGrammarParser.AndExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code andExpr}
	 * labeled alternative in {@link MyGrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitAndExpr(MyGrammarParser.AndExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code idExpr}
	 * labeled alternative in {@link MyGrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterIdExpr(MyGrammarParser.IdExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code idExpr}
	 * labeled alternative in {@link MyGrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitIdExpr(MyGrammarParser.IdExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyGrammarParser#varBind}.
	 * @param ctx the parse tree
	 */
	void enterVarBind(MyGrammarParser.VarBindContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyGrammarParser#varBind}.
	 * @param ctx the parse tree
	 */
	void exitVarBind(MyGrammarParser.VarBindContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyGrammarParser#id}.
	 * @param ctx the parse tree
	 */
	void enterId(MyGrammarParser.IdContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyGrammarParser#id}.
	 * @param ctx the parse tree
	 */
	void exitId(MyGrammarParser.IdContext ctx);
	/**
	 * Enter a parse tree produced by the {@code eqPExpr}
	 * labeled alternative in {@link MyGrammarParser#eqExpr}.
	 * @param ctx the parse tree
	 */
	void enterEqPExpr(MyGrammarParser.EqPExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code eqPExpr}
	 * labeled alternative in {@link MyGrammarParser#eqExpr}.
	 * @param ctx the parse tree
	 */
	void exitEqPExpr(MyGrammarParser.EqPExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code eqOExpr}
	 * labeled alternative in {@link MyGrammarParser#eqExpr}.
	 * @param ctx the parse tree
	 */
	void enterEqOExpr(MyGrammarParser.EqOExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code eqOExpr}
	 * labeled alternative in {@link MyGrammarParser#eqExpr}.
	 * @param ctx the parse tree
	 */
	void exitEqOExpr(MyGrammarParser.EqOExprContext ctx);
}