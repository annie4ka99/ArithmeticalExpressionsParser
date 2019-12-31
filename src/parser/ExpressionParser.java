// Generated from D:/webHW10/ArithmeticalExpressionsParser/src\Expression.g4 by ANTLR 4.7.2

package parser;
import java.util.Map;
import java.util.HashMap;
import exception.ArithmeticExpressionException;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ExpressionParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		EQUAL=1, APPLY=2, MULTIPLY=3, DIVIDE=4, SUBTRACT=5, MOD=6, OB=7, CB=8, 
		VAR=9, SEM=10, WS=11, NUM=12;
	public static final int
		RULE_file = 0, RULE_expression = 1, RULE_appsub = 2, RULE_muldiv = 3, 
		RULE_negation = 4, RULE_variable = 5, RULE_number = 6;
	private static String[] makeRuleNames() {
		return new String[] {
			"file", "expression", "appsub", "muldiv", "negation", "variable", "number"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'='", "'+'", "'*'", "'/'", "'-'", "'%'", "'('", "')'", null, "';'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "EQUAL", "APPLY", "MULTIPLY", "DIVIDE", "SUBTRACT", "MOD", "OB", 
			"CB", "VAR", "SEM", "WS", "NUM"
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
	public String getGrammarFileName() { return "Expression.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }


	Map<String, Integer> variableValues = new HashMap<>();
	int line = 1;

	public ExpressionParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class FileContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> SEM() { return getTokens(ExpressionParser.SEM); }
		public TerminalNode SEM(int i) {
			return getToken(ExpressionParser.SEM, i);
		}
		public FileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_file; }
	}

	public final FileContext file() throws RecognitionException {
		FileContext _localctx = new FileContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_file);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(19);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SUBTRACT) | (1L << OB) | (1L << VAR) | (1L << NUM))) != 0)) {
				{
				{
				setState(14);
				expression();
				setState(15);
				match(SEM);
				}
				}
				setState(21);
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

	public static class ExpressionContext extends ParserRuleContext {
		public Token VAR;
		public AppsubContext as;
		public AppsubContext as1;
		public TerminalNode VAR() { return getToken(ExpressionParser.VAR, 0); }
		public TerminalNode EQUAL() { return getToken(ExpressionParser.EQUAL, 0); }
		public AppsubContext appsub() {
			return getRuleContext(AppsubContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_expression);
		try {
			setState(30);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(22);
				((ExpressionContext)_localctx).VAR = match(VAR);
				setState(23);
				match(EQUAL);
				setState(24);
				((ExpressionContext)_localctx).as = appsub(0);
				variableValues.put((((ExpressionContext)_localctx).VAR!=null?((ExpressionContext)_localctx).VAR.getText():null), ((ExpressionContext)_localctx).as.value); System.out.println((((ExpressionContext)_localctx).VAR!=null?((ExpressionContext)_localctx).VAR.getText():null) + " = " + ((ExpressionContext)_localctx).as.value); 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(27);
				((ExpressionContext)_localctx).as1 = appsub(0);
				System.out.println(((ExpressionContext)_localctx).as1.value);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			line++;
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

	public static class AppsubContext extends ParserRuleContext {
		public Integer value;
		public AppsubContext as1;
		public AppsubContext as2;
		public MuldivContext md;
		public MuldivContext md1;
		public MuldivContext md2;
		public MuldivContext muldiv() {
			return getRuleContext(MuldivContext.class,0);
		}
		public TerminalNode APPLY() { return getToken(ExpressionParser.APPLY, 0); }
		public AppsubContext appsub() {
			return getRuleContext(AppsubContext.class,0);
		}
		public TerminalNode SUBTRACT() { return getToken(ExpressionParser.SUBTRACT, 0); }
		public AppsubContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_appsub; }
	}

	public final AppsubContext appsub() throws RecognitionException {
		return appsub(0);
	}

	private AppsubContext appsub(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		AppsubContext _localctx = new AppsubContext(_ctx, _parentState);
		AppsubContext _prevctx = _localctx;
		int _startState = 4;
		enterRecursionRule(_localctx, 4, RULE_appsub, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(33);
			((AppsubContext)_localctx).md = muldiv(0);
			((AppsubContext)_localctx).value =  ((AppsubContext)_localctx).md.value;
			}
			_ctx.stop = _input.LT(-1);
			setState(48);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(46);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
					case 1:
						{
						_localctx = new AppsubContext(_parentctx, _parentState);
						_localctx.as1 = _prevctx;
						_localctx.as1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_appsub);
						setState(36);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(37);
						match(APPLY);
						setState(38);
						((AppsubContext)_localctx).md1 = muldiv(0);
						((AppsubContext)_localctx).value =  (((AppsubContext)_localctx).as1.value)+(((AppsubContext)_localctx).md1.value);
						}
						break;
					case 2:
						{
						_localctx = new AppsubContext(_parentctx, _parentState);
						_localctx.as2 = _prevctx;
						_localctx.as2 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_appsub);
						setState(41);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(42);
						match(SUBTRACT);
						setState(43);
						((AppsubContext)_localctx).md2 = muldiv(0);
						((AppsubContext)_localctx).value =  (((AppsubContext)_localctx).as2.value)-(((AppsubContext)_localctx).md2.value);
						}
						break;
					}
					} 
				}
				setState(50);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
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

	public static class MuldivContext extends ParserRuleContext {
		public Integer value;
		public MuldivContext md1;
		public MuldivContext md2;
		public NegationContext neg;
		public NegationContext neg3;
		public MuldivContext md3;
		public NegationContext neg1;
		public NegationContext neg2;
		public NegationContext negation() {
			return getRuleContext(NegationContext.class,0);
		}
		public TerminalNode MOD() { return getToken(ExpressionParser.MOD, 0); }
		public MuldivContext muldiv() {
			return getRuleContext(MuldivContext.class,0);
		}
		public TerminalNode MULTIPLY() { return getToken(ExpressionParser.MULTIPLY, 0); }
		public TerminalNode DIVIDE() { return getToken(ExpressionParser.DIVIDE, 0); }
		public MuldivContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_muldiv; }
	}

	public final MuldivContext muldiv() throws RecognitionException {
		return muldiv(0);
	}

	private MuldivContext muldiv(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		MuldivContext _localctx = new MuldivContext(_ctx, _parentState);
		MuldivContext _prevctx = _localctx;
		int _startState = 6;
		enterRecursionRule(_localctx, 6, RULE_muldiv, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(60);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				{
				setState(52);
				((MuldivContext)_localctx).neg = negation();
				((MuldivContext)_localctx).value =  ((MuldivContext)_localctx).neg.value;
				}
				break;
			case 2:
				{
				setState(55);
				((MuldivContext)_localctx).neg3 = negation();
				setState(56);
				match(MOD);
				setState(57);
				((MuldivContext)_localctx).md3 = muldiv(1);
				((MuldivContext)_localctx).value =  (((MuldivContext)_localctx).neg3.value)%(((MuldivContext)_localctx).md3.value);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(74);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(72);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
					case 1:
						{
						_localctx = new MuldivContext(_parentctx, _parentState);
						_localctx.md1 = _prevctx;
						_localctx.md1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_muldiv);
						setState(62);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(63);
						match(MULTIPLY);
						setState(64);
						((MuldivContext)_localctx).neg1 = negation();
						((MuldivContext)_localctx).value =  (((MuldivContext)_localctx).md1.value)*(((MuldivContext)_localctx).neg1.value);
						}
						break;
					case 2:
						{
						_localctx = new MuldivContext(_parentctx, _parentState);
						_localctx.md2 = _prevctx;
						_localctx.md2 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_muldiv);
						setState(67);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(68);
						match(DIVIDE);
						setState(69);
						((MuldivContext)_localctx).neg2 = negation();
						 if (((MuldivContext)_localctx).neg2.value == 0) throw new ArithmeticExpressionException("division by zero", line);
						                          ((MuldivContext)_localctx).value =  (((MuldivContext)_localctx).md2.value)/(((MuldivContext)_localctx).neg2.value);
						}
						break;
					}
					} 
				}
				setState(76);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
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

	public static class NegationContext extends ParserRuleContext {
		public Integer value;
		public VariableContext var;
		public AppsubContext as;
		public NegationContext neg;
		public NumberContext n;
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public TerminalNode OB() { return getToken(ExpressionParser.OB, 0); }
		public TerminalNode CB() { return getToken(ExpressionParser.CB, 0); }
		public AppsubContext appsub() {
			return getRuleContext(AppsubContext.class,0);
		}
		public TerminalNode SUBTRACT() { return getToken(ExpressionParser.SUBTRACT, 0); }
		public NegationContext negation() {
			return getRuleContext(NegationContext.class,0);
		}
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public NegationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_negation; }
	}

	public final NegationContext negation() throws RecognitionException {
		NegationContext _localctx = new NegationContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_negation);
		try {
			setState(92);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VAR:
				enterOuterAlt(_localctx, 1);
				{
				setState(77);
				((NegationContext)_localctx).var = variable();
				((NegationContext)_localctx).value =  ((NegationContext)_localctx).var.value;
				}
				break;
			case OB:
				enterOuterAlt(_localctx, 2);
				{
				setState(80);
				match(OB);
				setState(81);
				((NegationContext)_localctx).as = appsub(0);
				setState(82);
				match(CB);
				((NegationContext)_localctx).value =  ((NegationContext)_localctx).as.value;
				}
				break;
			case SUBTRACT:
				enterOuterAlt(_localctx, 3);
				{
				setState(85);
				match(SUBTRACT);
				setState(86);
				((NegationContext)_localctx).neg = negation();
				((NegationContext)_localctx).value =  -(((NegationContext)_localctx).neg.value);
				}
				break;
			case NUM:
				enterOuterAlt(_localctx, 4);
				{
				setState(89);
				((NegationContext)_localctx).n = number();
				((NegationContext)_localctx).value =  ((NegationContext)_localctx).n.value;
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

	public static class VariableContext extends ParserRuleContext {
		public Integer value;
		public Token VAR;
		public TerminalNode VAR() { return getToken(ExpressionParser.VAR, 0); }
		public VariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable; }
	}

	public final VariableContext variable() throws RecognitionException {
		VariableContext _localctx = new VariableContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_variable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(94);
			((VariableContext)_localctx).VAR = match(VAR);

			    ((VariableContext)_localctx).value =  variableValues.get((((VariableContext)_localctx).VAR!=null?((VariableContext)_localctx).VAR.getText():null));
			    if (_localctx.value == null)
			        throw new ArithmeticExpressionException("can't find value of variable '" + (((VariableContext)_localctx).VAR!=null?((VariableContext)_localctx).VAR.getText():null) + "'", line);

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

	public static class NumberContext extends ParserRuleContext {
		public Integer value;
		public Token NUM;
		public TerminalNode NUM() { return getToken(ExpressionParser.NUM, 0); }
		public NumberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_number; }
	}

	public final NumberContext number() throws RecognitionException {
		NumberContext _localctx = new NumberContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_number);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(97);
			((NumberContext)_localctx).NUM = match(NUM);

			    try {
			        ((NumberContext)_localctx).value =  Integer.parseInt((((NumberContext)_localctx).NUM!=null?((NumberContext)_localctx).NUM.getText():null));
			    } catch (NumberFormatException ex) {
			        throw new ArithmeticExpressionException("can't get integer from " + (((NumberContext)_localctx).NUM!=null?((NumberContext)_localctx).NUM.getText():null), line);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 2:
			return appsub_sempred((AppsubContext)_localctx, predIndex);
		case 3:
			return muldiv_sempred((MuldivContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean appsub_sempred(AppsubContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 3);
		case 1:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean muldiv_sempred(MuldivContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 4);
		case 3:
			return precpred(_ctx, 3);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\16g\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\3\2\3\2\3\2\7\2\24\n\2\f\2"+
		"\16\2\27\13\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3!\n\3\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\7\4\61\n\4\f\4\16\4\64\13\4\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5?\n\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\7\5K\n\5\f\5\16\5N\13\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6_\n\6\3\7\3\7\3\7\3\b\3\b\3\b\3\b\2\4"+
		"\6\b\t\2\4\6\b\n\f\16\2\2\2i\2\25\3\2\2\2\4 \3\2\2\2\6\"\3\2\2\2\b>\3"+
		"\2\2\2\n^\3\2\2\2\f`\3\2\2\2\16c\3\2\2\2\20\21\5\4\3\2\21\22\7\f\2\2\22"+
		"\24\3\2\2\2\23\20\3\2\2\2\24\27\3\2\2\2\25\23\3\2\2\2\25\26\3\2\2\2\26"+
		"\3\3\2\2\2\27\25\3\2\2\2\30\31\7\13\2\2\31\32\7\3\2\2\32\33\5\6\4\2\33"+
		"\34\b\3\1\2\34!\3\2\2\2\35\36\5\6\4\2\36\37\b\3\1\2\37!\3\2\2\2 \30\3"+
		"\2\2\2 \35\3\2\2\2!\5\3\2\2\2\"#\b\4\1\2#$\5\b\5\2$%\b\4\1\2%\62\3\2\2"+
		"\2&\'\f\5\2\2\'(\7\4\2\2()\5\b\5\2)*\b\4\1\2*\61\3\2\2\2+,\f\4\2\2,-\7"+
		"\7\2\2-.\5\b\5\2./\b\4\1\2/\61\3\2\2\2\60&\3\2\2\2\60+\3\2\2\2\61\64\3"+
		"\2\2\2\62\60\3\2\2\2\62\63\3\2\2\2\63\7\3\2\2\2\64\62\3\2\2\2\65\66\b"+
		"\5\1\2\66\67\5\n\6\2\678\b\5\1\28?\3\2\2\29:\5\n\6\2:;\7\b\2\2;<\5\b\5"+
		"\3<=\b\5\1\2=?\3\2\2\2>\65\3\2\2\2>9\3\2\2\2?L\3\2\2\2@A\f\6\2\2AB\7\5"+
		"\2\2BC\5\n\6\2CD\b\5\1\2DK\3\2\2\2EF\f\5\2\2FG\7\6\2\2GH\5\n\6\2HI\b\5"+
		"\1\2IK\3\2\2\2J@\3\2\2\2JE\3\2\2\2KN\3\2\2\2LJ\3\2\2\2LM\3\2\2\2M\t\3"+
		"\2\2\2NL\3\2\2\2OP\5\f\7\2PQ\b\6\1\2Q_\3\2\2\2RS\7\t\2\2ST\5\6\4\2TU\7"+
		"\n\2\2UV\b\6\1\2V_\3\2\2\2WX\7\7\2\2XY\5\n\6\2YZ\b\6\1\2Z_\3\2\2\2[\\"+
		"\5\16\b\2\\]\b\6\1\2]_\3\2\2\2^O\3\2\2\2^R\3\2\2\2^W\3\2\2\2^[\3\2\2\2"+
		"_\13\3\2\2\2`a\7\13\2\2ab\b\7\1\2b\r\3\2\2\2cd\7\16\2\2de\b\b\1\2e\17"+
		"\3\2\2\2\n\25 \60\62>JL^";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}