// Generated from MyGrammar.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class MyGrammarLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		MODEL=1, BOOL=2, INT=3, TRUE=4, FALSE=5, NUMBER=6, TEXT=7, ITE=8, AND=9, 
		EQUAL=10, MINUS=11, PLUS=12, LE=13, GE=14, OR=15, NOT=16, UNSAT=17, SAT=18, 
		DEFINE_FUN_REC=19, DEFINE_FUN=20, ID=21, BEGINPARENS=22, ENDPARENS=23, 
		NEWLINE=24, STRING=25;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"MODEL", "BOOL", "INT", "TRUE", "FALSE", "NUMBER", "TEXT", "ITE", "AND", 
			"EQUAL", "MINUS", "PLUS", "LE", "GE", "OR", "NOT", "UNSAT", "SAT", "DEFINE_FUN_REC", 
			"DEFINE_FUN", "ID", "BEGINPARENS", "ENDPARENS", "NEWLINE", "STRING"
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


	public MyGrammarLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "MyGrammar.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\33\u00b0\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3"+
		"\4\3\4\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\7\6\7Q\n\7\r\7\16"+
		"\7R\3\b\3\b\7\bW\n\b\f\b\16\bZ\13\b\3\b\3\b\3\t\3\t\3\t\3\t\3\n\3\n\3"+
		"\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\16\3\17\3\17\3\17\3\20\3"+
		"\20\3\20\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3"+
		"\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3"+
		"\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3"+
		"\26\3\26\7\26\u009f\n\26\f\26\16\26\u00a2\13\26\3\27\3\27\3\30\3\30\3"+
		"\31\6\31\u00a9\n\31\r\31\16\31\u00aa\3\31\3\31\3\32\3\32\2\2\33\3\3\5"+
		"\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21"+
		"!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\3\2\b\3\2\62;\5\2\f\f\17"+
		"\17$$\5\2C\\aac|\b\2##\60\60\62;C\\aac|\5\2\13\f\17\17\"\"\6\2\62;C\\"+
		"aac|\2\u00b3\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2"+
		"\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2"+
		"\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2"+
		"\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2"+
		"\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\3\65\3\2\2\2\5;\3\2\2\2\7@\3\2"+
		"\2\2\tD\3\2\2\2\13I\3\2\2\2\rP\3\2\2\2\17T\3\2\2\2\21]\3\2\2\2\23a\3\2"+
		"\2\2\25e\3\2\2\2\27g\3\2\2\2\31i\3\2\2\2\33k\3\2\2\2\35n\3\2\2\2\37q\3"+
		"\2\2\2!t\3\2\2\2#x\3\2\2\2%~\3\2\2\2\'\u0082\3\2\2\2)\u0091\3\2\2\2+\u009c"+
		"\3\2\2\2-\u00a3\3\2\2\2/\u00a5\3\2\2\2\61\u00a8\3\2\2\2\63\u00ae\3\2\2"+
		"\2\65\66\7o\2\2\66\67\7q\2\2\678\7f\2\289\7g\2\29:\7n\2\2:\4\3\2\2\2;"+
		"<\7D\2\2<=\7q\2\2=>\7q\2\2>?\7n\2\2?\6\3\2\2\2@A\7K\2\2AB\7p\2\2BC\7v"+
		"\2\2C\b\3\2\2\2DE\7v\2\2EF\7t\2\2FG\7w\2\2GH\7g\2\2H\n\3\2\2\2IJ\7h\2"+
		"\2JK\7c\2\2KL\7n\2\2LM\7u\2\2MN\7g\2\2N\f\3\2\2\2OQ\t\2\2\2PO\3\2\2\2"+
		"QR\3\2\2\2RP\3\2\2\2RS\3\2\2\2S\16\3\2\2\2TX\7$\2\2UW\n\3\2\2VU\3\2\2"+
		"\2WZ\3\2\2\2XV\3\2\2\2XY\3\2\2\2Y[\3\2\2\2ZX\3\2\2\2[\\\7$\2\2\\\20\3"+
		"\2\2\2]^\7k\2\2^_\7v\2\2_`\7g\2\2`\22\3\2\2\2ab\7c\2\2bc\7p\2\2cd\7f\2"+
		"\2d\24\3\2\2\2ef\7?\2\2f\26\3\2\2\2gh\7/\2\2h\30\3\2\2\2ij\7-\2\2j\32"+
		"\3\2\2\2kl\7>\2\2lm\7?\2\2m\34\3\2\2\2no\7@\2\2op\7?\2\2p\36\3\2\2\2q"+
		"r\7q\2\2rs\7t\2\2s \3\2\2\2tu\7p\2\2uv\7q\2\2vw\7v\2\2w\"\3\2\2\2xy\7"+
		"w\2\2yz\7p\2\2z{\7u\2\2{|\7c\2\2|}\7v\2\2}$\3\2\2\2~\177\7u\2\2\177\u0080"+
		"\7c\2\2\u0080\u0081\7v\2\2\u0081&\3\2\2\2\u0082\u0083\7f\2\2\u0083\u0084"+
		"\7g\2\2\u0084\u0085\7h\2\2\u0085\u0086\7k\2\2\u0086\u0087\7p\2\2\u0087"+
		"\u0088\7g\2\2\u0088\u0089\7/\2\2\u0089\u008a\7h\2\2\u008a\u008b\7w\2\2"+
		"\u008b\u008c\7p\2\2\u008c\u008d\7/\2\2\u008d\u008e\7t\2\2\u008e\u008f"+
		"\7g\2\2\u008f\u0090\7e\2\2\u0090(\3\2\2\2\u0091\u0092\7f\2\2\u0092\u0093"+
		"\7g\2\2\u0093\u0094\7h\2\2\u0094\u0095\7k\2\2\u0095\u0096\7p\2\2\u0096"+
		"\u0097\7g\2\2\u0097\u0098\7/\2\2\u0098\u0099\7h\2\2\u0099\u009a\7w\2\2"+
		"\u009a\u009b\7p\2\2\u009b*\3\2\2\2\u009c\u00a0\t\4\2\2\u009d\u009f\t\5"+
		"\2\2\u009e\u009d\3\2\2\2\u009f\u00a2\3\2\2\2\u00a0\u009e\3\2\2\2\u00a0"+
		"\u00a1\3\2\2\2\u00a1,\3\2\2\2\u00a2\u00a0\3\2\2\2\u00a3\u00a4\7*\2\2\u00a4"+
		".\3\2\2\2\u00a5\u00a6\7+\2\2\u00a6\60\3\2\2\2\u00a7\u00a9\t\6\2\2\u00a8"+
		"\u00a7\3\2\2\2\u00a9\u00aa\3\2\2\2\u00aa\u00a8\3\2\2\2\u00aa\u00ab\3\2"+
		"\2\2\u00ab\u00ac\3\2\2\2\u00ac\u00ad\b\31\2\2\u00ad\62\3\2\2\2\u00ae\u00af"+
		"\t\7\2\2\u00af\64\3\2\2\2\7\2RX\u00a0\u00aa\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}