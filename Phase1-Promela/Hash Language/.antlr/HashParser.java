// Generated from e:/Abdoreza Sevadi Projects/Model Checker/Phase1-Promela/Hash Language/Hash.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class HashParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, IDENTIFIER=23, NUMBER=24, 
		WS=25;
	public static final int
		RULE_program = 0, RULE_statement = 1, RULE_assignment = 2, RULE_type = 3, 
		RULE_ifStatement = 4, RULE_whileLoop = 5, RULE_edameStatement = 6, RULE_shekanStatement = 7, 
		RULE_printStatement = 8, RULE_expression = 9;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "statement", "assignment", "type", "ifStatement", "whileLoop", 
			"edameStatement", "shekanStatement", "printStatement", "expression"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'='", "'adad'", "'boole'", "'age'", "'('", "')'", "'bood'", "'{'", 
			"'}'", "'vagarna'", "'ta'", "'edame'", "'shekan'", "'print'", "'*'", 
			"'/'", "'+'", "'-'", "'<'", "'>'", "'=='", "'!='"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, "IDENTIFIER", 
			"NUMBER", "WS"
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
	public String getGrammarFileName() { return "Hash.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public HashParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(HashParser.EOF, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(23);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 30748L) != 0)) {
				{
				{
				setState(20);
				statement();
				}
				}
				setState(25);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(26);
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

	@SuppressWarnings("CheckReturnValue")
	public static class StatementContext extends ParserRuleContext {
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public IfStatementContext ifStatement() {
			return getRuleContext(IfStatementContext.class,0);
		}
		public WhileLoopContext whileLoop() {
			return getRuleContext(WhileLoopContext.class,0);
		}
		public PrintStatementContext printStatement() {
			return getRuleContext(PrintStatementContext.class,0);
		}
		public EdameStatementContext edameStatement() {
			return getRuleContext(EdameStatementContext.class,0);
		}
		public ShekanStatementContext shekanStatement() {
			return getRuleContext(ShekanStatementContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_statement);
		try {
			setState(34);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
			case T__2:
				enterOuterAlt(_localctx, 1);
				{
				setState(28);
				assignment();
				}
				break;
			case T__3:
				enterOuterAlt(_localctx, 2);
				{
				setState(29);
				ifStatement();
				}
				break;
			case T__10:
				enterOuterAlt(_localctx, 3);
				{
				setState(30);
				whileLoop();
				}
				break;
			case T__13:
				enterOuterAlt(_localctx, 4);
				{
				setState(31);
				printStatement();
				}
				break;
			case T__11:
				enterOuterAlt(_localctx, 5);
				{
				setState(32);
				edameStatement();
				}
				break;
			case T__12:
				enterOuterAlt(_localctx, 6);
				{
				setState(33);
				shekanStatement();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	@SuppressWarnings("CheckReturnValue")
	public static class AssignmentContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(HashParser.IDENTIFIER, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(36);
			type();
			setState(37);
			match(IDENTIFIER);
			setState(38);
			match(T__0);
			setState(39);
			expression(0);
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

	@SuppressWarnings("CheckReturnValue")
	public static class TypeContext extends ParserRuleContext {
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(41);
			_la = _input.LA(1);
			if ( !(_la==T__1 || _la==T__2) ) {
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

	@SuppressWarnings("CheckReturnValue")
	public static class IfStatementContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public IfStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStatement; }
	}

	public final IfStatementContext ifStatement() throws RecognitionException {
		IfStatementContext _localctx = new IfStatementContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_ifStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(43);
			match(T__3);
			setState(44);
			match(T__4);
			setState(45);
			expression(0);
			setState(46);
			match(T__5);
			setState(47);
			match(T__6);
			setState(48);
			match(T__7);
			setState(52);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 30748L) != 0)) {
				{
				{
				setState(49);
				statement();
				}
				}
				setState(54);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(55);
			match(T__8);
			setState(65);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__9) {
				{
				setState(56);
				match(T__9);
				setState(57);
				match(T__7);
				setState(61);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 30748L) != 0)) {
					{
					{
					setState(58);
					statement();
					}
					}
					setState(63);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(64);
				match(T__8);
				}
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

	@SuppressWarnings("CheckReturnValue")
	public static class WhileLoopContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public WhileLoopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileLoop; }
	}

	public final WhileLoopContext whileLoop() throws RecognitionException {
		WhileLoopContext _localctx = new WhileLoopContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_whileLoop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(67);
			match(T__10);
			setState(68);
			match(T__4);
			setState(69);
			expression(0);
			setState(70);
			match(T__5);
			setState(71);
			match(T__7);
			setState(75);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 30748L) != 0)) {
				{
				{
				setState(72);
				statement();
				}
				}
				setState(77);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(78);
			match(T__8);
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

	@SuppressWarnings("CheckReturnValue")
	public static class EdameStatementContext extends ParserRuleContext {
		public EdameStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_edameStatement; }
	}

	public final EdameStatementContext edameStatement() throws RecognitionException {
		EdameStatementContext _localctx = new EdameStatementContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_edameStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(80);
			match(T__11);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ShekanStatementContext extends ParserRuleContext {
		public ShekanStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_shekanStatement; }
	}

	public final ShekanStatementContext shekanStatement() throws RecognitionException {
		ShekanStatementContext _localctx = new ShekanStatementContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_shekanStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(82);
			match(T__12);
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

	@SuppressWarnings("CheckReturnValue")
	public static class PrintStatementContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public PrintStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_printStatement; }
	}

	public final PrintStatementContext printStatement() throws RecognitionException {
		PrintStatementContext _localctx = new PrintStatementContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_printStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(84);
			match(T__13);
			setState(85);
			match(T__4);
			setState(86);
			expression(0);
			setState(87);
			match(T__5);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionContext extends ParserRuleContext {
		public Token op;
		public TerminalNode IDENTIFIER() { return getToken(HashParser.IDENTIFIER, 0); }
		public TerminalNode NUMBER() { return getToken(HashParser.NUMBER, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 18;
		enterRecursionRule(_localctx, 18, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(96);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				{
				setState(90);
				match(IDENTIFIER);
				}
				break;
			case NUMBER:
				{
				setState(91);
				match(NUMBER);
				}
				break;
			case T__4:
				{
				setState(92);
				match(T__4);
				setState(93);
				expression(0);
				setState(94);
				match(T__5);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(109);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(107);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(98);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(99);
						((ExpressionContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__14 || _la==T__15) ) {
							((ExpressionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(100);
						expression(5);
						}
						break;
					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(101);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(102);
						((ExpressionContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__16 || _la==T__17) ) {
							((ExpressionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(103);
						expression(4);
						}
						break;
					case 3:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(104);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(105);
						((ExpressionContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 7864320L) != 0)) ) {
							((ExpressionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(106);
						expression(3);
						}
						break;
					}
					} 
				}
				setState(111);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 9:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 4);
		case 1:
			return precpred(_ctx, 3);
		case 2:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001\u0019q\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0001\u0000\u0005\u0000\u0016\b\u0000\n\u0000"+
		"\f\u0000\u0019\t\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001#\b\u0001"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003"+
		"\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0005\u00043\b\u0004\n\u0004\f\u00046\t\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0005\u0004<\b\u0004"+
		"\n\u0004\f\u0004?\t\u0004\u0001\u0004\u0003\u0004B\b\u0004\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0005\u0005"+
		"J\b\u0005\n\u0005\f\u0005M\t\u0005\u0001\u0005\u0001\u0005\u0001\u0006"+
		"\u0001\u0006\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0003\ta\b"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0005\tl\b\t\n\t\f\to\t\t\u0001\t\u0000\u0001\u0012\n\u0000\u0002\u0004"+
		"\u0006\b\n\f\u000e\u0010\u0012\u0000\u0004\u0001\u0000\u0002\u0003\u0001"+
		"\u0000\u000f\u0010\u0001\u0000\u0011\u0012\u0001\u0000\u0013\u0016u\u0000"+
		"\u0017\u0001\u0000\u0000\u0000\u0002\"\u0001\u0000\u0000\u0000\u0004$"+
		"\u0001\u0000\u0000\u0000\u0006)\u0001\u0000\u0000\u0000\b+\u0001\u0000"+
		"\u0000\u0000\nC\u0001\u0000\u0000\u0000\fP\u0001\u0000\u0000\u0000\u000e"+
		"R\u0001\u0000\u0000\u0000\u0010T\u0001\u0000\u0000\u0000\u0012`\u0001"+
		"\u0000\u0000\u0000\u0014\u0016\u0003\u0002\u0001\u0000\u0015\u0014\u0001"+
		"\u0000\u0000\u0000\u0016\u0019\u0001\u0000\u0000\u0000\u0017\u0015\u0001"+
		"\u0000\u0000\u0000\u0017\u0018\u0001\u0000\u0000\u0000\u0018\u001a\u0001"+
		"\u0000\u0000\u0000\u0019\u0017\u0001\u0000\u0000\u0000\u001a\u001b\u0005"+
		"\u0000\u0000\u0001\u001b\u0001\u0001\u0000\u0000\u0000\u001c#\u0003\u0004"+
		"\u0002\u0000\u001d#\u0003\b\u0004\u0000\u001e#\u0003\n\u0005\u0000\u001f"+
		"#\u0003\u0010\b\u0000 #\u0003\f\u0006\u0000!#\u0003\u000e\u0007\u0000"+
		"\"\u001c\u0001\u0000\u0000\u0000\"\u001d\u0001\u0000\u0000\u0000\"\u001e"+
		"\u0001\u0000\u0000\u0000\"\u001f\u0001\u0000\u0000\u0000\" \u0001\u0000"+
		"\u0000\u0000\"!\u0001\u0000\u0000\u0000#\u0003\u0001\u0000\u0000\u0000"+
		"$%\u0003\u0006\u0003\u0000%&\u0005\u0017\u0000\u0000&\'\u0005\u0001\u0000"+
		"\u0000\'(\u0003\u0012\t\u0000(\u0005\u0001\u0000\u0000\u0000)*\u0007\u0000"+
		"\u0000\u0000*\u0007\u0001\u0000\u0000\u0000+,\u0005\u0004\u0000\u0000"+
		",-\u0005\u0005\u0000\u0000-.\u0003\u0012\t\u0000./\u0005\u0006\u0000\u0000"+
		"/0\u0005\u0007\u0000\u000004\u0005\b\u0000\u000013\u0003\u0002\u0001\u0000"+
		"21\u0001\u0000\u0000\u000036\u0001\u0000\u0000\u000042\u0001\u0000\u0000"+
		"\u000045\u0001\u0000\u0000\u000057\u0001\u0000\u0000\u000064\u0001\u0000"+
		"\u0000\u00007A\u0005\t\u0000\u000089\u0005\n\u0000\u00009=\u0005\b\u0000"+
		"\u0000:<\u0003\u0002\u0001\u0000;:\u0001\u0000\u0000\u0000<?\u0001\u0000"+
		"\u0000\u0000=;\u0001\u0000\u0000\u0000=>\u0001\u0000\u0000\u0000>@\u0001"+
		"\u0000\u0000\u0000?=\u0001\u0000\u0000\u0000@B\u0005\t\u0000\u0000A8\u0001"+
		"\u0000\u0000\u0000AB\u0001\u0000\u0000\u0000B\t\u0001\u0000\u0000\u0000"+
		"CD\u0005\u000b\u0000\u0000DE\u0005\u0005\u0000\u0000EF\u0003\u0012\t\u0000"+
		"FG\u0005\u0006\u0000\u0000GK\u0005\b\u0000\u0000HJ\u0003\u0002\u0001\u0000"+
		"IH\u0001\u0000\u0000\u0000JM\u0001\u0000\u0000\u0000KI\u0001\u0000\u0000"+
		"\u0000KL\u0001\u0000\u0000\u0000LN\u0001\u0000\u0000\u0000MK\u0001\u0000"+
		"\u0000\u0000NO\u0005\t\u0000\u0000O\u000b\u0001\u0000\u0000\u0000PQ\u0005"+
		"\f\u0000\u0000Q\r\u0001\u0000\u0000\u0000RS\u0005\r\u0000\u0000S\u000f"+
		"\u0001\u0000\u0000\u0000TU\u0005\u000e\u0000\u0000UV\u0005\u0005\u0000"+
		"\u0000VW\u0003\u0012\t\u0000WX\u0005\u0006\u0000\u0000X\u0011\u0001\u0000"+
		"\u0000\u0000YZ\u0006\t\uffff\uffff\u0000Za\u0005\u0017\u0000\u0000[a\u0005"+
		"\u0018\u0000\u0000\\]\u0005\u0005\u0000\u0000]^\u0003\u0012\t\u0000^_"+
		"\u0005\u0006\u0000\u0000_a\u0001\u0000\u0000\u0000`Y\u0001\u0000\u0000"+
		"\u0000`[\u0001\u0000\u0000\u0000`\\\u0001\u0000\u0000\u0000am\u0001\u0000"+
		"\u0000\u0000bc\n\u0004\u0000\u0000cd\u0007\u0001\u0000\u0000dl\u0003\u0012"+
		"\t\u0005ef\n\u0003\u0000\u0000fg\u0007\u0002\u0000\u0000gl\u0003\u0012"+
		"\t\u0004hi\n\u0002\u0000\u0000ij\u0007\u0003\u0000\u0000jl\u0003\u0012"+
		"\t\u0003kb\u0001\u0000\u0000\u0000ke\u0001\u0000\u0000\u0000kh\u0001\u0000"+
		"\u0000\u0000lo\u0001\u0000\u0000\u0000mk\u0001\u0000\u0000\u0000mn\u0001"+
		"\u0000\u0000\u0000n\u0013\u0001\u0000\u0000\u0000om\u0001\u0000\u0000"+
		"\u0000\t\u0017\"4=AK`km";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}