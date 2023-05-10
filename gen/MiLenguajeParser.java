// Generated from C:/Games/lenguajes3/grammar\MiLenguaje.g4 by ANTLR 4.12.0
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class MiLenguajeParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.12.0", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, TRUE=21, FALSE=22, TKN_PERIOD=23, TKN_EQUALS=24, 
		TKN_COMMA=25, TKN_COLON=26, TKN_LEFT_BRAC=27, TKN_RIGHT_BRAC=28, TKN_LEFT_PAREN=29, 
		TKN_RIGHT_PAREN=30, TKN_PLUS=31, TKN_MINUS=32, TKN_TIMES=33, TKN_DIV=34, 
		TKN_DIFF=35, TKN_LESS=36, TKN_LEQ=37, TKN_GREATER=38, TKN_GEQ=39, TKN_NUMBER=40, 
		TKN_TEXT=41, ID=42, WS=43;
	public static final int
		RULE_s = 0, RULE_srecursion = 1, RULE_routrecursion = 2, RULE_x = 3, RULE_types = 4, 
		RULE_xrecursion = 5, RULE_built = 6, RULE_bifunction = 7, RULE_params = 8, 
		RULE_paramsp = 9, RULE_xp = 10, RULE_conditional = 11, RULE_ei = 12, RULE_else = 13, 
		RULE_while = 14, RULE_for = 15, RULE_step = 16, RULE_etiq = 17, RULE_goto = 18, 
		RULE_routine = 19, RULE_xorempty = 20, RULE_exec = 21, RULE_corch = 22, 
		RULE_mem = 23, RULE_memp = 24, RULE_a = 25, RULE_asig = 26, RULE_b = 27, 
		RULE_bp = 28, RULE_c = 29, RULE_cp = 30, RULE_d = 31, RULE_dp = 32, RULE_e = 33, 
		RULE_ep = 34, RULE_f = 35, RULE_g = 36;
	private static String[] makeRuleNames() {
		return new String[] {
			"s", "srecursion", "routrecursion", "x", "types", "xrecursion", "built", 
			"bifunction", "params", "paramsp", "xp", "conditional", "ei", "else", 
			"while", "for", "step", "etiq", "goto", "routine", "xorempty", "exec", 
			"corch", "mem", "memp", "a", "asig", "b", "bp", "c", "cp", "d", "dp", 
			"e", "ep", "f", "g"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'Array'", "'Stack'", "'Program'", "'TextWindow'", "'If'", "'Then'", 
			"'EndIf'", "'ElseIf'", "'Else'", "'While'", "'EndWhile'", "'For'", "'To'", 
			"'EndFor'", "'Step'", "'Goto'", "'Sub'", "'EndSub'", "'And'", "'Or'", 
			null, null, "'.'", "'='", "','", "':'", "'['", "']'", "'('", "')'", "'+'", 
			"'-'", "'*'", "'/'", "'<>'", "'<'", "'<='", "'>'", "'>='"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, "TRUE", "FALSE", 
			"TKN_PERIOD", "TKN_EQUALS", "TKN_COMMA", "TKN_COLON", "TKN_LEFT_BRAC", 
			"TKN_RIGHT_BRAC", "TKN_LEFT_PAREN", "TKN_RIGHT_PAREN", "TKN_PLUS", "TKN_MINUS", 
			"TKN_TIMES", "TKN_DIV", "TKN_DIFF", "TKN_LESS", "TKN_LEQ", "TKN_GREATER", 
			"TKN_GEQ", "TKN_NUMBER", "TKN_TEXT", "ID", "WS"
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
	public String getGrammarFileName() { return "MiLenguaje.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public MiLenguajeParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SContext extends ParserRuleContext {
		public RoutineContext routine() {
			return getRuleContext(RoutineContext.class,0);
		}
		public SrecursionContext srecursion() {
			return getRuleContext(SrecursionContext.class,0);
		}
		public TerminalNode EOF() { return getToken(MiLenguajeParser.EOF, 0); }
		public XContext x() {
			return getRuleContext(XContext.class,0);
		}
		public RoutrecursionContext routrecursion() {
			return getRuleContext(RoutrecursionContext.class,0);
		}
		public SContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_s; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).enterS(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).exitS(this);
		}
	}

	public final SContext s() throws RecognitionException {
		SContext _localctx = new SContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_s);
		try {
			setState(83);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__16:
				enterOuterAlt(_localctx, 1);
				{
				setState(74);
				routine();
				setState(75);
				srecursion();
				setState(76);
				match(EOF);
				}
				break;
			case T__0:
			case T__1:
			case T__2:
			case T__3:
			case T__4:
			case T__9:
			case T__11:
			case T__15:
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(78);
				x();
				setState(79);
				routrecursion();
				setState(80);
				match(EOF);
				}
				break;
			case EOF:
				enterOuterAlt(_localctx, 3);
				{
				setState(82);
				match(EOF);
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
	public static class SrecursionContext extends ParserRuleContext {
		public SContext s() {
			return getRuleContext(SContext.class,0);
		}
		public SrecursionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_srecursion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).enterSrecursion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).exitSrecursion(this);
		}
	}

	public final SrecursionContext srecursion() throws RecognitionException {
		SrecursionContext _localctx = new SrecursionContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_srecursion);
		try {
			setState(87);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(85);
				s();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
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

	@SuppressWarnings("CheckReturnValue")
	public static class RoutrecursionContext extends ParserRuleContext {
		public RoutineContext routine() {
			return getRuleContext(RoutineContext.class,0);
		}
		public SrecursionContext srecursion() {
			return getRuleContext(SrecursionContext.class,0);
		}
		public RoutrecursionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_routrecursion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).enterRoutrecursion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).exitRoutrecursion(this);
		}
	}

	public final RoutrecursionContext routrecursion() throws RecognitionException {
		RoutrecursionContext _localctx = new RoutrecursionContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_routrecursion);
		try {
			setState(93);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__16:
				enterOuterAlt(_localctx, 1);
				{
				setState(89);
				routine();
				setState(90);
				srecursion();
				}
				break;
			case EOF:
				enterOuterAlt(_localctx, 2);
				{
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
	public static class XContext extends ParserRuleContext {
		public TypesContext types() {
			return getRuleContext(TypesContext.class,0);
		}
		public XrecursionContext xrecursion() {
			return getRuleContext(XrecursionContext.class,0);
		}
		public XContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_x; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).enterX(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).exitX(this);
		}
	}

	public final XContext x() throws RecognitionException {
		XContext _localctx = new XContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_x);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(95);
			types();
			setState(96);
			xrecursion();
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
	public static class TypesContext extends ParserRuleContext {
		public ConditionalContext conditional() {
			return getRuleContext(ConditionalContext.class,0);
		}
		public ForContext for_() {
			return getRuleContext(ForContext.class,0);
		}
		public WhileContext while_() {
			return getRuleContext(WhileContext.class,0);
		}
		public TerminalNode ID() { return getToken(MiLenguajeParser.ID, 0); }
		public XpContext xp() {
			return getRuleContext(XpContext.class,0);
		}
		public GotoContext goto_() {
			return getRuleContext(GotoContext.class,0);
		}
		public BuiltContext built() {
			return getRuleContext(BuiltContext.class,0);
		}
		public TypesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_types; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).enterTypes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).exitTypes(this);
		}
	}

	public final TypesContext types() throws RecognitionException {
		TypesContext _localctx = new TypesContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_types);
		try {
			setState(105);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__4:
				enterOuterAlt(_localctx, 1);
				{
				setState(98);
				conditional();
				}
				break;
			case T__11:
				enterOuterAlt(_localctx, 2);
				{
				setState(99);
				for_();
				}
				break;
			case T__9:
				enterOuterAlt(_localctx, 3);
				{
				setState(100);
				while_();
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 4);
				{
				setState(101);
				match(ID);
				setState(102);
				xp();
				}
				break;
			case T__15:
				enterOuterAlt(_localctx, 5);
				{
				setState(103);
				goto_();
				}
				break;
			case T__0:
			case T__1:
			case T__2:
			case T__3:
				enterOuterAlt(_localctx, 6);
				{
				setState(104);
				built();
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
	public static class XrecursionContext extends ParserRuleContext {
		public XContext x() {
			return getRuleContext(XContext.class,0);
		}
		public XrecursionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_xrecursion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).enterXrecursion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).exitXrecursion(this);
		}
	}

	public final XrecursionContext xrecursion() throws RecognitionException {
		XrecursionContext _localctx = new XrecursionContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_xrecursion);
		try {
			setState(109);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
			case T__1:
			case T__2:
			case T__3:
			case T__4:
			case T__9:
			case T__11:
			case T__15:
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(107);
				x();
				}
				break;
			case EOF:
			case T__6:
			case T__7:
			case T__8:
			case T__10:
			case T__13:
			case T__16:
			case T__17:
				enterOuterAlt(_localctx, 2);
				{
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
	public static class BuiltContext extends ParserRuleContext {
		public BifunctionContext bifunction() {
			return getRuleContext(BifunctionContext.class,0);
		}
		public BuiltContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_built; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).enterBuilt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).exitBuilt(this);
		}
	}

	public final BuiltContext built() throws RecognitionException {
		BuiltContext _localctx = new BuiltContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_built);
		try {
			setState(119);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
				enterOuterAlt(_localctx, 1);
				{
				setState(111);
				match(T__0);
				setState(112);
				bifunction();
				}
				break;
			case T__1:
				enterOuterAlt(_localctx, 2);
				{
				setState(113);
				match(T__1);
				setState(114);
				bifunction();
				}
				break;
			case T__2:
				enterOuterAlt(_localctx, 3);
				{
				setState(115);
				match(T__2);
				setState(116);
				bifunction();
				}
				break;
			case T__3:
				enterOuterAlt(_localctx, 4);
				{
				setState(117);
				match(T__3);
				setState(118);
				bifunction();
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
	public static class BifunctionContext extends ParserRuleContext {
		public TerminalNode TKN_PERIOD() { return getToken(MiLenguajeParser.TKN_PERIOD, 0); }
		public TerminalNode ID() { return getToken(MiLenguajeParser.ID, 0); }
		public TerminalNode TKN_LEFT_PAREN() { return getToken(MiLenguajeParser.TKN_LEFT_PAREN, 0); }
		public ParamspContext paramsp() {
			return getRuleContext(ParamspContext.class,0);
		}
		public TerminalNode TKN_RIGHT_PAREN() { return getToken(MiLenguajeParser.TKN_RIGHT_PAREN, 0); }
		public BifunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bifunction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).enterBifunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).exitBifunction(this);
		}
	}

	public final BifunctionContext bifunction() throws RecognitionException {
		BifunctionContext _localctx = new BifunctionContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_bifunction);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(121);
			match(TKN_PERIOD);
			setState(122);
			match(ID);
			setState(123);
			match(TKN_LEFT_PAREN);
			setState(124);
			paramsp();
			setState(125);
			match(TKN_RIGHT_PAREN);
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
	public static class ParamsContext extends ParserRuleContext {
		public TerminalNode TKN_COMMA() { return getToken(MiLenguajeParser.TKN_COMMA, 0); }
		public ParamspContext paramsp() {
			return getRuleContext(ParamspContext.class,0);
		}
		public ParamsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_params; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).enterParams(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).exitParams(this);
		}
	}

	public final ParamsContext params() throws RecognitionException {
		ParamsContext _localctx = new ParamsContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_params);
		try {
			setState(130);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TKN_COMMA:
				enterOuterAlt(_localctx, 1);
				{
				setState(127);
				match(TKN_COMMA);
				setState(128);
				paramsp();
				}
				break;
			case TKN_RIGHT_PAREN:
				enterOuterAlt(_localctx, 2);
				{
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
	public static class ParamspContext extends ParserRuleContext {
		public BContext b() {
			return getRuleContext(BContext.class,0);
		}
		public ParamsContext params() {
			return getRuleContext(ParamsContext.class,0);
		}
		public ParamspContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_paramsp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).enterParamsp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).exitParamsp(this);
		}
	}

	public final ParamspContext paramsp() throws RecognitionException {
		ParamspContext _localctx = new ParamspContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_paramsp);
		try {
			setState(136);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
			case T__1:
			case T__2:
			case T__3:
			case TRUE:
			case FALSE:
			case TKN_LEFT_PAREN:
			case TKN_MINUS:
			case TKN_NUMBER:
			case TKN_TEXT:
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(132);
				b();
				setState(133);
				params();
				}
				break;
			case TKN_COMMA:
			case TKN_RIGHT_PAREN:
				enterOuterAlt(_localctx, 2);
				{
				setState(135);
				params();
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
	public static class XpContext extends ParserRuleContext {
		public EtiqContext etiq() {
			return getRuleContext(EtiqContext.class,0);
		}
		public ExecContext exec() {
			return getRuleContext(ExecContext.class,0);
		}
		public AsigContext asig() {
			return getRuleContext(AsigContext.class,0);
		}
		public XpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_xp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).enterXp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).exitXp(this);
		}
	}

	public final XpContext xp() throws RecognitionException {
		XpContext _localctx = new XpContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_xp);
		try {
			setState(141);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TKN_COLON:
				enterOuterAlt(_localctx, 1);
				{
				setState(138);
				etiq();
				}
				break;
			case TKN_LEFT_PAREN:
				enterOuterAlt(_localctx, 2);
				{
				setState(139);
				exec();
				}
				break;
			case TKN_EQUALS:
			case TKN_LEFT_BRAC:
				enterOuterAlt(_localctx, 3);
				{
				setState(140);
				asig();
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
	public static class ConditionalContext extends ParserRuleContext {
		public TerminalNode TKN_LEFT_PAREN() { return getToken(MiLenguajeParser.TKN_LEFT_PAREN, 0); }
		public BContext b() {
			return getRuleContext(BContext.class,0);
		}
		public TerminalNode TKN_RIGHT_PAREN() { return getToken(MiLenguajeParser.TKN_RIGHT_PAREN, 0); }
		public XoremptyContext xorempty() {
			return getRuleContext(XoremptyContext.class,0);
		}
		public EiContext ei() {
			return getRuleContext(EiContext.class,0);
		}
		public ConditionalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditional; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).enterConditional(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).exitConditional(this);
		}
	}

	public final ConditionalContext conditional() throws RecognitionException {
		ConditionalContext _localctx = new ConditionalContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_conditional);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(143);
			match(T__4);
			setState(144);
			match(TKN_LEFT_PAREN);
			setState(145);
			b();
			setState(146);
			match(TKN_RIGHT_PAREN);
			setState(147);
			match(T__5);
			setState(148);
			xorempty();
			setState(149);
			ei();
			setState(150);
			match(T__6);
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
	public static class EiContext extends ParserRuleContext {
		public TerminalNode TKN_LEFT_PAREN() { return getToken(MiLenguajeParser.TKN_LEFT_PAREN, 0); }
		public BContext b() {
			return getRuleContext(BContext.class,0);
		}
		public TerminalNode TKN_RIGHT_PAREN() { return getToken(MiLenguajeParser.TKN_RIGHT_PAREN, 0); }
		public XoremptyContext xorempty() {
			return getRuleContext(XoremptyContext.class,0);
		}
		public EiContext ei() {
			return getRuleContext(EiContext.class,0);
		}
		public ElseContext else_() {
			return getRuleContext(ElseContext.class,0);
		}
		public EiContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ei; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).enterEi(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).exitEi(this);
		}
	}

	public final EiContext ei() throws RecognitionException {
		EiContext _localctx = new EiContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_ei);
		try {
			setState(161);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__7:
				enterOuterAlt(_localctx, 1);
				{
				setState(152);
				match(T__7);
				setState(153);
				match(TKN_LEFT_PAREN);
				setState(154);
				b();
				setState(155);
				match(TKN_RIGHT_PAREN);
				setState(156);
				match(T__5);
				setState(157);
				xorempty();
				setState(158);
				ei();
				}
				break;
			case T__6:
			case T__8:
				enterOuterAlt(_localctx, 2);
				{
				setState(160);
				else_();
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
	public static class ElseContext extends ParserRuleContext {
		public XoremptyContext xorempty() {
			return getRuleContext(XoremptyContext.class,0);
		}
		public ElseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_else; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).enterElse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).exitElse(this);
		}
	}

	public final ElseContext else_() throws RecognitionException {
		ElseContext _localctx = new ElseContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_else);
		try {
			setState(166);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__8:
				enterOuterAlt(_localctx, 1);
				{
				setState(163);
				match(T__8);
				setState(164);
				xorempty();
				}
				break;
			case T__6:
				enterOuterAlt(_localctx, 2);
				{
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
	public static class WhileContext extends ParserRuleContext {
		public TerminalNode TKN_LEFT_PAREN() { return getToken(MiLenguajeParser.TKN_LEFT_PAREN, 0); }
		public BContext b() {
			return getRuleContext(BContext.class,0);
		}
		public TerminalNode TKN_RIGHT_PAREN() { return getToken(MiLenguajeParser.TKN_RIGHT_PAREN, 0); }
		public XoremptyContext xorempty() {
			return getRuleContext(XoremptyContext.class,0);
		}
		public WhileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_while; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).enterWhile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).exitWhile(this);
		}
	}

	public final WhileContext while_() throws RecognitionException {
		WhileContext _localctx = new WhileContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_while);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(168);
			match(T__9);
			setState(169);
			match(TKN_LEFT_PAREN);
			setState(170);
			b();
			setState(171);
			match(TKN_RIGHT_PAREN);
			setState(172);
			xorempty();
			setState(173);
			match(T__10);
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
	public static class ForContext extends ParserRuleContext {
		public AContext a() {
			return getRuleContext(AContext.class,0);
		}
		public BContext b() {
			return getRuleContext(BContext.class,0);
		}
		public StepContext step() {
			return getRuleContext(StepContext.class,0);
		}
		public XoremptyContext xorempty() {
			return getRuleContext(XoremptyContext.class,0);
		}
		public ForContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).enterFor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).exitFor(this);
		}
	}

	public final ForContext for_() throws RecognitionException {
		ForContext _localctx = new ForContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_for);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(175);
			match(T__11);
			setState(176);
			a();
			setState(177);
			match(T__12);
			setState(178);
			b();
			setState(179);
			step();
			setState(180);
			xorempty();
			setState(181);
			match(T__13);
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
	public static class StepContext extends ParserRuleContext {
		public DContext d() {
			return getRuleContext(DContext.class,0);
		}
		public StepContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_step; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).enterStep(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).exitStep(this);
		}
	}

	public final StepContext step() throws RecognitionException {
		StepContext _localctx = new StepContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_step);
		try {
			setState(186);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__14:
				enterOuterAlt(_localctx, 1);
				{
				setState(183);
				match(T__14);
				setState(184);
				d();
				}
				break;
			case T__0:
			case T__1:
			case T__2:
			case T__3:
			case T__4:
			case T__9:
			case T__11:
			case T__13:
			case T__15:
			case ID:
				enterOuterAlt(_localctx, 2);
				{
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
	public static class EtiqContext extends ParserRuleContext {
		public TerminalNode TKN_COLON() { return getToken(MiLenguajeParser.TKN_COLON, 0); }
		public EtiqContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_etiq; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).enterEtiq(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).exitEtiq(this);
		}
	}

	public final EtiqContext etiq() throws RecognitionException {
		EtiqContext _localctx = new EtiqContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_etiq);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(188);
			match(TKN_COLON);
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
	public static class GotoContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(MiLenguajeParser.ID, 0); }
		public GotoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_goto; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).enterGoto(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).exitGoto(this);
		}
	}

	public final GotoContext goto_() throws RecognitionException {
		GotoContext _localctx = new GotoContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_goto);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(190);
			match(T__15);
			setState(191);
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

	@SuppressWarnings("CheckReturnValue")
	public static class RoutineContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(MiLenguajeParser.ID, 0); }
		public XoremptyContext xorempty() {
			return getRuleContext(XoremptyContext.class,0);
		}
		public RoutineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_routine; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).enterRoutine(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).exitRoutine(this);
		}
	}

	public final RoutineContext routine() throws RecognitionException {
		RoutineContext _localctx = new RoutineContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_routine);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(193);
			match(T__16);
			setState(194);
			match(ID);
			setState(195);
			xorempty();
			setState(196);
			match(T__17);
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
	public static class XoremptyContext extends ParserRuleContext {
		public XContext x() {
			return getRuleContext(XContext.class,0);
		}
		public XoremptyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_xorempty; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).enterXorempty(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).exitXorempty(this);
		}
	}

	public final XoremptyContext xorempty() throws RecognitionException {
		XoremptyContext _localctx = new XoremptyContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_xorempty);
		try {
			setState(200);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
			case T__1:
			case T__2:
			case T__3:
			case T__4:
			case T__9:
			case T__11:
			case T__15:
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(198);
				x();
				}
				break;
			case T__6:
			case T__7:
			case T__8:
			case T__10:
			case T__13:
			case T__17:
				enterOuterAlt(_localctx, 2);
				{
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
	public static class ExecContext extends ParserRuleContext {
		public TerminalNode TKN_LEFT_PAREN() { return getToken(MiLenguajeParser.TKN_LEFT_PAREN, 0); }
		public TerminalNode TKN_RIGHT_PAREN() { return getToken(MiLenguajeParser.TKN_RIGHT_PAREN, 0); }
		public ExecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).enterExec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).exitExec(this);
		}
	}

	public final ExecContext exec() throws RecognitionException {
		ExecContext _localctx = new ExecContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_exec);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(202);
			match(TKN_LEFT_PAREN);
			setState(203);
			match(TKN_RIGHT_PAREN);
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
	public static class CorchContext extends ParserRuleContext {
		public TerminalNode TKN_LEFT_BRAC() { return getToken(MiLenguajeParser.TKN_LEFT_BRAC, 0); }
		public BContext b() {
			return getRuleContext(BContext.class,0);
		}
		public TerminalNode TKN_RIGHT_BRAC() { return getToken(MiLenguajeParser.TKN_RIGHT_BRAC, 0); }
		public MempContext memp() {
			return getRuleContext(MempContext.class,0);
		}
		public CorchContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_corch; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).enterCorch(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).exitCorch(this);
		}
	}

	public final CorchContext corch() throws RecognitionException {
		CorchContext _localctx = new CorchContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_corch);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(205);
			match(TKN_LEFT_BRAC);
			setState(206);
			b();
			setState(207);
			match(TKN_RIGHT_BRAC);
			setState(208);
			memp();
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
	public static class MemContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(MiLenguajeParser.ID, 0); }
		public MempContext memp() {
			return getRuleContext(MempContext.class,0);
		}
		public MemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mem; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).enterMem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).exitMem(this);
		}
	}

	public final MemContext mem() throws RecognitionException {
		MemContext _localctx = new MemContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_mem);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(210);
			match(ID);
			setState(211);
			memp();
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
	public static class MempContext extends ParserRuleContext {
		public CorchContext corch() {
			return getRuleContext(CorchContext.class,0);
		}
		public MempContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_memp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).enterMemp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).exitMemp(this);
		}
	}

	public final MempContext memp() throws RecognitionException {
		MempContext _localctx = new MempContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_memp);
		try {
			setState(215);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TKN_LEFT_BRAC:
				enterOuterAlt(_localctx, 1);
				{
				setState(213);
				corch();
				}
				break;
			case EOF:
			case T__0:
			case T__1:
			case T__2:
			case T__3:
			case T__4:
			case T__6:
			case T__7:
			case T__8:
			case T__9:
			case T__10:
			case T__11:
			case T__12:
			case T__13:
			case T__14:
			case T__15:
			case T__16:
			case T__17:
			case T__18:
			case T__19:
			case TKN_EQUALS:
			case TKN_COMMA:
			case TKN_RIGHT_BRAC:
			case TKN_RIGHT_PAREN:
			case TKN_PLUS:
			case TKN_MINUS:
			case TKN_TIMES:
			case TKN_DIV:
			case TKN_DIFF:
			case TKN_LESS:
			case TKN_LEQ:
			case TKN_GREATER:
			case TKN_GEQ:
			case ID:
				enterOuterAlt(_localctx, 2);
				{
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
	public static class AContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(MiLenguajeParser.ID, 0); }
		public AsigContext asig() {
			return getRuleContext(AsigContext.class,0);
		}
		public AContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_a; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).enterA(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).exitA(this);
		}
	}

	public final AContext a() throws RecognitionException {
		AContext _localctx = new AContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_a);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(217);
			match(ID);
			setState(218);
			asig();
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
	public static class AsigContext extends ParserRuleContext {
		public CorchContext corch() {
			return getRuleContext(CorchContext.class,0);
		}
		public TerminalNode TKN_EQUALS() { return getToken(MiLenguajeParser.TKN_EQUALS, 0); }
		public BContext b() {
			return getRuleContext(BContext.class,0);
		}
		public AsigContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_asig; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).enterAsig(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).exitAsig(this);
		}
	}

	public final AsigContext asig() throws RecognitionException {
		AsigContext _localctx = new AsigContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_asig);
		try {
			setState(226);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TKN_LEFT_BRAC:
				enterOuterAlt(_localctx, 1);
				{
				setState(220);
				corch();
				setState(221);
				match(TKN_EQUALS);
				setState(222);
				b();
				}
				break;
			case TKN_EQUALS:
				enterOuterAlt(_localctx, 2);
				{
				setState(224);
				match(TKN_EQUALS);
				setState(225);
				b();
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
	public static class BContext extends ParserRuleContext {
		public CContext c() {
			return getRuleContext(CContext.class,0);
		}
		public BpContext bp() {
			return getRuleContext(BpContext.class,0);
		}
		public BContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_b; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).enterB(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).exitB(this);
		}
	}

	public final BContext b() throws RecognitionException {
		BContext _localctx = new BContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_b);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(228);
			c();
			setState(229);
			bp();
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
	public static class BpContext extends ParserRuleContext {
		public CContext c() {
			return getRuleContext(CContext.class,0);
		}
		public BpContext bp() {
			return getRuleContext(BpContext.class,0);
		}
		public BpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).enterBp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).exitBp(this);
		}
	}

	public final BpContext bp() throws RecognitionException {
		BpContext _localctx = new BpContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_bp);
		try {
			setState(240);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__18:
				enterOuterAlt(_localctx, 1);
				{
				setState(231);
				match(T__18);
				setState(232);
				c();
				setState(233);
				bp();
				}
				break;
			case T__19:
				enterOuterAlt(_localctx, 2);
				{
				setState(235);
				match(T__19);
				setState(236);
				c();
				setState(237);
				bp();
				}
				break;
			case EOF:
			case T__0:
			case T__1:
			case T__2:
			case T__3:
			case T__4:
			case T__6:
			case T__7:
			case T__8:
			case T__9:
			case T__10:
			case T__11:
			case T__12:
			case T__13:
			case T__14:
			case T__15:
			case T__16:
			case T__17:
			case TKN_COMMA:
			case TKN_RIGHT_BRAC:
			case TKN_RIGHT_PAREN:
			case ID:
				enterOuterAlt(_localctx, 3);
				{
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
	public static class CContext extends ParserRuleContext {
		public DContext d() {
			return getRuleContext(DContext.class,0);
		}
		public CpContext cp() {
			return getRuleContext(CpContext.class,0);
		}
		public CContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_c; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).enterC(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).exitC(this);
		}
	}

	public final CContext c() throws RecognitionException {
		CContext _localctx = new CContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_c);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(242);
			d();
			setState(243);
			cp();
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
	public static class CpContext extends ParserRuleContext {
		public TerminalNode TKN_LESS() { return getToken(MiLenguajeParser.TKN_LESS, 0); }
		public DContext d() {
			return getRuleContext(DContext.class,0);
		}
		public TerminalNode TKN_GREATER() { return getToken(MiLenguajeParser.TKN_GREATER, 0); }
		public TerminalNode TKN_LEQ() { return getToken(MiLenguajeParser.TKN_LEQ, 0); }
		public TerminalNode TKN_GEQ() { return getToken(MiLenguajeParser.TKN_GEQ, 0); }
		public TerminalNode TKN_DIFF() { return getToken(MiLenguajeParser.TKN_DIFF, 0); }
		public TerminalNode TKN_EQUALS() { return getToken(MiLenguajeParser.TKN_EQUALS, 0); }
		public CpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).enterCp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).exitCp(this);
		}
	}

	public final CpContext cp() throws RecognitionException {
		CpContext _localctx = new CpContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_cp);
		try {
			setState(258);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TKN_LESS:
				enterOuterAlt(_localctx, 1);
				{
				setState(245);
				match(TKN_LESS);
				setState(246);
				d();
				}
				break;
			case TKN_GREATER:
				enterOuterAlt(_localctx, 2);
				{
				setState(247);
				match(TKN_GREATER);
				setState(248);
				d();
				}
				break;
			case TKN_LEQ:
				enterOuterAlt(_localctx, 3);
				{
				setState(249);
				match(TKN_LEQ);
				setState(250);
				d();
				}
				break;
			case TKN_GEQ:
				enterOuterAlt(_localctx, 4);
				{
				setState(251);
				match(TKN_GEQ);
				setState(252);
				d();
				}
				break;
			case TKN_DIFF:
				enterOuterAlt(_localctx, 5);
				{
				setState(253);
				match(TKN_DIFF);
				setState(254);
				d();
				}
				break;
			case TKN_EQUALS:
				enterOuterAlt(_localctx, 6);
				{
				setState(255);
				match(TKN_EQUALS);
				setState(256);
				d();
				}
				break;
			case EOF:
			case T__0:
			case T__1:
			case T__2:
			case T__3:
			case T__4:
			case T__6:
			case T__7:
			case T__8:
			case T__9:
			case T__10:
			case T__11:
			case T__12:
			case T__13:
			case T__14:
			case T__15:
			case T__16:
			case T__17:
			case T__18:
			case T__19:
			case TKN_COMMA:
			case TKN_RIGHT_BRAC:
			case TKN_RIGHT_PAREN:
			case ID:
				enterOuterAlt(_localctx, 7);
				{
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
	public static class DContext extends ParserRuleContext {
		public EContext e() {
			return getRuleContext(EContext.class,0);
		}
		public DpContext dp() {
			return getRuleContext(DpContext.class,0);
		}
		public DContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_d; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).enterD(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).exitD(this);
		}
	}

	public final DContext d() throws RecognitionException {
		DContext _localctx = new DContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_d);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(260);
			e();
			setState(261);
			dp();
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
	public static class DpContext extends ParserRuleContext {
		public TerminalNode TKN_PLUS() { return getToken(MiLenguajeParser.TKN_PLUS, 0); }
		public EContext e() {
			return getRuleContext(EContext.class,0);
		}
		public DpContext dp() {
			return getRuleContext(DpContext.class,0);
		}
		public TerminalNode TKN_MINUS() { return getToken(MiLenguajeParser.TKN_MINUS, 0); }
		public DpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).enterDp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).exitDp(this);
		}
	}

	public final DpContext dp() throws RecognitionException {
		DpContext _localctx = new DpContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_dp);
		try {
			setState(272);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TKN_PLUS:
				enterOuterAlt(_localctx, 1);
				{
				setState(263);
				match(TKN_PLUS);
				setState(264);
				e();
				setState(265);
				dp();
				}
				break;
			case TKN_MINUS:
				enterOuterAlt(_localctx, 2);
				{
				setState(267);
				match(TKN_MINUS);
				setState(268);
				e();
				setState(269);
				dp();
				}
				break;
			case EOF:
			case T__0:
			case T__1:
			case T__2:
			case T__3:
			case T__4:
			case T__6:
			case T__7:
			case T__8:
			case T__9:
			case T__10:
			case T__11:
			case T__12:
			case T__13:
			case T__14:
			case T__15:
			case T__16:
			case T__17:
			case T__18:
			case T__19:
			case TKN_EQUALS:
			case TKN_COMMA:
			case TKN_RIGHT_BRAC:
			case TKN_RIGHT_PAREN:
			case TKN_DIFF:
			case TKN_LESS:
			case TKN_LEQ:
			case TKN_GREATER:
			case TKN_GEQ:
			case ID:
				enterOuterAlt(_localctx, 3);
				{
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
	public static class EContext extends ParserRuleContext {
		public FContext f() {
			return getRuleContext(FContext.class,0);
		}
		public EpContext ep() {
			return getRuleContext(EpContext.class,0);
		}
		public EContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_e; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).enterE(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).exitE(this);
		}
	}

	public final EContext e() throws RecognitionException {
		EContext _localctx = new EContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_e);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(274);
			f();
			setState(275);
			ep();
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
	public static class EpContext extends ParserRuleContext {
		public TerminalNode TKN_TIMES() { return getToken(MiLenguajeParser.TKN_TIMES, 0); }
		public FContext f() {
			return getRuleContext(FContext.class,0);
		}
		public EpContext ep() {
			return getRuleContext(EpContext.class,0);
		}
		public TerminalNode TKN_DIV() { return getToken(MiLenguajeParser.TKN_DIV, 0); }
		public EpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ep; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).enterEp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).exitEp(this);
		}
	}

	public final EpContext ep() throws RecognitionException {
		EpContext _localctx = new EpContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_ep);
		try {
			setState(286);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TKN_TIMES:
				enterOuterAlt(_localctx, 1);
				{
				setState(277);
				match(TKN_TIMES);
				setState(278);
				f();
				setState(279);
				ep();
				}
				break;
			case TKN_DIV:
				enterOuterAlt(_localctx, 2);
				{
				setState(281);
				match(TKN_DIV);
				setState(282);
				f();
				setState(283);
				ep();
				}
				break;
			case EOF:
			case T__0:
			case T__1:
			case T__2:
			case T__3:
			case T__4:
			case T__6:
			case T__7:
			case T__8:
			case T__9:
			case T__10:
			case T__11:
			case T__12:
			case T__13:
			case T__14:
			case T__15:
			case T__16:
			case T__17:
			case T__18:
			case T__19:
			case TKN_EQUALS:
			case TKN_COMMA:
			case TKN_RIGHT_BRAC:
			case TKN_RIGHT_PAREN:
			case TKN_PLUS:
			case TKN_MINUS:
			case TKN_DIFF:
			case TKN_LESS:
			case TKN_LEQ:
			case TKN_GREATER:
			case TKN_GEQ:
			case ID:
				enterOuterAlt(_localctx, 3);
				{
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
	public static class FContext extends ParserRuleContext {
		public TerminalNode TKN_MINUS() { return getToken(MiLenguajeParser.TKN_MINUS, 0); }
		public GContext g() {
			return getRuleContext(GContext.class,0);
		}
		public FContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_f; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).enterF(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).exitF(this);
		}
	}

	public final FContext f() throws RecognitionException {
		FContext _localctx = new FContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_f);
		try {
			setState(291);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TKN_MINUS:
				enterOuterAlt(_localctx, 1);
				{
				setState(288);
				match(TKN_MINUS);
				setState(289);
				g();
				}
				break;
			case T__0:
			case T__1:
			case T__2:
			case T__3:
			case TRUE:
			case FALSE:
			case TKN_LEFT_PAREN:
			case TKN_NUMBER:
			case TKN_TEXT:
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(290);
				g();
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
	public static class GContext extends ParserRuleContext {
		public MemContext mem() {
			return getRuleContext(MemContext.class,0);
		}
		public BuiltContext built() {
			return getRuleContext(BuiltContext.class,0);
		}
		public TerminalNode TKN_NUMBER() { return getToken(MiLenguajeParser.TKN_NUMBER, 0); }
		public TerminalNode TKN_TEXT() { return getToken(MiLenguajeParser.TKN_TEXT, 0); }
		public TerminalNode TRUE() { return getToken(MiLenguajeParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(MiLenguajeParser.FALSE, 0); }
		public TerminalNode TKN_LEFT_PAREN() { return getToken(MiLenguajeParser.TKN_LEFT_PAREN, 0); }
		public BContext b() {
			return getRuleContext(BContext.class,0);
		}
		public TerminalNode TKN_RIGHT_PAREN() { return getToken(MiLenguajeParser.TKN_RIGHT_PAREN, 0); }
		public GContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_g; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).enterG(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).exitG(this);
		}
	}

	public final GContext g() throws RecognitionException {
		GContext _localctx = new GContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_g);
		try {
			setState(303);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(293);
				mem();
				}
				break;
			case T__0:
			case T__1:
			case T__2:
			case T__3:
				enterOuterAlt(_localctx, 2);
				{
				setState(294);
				built();
				}
				break;
			case TKN_NUMBER:
				enterOuterAlt(_localctx, 3);
				{
				setState(295);
				match(TKN_NUMBER);
				}
				break;
			case TKN_TEXT:
				enterOuterAlt(_localctx, 4);
				{
				setState(296);
				match(TKN_TEXT);
				}
				break;
			case TRUE:
				enterOuterAlt(_localctx, 5);
				{
				setState(297);
				match(TRUE);
				}
				break;
			case FALSE:
				enterOuterAlt(_localctx, 6);
				{
				setState(298);
				match(FALSE);
				}
				break;
			case TKN_LEFT_PAREN:
				enterOuterAlt(_localctx, 7);
				{
				setState(299);
				match(TKN_LEFT_PAREN);
				setState(300);
				b();
				setState(301);
				match(TKN_RIGHT_PAREN);
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
		"\u0004\u0001+\u0132\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007\u001b"+
		"\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007\u001e"+
		"\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007!\u0002\"\u0007\"\u0002"+
		"#\u0007#\u0002$\u0007$\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0003\u0000"+
		"T\b\u0000\u0001\u0001\u0001\u0001\u0003\u0001X\b\u0001\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0003\u0002^\b\u0002\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0003\u0004j\b\u0004\u0001\u0005\u0001"+
		"\u0005\u0003\u0005n\b\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0003\u0006x\b"+
		"\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\b\u0001\b\u0001\b\u0003\b\u0083\b\b\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0003\t\u0089\b\t\u0001\n\u0001\n\u0001\n\u0003\n\u008e\b\n"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\f\u0003\f\u00a2\b\f\u0001\r\u0001\r\u0001"+
		"\r\u0003\r\u00a7\b\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0003\u0010\u00bb\b\u0010\u0001\u0011\u0001\u0011\u0001"+
		"\u0012\u0001\u0012\u0001\u0012\u0001\u0013\u0001\u0013\u0001\u0013\u0001"+
		"\u0013\u0001\u0013\u0001\u0014\u0001\u0014\u0003\u0014\u00c9\b\u0014\u0001"+
		"\u0015\u0001\u0015\u0001\u0015\u0001\u0016\u0001\u0016\u0001\u0016\u0001"+
		"\u0016\u0001\u0016\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0018\u0001"+
		"\u0018\u0003\u0018\u00d8\b\u0018\u0001\u0019\u0001\u0019\u0001\u0019\u0001"+
		"\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0003"+
		"\u001a\u00e3\b\u001a\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001c\u0001"+
		"\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001"+
		"\u001c\u0001\u001c\u0003\u001c\u00f1\b\u001c\u0001\u001d\u0001\u001d\u0001"+
		"\u001d\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001"+
		"\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001"+
		"\u001e\u0001\u001e\u0003\u001e\u0103\b\u001e\u0001\u001f\u0001\u001f\u0001"+
		"\u001f\u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 "+
		"\u0003 \u0111\b \u0001!\u0001!\u0001!\u0001\"\u0001\"\u0001\"\u0001\""+
		"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0003\"\u011f\b\"\u0001#\u0001"+
		"#\u0001#\u0003#\u0124\b#\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001"+
		"$\u0001$\u0001$\u0001$\u0003$\u0130\b$\u0001$\u0000\u0000%\u0000\u0002"+
		"\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e"+
		" \"$&(*,.02468:<>@BDFH\u0000\u0000\u0136\u0000S\u0001\u0000\u0000\u0000"+
		"\u0002W\u0001\u0000\u0000\u0000\u0004]\u0001\u0000\u0000\u0000\u0006_"+
		"\u0001\u0000\u0000\u0000\bi\u0001\u0000\u0000\u0000\nm\u0001\u0000\u0000"+
		"\u0000\fw\u0001\u0000\u0000\u0000\u000ey\u0001\u0000\u0000\u0000\u0010"+
		"\u0082\u0001\u0000\u0000\u0000\u0012\u0088\u0001\u0000\u0000\u0000\u0014"+
		"\u008d\u0001\u0000\u0000\u0000\u0016\u008f\u0001\u0000\u0000\u0000\u0018"+
		"\u00a1\u0001\u0000\u0000\u0000\u001a\u00a6\u0001\u0000\u0000\u0000\u001c"+
		"\u00a8\u0001\u0000\u0000\u0000\u001e\u00af\u0001\u0000\u0000\u0000 \u00ba"+
		"\u0001\u0000\u0000\u0000\"\u00bc\u0001\u0000\u0000\u0000$\u00be\u0001"+
		"\u0000\u0000\u0000&\u00c1\u0001\u0000\u0000\u0000(\u00c8\u0001\u0000\u0000"+
		"\u0000*\u00ca\u0001\u0000\u0000\u0000,\u00cd\u0001\u0000\u0000\u0000."+
		"\u00d2\u0001\u0000\u0000\u00000\u00d7\u0001\u0000\u0000\u00002\u00d9\u0001"+
		"\u0000\u0000\u00004\u00e2\u0001\u0000\u0000\u00006\u00e4\u0001\u0000\u0000"+
		"\u00008\u00f0\u0001\u0000\u0000\u0000:\u00f2\u0001\u0000\u0000\u0000<"+
		"\u0102\u0001\u0000\u0000\u0000>\u0104\u0001\u0000\u0000\u0000@\u0110\u0001"+
		"\u0000\u0000\u0000B\u0112\u0001\u0000\u0000\u0000D\u011e\u0001\u0000\u0000"+
		"\u0000F\u0123\u0001\u0000\u0000\u0000H\u012f\u0001\u0000\u0000\u0000J"+
		"K\u0003&\u0013\u0000KL\u0003\u0002\u0001\u0000LM\u0005\u0000\u0000\u0001"+
		"MT\u0001\u0000\u0000\u0000NO\u0003\u0006\u0003\u0000OP\u0003\u0004\u0002"+
		"\u0000PQ\u0005\u0000\u0000\u0001QT\u0001\u0000\u0000\u0000RT\u0005\u0000"+
		"\u0000\u0001SJ\u0001\u0000\u0000\u0000SN\u0001\u0000\u0000\u0000SR\u0001"+
		"\u0000\u0000\u0000T\u0001\u0001\u0000\u0000\u0000UX\u0003\u0000\u0000"+
		"\u0000VX\u0001\u0000\u0000\u0000WU\u0001\u0000\u0000\u0000WV\u0001\u0000"+
		"\u0000\u0000X\u0003\u0001\u0000\u0000\u0000YZ\u0003&\u0013\u0000Z[\u0003"+
		"\u0002\u0001\u0000[^\u0001\u0000\u0000\u0000\\^\u0001\u0000\u0000\u0000"+
		"]Y\u0001\u0000\u0000\u0000]\\\u0001\u0000\u0000\u0000^\u0005\u0001\u0000"+
		"\u0000\u0000_`\u0003\b\u0004\u0000`a\u0003\n\u0005\u0000a\u0007\u0001"+
		"\u0000\u0000\u0000bj\u0003\u0016\u000b\u0000cj\u0003\u001e\u000f\u0000"+
		"dj\u0003\u001c\u000e\u0000ef\u0005*\u0000\u0000fj\u0003\u0014\n\u0000"+
		"gj\u0003$\u0012\u0000hj\u0003\f\u0006\u0000ib\u0001\u0000\u0000\u0000"+
		"ic\u0001\u0000\u0000\u0000id\u0001\u0000\u0000\u0000ie\u0001\u0000\u0000"+
		"\u0000ig\u0001\u0000\u0000\u0000ih\u0001\u0000\u0000\u0000j\t\u0001\u0000"+
		"\u0000\u0000kn\u0003\u0006\u0003\u0000ln\u0001\u0000\u0000\u0000mk\u0001"+
		"\u0000\u0000\u0000ml\u0001\u0000\u0000\u0000n\u000b\u0001\u0000\u0000"+
		"\u0000op\u0005\u0001\u0000\u0000px\u0003\u000e\u0007\u0000qr\u0005\u0002"+
		"\u0000\u0000rx\u0003\u000e\u0007\u0000st\u0005\u0003\u0000\u0000tx\u0003"+
		"\u000e\u0007\u0000uv\u0005\u0004\u0000\u0000vx\u0003\u000e\u0007\u0000"+
		"wo\u0001\u0000\u0000\u0000wq\u0001\u0000\u0000\u0000ws\u0001\u0000\u0000"+
		"\u0000wu\u0001\u0000\u0000\u0000x\r\u0001\u0000\u0000\u0000yz\u0005\u0017"+
		"\u0000\u0000z{\u0005*\u0000\u0000{|\u0005\u001d\u0000\u0000|}\u0003\u0012"+
		"\t\u0000}~\u0005\u001e\u0000\u0000~\u000f\u0001\u0000\u0000\u0000\u007f"+
		"\u0080\u0005\u0019\u0000\u0000\u0080\u0083\u0003\u0012\t\u0000\u0081\u0083"+
		"\u0001\u0000\u0000\u0000\u0082\u007f\u0001\u0000\u0000\u0000\u0082\u0081"+
		"\u0001\u0000\u0000\u0000\u0083\u0011\u0001\u0000\u0000\u0000\u0084\u0085"+
		"\u00036\u001b\u0000\u0085\u0086\u0003\u0010\b\u0000\u0086\u0089\u0001"+
		"\u0000\u0000\u0000\u0087\u0089\u0003\u0010\b\u0000\u0088\u0084\u0001\u0000"+
		"\u0000\u0000\u0088\u0087\u0001\u0000\u0000\u0000\u0089\u0013\u0001\u0000"+
		"\u0000\u0000\u008a\u008e\u0003\"\u0011\u0000\u008b\u008e\u0003*\u0015"+
		"\u0000\u008c\u008e\u00034\u001a\u0000\u008d\u008a\u0001\u0000\u0000\u0000"+
		"\u008d\u008b\u0001\u0000\u0000\u0000\u008d\u008c\u0001\u0000\u0000\u0000"+
		"\u008e\u0015\u0001\u0000\u0000\u0000\u008f\u0090\u0005\u0005\u0000\u0000"+
		"\u0090\u0091\u0005\u001d\u0000\u0000\u0091\u0092\u00036\u001b\u0000\u0092"+
		"\u0093\u0005\u001e\u0000\u0000\u0093\u0094\u0005\u0006\u0000\u0000\u0094"+
		"\u0095\u0003(\u0014\u0000\u0095\u0096\u0003\u0018\f\u0000\u0096\u0097"+
		"\u0005\u0007\u0000\u0000\u0097\u0017\u0001\u0000\u0000\u0000\u0098\u0099"+
		"\u0005\b\u0000\u0000\u0099\u009a\u0005\u001d\u0000\u0000\u009a\u009b\u0003"+
		"6\u001b\u0000\u009b\u009c\u0005\u001e\u0000\u0000\u009c\u009d\u0005\u0006"+
		"\u0000\u0000\u009d\u009e\u0003(\u0014\u0000\u009e\u009f\u0003\u0018\f"+
		"\u0000\u009f\u00a2\u0001\u0000\u0000\u0000\u00a0\u00a2\u0003\u001a\r\u0000"+
		"\u00a1\u0098\u0001\u0000\u0000\u0000\u00a1\u00a0\u0001\u0000\u0000\u0000"+
		"\u00a2\u0019\u0001\u0000\u0000\u0000\u00a3\u00a4\u0005\t\u0000\u0000\u00a4"+
		"\u00a7\u0003(\u0014\u0000\u00a5\u00a7\u0001\u0000\u0000\u0000\u00a6\u00a3"+
		"\u0001\u0000\u0000\u0000\u00a6\u00a5\u0001\u0000\u0000\u0000\u00a7\u001b"+
		"\u0001\u0000\u0000\u0000\u00a8\u00a9\u0005\n\u0000\u0000\u00a9\u00aa\u0005"+
		"\u001d\u0000\u0000\u00aa\u00ab\u00036\u001b\u0000\u00ab\u00ac\u0005\u001e"+
		"\u0000\u0000\u00ac\u00ad\u0003(\u0014\u0000\u00ad\u00ae\u0005\u000b\u0000"+
		"\u0000\u00ae\u001d\u0001\u0000\u0000\u0000\u00af\u00b0\u0005\f\u0000\u0000"+
		"\u00b0\u00b1\u00032\u0019\u0000\u00b1\u00b2\u0005\r\u0000\u0000\u00b2"+
		"\u00b3\u00036\u001b\u0000\u00b3\u00b4\u0003 \u0010\u0000\u00b4\u00b5\u0003"+
		"(\u0014\u0000\u00b5\u00b6\u0005\u000e\u0000\u0000\u00b6\u001f\u0001\u0000"+
		"\u0000\u0000\u00b7\u00b8\u0005\u000f\u0000\u0000\u00b8\u00bb\u0003>\u001f"+
		"\u0000\u00b9\u00bb\u0001\u0000\u0000\u0000\u00ba\u00b7\u0001\u0000\u0000"+
		"\u0000\u00ba\u00b9\u0001\u0000\u0000\u0000\u00bb!\u0001\u0000\u0000\u0000"+
		"\u00bc\u00bd\u0005\u001a\u0000\u0000\u00bd#\u0001\u0000\u0000\u0000\u00be"+
		"\u00bf\u0005\u0010\u0000\u0000\u00bf\u00c0\u0005*\u0000\u0000\u00c0%\u0001"+
		"\u0000\u0000\u0000\u00c1\u00c2\u0005\u0011\u0000\u0000\u00c2\u00c3\u0005"+
		"*\u0000\u0000\u00c3\u00c4\u0003(\u0014\u0000\u00c4\u00c5\u0005\u0012\u0000"+
		"\u0000\u00c5\'\u0001\u0000\u0000\u0000\u00c6\u00c9\u0003\u0006\u0003\u0000"+
		"\u00c7\u00c9\u0001\u0000\u0000\u0000\u00c8\u00c6\u0001\u0000\u0000\u0000"+
		"\u00c8\u00c7\u0001\u0000\u0000\u0000\u00c9)\u0001\u0000\u0000\u0000\u00ca"+
		"\u00cb\u0005\u001d\u0000\u0000\u00cb\u00cc\u0005\u001e\u0000\u0000\u00cc"+
		"+\u0001\u0000\u0000\u0000\u00cd\u00ce\u0005\u001b\u0000\u0000\u00ce\u00cf"+
		"\u00036\u001b\u0000\u00cf\u00d0\u0005\u001c\u0000\u0000\u00d0\u00d1\u0003"+
		"0\u0018\u0000\u00d1-\u0001\u0000\u0000\u0000\u00d2\u00d3\u0005*\u0000"+
		"\u0000\u00d3\u00d4\u00030\u0018\u0000\u00d4/\u0001\u0000\u0000\u0000\u00d5"+
		"\u00d8\u0003,\u0016\u0000\u00d6\u00d8\u0001\u0000\u0000\u0000\u00d7\u00d5"+
		"\u0001\u0000\u0000\u0000\u00d7\u00d6\u0001\u0000\u0000\u0000\u00d81\u0001"+
		"\u0000\u0000\u0000\u00d9\u00da\u0005*\u0000\u0000\u00da\u00db\u00034\u001a"+
		"\u0000\u00db3\u0001\u0000\u0000\u0000\u00dc\u00dd\u0003,\u0016\u0000\u00dd"+
		"\u00de\u0005\u0018\u0000\u0000\u00de\u00df\u00036\u001b\u0000\u00df\u00e3"+
		"\u0001\u0000\u0000\u0000\u00e0\u00e1\u0005\u0018\u0000\u0000\u00e1\u00e3"+
		"\u00036\u001b\u0000\u00e2\u00dc\u0001\u0000\u0000\u0000\u00e2\u00e0\u0001"+
		"\u0000\u0000\u0000\u00e35\u0001\u0000\u0000\u0000\u00e4\u00e5\u0003:\u001d"+
		"\u0000\u00e5\u00e6\u00038\u001c\u0000\u00e67\u0001\u0000\u0000\u0000\u00e7"+
		"\u00e8\u0005\u0013\u0000\u0000\u00e8\u00e9\u0003:\u001d\u0000\u00e9\u00ea"+
		"\u00038\u001c\u0000\u00ea\u00f1\u0001\u0000\u0000\u0000\u00eb\u00ec\u0005"+
		"\u0014\u0000\u0000\u00ec\u00ed\u0003:\u001d\u0000\u00ed\u00ee\u00038\u001c"+
		"\u0000\u00ee\u00f1\u0001\u0000\u0000\u0000\u00ef\u00f1\u0001\u0000\u0000"+
		"\u0000\u00f0\u00e7\u0001\u0000\u0000\u0000\u00f0\u00eb\u0001\u0000\u0000"+
		"\u0000\u00f0\u00ef\u0001\u0000\u0000\u0000\u00f19\u0001\u0000\u0000\u0000"+
		"\u00f2\u00f3\u0003>\u001f\u0000\u00f3\u00f4\u0003<\u001e\u0000\u00f4;"+
		"\u0001\u0000\u0000\u0000\u00f5\u00f6\u0005$\u0000\u0000\u00f6\u0103\u0003"+
		">\u001f\u0000\u00f7\u00f8\u0005&\u0000\u0000\u00f8\u0103\u0003>\u001f"+
		"\u0000\u00f9\u00fa\u0005%\u0000\u0000\u00fa\u0103\u0003>\u001f\u0000\u00fb"+
		"\u00fc\u0005\'\u0000\u0000\u00fc\u0103\u0003>\u001f\u0000\u00fd\u00fe"+
		"\u0005#\u0000\u0000\u00fe\u0103\u0003>\u001f\u0000\u00ff\u0100\u0005\u0018"+
		"\u0000\u0000\u0100\u0103\u0003>\u001f\u0000\u0101\u0103\u0001\u0000\u0000"+
		"\u0000\u0102\u00f5\u0001\u0000\u0000\u0000\u0102\u00f7\u0001\u0000\u0000"+
		"\u0000\u0102\u00f9\u0001\u0000\u0000\u0000\u0102\u00fb\u0001\u0000\u0000"+
		"\u0000\u0102\u00fd\u0001\u0000\u0000\u0000\u0102\u00ff\u0001\u0000\u0000"+
		"\u0000\u0102\u0101\u0001\u0000\u0000\u0000\u0103=\u0001\u0000\u0000\u0000"+
		"\u0104\u0105\u0003B!\u0000\u0105\u0106\u0003@ \u0000\u0106?\u0001\u0000"+
		"\u0000\u0000\u0107\u0108\u0005\u001f\u0000\u0000\u0108\u0109\u0003B!\u0000"+
		"\u0109\u010a\u0003@ \u0000\u010a\u0111\u0001\u0000\u0000\u0000\u010b\u010c"+
		"\u0005 \u0000\u0000\u010c\u010d\u0003B!\u0000\u010d\u010e\u0003@ \u0000"+
		"\u010e\u0111\u0001\u0000\u0000\u0000\u010f\u0111\u0001\u0000\u0000\u0000"+
		"\u0110\u0107\u0001\u0000\u0000\u0000\u0110\u010b\u0001\u0000\u0000\u0000"+
		"\u0110\u010f\u0001\u0000\u0000\u0000\u0111A\u0001\u0000\u0000\u0000\u0112"+
		"\u0113\u0003F#\u0000\u0113\u0114\u0003D\"\u0000\u0114C\u0001\u0000\u0000"+
		"\u0000\u0115\u0116\u0005!\u0000\u0000\u0116\u0117\u0003F#\u0000\u0117"+
		"\u0118\u0003D\"\u0000\u0118\u011f\u0001\u0000\u0000\u0000\u0119\u011a"+
		"\u0005\"\u0000\u0000\u011a\u011b\u0003F#\u0000\u011b\u011c\u0003D\"\u0000"+
		"\u011c\u011f\u0001\u0000\u0000\u0000\u011d\u011f\u0001\u0000\u0000\u0000"+
		"\u011e\u0115\u0001\u0000\u0000\u0000\u011e\u0119\u0001\u0000\u0000\u0000"+
		"\u011e\u011d\u0001\u0000\u0000\u0000\u011fE\u0001\u0000\u0000\u0000\u0120"+
		"\u0121\u0005 \u0000\u0000\u0121\u0124\u0003H$\u0000\u0122\u0124\u0003"+
		"H$\u0000\u0123\u0120\u0001\u0000\u0000\u0000\u0123\u0122\u0001\u0000\u0000"+
		"\u0000\u0124G\u0001\u0000\u0000\u0000\u0125\u0130\u0003.\u0017\u0000\u0126"+
		"\u0130\u0003\f\u0006\u0000\u0127\u0130\u0005(\u0000\u0000\u0128\u0130"+
		"\u0005)\u0000\u0000\u0129\u0130\u0005\u0015\u0000\u0000\u012a\u0130\u0005"+
		"\u0016\u0000\u0000\u012b\u012c\u0005\u001d\u0000\u0000\u012c\u012d\u0003"+
		"6\u001b\u0000\u012d\u012e\u0005\u001e\u0000\u0000\u012e\u0130\u0001\u0000"+
		"\u0000\u0000\u012f\u0125\u0001\u0000\u0000\u0000\u012f\u0126\u0001\u0000"+
		"\u0000\u0000\u012f\u0127\u0001\u0000\u0000\u0000\u012f\u0128\u0001\u0000"+
		"\u0000\u0000\u012f\u0129\u0001\u0000\u0000\u0000\u012f\u012a\u0001\u0000"+
		"\u0000\u0000\u012f\u012b\u0001\u0000\u0000\u0000\u0130I\u0001\u0000\u0000"+
		"\u0000\u0015SW]imw\u0082\u0088\u008d\u00a1\u00a6\u00ba\u00c8\u00d7\u00e2"+
		"\u00f0\u0102\u0110\u011e\u0123\u012f";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}