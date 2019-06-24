// Generated from vdocs.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class vdocsLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		NAMEDELEMENT=1, COLON=2, SEMICOLON=3, STRING=4, WS=5, COMMENT=6, LINE_COMMENT=7;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"NAMEDELEMENT", "COLON", "SEMICOLON", "STRING", "WS", "COMMENT", "LINE_COMMENT", 
			"ESC_SEQ", "OCTAL_ESC", "HEX_DIGIT", "UNICODE_ESC"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, "':'", "';'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "NAMEDELEMENT", "COLON", "SEMICOLON", "STRING", "WS", "COMMENT", 
			"LINE_COMMENT"
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


	public vdocsLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "vdocs.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\tw\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\3\2\3\2\7\2\34\n\2\f\2\16\2\37\13\2\3\3\3\3\3\4\3\4\3\5\3"+
		"\5\3\5\7\5(\n\5\f\5\16\5+\13\5\3\5\3\5\3\5\3\5\7\5\61\n\5\f\5\16\5\64"+
		"\13\5\3\5\5\5\67\n\5\3\6\6\6:\n\6\r\6\16\6;\3\6\3\6\3\7\3\7\3\7\3\7\7"+
		"\7D\n\7\f\7\16\7G\13\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\7\bR\n\b\f"+
		"\b\16\bU\13\b\3\b\5\bX\n\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\5\tb\n\t\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\nm\n\n\3\13\3\13\3\f\3\f\3\f\3\f"+
		"\3\f\3\f\3\f\3E\2\r\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\2\23\2\25\2\27\2"+
		"\3\2\n\5\2B\\aac|\7\2//\62;B\\aac|\4\2$$^^\4\2))^^\5\2\13\f\16\17\"\""+
		"\4\2\f\f\17\17\n\2$$))^^ddhhppttvv\5\2\62;CHch\2\u0080\2\3\3\2\2\2\2\5"+
		"\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2"+
		"\3\31\3\2\2\2\5 \3\2\2\2\7\"\3\2\2\2\t\66\3\2\2\2\139\3\2\2\2\r?\3\2\2"+
		"\2\17M\3\2\2\2\21a\3\2\2\2\23l\3\2\2\2\25n\3\2\2\2\27p\3\2\2\2\31\35\t"+
		"\2\2\2\32\34\t\3\2\2\33\32\3\2\2\2\34\37\3\2\2\2\35\33\3\2\2\2\35\36\3"+
		"\2\2\2\36\4\3\2\2\2\37\35\3\2\2\2 !\7<\2\2!\6\3\2\2\2\"#\7=\2\2#\b\3\2"+
		"\2\2$)\7$\2\2%(\5\21\t\2&(\n\4\2\2\'%\3\2\2\2\'&\3\2\2\2(+\3\2\2\2)\'"+
		"\3\2\2\2)*\3\2\2\2*,\3\2\2\2+)\3\2\2\2,\67\7$\2\2-\62\7)\2\2.\61\5\21"+
		"\t\2/\61\n\5\2\2\60.\3\2\2\2\60/\3\2\2\2\61\64\3\2\2\2\62\60\3\2\2\2\62"+
		"\63\3\2\2\2\63\65\3\2\2\2\64\62\3\2\2\2\65\67\7)\2\2\66$\3\2\2\2\66-\3"+
		"\2\2\2\67\n\3\2\2\28:\t\6\2\298\3\2\2\2:;\3\2\2\2;9\3\2\2\2;<\3\2\2\2"+
		"<=\3\2\2\2=>\b\6\2\2>\f\3\2\2\2?@\7\61\2\2@A\7,\2\2AE\3\2\2\2BD\13\2\2"+
		"\2CB\3\2\2\2DG\3\2\2\2EF\3\2\2\2EC\3\2\2\2FH\3\2\2\2GE\3\2\2\2HI\7,\2"+
		"\2IJ\7\61\2\2JK\3\2\2\2KL\b\7\2\2L\16\3\2\2\2MN\7\61\2\2NO\7\61\2\2OS"+
		"\3\2\2\2PR\n\7\2\2QP\3\2\2\2RU\3\2\2\2SQ\3\2\2\2ST\3\2\2\2TW\3\2\2\2U"+
		"S\3\2\2\2VX\7\17\2\2WV\3\2\2\2WX\3\2\2\2XY\3\2\2\2YZ\7\f\2\2Z[\3\2\2\2"+
		"[\\\b\b\2\2\\\20\3\2\2\2]^\7^\2\2^b\t\b\2\2_b\5\27\f\2`b\5\23\n\2a]\3"+
		"\2\2\2a_\3\2\2\2a`\3\2\2\2b\22\3\2\2\2cd\7^\2\2de\4\62\65\2ef\4\629\2"+
		"fm\4\629\2gh\7^\2\2hi\4\629\2im\4\629\2jk\7^\2\2km\4\629\2lc\3\2\2\2l"+
		"g\3\2\2\2lj\3\2\2\2m\24\3\2\2\2no\t\t\2\2o\26\3\2\2\2pq\7^\2\2qr\7w\2"+
		"\2rs\5\25\13\2st\5\25\13\2tu\5\25\13\2uv\5\25\13\2v\30\3\2\2\2\17\2\35"+
		"\')\60\62\66;ESWal\3\2\3\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}