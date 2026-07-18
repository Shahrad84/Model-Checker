// Generated from Hash.g4 by ANTLR 4.8
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class HashLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, ADAD=6, BOOLE=7, AGE=8, BOOD=9, 
		VAGARNA=10, TA=11, EDAME=12, SHEKAN=13, PRINT=14, TRUE=15, FALSE=16, PLUS=17, 
		MINUS=18, MUL=19, DIV=20, LT=21, GT=22, LE=23, GE=24, EQ=25, NEQ=26, IDENTIFIER=27, 
		NUMBER=28, WS=29;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "ADAD", "BOOLE", "AGE", "BOOD", 
			"VAGARNA", "TA", "EDAME", "SHEKAN", "PRINT", "TRUE", "FALSE", "PLUS", 
			"MINUS", "MUL", "DIV", "LT", "GT", "LE", "GE", "EQ", "NEQ", "IDENTIFIER", 
			"NUMBER", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'='", "'('", "')'", "'{'", "'}'", "'adad'", "'boole'", "'age'", 
			"'bood'", "'vagarna'", "'ta'", "'edame'", "'shekan'", "'print'", "'dorost'", 
			"'ghalat'", "'+'", "'-'", "'*'", "'/'", "'<'", "'>'", "'<='", "'>='", 
			"'=='", "'!='"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, "ADAD", "BOOLE", "AGE", "BOOD", "VAGARNA", 
			"TA", "EDAME", "SHEKAN", "PRINT", "TRUE", "FALSE", "PLUS", "MINUS", "MUL", 
			"DIV", "LT", "GT", "LE", "GE", "EQ", "NEQ", "IDENTIFIER", "NUMBER", "WS"
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


	public HashLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Hash.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\37\u00b2\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\3\2\3\2\3\3\3"+
		"\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3\25"+
		"\3\25\3\26\3\26\3\27\3\27\3\30\3\30\3\30\3\31\3\31\3\31\3\32\3\32\3\32"+
		"\3\33\3\33\3\33\3\34\3\34\7\34\u00a2\n\34\f\34\16\34\u00a5\13\34\3\35"+
		"\6\35\u00a8\n\35\r\35\16\35\u00a9\3\36\6\36\u00ad\n\36\r\36\16\36\u00ae"+
		"\3\36\3\36\2\2\37\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31"+
		"\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65"+
		"\34\67\359\36;\37\3\2\6\5\2C\\aac|\6\2\62;C\\aac|\3\2\62;\5\2\13\f\17"+
		"\17\"\"\2\u00b4\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3"+
		"\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2"+
		"\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3"+
		"\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2"+
		"\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\2"+
		"9\3\2\2\2\2;\3\2\2\2\3=\3\2\2\2\5?\3\2\2\2\7A\3\2\2\2\tC\3\2\2\2\13E\3"+
		"\2\2\2\rG\3\2\2\2\17L\3\2\2\2\21R\3\2\2\2\23V\3\2\2\2\25[\3\2\2\2\27c"+
		"\3\2\2\2\31f\3\2\2\2\33l\3\2\2\2\35s\3\2\2\2\37y\3\2\2\2!\u0080\3\2\2"+
		"\2#\u0087\3\2\2\2%\u0089\3\2\2\2\'\u008b\3\2\2\2)\u008d\3\2\2\2+\u008f"+
		"\3\2\2\2-\u0091\3\2\2\2/\u0093\3\2\2\2\61\u0096\3\2\2\2\63\u0099\3\2\2"+
		"\2\65\u009c\3\2\2\2\67\u009f\3\2\2\29\u00a7\3\2\2\2;\u00ac\3\2\2\2=>\7"+
		"?\2\2>\4\3\2\2\2?@\7*\2\2@\6\3\2\2\2AB\7+\2\2B\b\3\2\2\2CD\7}\2\2D\n\3"+
		"\2\2\2EF\7\177\2\2F\f\3\2\2\2GH\7c\2\2HI\7f\2\2IJ\7c\2\2JK\7f\2\2K\16"+
		"\3\2\2\2LM\7d\2\2MN\7q\2\2NO\7q\2\2OP\7n\2\2PQ\7g\2\2Q\20\3\2\2\2RS\7"+
		"c\2\2ST\7i\2\2TU\7g\2\2U\22\3\2\2\2VW\7d\2\2WX\7q\2\2XY\7q\2\2YZ\7f\2"+
		"\2Z\24\3\2\2\2[\\\7x\2\2\\]\7c\2\2]^\7i\2\2^_\7c\2\2_`\7t\2\2`a\7p\2\2"+
		"ab\7c\2\2b\26\3\2\2\2cd\7v\2\2de\7c\2\2e\30\3\2\2\2fg\7g\2\2gh\7f\2\2"+
		"hi\7c\2\2ij\7o\2\2jk\7g\2\2k\32\3\2\2\2lm\7u\2\2mn\7j\2\2no\7g\2\2op\7"+
		"m\2\2pq\7c\2\2qr\7p\2\2r\34\3\2\2\2st\7r\2\2tu\7t\2\2uv\7k\2\2vw\7p\2"+
		"\2wx\7v\2\2x\36\3\2\2\2yz\7f\2\2z{\7q\2\2{|\7t\2\2|}\7q\2\2}~\7u\2\2~"+
		"\177\7v\2\2\177 \3\2\2\2\u0080\u0081\7i\2\2\u0081\u0082\7j\2\2\u0082\u0083"+
		"\7c\2\2\u0083\u0084\7n\2\2\u0084\u0085\7c\2\2\u0085\u0086\7v\2\2\u0086"+
		"\"\3\2\2\2\u0087\u0088\7-\2\2\u0088$\3\2\2\2\u0089\u008a\7/\2\2\u008a"+
		"&\3\2\2\2\u008b\u008c\7,\2\2\u008c(\3\2\2\2\u008d\u008e\7\61\2\2\u008e"+
		"*\3\2\2\2\u008f\u0090\7>\2\2\u0090,\3\2\2\2\u0091\u0092\7@\2\2\u0092."+
		"\3\2\2\2\u0093\u0094\7>\2\2\u0094\u0095\7?\2\2\u0095\60\3\2\2\2\u0096"+
		"\u0097\7@\2\2\u0097\u0098\7?\2\2\u0098\62\3\2\2\2\u0099\u009a\7?\2\2\u009a"+
		"\u009b\7?\2\2\u009b\64\3\2\2\2\u009c\u009d\7#\2\2\u009d\u009e\7?\2\2\u009e"+
		"\66\3\2\2\2\u009f\u00a3\t\2\2\2\u00a0\u00a2\t\3\2\2\u00a1\u00a0\3\2\2"+
		"\2\u00a2\u00a5\3\2\2\2\u00a3\u00a1\3\2\2\2\u00a3\u00a4\3\2\2\2\u00a48"+
		"\3\2\2\2\u00a5\u00a3\3\2\2\2\u00a6\u00a8\t\4\2\2\u00a7\u00a6\3\2\2\2\u00a8"+
		"\u00a9\3\2\2\2\u00a9\u00a7\3\2\2\2\u00a9\u00aa\3\2\2\2\u00aa:\3\2\2\2"+
		"\u00ab\u00ad\t\5\2\2\u00ac\u00ab\3\2\2\2\u00ad\u00ae\3\2\2\2\u00ae\u00ac"+
		"\3\2\2\2\u00ae\u00af\3\2\2\2\u00af\u00b0\3\2\2\2\u00b0\u00b1\b\36\2\2"+
		"\u00b1<\3\2\2\2\6\2\u00a3\u00a9\u00ae\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}