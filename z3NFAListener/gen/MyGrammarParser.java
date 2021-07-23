// Generated from MyGrammar.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class MyGrammarParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		MODEL=1, BOOL=2, INT=3, LET=4, TRUE=5, FALSE=6, NUMBER=7, STRING=8, TEXT=9, 
		ITE=10, AND=11, EQUAL=12, MINUS=13, PLUS=14, DOUBLEPLUS=15, LE=16, GE=17, 
		OR=18, NOT=19, UNSAT=20, SAT=21, DEFINE_FUN_REC=22, DEFINE_FUN=23, ID=24, 
		BEGINPARENS=25, ENDPARENS=26, NEWLINE=27;
	public static final int
		RULE_myStart = 0, RULE_checkSatResponse = 1, RULE_checkModelResponse = 2, 
		RULE_modelResponse = 3, RULE_functionDef = 4, RULE_fParams = 5, RULE_fParam = 6, 
		RULE_type = 7, RULE_fRetValue = 8, RULE_fValues = 9, RULE_value = 10, 
		RULE_expr = 11, RULE_varBind = 12, RULE_id = 13, RULE_eqExpr = 14;
	private static String[] makeRuleNames() {
		return new String[] {
			"myStart", "checkSatResponse", "checkModelResponse", "modelResponse", 
			"functionDef", "fParams", "fParam", "type", "fRetValue", "fValues", "value", 
			"expr", "varBind", "id", "eqExpr"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'model'", "'Bool'", "'Int'", "'let'", "'true'", "'false'", null, 
			"'String'", null, "'ite'", "'and'", "'='", "'-'", "'+'", "'++'", "'<='", 
			"'>='", "'or'", "'not'", "'unsat'", "'sat'", "'define-fun-rec'", "'define-fun'", 
			null, "'('", "')'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "MODEL", "BOOL", "INT", "LET", "TRUE", "FALSE", "NUMBER", "STRING", 
			"TEXT", "ITE", "AND", "EQUAL", "MINUS", "PLUS", "DOUBLEPLUS", "LE", "GE", 
			"OR", "NOT", "UNSAT", "SAT", "DEFINE_FUN_REC", "DEFINE_FUN", "ID", "BEGINPARENS", 
			"ENDPARENS", "NEWLINE"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "MyGrammar.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public MyGrammarParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class MyStartContext extends ParserRuleContext {
		public CheckSatResponseContext checkSatResponse() {
			return getRuleContext(CheckSatResponseContext.class,0);
		}
		public CheckModelResponseContext checkModelResponse() {
			return getRuleContext(CheckModelResponseContext.class,0);
		}
		public TerminalNode EOF() { return getToken(MyGrammarParser.EOF, 0); }
		public MyStartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_myStart; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).enterMyStart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).exitMyStart(this);
		}
	}

	public final MyStartContext myStart() throws RecognitionException {
		MyStartContext _localctx = new MyStartContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_myStart);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(30);
			checkSatResponse();
			setState(31);
			checkModelResponse();
			setState(32);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CheckSatResponseContext extends ParserRuleContext {
		public TerminalNode SAT() { return getToken(MyGrammarParser.SAT, 0); }
		public TerminalNode UNSAT() { return getToken(MyGrammarParser.UNSAT, 0); }
		public CheckSatResponseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_checkSatResponse; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).enterCheckSatResponse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).exitCheckSatResponse(this);
		}
	}

	public final CheckSatResponseContext checkSatResponse() throws RecognitionException {
		CheckSatResponseContext _localctx = new CheckSatResponseContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_checkSatResponse);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(34);
			_la = _input.LA(1);
			if ( !(_la==UNSAT || _la==SAT) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CheckModelResponseContext extends ParserRuleContext {
		public TerminalNode BEGINPARENS() { return getToken(MyGrammarParser.BEGINPARENS, 0); }
		public TerminalNode MODEL() { return getToken(MyGrammarParser.MODEL, 0); }
		public TerminalNode ENDPARENS() { return getToken(MyGrammarParser.ENDPARENS, 0); }
		public List<ModelResponseContext> modelResponse() {
			return getRuleContexts(ModelResponseContext.class);
		}
		public ModelResponseContext modelResponse(int i) {
			return getRuleContext(ModelResponseContext.class,i);
		}
		public CheckModelResponseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_checkModelResponse; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).enterCheckModelResponse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).exitCheckModelResponse(this);
		}
	}

	public final CheckModelResponseContext checkModelResponse() throws RecognitionException {
		CheckModelResponseContext _localctx = new CheckModelResponseContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_checkModelResponse);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(36);
			match(BEGINPARENS);
			setState(37);
			match(MODEL);
			setState(41);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BEGINPARENS) {
				{
				{
				setState(38);
				modelResponse();
				}
				}
				setState(43);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(44);
			match(ENDPARENS);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ModelResponseContext extends ParserRuleContext {
		public ModelResponseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_modelResponse; }
	 
		public ModelResponseContext() { }
		public void copyFrom(ModelResponseContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class RecFuncModRespContext extends ModelResponseContext {
		public TerminalNode BEGINPARENS() { return getToken(MyGrammarParser.BEGINPARENS, 0); }
		public TerminalNode DEFINE_FUN_REC() { return getToken(MyGrammarParser.DEFINE_FUN_REC, 0); }
		public FunctionDefContext functionDef() {
			return getRuleContext(FunctionDefContext.class,0);
		}
		public TerminalNode ENDPARENS() { return getToken(MyGrammarParser.ENDPARENS, 0); }
		public RecFuncModRespContext(ModelResponseContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).enterRecFuncModResp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).exitRecFuncModResp(this);
		}
	}
	public static class FuncModRespContext extends ModelResponseContext {
		public TerminalNode BEGINPARENS() { return getToken(MyGrammarParser.BEGINPARENS, 0); }
		public TerminalNode DEFINE_FUN() { return getToken(MyGrammarParser.DEFINE_FUN, 0); }
		public FunctionDefContext functionDef() {
			return getRuleContext(FunctionDefContext.class,0);
		}
		public TerminalNode ENDPARENS() { return getToken(MyGrammarParser.ENDPARENS, 0); }
		public FuncModRespContext(ModelResponseContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).enterFuncModResp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).exitFuncModResp(this);
		}
	}

	public final ModelResponseContext modelResponse() throws RecognitionException {
		ModelResponseContext _localctx = new ModelResponseContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_modelResponse);
		try {
			setState(56);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				_localctx = new FuncModRespContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(46);
				match(BEGINPARENS);
				setState(47);
				match(DEFINE_FUN);
				setState(48);
				functionDef();
				setState(49);
				match(ENDPARENS);
				}
				break;
			case 2:
				_localctx = new RecFuncModRespContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(51);
				match(BEGINPARENS);
				setState(52);
				match(DEFINE_FUN_REC);
				setState(53);
				functionDef();
				setState(54);
				match(ENDPARENS);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionDefContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(MyGrammarParser.ID, 0); }
		public FParamsContext fParams() {
			return getRuleContext(FParamsContext.class,0);
		}
		public FRetValueContext fRetValue() {
			return getRuleContext(FRetValueContext.class,0);
		}
		public FValuesContext fValues() {
			return getRuleContext(FValuesContext.class,0);
		}
		public FunctionDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionDef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).enterFunctionDef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).exitFunctionDef(this);
		}
	}

	public final FunctionDefContext functionDef() throws RecognitionException {
		FunctionDefContext _localctx = new FunctionDefContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_functionDef);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(58);
			match(ID);
			setState(59);
			fParams();
			setState(60);
			fRetValue();
			setState(61);
			fValues();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FParamsContext extends ParserRuleContext {
		public TerminalNode BEGINPARENS() { return getToken(MyGrammarParser.BEGINPARENS, 0); }
		public TerminalNode ENDPARENS() { return getToken(MyGrammarParser.ENDPARENS, 0); }
		public List<FParamContext> fParam() {
			return getRuleContexts(FParamContext.class);
		}
		public FParamContext fParam(int i) {
			return getRuleContext(FParamContext.class,i);
		}
		public FParamsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fParams; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).enterFParams(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).exitFParams(this);
		}
	}

	public final FParamsContext fParams() throws RecognitionException {
		FParamsContext _localctx = new FParamsContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_fParams);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(63);
			match(BEGINPARENS);
			setState(67);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BEGINPARENS) {
				{
				{
				setState(64);
				fParam();
				}
				}
				setState(69);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(70);
			match(ENDPARENS);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FParamContext extends ParserRuleContext {
		public TerminalNode BEGINPARENS() { return getToken(MyGrammarParser.BEGINPARENS, 0); }
		public TerminalNode ID() { return getToken(MyGrammarParser.ID, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode ENDPARENS() { return getToken(MyGrammarParser.ENDPARENS, 0); }
		public FParamContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fParam; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).enterFParam(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).exitFParam(this);
		}
	}

	public final FParamContext fParam() throws RecognitionException {
		FParamContext _localctx = new FParamContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_fParam);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(72);
			match(BEGINPARENS);
			setState(73);
			match(ID);
			setState(74);
			type();
			setState(75);
			match(ENDPARENS);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(MyGrammarParser.INT, 0); }
		public TerminalNode BOOL() { return getToken(MyGrammarParser.BOOL, 0); }
		public TerminalNode STRING() { return getToken(MyGrammarParser.STRING, 0); }
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).exitType(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(77);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOL) | (1L << INT) | (1L << STRING))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FRetValueContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public FRetValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fRetValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).enterFRetValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).exitFRetValue(this);
		}
	}

	public final FRetValueContext fRetValue() throws RecognitionException {
		FRetValueContext _localctx = new FRetValueContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_fRetValue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(79);
			type();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FValuesContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public FValuesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fValues; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).enterFValues(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).exitFValues(this);
		}
	}

	public final FValuesContext fValues() throws RecognitionException {
		FValuesContext _localctx = new FValuesContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_fValues);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(81);
			expr(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ValueContext extends ParserRuleContext {
		public TerminalNode TRUE() { return getToken(MyGrammarParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(MyGrammarParser.FALSE, 0); }
		public TerminalNode NUMBER() { return getToken(MyGrammarParser.NUMBER, 0); }
		public TerminalNode TEXT() { return getToken(MyGrammarParser.TEXT, 0); }
		public ValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).enterValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).exitValue(this);
		}
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_value);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(83);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TRUE) | (1L << FALSE) | (1L << NUMBER) | (1L << TEXT))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExprContext extends ParserRuleContext {
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	 
		public ExprContext() { }
		public void copyFrom(ExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class GeExprContext extends ExprContext {
		public TerminalNode BEGINPARENS() { return getToken(MyGrammarParser.BEGINPARENS, 0); }
		public TerminalNode GE() { return getToken(MyGrammarParser.GE, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode ENDPARENS() { return getToken(MyGrammarParser.ENDPARENS, 0); }
		public GeExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).enterGeExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).exitGeExpr(this);
		}
	}
	public static class EqExprLblContext extends ExprContext {
		public EqExprContext eqExpr() {
			return getRuleContext(EqExprContext.class,0);
		}
		public EqExprLblContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).enterEqExprLbl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).exitEqExprLbl(this);
		}
	}
	public static class FunExprContext extends ExprContext {
		public TerminalNode BEGINPARENS() { return getToken(MyGrammarParser.BEGINPARENS, 0); }
		public TerminalNode ID() { return getToken(MyGrammarParser.ID, 0); }
		public TerminalNode ENDPARENS() { return getToken(MyGrammarParser.ENDPARENS, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public FunExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).enterFunExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).exitFunExpr(this);
		}
	}
	public static class MoreExprContext extends ExprContext {
		public TerminalNode BEGINPARENS() { return getToken(MyGrammarParser.BEGINPARENS, 0); }
		public TerminalNode ENDPARENS() { return getToken(MyGrammarParser.ENDPARENS, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public MoreExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).enterMoreExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).exitMoreExpr(this);
		}
	}
	public static class DoublePlusExprContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode DOUBLEPLUS() { return getToken(MyGrammarParser.DOUBLEPLUS, 0); }
		public DoublePlusExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).enterDoublePlusExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).exitDoublePlusExpr(this);
		}
	}
	public static class OrExprContext extends ExprContext {
		public TerminalNode BEGINPARENS() { return getToken(MyGrammarParser.BEGINPARENS, 0); }
		public TerminalNode OR() { return getToken(MyGrammarParser.OR, 0); }
		public TerminalNode ENDPARENS() { return getToken(MyGrammarParser.ENDPARENS, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public OrExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).enterOrExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).exitOrExpr(this);
		}
	}
	public static class MinusExprContext extends ExprContext {
		public TerminalNode BEGINPARENS() { return getToken(MyGrammarParser.BEGINPARENS, 0); }
		public TerminalNode MINUS() { return getToken(MyGrammarParser.MINUS, 0); }
		public TerminalNode ENDPARENS() { return getToken(MyGrammarParser.ENDPARENS, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public MinusExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).enterMinusExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).exitMinusExpr(this);
		}
	}
	public static class LetExprContext extends ExprContext {
		public List<TerminalNode> BEGINPARENS() { return getTokens(MyGrammarParser.BEGINPARENS); }
		public TerminalNode BEGINPARENS(int i) {
			return getToken(MyGrammarParser.BEGINPARENS, i);
		}
		public TerminalNode LET() { return getToken(MyGrammarParser.LET, 0); }
		public List<TerminalNode> ENDPARENS() { return getTokens(MyGrammarParser.ENDPARENS); }
		public TerminalNode ENDPARENS(int i) {
			return getToken(MyGrammarParser.ENDPARENS, i);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public List<VarBindContext> varBind() {
			return getRuleContexts(VarBindContext.class);
		}
		public VarBindContext varBind(int i) {
			return getRuleContext(VarBindContext.class,i);
		}
		public LetExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).enterLetExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).exitLetExpr(this);
		}
	}
	public static class PlusExprContext extends ExprContext {
		public TerminalNode BEGINPARENS() { return getToken(MyGrammarParser.BEGINPARENS, 0); }
		public TerminalNode PLUS() { return getToken(MyGrammarParser.PLUS, 0); }
		public TerminalNode ENDPARENS() { return getToken(MyGrammarParser.ENDPARENS, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public PlusExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).enterPlusExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).exitPlusExpr(this);
		}
	}
	public static class ValueExprContext extends ExprContext {
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public ValueExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).enterValueExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).exitValueExpr(this);
		}
	}
	public static class NotExprContext extends ExprContext {
		public TerminalNode BEGINPARENS() { return getToken(MyGrammarParser.BEGINPARENS, 0); }
		public TerminalNode NOT() { return getToken(MyGrammarParser.NOT, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode ENDPARENS() { return getToken(MyGrammarParser.ENDPARENS, 0); }
		public NotExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).enterNotExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).exitNotExpr(this);
		}
	}
	public static class ITEexprContext extends ExprContext {
		public TerminalNode BEGINPARENS() { return getToken(MyGrammarParser.BEGINPARENS, 0); }
		public TerminalNode ITE() { return getToken(MyGrammarParser.ITE, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode ENDPARENS() { return getToken(MyGrammarParser.ENDPARENS, 0); }
		public ITEexprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).enterITEexpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).exitITEexpr(this);
		}
	}
	public static class LeExprContext extends ExprContext {
		public TerminalNode BEGINPARENS() { return getToken(MyGrammarParser.BEGINPARENS, 0); }
		public TerminalNode LE() { return getToken(MyGrammarParser.LE, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode ENDPARENS() { return getToken(MyGrammarParser.ENDPARENS, 0); }
		public LeExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).enterLeExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).exitLeExpr(this);
		}
	}
	public static class AndExprContext extends ExprContext {
		public TerminalNode BEGINPARENS() { return getToken(MyGrammarParser.BEGINPARENS, 0); }
		public TerminalNode AND() { return getToken(MyGrammarParser.AND, 0); }
		public TerminalNode ENDPARENS() { return getToken(MyGrammarParser.ENDPARENS, 0); }
		public List<EqExprContext> eqExpr() {
			return getRuleContexts(EqExprContext.class);
		}
		public EqExprContext eqExpr(int i) {
			return getRuleContext(EqExprContext.class,i);
		}
		public AndExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).enterAndExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).exitAndExpr(this);
		}
	}
	public static class IdExprContext extends ExprContext {
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public IdExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).enterIdExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).exitIdExpr(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 22;
		enterRecursionRule(_localctx, 22, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(178);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				{
				_localctx = new ITEexprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(86);
				match(BEGINPARENS);
				setState(87);
				match(ITE);
				setState(88);
				expr(0);
				setState(89);
				expr(0);
				setState(90);
				expr(0);
				setState(91);
				match(ENDPARENS);
				}
				break;
			case 2:
				{
				_localctx = new LetExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(93);
				match(BEGINPARENS);
				setState(94);
				match(LET);
				setState(95);
				match(BEGINPARENS);
				setState(97); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(96);
					varBind();
					}
					}
					setState(99); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==BEGINPARENS );
				setState(101);
				match(ENDPARENS);
				setState(102);
				expr(0);
				setState(103);
				match(ENDPARENS);
				}
				break;
			case 3:
				{
				_localctx = new ValueExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(105);
				value();
				}
				break;
			case 4:
				{
				_localctx = new FunExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(106);
				match(BEGINPARENS);
				setState(107);
				match(ID);
				setState(109); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(108);
					expr(0);
					}
					}
					setState(111); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TRUE) | (1L << FALSE) | (1L << NUMBER) | (1L << TEXT) | (1L << ID) | (1L << BEGINPARENS))) != 0) );
				setState(113);
				match(ENDPARENS);
				}
				break;
			case 5:
				{
				_localctx = new AndExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(115);
				match(BEGINPARENS);
				setState(116);
				match(AND);
				setState(118); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(117);
					eqExpr();
					}
					}
					setState(120); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==BEGINPARENS );
				setState(122);
				match(ENDPARENS);
				}
				break;
			case 6:
				{
				_localctx = new EqExprLblContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(124);
				eqExpr();
				}
				break;
			case 7:
				{
				_localctx = new NotExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(125);
				match(BEGINPARENS);
				setState(126);
				match(NOT);
				setState(127);
				expr(0);
				setState(128);
				match(ENDPARENS);
				}
				break;
			case 8:
				{
				_localctx = new OrExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(130);
				match(BEGINPARENS);
				setState(131);
				match(OR);
				setState(133); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(132);
					expr(0);
					}
					}
					setState(135); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TRUE) | (1L << FALSE) | (1L << NUMBER) | (1L << TEXT) | (1L << ID) | (1L << BEGINPARENS))) != 0) );
				setState(137);
				match(ENDPARENS);
				}
				break;
			case 9:
				{
				_localctx = new GeExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(139);
				match(BEGINPARENS);
				setState(140);
				match(GE);
				setState(141);
				expr(0);
				setState(142);
				expr(0);
				setState(143);
				match(ENDPARENS);
				}
				break;
			case 10:
				{
				_localctx = new LeExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(145);
				match(BEGINPARENS);
				setState(146);
				match(LE);
				setState(147);
				expr(0);
				setState(148);
				expr(0);
				setState(149);
				match(ENDPARENS);
				}
				break;
			case 11:
				{
				_localctx = new PlusExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(151);
				match(BEGINPARENS);
				setState(152);
				match(PLUS);
				setState(154); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(153);
					expr(0);
					}
					}
					setState(156); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TRUE) | (1L << FALSE) | (1L << NUMBER) | (1L << TEXT) | (1L << ID) | (1L << BEGINPARENS))) != 0) );
				setState(158);
				match(ENDPARENS);
				}
				break;
			case 12:
				{
				_localctx = new MoreExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(160);
				match(BEGINPARENS);
				setState(162); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(161);
					expr(0);
					}
					}
					setState(164); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TRUE) | (1L << FALSE) | (1L << NUMBER) | (1L << TEXT) | (1L << ID) | (1L << BEGINPARENS))) != 0) );
				setState(166);
				match(ENDPARENS);
				}
				break;
			case 13:
				{
				_localctx = new MinusExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(168);
				match(BEGINPARENS);
				setState(169);
				match(MINUS);
				setState(171); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(170);
					expr(0);
					}
					}
					setState(173); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TRUE) | (1L << FALSE) | (1L << NUMBER) | (1L << TEXT) | (1L << ID) | (1L << BEGINPARENS))) != 0) );
				setState(175);
				match(ENDPARENS);
				}
				break;
			case 14:
				{
				_localctx = new IdExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(177);
				id();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(190);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new DoublePlusExprContext(new ExprContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_expr);
					setState(180);
					if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
					setState(181);
					match(DOUBLEPLUS);
					setState(185);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(182);
							expr(0);
							}
							} 
						}
						setState(187);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
					}
					}
					} 
				}
				setState(192);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class VarBindContext extends ParserRuleContext {
		public TerminalNode BEGINPARENS() { return getToken(MyGrammarParser.BEGINPARENS, 0); }
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode ENDPARENS() { return getToken(MyGrammarParser.ENDPARENS, 0); }
		public VarBindContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varBind; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).enterVarBind(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).exitVarBind(this);
		}
	}

	public final VarBindContext varBind() throws RecognitionException {
		VarBindContext _localctx = new VarBindContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_varBind);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(193);
			match(BEGINPARENS);
			setState(194);
			id();
			setState(195);
			expr(0);
			setState(196);
			match(ENDPARENS);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IdContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(MyGrammarParser.ID, 0); }
		public IdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_id; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).enterId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).exitId(this);
		}
	}

	public final IdContext id() throws RecognitionException {
		IdContext _localctx = new IdContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_id);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(198);
			match(ID);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EqExprContext extends ParserRuleContext {
		public EqExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_eqExpr; }
	 
		public EqExprContext() { }
		public void copyFrom(EqExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class EqPExprContext extends EqExprContext {
		public TerminalNode BEGINPARENS() { return getToken(MyGrammarParser.BEGINPARENS, 0); }
		public TerminalNode EQUAL() { return getToken(MyGrammarParser.EQUAL, 0); }
		public TerminalNode ID() { return getToken(MyGrammarParser.ID, 0); }
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public TerminalNode ENDPARENS() { return getToken(MyGrammarParser.ENDPARENS, 0); }
		public EqPExprContext(EqExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).enterEqPExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).exitEqPExpr(this);
		}
	}
	public static class EqOExprContext extends EqExprContext {
		public TerminalNode BEGINPARENS() { return getToken(MyGrammarParser.BEGINPARENS, 0); }
		public TerminalNode EQUAL() { return getToken(MyGrammarParser.EQUAL, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode ENDPARENS() { return getToken(MyGrammarParser.ENDPARENS, 0); }
		public EqOExprContext(EqExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).enterEqOExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).exitEqOExpr(this);
		}
	}

	public final EqExprContext eqExpr() throws RecognitionException {
		EqExprContext _localctx = new EqExprContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_eqExpr);
		try {
			setState(212);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				_localctx = new EqPExprContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(200);
				match(BEGINPARENS);
				setState(201);
				match(EQUAL);
				setState(202);
				match(ID);
				setState(203);
				value();
				setState(204);
				match(ENDPARENS);
				}
				break;
			case 2:
				_localctx = new EqOExprContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(206);
				match(BEGINPARENS);
				setState(207);
				match(EQUAL);
				setState(208);
				expr(0);
				setState(209);
				expr(0);
				setState(210);
				match(ENDPARENS);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 11:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 3);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\35\u00d9\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\3\2\3\2\3\2\3\2\3"+
		"\3\3\3\3\4\3\4\3\4\7\4*\n\4\f\4\16\4-\13\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\5\5;\n\5\3\6\3\6\3\6\3\6\3\6\3\7\3\7\7\7D\n\7\f\7"+
		"\16\7G\13\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f"+
		"\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\6\rd\n\r\r\r\16\r"+
		"e\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\6\rp\n\r\r\r\16\rq\3\r\3\r\3\r\3\r\3"+
		"\r\6\ry\n\r\r\r\16\rz\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\6\r"+
		"\u0088\n\r\r\r\16\r\u0089\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r"+
		"\3\r\3\r\3\r\3\r\3\r\3\r\6\r\u009d\n\r\r\r\16\r\u009e\3\r\3\r\3\r\3\r"+
		"\6\r\u00a5\n\r\r\r\16\r\u00a6\3\r\3\r\3\r\3\r\3\r\6\r\u00ae\n\r\r\r\16"+
		"\r\u00af\3\r\3\r\3\r\5\r\u00b5\n\r\3\r\3\r\3\r\7\r\u00ba\n\r\f\r\16\r"+
		"\u00bd\13\r\7\r\u00bf\n\r\f\r\16\r\u00c2\13\r\3\16\3\16\3\16\3\16\3\16"+
		"\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\5\20\u00d7\n\20\3\20\2\3\30\21\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36"+
		"\2\5\3\2\26\27\4\2\4\5\n\n\4\2\7\t\13\13\2\u00e3\2 \3\2\2\2\4$\3\2\2\2"+
		"\6&\3\2\2\2\b:\3\2\2\2\n<\3\2\2\2\fA\3\2\2\2\16J\3\2\2\2\20O\3\2\2\2\22"+
		"Q\3\2\2\2\24S\3\2\2\2\26U\3\2\2\2\30\u00b4\3\2\2\2\32\u00c3\3\2\2\2\34"+
		"\u00c8\3\2\2\2\36\u00d6\3\2\2\2 !\5\4\3\2!\"\5\6\4\2\"#\7\2\2\3#\3\3\2"+
		"\2\2$%\t\2\2\2%\5\3\2\2\2&\'\7\33\2\2\'+\7\3\2\2(*\5\b\5\2)(\3\2\2\2*"+
		"-\3\2\2\2+)\3\2\2\2+,\3\2\2\2,.\3\2\2\2-+\3\2\2\2./\7\34\2\2/\7\3\2\2"+
		"\2\60\61\7\33\2\2\61\62\7\31\2\2\62\63\5\n\6\2\63\64\7\34\2\2\64;\3\2"+
		"\2\2\65\66\7\33\2\2\66\67\7\30\2\2\678\5\n\6\289\7\34\2\29;\3\2\2\2:\60"+
		"\3\2\2\2:\65\3\2\2\2;\t\3\2\2\2<=\7\32\2\2=>\5\f\7\2>?\5\22\n\2?@\5\24"+
		"\13\2@\13\3\2\2\2AE\7\33\2\2BD\5\16\b\2CB\3\2\2\2DG\3\2\2\2EC\3\2\2\2"+
		"EF\3\2\2\2FH\3\2\2\2GE\3\2\2\2HI\7\34\2\2I\r\3\2\2\2JK\7\33\2\2KL\7\32"+
		"\2\2LM\5\20\t\2MN\7\34\2\2N\17\3\2\2\2OP\t\3\2\2P\21\3\2\2\2QR\5\20\t"+
		"\2R\23\3\2\2\2ST\5\30\r\2T\25\3\2\2\2UV\t\4\2\2V\27\3\2\2\2WX\b\r\1\2"+
		"XY\7\33\2\2YZ\7\f\2\2Z[\5\30\r\2[\\\5\30\r\2\\]\5\30\r\2]^\7\34\2\2^\u00b5"+
		"\3\2\2\2_`\7\33\2\2`a\7\6\2\2ac\7\33\2\2bd\5\32\16\2cb\3\2\2\2de\3\2\2"+
		"\2ec\3\2\2\2ef\3\2\2\2fg\3\2\2\2gh\7\34\2\2hi\5\30\r\2ij\7\34\2\2j\u00b5"+
		"\3\2\2\2k\u00b5\5\26\f\2lm\7\33\2\2mo\7\32\2\2np\5\30\r\2on\3\2\2\2pq"+
		"\3\2\2\2qo\3\2\2\2qr\3\2\2\2rs\3\2\2\2st\7\34\2\2t\u00b5\3\2\2\2uv\7\33"+
		"\2\2vx\7\r\2\2wy\5\36\20\2xw\3\2\2\2yz\3\2\2\2zx\3\2\2\2z{\3\2\2\2{|\3"+
		"\2\2\2|}\7\34\2\2}\u00b5\3\2\2\2~\u00b5\5\36\20\2\177\u0080\7\33\2\2\u0080"+
		"\u0081\7\25\2\2\u0081\u0082\5\30\r\2\u0082\u0083\7\34\2\2\u0083\u00b5"+
		"\3\2\2\2\u0084\u0085\7\33\2\2\u0085\u0087\7\24\2\2\u0086\u0088\5\30\r"+
		"\2\u0087\u0086\3\2\2\2\u0088\u0089\3\2\2\2\u0089\u0087\3\2\2\2\u0089\u008a"+
		"\3\2\2\2\u008a\u008b\3\2\2\2\u008b\u008c\7\34\2\2\u008c\u00b5\3\2\2\2"+
		"\u008d\u008e\7\33\2\2\u008e\u008f\7\23\2\2\u008f\u0090\5\30\r\2\u0090"+
		"\u0091\5\30\r\2\u0091\u0092\7\34\2\2\u0092\u00b5\3\2\2\2\u0093\u0094\7"+
		"\33\2\2\u0094\u0095\7\22\2\2\u0095\u0096\5\30\r\2\u0096\u0097\5\30\r\2"+
		"\u0097\u0098\7\34\2\2\u0098\u00b5\3\2\2\2\u0099\u009a\7\33\2\2\u009a\u009c"+
		"\7\20\2\2\u009b\u009d\5\30\r\2\u009c\u009b\3\2\2\2\u009d\u009e\3\2\2\2"+
		"\u009e\u009c\3\2\2\2\u009e\u009f\3\2\2\2\u009f\u00a0\3\2\2\2\u00a0\u00a1"+
		"\7\34\2\2\u00a1\u00b5\3\2\2\2\u00a2\u00a4\7\33\2\2\u00a3\u00a5\5\30\r"+
		"\2\u00a4\u00a3\3\2\2\2\u00a5\u00a6\3\2\2\2\u00a6\u00a4\3\2\2\2\u00a6\u00a7"+
		"\3\2\2\2\u00a7\u00a8\3\2\2\2\u00a8\u00a9\7\34\2\2\u00a9\u00b5\3\2\2\2"+
		"\u00aa\u00ab\7\33\2\2\u00ab\u00ad\7\17\2\2\u00ac\u00ae\5\30\r\2\u00ad"+
		"\u00ac\3\2\2\2\u00ae\u00af\3\2\2\2\u00af\u00ad\3\2\2\2\u00af\u00b0\3\2"+
		"\2\2\u00b0\u00b1\3\2\2\2\u00b1\u00b2\7\34\2\2\u00b2\u00b5\3\2\2\2\u00b3"+
		"\u00b5\5\34\17\2\u00b4W\3\2\2\2\u00b4_\3\2\2\2\u00b4k\3\2\2\2\u00b4l\3"+
		"\2\2\2\u00b4u\3\2\2\2\u00b4~\3\2\2\2\u00b4\177\3\2\2\2\u00b4\u0084\3\2"+
		"\2\2\u00b4\u008d\3\2\2\2\u00b4\u0093\3\2\2\2\u00b4\u0099\3\2\2\2\u00b4"+
		"\u00a2\3\2\2\2\u00b4\u00aa\3\2\2\2\u00b4\u00b3\3\2\2\2\u00b5\u00c0\3\2"+
		"\2\2\u00b6\u00b7\f\5\2\2\u00b7\u00bb\7\21\2\2\u00b8\u00ba\5\30\r\2\u00b9"+
		"\u00b8\3\2\2\2\u00ba\u00bd\3\2\2\2\u00bb\u00b9\3\2\2\2\u00bb\u00bc\3\2"+
		"\2\2\u00bc\u00bf\3\2\2\2\u00bd\u00bb\3\2\2\2\u00be\u00b6\3\2\2\2\u00bf"+
		"\u00c2\3\2\2\2\u00c0\u00be\3\2\2\2\u00c0\u00c1\3\2\2\2\u00c1\31\3\2\2"+
		"\2\u00c2\u00c0\3\2\2\2\u00c3\u00c4\7\33\2\2\u00c4\u00c5\5\34\17\2\u00c5"+
		"\u00c6\5\30\r\2\u00c6\u00c7\7\34\2\2\u00c7\33\3\2\2\2\u00c8\u00c9\7\32"+
		"\2\2\u00c9\35\3\2\2\2\u00ca\u00cb\7\33\2\2\u00cb\u00cc\7\16\2\2\u00cc"+
		"\u00cd\7\32\2\2\u00cd\u00ce\5\26\f\2\u00ce\u00cf\7\34\2\2\u00cf\u00d7"+
		"\3\2\2\2\u00d0\u00d1\7\33\2\2\u00d1\u00d2\7\16\2\2\u00d2\u00d3\5\30\r"+
		"\2\u00d3\u00d4\5\30\r\2\u00d4\u00d5\7\34\2\2\u00d5\u00d7\3\2\2\2\u00d6"+
		"\u00ca\3\2\2\2\u00d6\u00d0\3\2\2\2\u00d7\37\3\2\2\2\20+:Eeqz\u0089\u009e"+
		"\u00a6\u00af\u00b4\u00bb\u00c0\u00d6";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}