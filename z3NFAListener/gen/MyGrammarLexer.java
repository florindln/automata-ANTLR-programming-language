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
		MODEL=1, BOOL=2, INT=3, LET=4, TRUE=5, FALSE=6, NUMBER=7, STRING=8, TEXT=9, 
		ITE=10, AND=11, EQUAL=12, MINUS=13, PLUS=14, DOUBLEPLUS=15, LE=16, GE=17, 
		OR=18, NOT=19, UNSAT=20, SAT=21, DEFINE_FUN_REC=22, DEFINE_FUN=23, ID=24, 
		BEGINPARENS=25, ENDPARENS=26, NEWLINE=27;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"MODEL", "BOOL", "INT", "LET", "TRUE", "FALSE", "NUMBER", "STRING", "TEXT", 
			"ITE", "AND", "EQUAL", "MINUS", "PLUS", "DOUBLEPLUS", "LE", "GE", "OR", 
			"NOT", "UNSAT", "SAT", "DEFINE_FUN_REC", "DEFINE_FUN", "ID", "BEGINPARENS", 
			"ENDPARENS", "NEWLINE"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\35\u00c0\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3"+
		"\3\3\3\3\3\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\3\b\6\bY\n\b\r\b\16\bZ\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\n\3\n\7\nf\n\n\f\n\16\ni\13\n\3\n\3\n\3\13\3\13\3\13\3\13\3\f\3\f\3\f"+
		"\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\20\3\21\3\21\3\21\3\22\3"+
		"\22\3\22\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3"+
		"\25\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3"+
		"\27\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3"+
		"\30\3\30\3\30\3\31\3\31\7\31\u00b1\n\31\f\31\16\31\u00b4\13\31\3\32\3"+
		"\32\3\33\3\33\3\34\6\34\u00bb\n\34\r\34\16\34\u00bc\3\34\3\34\2\2\35\3"+
		"\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37"+
		"\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\35\3\2\7\3\2"+
		"\62;\5\2\f\f\17\17$$\5\2C\\aac|\b\2##\60\60\62;C\\aac|\5\2\13\f\17\17"+
		"\"\"\2\u00c3\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2"+
		"\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2"+
		"\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2"+
		"\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2"+
		"\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\39\3"+
		"\2\2\2\5?\3\2\2\2\7D\3\2\2\2\tH\3\2\2\2\13L\3\2\2\2\rQ\3\2\2\2\17X\3\2"+
		"\2\2\21\\\3\2\2\2\23c\3\2\2\2\25l\3\2\2\2\27p\3\2\2\2\31t\3\2\2\2\33v"+
		"\3\2\2\2\35x\3\2\2\2\37z\3\2\2\2!}\3\2\2\2#\u0080\3\2\2\2%\u0083\3\2\2"+
		"\2\'\u0086\3\2\2\2)\u008a\3\2\2\2+\u0090\3\2\2\2-\u0094\3\2\2\2/\u00a3"+
		"\3\2\2\2\61\u00ae\3\2\2\2\63\u00b5\3\2\2\2\65\u00b7\3\2\2\2\67\u00ba\3"+
		"\2\2\29:\7o\2\2:;\7q\2\2;<\7f\2\2<=\7g\2\2=>\7n\2\2>\4\3\2\2\2?@\7D\2"+
		"\2@A\7q\2\2AB\7q\2\2BC\7n\2\2C\6\3\2\2\2DE\7K\2\2EF\7p\2\2FG\7v\2\2G\b"+
		"\3\2\2\2HI\7n\2\2IJ\7g\2\2JK\7v\2\2K\n\3\2\2\2LM\7v\2\2MN\7t\2\2NO\7w"+
		"\2\2OP\7g\2\2P\f\3\2\2\2QR\7h\2\2RS\7c\2\2ST\7n\2\2TU\7u\2\2UV\7g\2\2"+
		"V\16\3\2\2\2WY\t\2\2\2XW\3\2\2\2YZ\3\2\2\2ZX\3\2\2\2Z[\3\2\2\2[\20\3\2"+
		"\2\2\\]\7U\2\2]^\7v\2\2^_\7t\2\2_`\7k\2\2`a\7p\2\2ab\7i\2\2b\22\3\2\2"+
		"\2cg\7$\2\2df\n\3\2\2ed\3\2\2\2fi\3\2\2\2ge\3\2\2\2gh\3\2\2\2hj\3\2\2"+
		"\2ig\3\2\2\2jk\7$\2\2k\24\3\2\2\2lm\7k\2\2mn\7v\2\2no\7g\2\2o\26\3\2\2"+
		"\2pq\7c\2\2qr\7p\2\2rs\7f\2\2s\30\3\2\2\2tu\7?\2\2u\32\3\2\2\2vw\7/\2"+
		"\2w\34\3\2\2\2xy\7-\2\2y\36\3\2\2\2z{\7-\2\2{|\7-\2\2| \3\2\2\2}~\7>\2"+
		"\2~\177\7?\2\2\177\"\3\2\2\2\u0080\u0081\7@\2\2\u0081\u0082\7?\2\2\u0082"+
		"$\3\2\2\2\u0083\u0084\7q\2\2\u0084\u0085\7t\2\2\u0085&\3\2\2\2\u0086\u0087"+
		"\7p\2\2\u0087\u0088\7q\2\2\u0088\u0089\7v\2\2\u0089(\3\2\2\2\u008a\u008b"+
		"\7w\2\2\u008b\u008c\7p\2\2\u008c\u008d\7u\2\2\u008d\u008e\7c\2\2\u008e"+
		"\u008f\7v\2\2\u008f*\3\2\2\2\u0090\u0091\7u\2\2\u0091\u0092\7c\2\2\u0092"+
		"\u0093\7v\2\2\u0093,\3\2\2\2\u0094\u0095\7f\2\2\u0095\u0096\7g\2\2\u0096"+
		"\u0097\7h\2\2\u0097\u0098\7k\2\2\u0098\u0099\7p\2\2\u0099\u009a\7g\2\2"+
		"\u009a\u009b\7/\2\2\u009b\u009c\7h\2\2\u009c\u009d\7w\2\2\u009d\u009e"+
		"\7p\2\2\u009e\u009f\7/\2\2\u009f\u00a0\7t\2\2\u00a0\u00a1\7g\2\2\u00a1"+
		"\u00a2\7e\2\2\u00a2.\3\2\2\2\u00a3\u00a4\7f\2\2\u00a4\u00a5\7g\2\2\u00a5"+
		"\u00a6\7h\2\2\u00a6\u00a7\7k\2\2\u00a7\u00a8\7p\2\2\u00a8\u00a9\7g\2\2"+
		"\u00a9\u00aa\7/\2\2\u00aa\u00ab\7h\2\2\u00ab\u00ac\7w\2\2\u00ac\u00ad"+
		"\7p\2\2\u00ad\60\3\2\2\2\u00ae\u00b2\t\4\2\2\u00af\u00b1\t\5\2\2\u00b0"+
		"\u00af\3\2\2\2\u00b1\u00b4\3\2\2\2\u00b2\u00b0\3\2\2\2\u00b2\u00b3\3\2"+
		"\2\2\u00b3\62\3\2\2\2\u00b4\u00b2\3\2\2\2\u00b5\u00b6\7*\2\2\u00b6\64"+
		"\3\2\2\2\u00b7\u00b8\7+\2\2\u00b8\66\3\2\2\2\u00b9\u00bb\t\6\2\2\u00ba"+
		"\u00b9\3\2\2\2\u00bb\u00bc\3\2\2\2\u00bc\u00ba\3\2\2\2\u00bc\u00bd\3\2"+
		"\2\2\u00bd\u00be\3\2\2\2\u00be\u00bf\b\34\2\2\u00bf8\3\2\2\2\7\2Zg\u00b2"+
		"\u00bc\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}