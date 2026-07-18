// Generated from Hash.g4 by ANTLR 4.8
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class HashParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, ADAD=6, BOOLE=7, AGE=8, BOOD=9, 
		VAGARNA=10, TA=11, EDAME=12, SHEKAN=13, PRINT=14, TRUE=15, FALSE=16, PLUS=17, 
		MINUS=18, MUL=19, DIV=20, LT=21, GT=22, LE=23, GE=24, EQ=25, NEQ=26, IDENTIFIER=27, 
		NUMBER=28, WS=29;
	public static final int
		RULE_program = 0, RULE_statement = 1, RULE_assignment = 2, RULE_reassignment = 3, 
		RULE_type = 4, RULE_ifStatement = 5, RULE_whileLoop = 6, RULE_edameStatement = 7, 
		RULE_shekanStatement = 8, RULE_printStatement = 9, RULE_expression = 10, 
		RULE_comparison = 11, RULE_addition = 12, RULE_multiplication = 13, RULE_primary = 14;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "statement", "assignment", "reassignment", "type", "ifStatement", 
			"whileLoop", "edameStatement", "shekanStatement", "printStatement", "expression", 
			"comparison", "addition", "multiplication", "primary"
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HashListener ) ((HashListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HashListener ) ((HashListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HashVisitor ) return ((HashVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(33);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ADAD) | (1L << BOOLE) | (1L << AGE) | (1L << TA) | (1L << EDAME) | (1L << SHEKAN) | (1L << PRINT) | (1L << IDENTIFIER))) != 0)) {
				{
				{
				setState(30);
				statement();
				}
				}
				setState(35);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(36);
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

	public static class StatementContext extends ParserRuleContext {
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public ReassignmentContext reassignment() {
			return getRuleContext(ReassignmentContext.class,0);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HashListener ) ((HashListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HashListener ) ((HashListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HashVisitor ) return ((HashVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_statement);
		try {
			setState(45);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ADAD:
			case BOOLE:
				enterOuterAlt(_localctx, 1);
				{
				setState(38);
				assignment();
				}
				break;
			case IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(39);
				reassignment();
				}
				break;
			case AGE:
				enterOuterAlt(_localctx, 3);
				{
				setState(40);
				ifStatement();
				}
				break;
			case TA:
				enterOuterAlt(_localctx, 4);
				{
				setState(41);
				whileLoop();
				}
				break;
			case PRINT:
				enterOuterAlt(_localctx, 5);
				{
				setState(42);
				printStatement();
				}
				break;
			case EDAME:
				enterOuterAlt(_localctx, 6);
				{
				setState(43);
				edameStatement();
				}
				break;
			case SHEKAN:
				enterOuterAlt(_localctx, 7);
				{
				setState(44);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HashListener ) ((HashListener)listener).enterAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HashListener ) ((HashListener)listener).exitAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HashVisitor ) return ((HashVisitor<? extends T>)visitor).visitAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(47);
			type();
			setState(48);
			match(IDENTIFIER);
			setState(49);
			match(T__0);
			setState(50);
			expression();
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

	public static class ReassignmentContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(HashParser.IDENTIFIER, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ReassignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_reassignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HashListener ) ((HashListener)listener).enterReassignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HashListener ) ((HashListener)listener).exitReassignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HashVisitor ) return ((HashVisitor<? extends T>)visitor).visitReassignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReassignmentContext reassignment() throws RecognitionException {
		ReassignmentContext _localctx = new ReassignmentContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_reassignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(52);
			match(IDENTIFIER);
			setState(53);
			match(T__0);
			setState(54);
			expression();
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
		public TerminalNode ADAD() { return getToken(HashParser.ADAD, 0); }
		public TerminalNode BOOLE() { return getToken(HashParser.BOOLE, 0); }
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HashListener ) ((HashListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HashListener ) ((HashListener)listener).exitType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HashVisitor ) return ((HashVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(56);
			_la = _input.LA(1);
			if ( !(_la==ADAD || _la==BOOLE) ) {
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

	public static class IfStatementContext extends ParserRuleContext {
		public TerminalNode AGE() { return getToken(HashParser.AGE, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode BOOD() { return getToken(HashParser.BOOD, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public TerminalNode VAGARNA() { return getToken(HashParser.VAGARNA, 0); }
		public IfStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HashListener ) ((HashListener)listener).enterIfStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HashListener ) ((HashListener)listener).exitIfStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HashVisitor ) return ((HashVisitor<? extends T>)visitor).visitIfStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfStatementContext ifStatement() throws RecognitionException {
		IfStatementContext _localctx = new IfStatementContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_ifStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(58);
			match(AGE);
			setState(59);
			match(T__1);
			setState(60);
			expression();
			setState(61);
			match(T__2);
			setState(62);
			match(BOOD);
			setState(63);
			match(T__3);
			setState(67);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ADAD) | (1L << BOOLE) | (1L << AGE) | (1L << TA) | (1L << EDAME) | (1L << SHEKAN) | (1L << PRINT) | (1L << IDENTIFIER))) != 0)) {
				{
				{
				setState(64);
				statement();
				}
				}
				setState(69);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(70);
			match(T__4);
			setState(80);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==VAGARNA) {
				{
				setState(71);
				match(VAGARNA);
				setState(72);
				match(T__3);
				setState(76);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ADAD) | (1L << BOOLE) | (1L << AGE) | (1L << TA) | (1L << EDAME) | (1L << SHEKAN) | (1L << PRINT) | (1L << IDENTIFIER))) != 0)) {
					{
					{
					setState(73);
					statement();
					}
					}
					setState(78);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(79);
				match(T__4);
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

	public static class WhileLoopContext extends ParserRuleContext {
		public TerminalNode TA() { return getToken(HashParser.TA, 0); }
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HashListener ) ((HashListener)listener).enterWhileLoop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HashListener ) ((HashListener)listener).exitWhileLoop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HashVisitor ) return ((HashVisitor<? extends T>)visitor).visitWhileLoop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhileLoopContext whileLoop() throws RecognitionException {
		WhileLoopContext _localctx = new WhileLoopContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_whileLoop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(82);
			match(TA);
			setState(83);
			match(T__1);
			setState(84);
			expression();
			setState(85);
			match(T__2);
			setState(86);
			match(T__3);
			setState(90);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ADAD) | (1L << BOOLE) | (1L << AGE) | (1L << TA) | (1L << EDAME) | (1L << SHEKAN) | (1L << PRINT) | (1L << IDENTIFIER))) != 0)) {
				{
				{
				setState(87);
				statement();
				}
				}
				setState(92);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(93);
			match(T__4);
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

	public static class EdameStatementContext extends ParserRuleContext {
		public TerminalNode EDAME() { return getToken(HashParser.EDAME, 0); }
		public EdameStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_edameStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HashListener ) ((HashListener)listener).enterEdameStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HashListener ) ((HashListener)listener).exitEdameStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HashVisitor ) return ((HashVisitor<? extends T>)visitor).visitEdameStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EdameStatementContext edameStatement() throws RecognitionException {
		EdameStatementContext _localctx = new EdameStatementContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_edameStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(95);
			match(EDAME);
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

	public static class ShekanStatementContext extends ParserRuleContext {
		public TerminalNode SHEKAN() { return getToken(HashParser.SHEKAN, 0); }
		public ShekanStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_shekanStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HashListener ) ((HashListener)listener).enterShekanStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HashListener ) ((HashListener)listener).exitShekanStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HashVisitor ) return ((HashVisitor<? extends T>)visitor).visitShekanStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ShekanStatementContext shekanStatement() throws RecognitionException {
		ShekanStatementContext _localctx = new ShekanStatementContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_shekanStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(97);
			match(SHEKAN);
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

	public static class PrintStatementContext extends ParserRuleContext {
		public TerminalNode PRINT() { return getToken(HashParser.PRINT, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public PrintStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_printStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HashListener ) ((HashListener)listener).enterPrintStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HashListener ) ((HashListener)listener).exitPrintStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HashVisitor ) return ((HashVisitor<? extends T>)visitor).visitPrintStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrintStatementContext printStatement() throws RecognitionException {
		PrintStatementContext _localctx = new PrintStatementContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_printStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(99);
			match(PRINT);
			setState(100);
			match(T__1);
			setState(101);
			expression();
			setState(102);
			match(T__2);
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

	public static class ExpressionContext extends ParserRuleContext {
		public ComparisonContext comparison() {
			return getRuleContext(ComparisonContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HashListener ) ((HashListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HashListener ) ((HashListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HashVisitor ) return ((HashVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(104);
			comparison();
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

	public static class ComparisonContext extends ParserRuleContext {
		public List<AdditionContext> addition() {
			return getRuleContexts(AdditionContext.class);
		}
		public AdditionContext addition(int i) {
			return getRuleContext(AdditionContext.class,i);
		}
		public List<TerminalNode> LT() { return getTokens(HashParser.LT); }
		public TerminalNode LT(int i) {
			return getToken(HashParser.LT, i);
		}
		public List<TerminalNode> GT() { return getTokens(HashParser.GT); }
		public TerminalNode GT(int i) {
			return getToken(HashParser.GT, i);
		}
		public List<TerminalNode> LE() { return getTokens(HashParser.LE); }
		public TerminalNode LE(int i) {
			return getToken(HashParser.LE, i);
		}
		public List<TerminalNode> GE() { return getTokens(HashParser.GE); }
		public TerminalNode GE(int i) {
			return getToken(HashParser.GE, i);
		}
		public List<TerminalNode> EQ() { return getTokens(HashParser.EQ); }
		public TerminalNode EQ(int i) {
			return getToken(HashParser.EQ, i);
		}
		public List<TerminalNode> NEQ() { return getTokens(HashParser.NEQ); }
		public TerminalNode NEQ(int i) {
			return getToken(HashParser.NEQ, i);
		}
		public ComparisonContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparison; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HashListener ) ((HashListener)listener).enterComparison(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HashListener ) ((HashListener)listener).exitComparison(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HashVisitor ) return ((HashVisitor<? extends T>)visitor).visitComparison(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComparisonContext comparison() throws RecognitionException {
		ComparisonContext _localctx = new ComparisonContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_comparison);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(106);
			addition();
			setState(111);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LT) | (1L << GT) | (1L << LE) | (1L << GE) | (1L << EQ) | (1L << NEQ))) != 0)) {
				{
				{
				setState(107);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LT) | (1L << GT) | (1L << LE) | (1L << GE) | (1L << EQ) | (1L << NEQ))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(108);
				addition();
				}
				}
				setState(113);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class AdditionContext extends ParserRuleContext {
		public List<MultiplicationContext> multiplication() {
			return getRuleContexts(MultiplicationContext.class);
		}
		public MultiplicationContext multiplication(int i) {
			return getRuleContext(MultiplicationContext.class,i);
		}
		public List<TerminalNode> PLUS() { return getTokens(HashParser.PLUS); }
		public TerminalNode PLUS(int i) {
			return getToken(HashParser.PLUS, i);
		}
		public List<TerminalNode> MINUS() { return getTokens(HashParser.MINUS); }
		public TerminalNode MINUS(int i) {
			return getToken(HashParser.MINUS, i);
		}
		public AdditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_addition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HashListener ) ((HashListener)listener).enterAddition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HashListener ) ((HashListener)listener).exitAddition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HashVisitor ) return ((HashVisitor<? extends T>)visitor).visitAddition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AdditionContext addition() throws RecognitionException {
		AdditionContext _localctx = new AdditionContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_addition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(114);
			multiplication();
			setState(119);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PLUS || _la==MINUS) {
				{
				{
				setState(115);
				_la = _input.LA(1);
				if ( !(_la==PLUS || _la==MINUS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(116);
				multiplication();
				}
				}
				setState(121);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class MultiplicationContext extends ParserRuleContext {
		public List<PrimaryContext> primary() {
			return getRuleContexts(PrimaryContext.class);
		}
		public PrimaryContext primary(int i) {
			return getRuleContext(PrimaryContext.class,i);
		}
		public List<TerminalNode> MUL() { return getTokens(HashParser.MUL); }
		public TerminalNode MUL(int i) {
			return getToken(HashParser.MUL, i);
		}
		public List<TerminalNode> DIV() { return getTokens(HashParser.DIV); }
		public TerminalNode DIV(int i) {
			return getToken(HashParser.DIV, i);
		}
		public MultiplicationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiplication; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HashListener ) ((HashListener)listener).enterMultiplication(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HashListener ) ((HashListener)listener).exitMultiplication(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HashVisitor ) return ((HashVisitor<? extends T>)visitor).visitMultiplication(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MultiplicationContext multiplication() throws RecognitionException {
		MultiplicationContext _localctx = new MultiplicationContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_multiplication);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(122);
			primary();
			setState(127);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==MUL || _la==DIV) {
				{
				{
				setState(123);
				_la = _input.LA(1);
				if ( !(_la==MUL || _la==DIV) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(124);
				primary();
				}
				}
				setState(129);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class PrimaryContext extends ParserRuleContext {
		public TerminalNode NUMBER() { return getToken(HashParser.NUMBER, 0); }
		public TerminalNode TRUE() { return getToken(HashParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(HashParser.FALSE, 0); }
		public TerminalNode IDENTIFIER() { return getToken(HashParser.IDENTIFIER, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public PrimaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HashListener ) ((HashListener)listener).enterPrimary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HashListener ) ((HashListener)listener).exitPrimary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HashVisitor ) return ((HashVisitor<? extends T>)visitor).visitPrimary(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimaryContext primary() throws RecognitionException {
		PrimaryContext _localctx = new PrimaryContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_primary);
		try {
			setState(138);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUMBER:
				enterOuterAlt(_localctx, 1);
				{
				setState(130);
				match(NUMBER);
				}
				break;
			case TRUE:
				enterOuterAlt(_localctx, 2);
				{
				setState(131);
				match(TRUE);
				}
				break;
			case FALSE:
				enterOuterAlt(_localctx, 3);
				{
				setState(132);
				match(FALSE);
				}
				break;
			case IDENTIFIER:
				enterOuterAlt(_localctx, 4);
				{
				setState(133);
				match(IDENTIFIER);
				}
				break;
			case T__1:
				enterOuterAlt(_localctx, 5);
				{
				setState(134);
				match(T__1);
				setState(135);
				expression();
				setState(136);
				match(T__2);
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\37\u008f\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\3\2\7\2\"\n\2\f\2"+
		"\16\2%\13\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3\60\n\3\3\4\3\4\3\4"+
		"\3\4\3\4\3\5\3\5\3\5\3\5\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\7\7D\n\7"+
		"\f\7\16\7G\13\7\3\7\3\7\3\7\3\7\7\7M\n\7\f\7\16\7P\13\7\3\7\5\7S\n\7\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\7\b[\n\b\f\b\16\b^\13\b\3\b\3\b\3\t\3\t\3\n\3\n"+
		"\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\r\3\r\3\r\7\rp\n\r\f\r\16\rs\13\r"+
		"\3\16\3\16\3\16\7\16x\n\16\f\16\16\16{\13\16\3\17\3\17\3\17\7\17\u0080"+
		"\n\17\f\17\16\17\u0083\13\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\5"+
		"\20\u008d\n\20\3\20\2\2\21\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36\2\6"+
		"\3\2\b\t\3\2\27\34\3\2\23\24\3\2\25\26\2\u0091\2#\3\2\2\2\4/\3\2\2\2\6"+
		"\61\3\2\2\2\b\66\3\2\2\2\n:\3\2\2\2\f<\3\2\2\2\16T\3\2\2\2\20a\3\2\2\2"+
		"\22c\3\2\2\2\24e\3\2\2\2\26j\3\2\2\2\30l\3\2\2\2\32t\3\2\2\2\34|\3\2\2"+
		"\2\36\u008c\3\2\2\2 \"\5\4\3\2! \3\2\2\2\"%\3\2\2\2#!\3\2\2\2#$\3\2\2"+
		"\2$&\3\2\2\2%#\3\2\2\2&\'\7\2\2\3\'\3\3\2\2\2(\60\5\6\4\2)\60\5\b\5\2"+
		"*\60\5\f\7\2+\60\5\16\b\2,\60\5\24\13\2-\60\5\20\t\2.\60\5\22\n\2/(\3"+
		"\2\2\2/)\3\2\2\2/*\3\2\2\2/+\3\2\2\2/,\3\2\2\2/-\3\2\2\2/.\3\2\2\2\60"+
		"\5\3\2\2\2\61\62\5\n\6\2\62\63\7\35\2\2\63\64\7\3\2\2\64\65\5\26\f\2\65"+
		"\7\3\2\2\2\66\67\7\35\2\2\678\7\3\2\289\5\26\f\29\t\3\2\2\2:;\t\2\2\2"+
		";\13\3\2\2\2<=\7\n\2\2=>\7\4\2\2>?\5\26\f\2?@\7\5\2\2@A\7\13\2\2AE\7\6"+
		"\2\2BD\5\4\3\2CB\3\2\2\2DG\3\2\2\2EC\3\2\2\2EF\3\2\2\2FH\3\2\2\2GE\3\2"+
		"\2\2HR\7\7\2\2IJ\7\f\2\2JN\7\6\2\2KM\5\4\3\2LK\3\2\2\2MP\3\2\2\2NL\3\2"+
		"\2\2NO\3\2\2\2OQ\3\2\2\2PN\3\2\2\2QS\7\7\2\2RI\3\2\2\2RS\3\2\2\2S\r\3"+
		"\2\2\2TU\7\r\2\2UV\7\4\2\2VW\5\26\f\2WX\7\5\2\2X\\\7\6\2\2Y[\5\4\3\2Z"+
		"Y\3\2\2\2[^\3\2\2\2\\Z\3\2\2\2\\]\3\2\2\2]_\3\2\2\2^\\\3\2\2\2_`\7\7\2"+
		"\2`\17\3\2\2\2ab\7\16\2\2b\21\3\2\2\2cd\7\17\2\2d\23\3\2\2\2ef\7\20\2"+
		"\2fg\7\4\2\2gh\5\26\f\2hi\7\5\2\2i\25\3\2\2\2jk\5\30\r\2k\27\3\2\2\2l"+
		"q\5\32\16\2mn\t\3\2\2np\5\32\16\2om\3\2\2\2ps\3\2\2\2qo\3\2\2\2qr\3\2"+
		"\2\2r\31\3\2\2\2sq\3\2\2\2ty\5\34\17\2uv\t\4\2\2vx\5\34\17\2wu\3\2\2\2"+
		"x{\3\2\2\2yw\3\2\2\2yz\3\2\2\2z\33\3\2\2\2{y\3\2\2\2|\u0081\5\36\20\2"+
		"}~\t\5\2\2~\u0080\5\36\20\2\177}\3\2\2\2\u0080\u0083\3\2\2\2\u0081\177"+
		"\3\2\2\2\u0081\u0082\3\2\2\2\u0082\35\3\2\2\2\u0083\u0081\3\2\2\2\u0084"+
		"\u008d\7\36\2\2\u0085\u008d\7\21\2\2\u0086\u008d\7\22\2\2\u0087\u008d"+
		"\7\35\2\2\u0088\u0089\7\4\2\2\u0089\u008a\5\26\f\2\u008a\u008b\7\5\2\2"+
		"\u008b\u008d\3\2\2\2\u008c\u0084\3\2\2\2\u008c\u0085\3\2\2\2\u008c\u0086"+
		"\3\2\2\2\u008c\u0087\3\2\2\2\u008c\u0088\3\2\2\2\u008d\37\3\2\2\2\f#/"+
		"ENR\\qy\u0081\u008c";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}