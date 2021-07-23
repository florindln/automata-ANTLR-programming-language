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
		MODEL=1, BOOL=2, INT=3, TRUE=4, FALSE=5, NUMBER=6, TEXT=7, ITE=8, AND=9, 
		EQUAL=10, MINUS=11, PLUS=12, LE=13, GE=14, OR=15, NOT=16, UNSAT=17, SAT=18, 
		DEFINE_FUN_REC=19, DEFINE_FUN=20, ID=21, BEGINPARENS=22, ENDPARENS=23, 
		NEWLINE=24, STRING=25;
	public static final int
		RULE_myStart = 0, RULE_checkSatResponse = 1, RULE_checkModelResponse = 2, 
		RULE_modelResponse = 3, RULE_functionDef = 4, RULE_fParams = 5, RULE_fParam = 6, 
		RULE_type = 7, RULE_fRetValue = 8, RULE_fValues = 9, RULE_value = 10, 
		RULE_expr = 11, RULE_id = 12, RULE_eqExpr = 13;
	private static String[] makeRuleNames() {
		return new String[] {
			"myStart", "checkSatResponse", "checkModelResponse", "modelResponse", 
			"functionDef", "fParams", "fParam", "type", "fRetValue", "fValues", "value", 
			"expr", "id", "eqExpr"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'model'", "'Bool'", "'Int'", "'true'", "'false'", null, null, 
			"'ite'", "'and'", "'='", "'-'", "'+'", "'<='", "'>='", "'or'", "'not'", 
			"'unsat'", "'sat'", "'define-fun-rec'", "'define-fun'", null, "'('", 
			"')'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "MODEL", "BOOL", "INT", "TRUE", "FALSE", "NUMBER", "TEXT", "ITE", 
			"AND", "EQUAL", "MINUS", "PLUS", "LE", "GE", "OR", "NOT", "UNSAT", "SAT", 
			"DEFINE_FUN_REC", "DEFINE_FUN", "ID", "BEGINPARENS", "ENDPARENS", "NEWLINE", 
			"STRING"
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
			setState(28);
			checkSatResponse();
			setState(29);
			checkModelResponse();
			setState(30);
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
			setState(32);
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
			setState(34);
			match(BEGINPARENS);
			setState(35);
			match(MODEL);
			setState(39);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BEGINPARENS) {
				{
				{
				setState(36);
				modelResponse();
				}
				}
				setState(41);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(42);
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
			setState(54);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				_localctx = new FuncModRespContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(44);
				match(BEGINPARENS);
				setState(45);
				match(DEFINE_FUN);
				setState(46);
				functionDef();
				setState(47);
				match(ENDPARENS);
				}
				break;
			case 2:
				_localctx = new RecFuncModRespContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(49);
				match(BEGINPARENS);
				setState(50);
				match(DEFINE_FUN_REC);
				setState(51);
				functionDef();
				setState(52);
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
			setState(56);
			match(ID);
			setState(57);
			fParams();
			setState(58);
			fRetValue();
			setState(59);
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
			setState(61);
			match(BEGINPARENS);
			setState(65);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BEGINPARENS) {
				{
				{
				setState(62);
				fParam();
				}
				}
				setState(67);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(68);
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
			setState(70);
			match(BEGINPARENS);
			setState(71);
			match(ID);
			setState(72);
			type();
			setState(73);
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
			setState(75);
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
			setState(77);
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
			setState(79);
			expr();
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
			setState(81);
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
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_expr);
		int _la;
		try {
			setState(155);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				_localctx = new ITEexprContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(83);
				match(BEGINPARENS);
				setState(84);
				match(ITE);
				setState(85);
				expr();
				setState(86);
				expr();
				setState(87);
				expr();
				setState(88);
				match(ENDPARENS);
				}
				break;
			case 2:
				_localctx = new ValueExprContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(90);
				value();
				}
				break;
			case 3:
				_localctx = new FunExprContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(91);
				match(BEGINPARENS);
				setState(92);
				match(ID);
				setState(94); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(93);
					expr();
					}
					}
					setState(96); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TRUE) | (1L << FALSE) | (1L << NUMBER) | (1L << TEXT) | (1L << ID) | (1L << BEGINPARENS))) != 0) );
				setState(98);
				match(ENDPARENS);
				}
				break;
			case 4:
				_localctx = new AndExprContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(100);
				match(BEGINPARENS);
				setState(101);
				match(AND);
				setState(103); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(102);
					eqExpr();
					}
					}
					setState(105); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==BEGINPARENS );
				setState(107);
				match(ENDPARENS);
				}
				break;
			case 5:
				_localctx = new EqExprLblContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(109);
				eqExpr();
				}
				break;
			case 6:
				_localctx = new NotExprContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(110);
				match(BEGINPARENS);
				setState(111);
				match(NOT);
				setState(112);
				expr();
				setState(113);
				match(ENDPARENS);
				}
				break;
			case 7:
				_localctx = new OrExprContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(115);
				match(BEGINPARENS);
				setState(116);
				match(OR);
				setState(118); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(117);
					expr();
					}
					}
					setState(120); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TRUE) | (1L << FALSE) | (1L << NUMBER) | (1L << TEXT) | (1L << ID) | (1L << BEGINPARENS))) != 0) );
				setState(122);
				match(ENDPARENS);
				}
				break;
			case 8:
				_localctx = new GeExprContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(124);
				match(BEGINPARENS);
				setState(125);
				match(GE);
				setState(126);
				expr();
				setState(127);
				expr();
				setState(128);
				match(ENDPARENS);
				}
				break;
			case 9:
				_localctx = new LeExprContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(130);
				match(BEGINPARENS);
				setState(131);
				match(LE);
				setState(132);
				expr();
				setState(133);
				expr();
				setState(134);
				match(ENDPARENS);
				}
				break;
			case 10:
				_localctx = new PlusExprContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(136);
				match(BEGINPARENS);
				setState(137);
				match(PLUS);
				setState(139); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(138);
					expr();
					}
					}
					setState(141); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TRUE) | (1L << FALSE) | (1L << NUMBER) | (1L << TEXT) | (1L << ID) | (1L << BEGINPARENS))) != 0) );
				setState(143);
				match(ENDPARENS);
				}
				break;
			case 11:
				_localctx = new MinusExprContext(_localctx);
				enterOuterAlt(_localctx, 11);
				{
				setState(145);
				match(BEGINPARENS);
				setState(146);
				match(MINUS);
				setState(148); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(147);
					expr();
					}
					}
					setState(150); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TRUE) | (1L << FALSE) | (1L << NUMBER) | (1L << TEXT) | (1L << ID) | (1L << BEGINPARENS))) != 0) );
				setState(152);
				match(ENDPARENS);
				}
				break;
			case 12:
				_localctx = new IdExprContext(_localctx);
				enterOuterAlt(_localctx, 12);
				{
				setState(154);
				id();
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
		enterRule(_localctx, 24, RULE_id);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(157);
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
		enterRule(_localctx, 26, RULE_eqExpr);
		try {
			setState(171);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				_localctx = new EqPExprContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(159);
				match(BEGINPARENS);
				setState(160);
				match(EQUAL);
				setState(161);
				match(ID);
				setState(162);
				value();
				setState(163);
				match(ENDPARENS);
				}
				break;
			case 2:
				_localctx = new EqOExprContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(165);
				match(BEGINPARENS);
				setState(166);
				match(EQUAL);
				setState(167);
				expr();
				setState(168);
				expr();
				setState(169);
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\33\u00b0\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\3\2\3\2\3\2\3\2\3\3\3\3\3\4"+
		"\3\4\3\4\7\4(\n\4\f\4\16\4+\13\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\5\59\n\5\3\6\3\6\3\6\3\6\3\6\3\7\3\7\7\7B\n\7\f\7\16\7E\13"+
		"\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3"+
		"\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\6\ra\n\r\r\r\16\rb\3\r\3\r\3\r"+
		"\3\r\3\r\6\rj\n\r\r\r\16\rk\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3"+
		"\r\6\ry\n\r\r\r\16\rz\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r"+
		"\3\r\3\r\3\r\3\r\3\r\6\r\u008e\n\r\r\r\16\r\u008f\3\r\3\r\3\r\3\r\3\r"+
		"\6\r\u0097\n\r\r\r\16\r\u0098\3\r\3\r\3\r\5\r\u009e\n\r\3\16\3\16\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u00ae\n\17"+
		"\3\17\2\2\20\2\4\6\b\n\f\16\20\22\24\26\30\32\34\2\5\3\2\23\24\4\2\4\5"+
		"\33\33\3\2\6\t\2\u00b5\2\36\3\2\2\2\4\"\3\2\2\2\6$\3\2\2\2\b8\3\2\2\2"+
		"\n:\3\2\2\2\f?\3\2\2\2\16H\3\2\2\2\20M\3\2\2\2\22O\3\2\2\2\24Q\3\2\2\2"+
		"\26S\3\2\2\2\30\u009d\3\2\2\2\32\u009f\3\2\2\2\34\u00ad\3\2\2\2\36\37"+
		"\5\4\3\2\37 \5\6\4\2 !\7\2\2\3!\3\3\2\2\2\"#\t\2\2\2#\5\3\2\2\2$%\7\30"+
		"\2\2%)\7\3\2\2&(\5\b\5\2\'&\3\2\2\2(+\3\2\2\2)\'\3\2\2\2)*\3\2\2\2*,\3"+
		"\2\2\2+)\3\2\2\2,-\7\31\2\2-\7\3\2\2\2./\7\30\2\2/\60\7\26\2\2\60\61\5"+
		"\n\6\2\61\62\7\31\2\2\629\3\2\2\2\63\64\7\30\2\2\64\65\7\25\2\2\65\66"+
		"\5\n\6\2\66\67\7\31\2\2\679\3\2\2\28.\3\2\2\28\63\3\2\2\29\t\3\2\2\2:"+
		";\7\27\2\2;<\5\f\7\2<=\5\22\n\2=>\5\24\13\2>\13\3\2\2\2?C\7\30\2\2@B\5"+
		"\16\b\2A@\3\2\2\2BE\3\2\2\2CA\3\2\2\2CD\3\2\2\2DF\3\2\2\2EC\3\2\2\2FG"+
		"\7\31\2\2G\r\3\2\2\2HI\7\30\2\2IJ\7\27\2\2JK\5\20\t\2KL\7\31\2\2L\17\3"+
		"\2\2\2MN\t\3\2\2N\21\3\2\2\2OP\5\20\t\2P\23\3\2\2\2QR\5\30\r\2R\25\3\2"+
		"\2\2ST\t\4\2\2T\27\3\2\2\2UV\7\30\2\2VW\7\n\2\2WX\5\30\r\2XY\5\30\r\2"+
		"YZ\5\30\r\2Z[\7\31\2\2[\u009e\3\2\2\2\\\u009e\5\26\f\2]^\7\30\2\2^`\7"+
		"\27\2\2_a\5\30\r\2`_\3\2\2\2ab\3\2\2\2b`\3\2\2\2bc\3\2\2\2cd\3\2\2\2d"+
		"e\7\31\2\2e\u009e\3\2\2\2fg\7\30\2\2gi\7\13\2\2hj\5\34\17\2ih\3\2\2\2"+
		"jk\3\2\2\2ki\3\2\2\2kl\3\2\2\2lm\3\2\2\2mn\7\31\2\2n\u009e\3\2\2\2o\u009e"+
		"\5\34\17\2pq\7\30\2\2qr\7\22\2\2rs\5\30\r\2st\7\31\2\2t\u009e\3\2\2\2"+
		"uv\7\30\2\2vx\7\21\2\2wy\5\30\r\2xw\3\2\2\2yz\3\2\2\2zx\3\2\2\2z{\3\2"+
		"\2\2{|\3\2\2\2|}\7\31\2\2}\u009e\3\2\2\2~\177\7\30\2\2\177\u0080\7\20"+
		"\2\2\u0080\u0081\5\30\r\2\u0081\u0082\5\30\r\2\u0082\u0083\7\31\2\2\u0083"+
		"\u009e\3\2\2\2\u0084\u0085\7\30\2\2\u0085\u0086\7\17\2\2\u0086\u0087\5"+
		"\30\r\2\u0087\u0088\5\30\r\2\u0088\u0089\7\31\2\2\u0089\u009e\3\2\2\2"+
		"\u008a\u008b\7\30\2\2\u008b\u008d\7\16\2\2\u008c\u008e\5\30\r\2\u008d"+
		"\u008c\3\2\2\2\u008e\u008f\3\2\2\2\u008f\u008d\3\2\2\2\u008f\u0090\3\2"+
		"\2\2\u0090\u0091\3\2\2\2\u0091\u0092\7\31\2\2\u0092\u009e\3\2\2\2\u0093"+
		"\u0094\7\30\2\2\u0094\u0096\7\r\2\2\u0095\u0097\5\30\r\2\u0096\u0095\3"+
		"\2\2\2\u0097\u0098\3\2\2\2\u0098\u0096\3\2\2\2\u0098\u0099\3\2\2\2\u0099"+
		"\u009a\3\2\2\2\u009a\u009b\7\31\2\2\u009b\u009e\3\2\2\2\u009c\u009e\5"+
		"\32\16\2\u009dU\3\2\2\2\u009d\\\3\2\2\2\u009d]\3\2\2\2\u009df\3\2\2\2"+
		"\u009do\3\2\2\2\u009dp\3\2\2\2\u009du\3\2\2\2\u009d~\3\2\2\2\u009d\u0084"+
		"\3\2\2\2\u009d\u008a\3\2\2\2\u009d\u0093\3\2\2\2\u009d\u009c\3\2\2\2\u009e"+
		"\31\3\2\2\2\u009f\u00a0\7\27\2\2\u00a0\33\3\2\2\2\u00a1\u00a2\7\30\2\2"+
		"\u00a2\u00a3\7\f\2\2\u00a3\u00a4\7\27\2\2\u00a4\u00a5\5\26\f\2\u00a5\u00a6"+
		"\7\31\2\2\u00a6\u00ae\3\2\2\2\u00a7\u00a8\7\30\2\2\u00a8\u00a9\7\f\2\2"+
		"\u00a9\u00aa\5\30\r\2\u00aa\u00ab\5\30\r\2\u00ab\u00ac\7\31\2\2\u00ac"+
		"\u00ae\3\2\2\2\u00ad\u00a1\3\2\2\2\u00ad\u00a7\3\2\2\2\u00ae\35\3\2\2"+
		"\2\f)8Cbkz\u008f\u0098\u009d\u00ad";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}