// Generated from Hello.g4 by ANTLR 4.5.3
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class HelloParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, T__36=37, T__37=38, 
		T__38=39, T__39=40, T__40=41, T__41=42, NEWLINE=43, NUM=44, ID=45, WS=46;
	public static final int
		RULE_program = 0, RULE_komutlar = 1, RULE_interrupt_fonksiyonu = 2, RULE_label_definition = 3, 
		RULE_special_komutlar = 4, RULE_special_komut_ismi = 5, RULE_high_level_commands = 6, 
		RULE_mov_komutu = 7, RULE_destination = 8, RULE_reg_or_immediate = 9, 
		RULE_source = 10, RULE_math_commands = 11, RULE_math_komut_ismi = 12, 
		RULE_stack_commands = 13, RULE_stack_komut_ismi = 14, RULE_reg_def = 15, 
		RULE_r_type_komutlar = 16, RULE_r_type_komut_ismi = 17, RULE_i_type_komutlar = 18, 
		RULE_j_type_komutlar = 19, RULE_jump_to = 20, RULE_j_type_komut_ismi = 21, 
		RULE_i_type_komut_ismi = 22, RULE_label = 23, RULE_immediate = 24;
	public static final String[] ruleNames = {
		"program", "komutlar", "interrupt_fonksiyonu", "label_definition", "special_komutlar", 
		"special_komut_ismi", "high_level_commands", "mov_komutu", "destination", 
		"reg_or_immediate", "source", "math_commands", "math_komut_ismi", "stack_commands", 
		"stack_komut_ismi", "reg_def", "r_type_komutlar", "r_type_komut_ismi", 
		"i_type_komutlar", "j_type_komutlar", "jump_to", "j_type_komut_ismi", 
		"i_type_komut_ismi", "label", "immediate"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'interrupt'", "'{'", "'}'", "':'", "'call'", "'return'", "'nop'", 
		"'save_pc'", "'mov'", "','", "'['", "']'", "'incf'", "'decf'", "'push'", 
		"'pop'", "'$'", "'sp'", "'result'", "'lw'", "'sw'", "'add'", "'sub'", 
		"'mov_fast'", "'slt'", "'beq'", "'bnq'", "'and'", "'or'", "'mul'", "'shr'", 
		"'jmp'", "'lwi'", "'swi'", "'lui'", "'addi'", "'movi'", "'out'", "'in'", 
		"'bsf'", "'bcf'", "'get_bit'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, "NEWLINE", "NUM", "ID", "WS"
	};
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
	public String getGrammarFileName() { return "Hello.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public HelloParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgramContext extends ParserRuleContext {
		public List<KomutlarContext> komutlar() {
			return getRuleContexts(KomutlarContext.class);
		}
		public KomutlarContext komutlar(int i) {
			return getRuleContext(KomutlarContext.class,i);
		}
		public List<Interrupt_fonksiyonuContext> interrupt_fonksiyonu() {
			return getRuleContexts(Interrupt_fonksiyonuContext.class);
		}
		public Interrupt_fonksiyonuContext interrupt_fonksiyonu(int i) {
			return getRuleContext(Interrupt_fonksiyonuContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HelloVisitor ) return ((HelloVisitor<? extends T>)visitor).visitProgram(this);
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
			setState(52); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(52);
				switch (_input.LA(1)) {
				case T__4:
				case T__5:
				case T__6:
				case T__7:
				case T__8:
				case T__12:
				case T__13:
				case T__14:
				case T__15:
				case T__19:
				case T__20:
				case T__21:
				case T__22:
				case T__23:
				case T__24:
				case T__25:
				case T__26:
				case T__27:
				case T__28:
				case T__29:
				case T__30:
				case T__31:
				case T__32:
				case T__33:
				case T__34:
				case T__35:
				case T__36:
				case T__37:
				case T__38:
				case T__39:
				case T__40:
				case T__41:
				case ID:
					{
					setState(50);
					komutlar();
					}
					break;
				case T__0:
					{
					setState(51);
					interrupt_fonksiyonu();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(54); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__35) | (1L << T__36) | (1L << T__37) | (1L << T__38) | (1L << T__39) | (1L << T__40) | (1L << T__41) | (1L << ID))) != 0) );
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

	public static class KomutlarContext extends ParserRuleContext {
		public R_type_komutlarContext r_type_komutlar() {
			return getRuleContext(R_type_komutlarContext.class,0);
		}
		public I_type_komutlarContext i_type_komutlar() {
			return getRuleContext(I_type_komutlarContext.class,0);
		}
		public J_type_komutlarContext j_type_komutlar() {
			return getRuleContext(J_type_komutlarContext.class,0);
		}
		public Stack_commandsContext stack_commands() {
			return getRuleContext(Stack_commandsContext.class,0);
		}
		public Math_commandsContext math_commands() {
			return getRuleContext(Math_commandsContext.class,0);
		}
		public High_level_commandsContext high_level_commands() {
			return getRuleContext(High_level_commandsContext.class,0);
		}
		public Special_komutlarContext special_komutlar() {
			return getRuleContext(Special_komutlarContext.class,0);
		}
		public Label_definitionContext label_definition() {
			return getRuleContext(Label_definitionContext.class,0);
		}
		public KomutlarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_komutlar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterKomutlar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitKomutlar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HelloVisitor ) return ((HelloVisitor<? extends T>)visitor).visitKomutlar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final KomutlarContext komutlar() throws RecognitionException {
		KomutlarContext _localctx = new KomutlarContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_komutlar);
		try {
			setState(64);
			switch (_input.LA(1)) {
			case T__19:
			case T__20:
			case T__21:
			case T__22:
			case T__23:
			case T__24:
			case T__25:
			case T__26:
			case T__27:
			case T__28:
			case T__29:
			case T__30:
				enterOuterAlt(_localctx, 1);
				{
				setState(56);
				r_type_komutlar();
				}
				break;
			case T__32:
			case T__33:
			case T__34:
			case T__35:
			case T__36:
			case T__37:
			case T__38:
			case T__39:
			case T__40:
			case T__41:
				enterOuterAlt(_localctx, 2);
				{
				setState(57);
				i_type_komutlar();
				}
				break;
			case T__31:
				enterOuterAlt(_localctx, 3);
				{
				setState(58);
				j_type_komutlar();
				}
				break;
			case T__14:
			case T__15:
				enterOuterAlt(_localctx, 4);
				{
				setState(59);
				stack_commands();
				}
				break;
			case T__12:
			case T__13:
				enterOuterAlt(_localctx, 5);
				{
				setState(60);
				math_commands();
				}
				break;
			case T__8:
				enterOuterAlt(_localctx, 6);
				{
				setState(61);
				high_level_commands();
				}
				break;
			case T__4:
			case T__5:
			case T__6:
			case T__7:
				enterOuterAlt(_localctx, 7);
				{
				setState(62);
				special_komutlar();
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 8);
				{
				setState(63);
				label_definition();
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

	public static class Interrupt_fonksiyonuContext extends ParserRuleContext {
		public Interrupt_fonksiyonuContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interrupt_fonksiyonu; }
	 
		public Interrupt_fonksiyonuContext() { }
		public void copyFrom(Interrupt_fonksiyonuContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Interrupt_fonkContext extends Interrupt_fonksiyonuContext {
		public List<KomutlarContext> komutlar() {
			return getRuleContexts(KomutlarContext.class);
		}
		public KomutlarContext komutlar(int i) {
			return getRuleContext(KomutlarContext.class,i);
		}
		public Interrupt_fonkContext(Interrupt_fonksiyonuContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterInterrupt_fonk(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitInterrupt_fonk(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HelloVisitor ) return ((HelloVisitor<? extends T>)visitor).visitInterrupt_fonk(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Interrupt_fonksiyonuContext interrupt_fonksiyonu() throws RecognitionException {
		Interrupt_fonksiyonuContext _localctx = new Interrupt_fonksiyonuContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_interrupt_fonksiyonu);
		int _la;
		try {
			_localctx = new Interrupt_fonkContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(66);
			match(T__0);
			setState(67);
			match(T__1);
			setState(71);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__35) | (1L << T__36) | (1L << T__37) | (1L << T__38) | (1L << T__39) | (1L << T__40) | (1L << T__41) | (1L << ID))) != 0)) {
				{
				{
				setState(68);
				komutlar();
				}
				}
				setState(73);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(74);
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

	public static class Label_definitionContext extends ParserRuleContext {
		public Label_definitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_label_definition; }
	 
		public Label_definitionContext() { }
		public void copyFrom(Label_definitionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Label_processContext extends Label_definitionContext {
		public LabelContext label() {
			return getRuleContext(LabelContext.class,0);
		}
		public Label_processContext(Label_definitionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterLabel_process(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitLabel_process(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HelloVisitor ) return ((HelloVisitor<? extends T>)visitor).visitLabel_process(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Label_definitionContext label_definition() throws RecognitionException {
		Label_definitionContext _localctx = new Label_definitionContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_label_definition);
		try {
			_localctx = new Label_processContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(76);
			label();
			setState(77);
			match(T__3);
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

	public static class Special_komutlarContext extends ParserRuleContext {
		public Special_komutlarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_special_komutlar; }
	 
		public Special_komutlarContext() { }
		public void copyFrom(Special_komutlarContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Labelli_callContext extends Special_komutlarContext {
		public LabelContext label() {
			return getRuleContext(LabelContext.class,0);
		}
		public Labelli_callContext(Special_komutlarContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterLabelli_call(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitLabelli_call(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HelloVisitor ) return ((HelloVisitor<? extends T>)visitor).visitLabelli_call(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Save_pc_to_resultContext extends Special_komutlarContext {
		public Special_komut_ismiContext special_komut_ismi() {
			return getRuleContext(Special_komut_ismiContext.class,0);
		}
		public Reg_defContext reg_def() {
			return getRuleContext(Reg_defContext.class,0);
		}
		public Save_pc_to_resultContext(Special_komutlarContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterSave_pc_to_result(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitSave_pc_to_result(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HelloVisitor ) return ((HelloVisitor<? extends T>)visitor).visitSave_pc_to_result(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Foksiyon_cagirmaContext extends Special_komutlarContext {
		public ImmediateContext immediate() {
			return getRuleContext(ImmediateContext.class,0);
		}
		public Foksiyon_cagirmaContext(Special_komutlarContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterFoksiyon_cagirma(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitFoksiyon_cagirma(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HelloVisitor ) return ((HelloVisitor<? extends T>)visitor).visitFoksiyon_cagirma(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Return_from_functionContext extends Special_komutlarContext {
		public Return_from_functionContext(Special_komutlarContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterReturn_from_function(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitReturn_from_function(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HelloVisitor ) return ((HelloVisitor<? extends T>)visitor).visitReturn_from_function(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Nop_operationContext extends Special_komutlarContext {
		public Nop_operationContext(Special_komutlarContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterNop_operation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitNop_operation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HelloVisitor ) return ((HelloVisitor<? extends T>)visitor).visitNop_operation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Special_komutlarContext special_komutlar() throws RecognitionException {
		Special_komutlarContext _localctx = new Special_komutlarContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_special_komutlar);
		try {
			setState(88);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				_localctx = new Save_pc_to_resultContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(79);
				special_komut_ismi();
				setState(80);
				reg_def();
				}
				break;
			case 2:
				_localctx = new Foksiyon_cagirmaContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(82);
				match(T__4);
				setState(83);
				immediate();
				}
				break;
			case 3:
				_localctx = new Labelli_callContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(84);
				match(T__4);
				setState(85);
				label();
				}
				break;
			case 4:
				_localctx = new Return_from_functionContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(86);
				match(T__5);
				}
				break;
			case 5:
				_localctx = new Nop_operationContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(87);
				match(T__6);
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

	public static class Special_komut_ismiContext extends ParserRuleContext {
		public Special_komut_ismiContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_special_komut_ismi; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterSpecial_komut_ismi(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitSpecial_komut_ismi(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HelloVisitor ) return ((HelloVisitor<? extends T>)visitor).visitSpecial_komut_ismi(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Special_komut_ismiContext special_komut_ismi() throws RecognitionException {
		Special_komut_ismiContext _localctx = new Special_komut_ismiContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_special_komut_ismi);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(90);
			match(T__7);
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

	public static class High_level_commandsContext extends ParserRuleContext {
		public Mov_komutuContext mov_komutu() {
			return getRuleContext(Mov_komutuContext.class,0);
		}
		public High_level_commandsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_high_level_commands; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterHigh_level_commands(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitHigh_level_commands(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HelloVisitor ) return ((HelloVisitor<? extends T>)visitor).visitHigh_level_commands(this);
			else return visitor.visitChildren(this);
		}
	}

	public final High_level_commandsContext high_level_commands() throws RecognitionException {
		High_level_commandsContext _localctx = new High_level_commandsContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_high_level_commands);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(92);
			mov_komutu();
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

	public static class Mov_komutuContext extends ParserRuleContext {
		public Mov_komutuContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mov_komutu; }
	 
		public Mov_komutuContext() { }
		public void copyFrom(Mov_komutuContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Mov_highContext extends Mov_komutuContext {
		public DestinationContext destination() {
			return getRuleContext(DestinationContext.class,0);
		}
		public SourceContext source() {
			return getRuleContext(SourceContext.class,0);
		}
		public Mov_highContext(Mov_komutuContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterMov_high(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitMov_high(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HelloVisitor ) return ((HelloVisitor<? extends T>)visitor).visitMov_high(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Mov_komutuContext mov_komutu() throws RecognitionException {
		Mov_komutuContext _localctx = new Mov_komutuContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_mov_komutu);
		try {
			_localctx = new Mov_highContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(94);
			match(T__8);
			setState(95);
			destination();
			setState(96);
			match(T__9);
			setState(97);
			source();
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

	public static class DestinationContext extends ParserRuleContext {
		public DestinationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_destination; }
	 
		public DestinationContext() { }
		public void copyFrom(DestinationContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class JkContext extends DestinationContext {
		public Reg_or_immediateContext reg_or_immediate() {
			return getRuleContext(Reg_or_immediateContext.class,0);
		}
		public JkContext(DestinationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterJk(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitJk(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HelloVisitor ) return ((HelloVisitor<? extends T>)visitor).visitJk(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class JnContext extends DestinationContext {
		public Reg_defContext reg_def() {
			return getRuleContext(Reg_defContext.class,0);
		}
		public JnContext(DestinationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterJn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitJn(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HelloVisitor ) return ((HelloVisitor<? extends T>)visitor).visitJn(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DestinationContext destination() throws RecognitionException {
		DestinationContext _localctx = new DestinationContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_destination);
		try {
			setState(104);
			switch (_input.LA(1)) {
			case T__10:
				_localctx = new JkContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(99);
				match(T__10);
				setState(100);
				reg_or_immediate();
				setState(101);
				match(T__11);
				}
				break;
			case T__16:
				_localctx = new JnContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(103);
				reg_def();
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

	public static class Reg_or_immediateContext extends ParserRuleContext {
		public Reg_defContext reg_def() {
			return getRuleContext(Reg_defContext.class,0);
		}
		public ImmediateContext immediate() {
			return getRuleContext(ImmediateContext.class,0);
		}
		public Reg_or_immediateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_reg_or_immediate; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterReg_or_immediate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitReg_or_immediate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HelloVisitor ) return ((HelloVisitor<? extends T>)visitor).visitReg_or_immediate(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Reg_or_immediateContext reg_or_immediate() throws RecognitionException {
		Reg_or_immediateContext _localctx = new Reg_or_immediateContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_reg_or_immediate);
		try {
			setState(108);
			switch (_input.LA(1)) {
			case T__16:
				enterOuterAlt(_localctx, 1);
				{
				setState(106);
				reg_def();
				}
				break;
			case NUM:
				enterOuterAlt(_localctx, 2);
				{
				setState(107);
				immediate();
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

	public static class SourceContext extends ParserRuleContext {
		public SourceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_source; }
	 
		public SourceContext() { }
		public void copyFrom(SourceContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class KlContext extends SourceContext {
		public Reg_defContext reg_def() {
			return getRuleContext(Reg_defContext.class,0);
		}
		public KlContext(SourceContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterKl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitKl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HelloVisitor ) return ((HelloVisitor<? extends T>)visitor).visitKl(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class GetirContext extends SourceContext {
		public Reg_or_immediateContext reg_or_immediate() {
			return getRuleContext(Reg_or_immediateContext.class,0);
		}
		public GetirContext(SourceContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterGetir(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitGetir(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HelloVisitor ) return ((HelloVisitor<? extends T>)visitor).visitGetir(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ImmContext extends SourceContext {
		public ImmediateContext immediate() {
			return getRuleContext(ImmediateContext.class,0);
		}
		public ImmContext(SourceContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterImm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitImm(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HelloVisitor ) return ((HelloVisitor<? extends T>)visitor).visitImm(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SourceContext source() throws RecognitionException {
		SourceContext _localctx = new SourceContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_source);
		try {
			setState(116);
			switch (_input.LA(1)) {
			case T__10:
				_localctx = new GetirContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(110);
				match(T__10);
				setState(111);
				reg_or_immediate();
				setState(112);
				match(T__11);
				}
				break;
			case T__16:
				_localctx = new KlContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(114);
				reg_def();
				}
				break;
			case NUM:
				_localctx = new ImmContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(115);
				immediate();
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

	public static class Math_commandsContext extends ParserRuleContext {
		public Math_commandsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_math_commands; }
	 
		public Math_commandsContext() { }
		public void copyFrom(Math_commandsContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Math_komutuContext extends Math_commandsContext {
		public Math_komut_ismiContext math_komut_ismi() {
			return getRuleContext(Math_komut_ismiContext.class,0);
		}
		public Reg_defContext reg_def() {
			return getRuleContext(Reg_defContext.class,0);
		}
		public Math_komutuContext(Math_commandsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterMath_komutu(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitMath_komutu(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HelloVisitor ) return ((HelloVisitor<? extends T>)visitor).visitMath_komutu(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Math_commandsContext math_commands() throws RecognitionException {
		Math_commandsContext _localctx = new Math_commandsContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_math_commands);
		try {
			_localctx = new Math_komutuContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(118);
			math_komut_ismi();
			setState(119);
			reg_def();
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

	public static class Math_komut_ismiContext extends ParserRuleContext {
		public Math_komut_ismiContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_math_komut_ismi; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterMath_komut_ismi(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitMath_komut_ismi(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HelloVisitor ) return ((HelloVisitor<? extends T>)visitor).visitMath_komut_ismi(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Math_komut_ismiContext math_komut_ismi() throws RecognitionException {
		Math_komut_ismiContext _localctx = new Math_komut_ismiContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_math_komut_ismi);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(121);
			_la = _input.LA(1);
			if ( !(_la==T__12 || _la==T__13) ) {
			_errHandler.recoverInline(this);
			} else {
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

	public static class Stack_commandsContext extends ParserRuleContext {
		public Stack_commandsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stack_commands; }
	 
		public Stack_commandsContext() { }
		public void copyFrom(Stack_commandsContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Stack_komutuContext extends Stack_commandsContext {
		public Stack_komut_ismiContext stack_komut_ismi() {
			return getRuleContext(Stack_komut_ismiContext.class,0);
		}
		public Reg_defContext reg_def() {
			return getRuleContext(Reg_defContext.class,0);
		}
		public Stack_komutuContext(Stack_commandsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterStack_komutu(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitStack_komutu(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HelloVisitor ) return ((HelloVisitor<? extends T>)visitor).visitStack_komutu(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Stack_commandsContext stack_commands() throws RecognitionException {
		Stack_commandsContext _localctx = new Stack_commandsContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_stack_commands);
		try {
			_localctx = new Stack_komutuContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(123);
			stack_komut_ismi();
			setState(124);
			reg_def();
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

	public static class Stack_komut_ismiContext extends ParserRuleContext {
		public Stack_komut_ismiContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stack_komut_ismi; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterStack_komut_ismi(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitStack_komut_ismi(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HelloVisitor ) return ((HelloVisitor<? extends T>)visitor).visitStack_komut_ismi(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Stack_komut_ismiContext stack_komut_ismi() throws RecognitionException {
		Stack_komut_ismiContext _localctx = new Stack_komut_ismiContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_stack_komut_ismi);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(126);
			_la = _input.LA(1);
			if ( !(_la==T__14 || _la==T__15) ) {
			_errHandler.recoverInline(this);
			} else {
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

	public static class Reg_defContext extends ParserRuleContext {
		public ImmediateContext immediate() {
			return getRuleContext(ImmediateContext.class,0);
		}
		public Reg_defContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_reg_def; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterReg_def(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitReg_def(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HelloVisitor ) return ((HelloVisitor<? extends T>)visitor).visitReg_def(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Reg_defContext reg_def() throws RecognitionException {
		Reg_defContext _localctx = new Reg_defContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_reg_def);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(128);
			match(T__16);
			setState(132);
			switch (_input.LA(1)) {
			case T__17:
				{
				setState(129);
				match(T__17);
				}
				break;
			case T__18:
				{
				setState(130);
				match(T__18);
				}
				break;
			case NUM:
				{
				setState(131);
				immediate();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class R_type_komutlarContext extends ParserRuleContext {
		public R_type_komutlarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_r_type_komutlar; }
	 
		public R_type_komutlarContext() { }
		public void copyFrom(R_type_komutlarContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class R_type_komutContext extends R_type_komutlarContext {
		public R_type_komut_ismiContext r_type_komut_ismi() {
			return getRuleContext(R_type_komut_ismiContext.class,0);
		}
		public List<Reg_defContext> reg_def() {
			return getRuleContexts(Reg_defContext.class);
		}
		public Reg_defContext reg_def(int i) {
			return getRuleContext(Reg_defContext.class,i);
		}
		public R_type_komutContext(R_type_komutlarContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterR_type_komut(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitR_type_komut(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HelloVisitor ) return ((HelloVisitor<? extends T>)visitor).visitR_type_komut(this);
			else return visitor.visitChildren(this);
		}
	}

	public final R_type_komutlarContext r_type_komutlar() throws RecognitionException {
		R_type_komutlarContext _localctx = new R_type_komutlarContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_r_type_komutlar);
		try {
			_localctx = new R_type_komutContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(134);
			r_type_komut_ismi();
			setState(135);
			reg_def();
			setState(136);
			match(T__9);
			setState(137);
			reg_def();
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

	public static class R_type_komut_ismiContext extends ParserRuleContext {
		public R_type_komut_ismiContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_r_type_komut_ismi; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterR_type_komut_ismi(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitR_type_komut_ismi(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HelloVisitor ) return ((HelloVisitor<? extends T>)visitor).visitR_type_komut_ismi(this);
			else return visitor.visitChildren(this);
		}
	}

	public final R_type_komut_ismiContext r_type_komut_ismi() throws RecognitionException {
		R_type_komut_ismiContext _localctx = new R_type_komut_ismiContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_r_type_komut_ismi);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(139);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << T__30))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
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

	public static class I_type_komutlarContext extends ParserRuleContext {
		public I_type_komutlarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_i_type_komutlar; }
	 
		public I_type_komutlarContext() { }
		public void copyFrom(I_type_komutlarContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class I_type_komutContext extends I_type_komutlarContext {
		public I_type_komut_ismiContext i_type_komut_ismi() {
			return getRuleContext(I_type_komut_ismiContext.class,0);
		}
		public Reg_defContext reg_def() {
			return getRuleContext(Reg_defContext.class,0);
		}
		public ImmediateContext immediate() {
			return getRuleContext(ImmediateContext.class,0);
		}
		public I_type_komutContext(I_type_komutlarContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterI_type_komut(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitI_type_komut(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HelloVisitor ) return ((HelloVisitor<? extends T>)visitor).visitI_type_komut(this);
			else return visitor.visitChildren(this);
		}
	}

	public final I_type_komutlarContext i_type_komutlar() throws RecognitionException {
		I_type_komutlarContext _localctx = new I_type_komutlarContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_i_type_komutlar);
		try {
			_localctx = new I_type_komutContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(141);
			i_type_komut_ismi();
			setState(142);
			reg_def();
			setState(143);
			match(T__9);
			setState(144);
			immediate();
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

	public static class J_type_komutlarContext extends ParserRuleContext {
		public J_type_komutlarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_j_type_komutlar; }
	 
		public J_type_komutlarContext() { }
		public void copyFrom(J_type_komutlarContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class J_type_komutContext extends J_type_komutlarContext {
		public J_type_komut_ismiContext j_type_komut_ismi() {
			return getRuleContext(J_type_komut_ismiContext.class,0);
		}
		public Jump_toContext jump_to() {
			return getRuleContext(Jump_toContext.class,0);
		}
		public J_type_komutContext(J_type_komutlarContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterJ_type_komut(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitJ_type_komut(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HelloVisitor ) return ((HelloVisitor<? extends T>)visitor).visitJ_type_komut(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Labelli_komutContext extends J_type_komutlarContext {
		public J_type_komut_ismiContext j_type_komut_ismi() {
			return getRuleContext(J_type_komut_ismiContext.class,0);
		}
		public LabelContext label() {
			return getRuleContext(LabelContext.class,0);
		}
		public Labelli_komutContext(J_type_komutlarContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterLabelli_komut(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitLabelli_komut(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HelloVisitor ) return ((HelloVisitor<? extends T>)visitor).visitLabelli_komut(this);
			else return visitor.visitChildren(this);
		}
	}

	public final J_type_komutlarContext j_type_komutlar() throws RecognitionException {
		J_type_komutlarContext _localctx = new J_type_komutlarContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_j_type_komutlar);
		try {
			setState(152);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				_localctx = new J_type_komutContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(146);
				j_type_komut_ismi();
				setState(147);
				jump_to();
				}
				break;
			case 2:
				_localctx = new Labelli_komutContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(149);
				j_type_komut_ismi();
				setState(150);
				label();
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

	public static class Jump_toContext extends ParserRuleContext {
		public ImmediateContext immediate() {
			return getRuleContext(ImmediateContext.class,0);
		}
		public Reg_defContext reg_def() {
			return getRuleContext(Reg_defContext.class,0);
		}
		public Jump_toContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jump_to; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterJump_to(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitJump_to(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HelloVisitor ) return ((HelloVisitor<? extends T>)visitor).visitJump_to(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Jump_toContext jump_to() throws RecognitionException {
		Jump_toContext _localctx = new Jump_toContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_jump_to);
		try {
			setState(156);
			switch (_input.LA(1)) {
			case NUM:
				enterOuterAlt(_localctx, 1);
				{
				setState(154);
				immediate();
				}
				break;
			case T__16:
				enterOuterAlt(_localctx, 2);
				{
				setState(155);
				reg_def();
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

	public static class J_type_komut_ismiContext extends ParserRuleContext {
		public J_type_komut_ismiContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_j_type_komut_ismi; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterJ_type_komut_ismi(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitJ_type_komut_ismi(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HelloVisitor ) return ((HelloVisitor<? extends T>)visitor).visitJ_type_komut_ismi(this);
			else return visitor.visitChildren(this);
		}
	}

	public final J_type_komut_ismiContext j_type_komut_ismi() throws RecognitionException {
		J_type_komut_ismiContext _localctx = new J_type_komut_ismiContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_j_type_komut_ismi);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(158);
			match(T__31);
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

	public static class I_type_komut_ismiContext extends ParserRuleContext {
		public I_type_komut_ismiContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_i_type_komut_ismi; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterI_type_komut_ismi(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitI_type_komut_ismi(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HelloVisitor ) return ((HelloVisitor<? extends T>)visitor).visitI_type_komut_ismi(this);
			else return visitor.visitChildren(this);
		}
	}

	public final I_type_komut_ismiContext i_type_komut_ismi() throws RecognitionException {
		I_type_komut_ismiContext _localctx = new I_type_komut_ismiContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_i_type_komut_ismi);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(160);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__35) | (1L << T__36) | (1L << T__37) | (1L << T__38) | (1L << T__39) | (1L << T__40) | (1L << T__41))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
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

	public static class LabelContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(HelloParser.ID, 0); }
		public LabelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_label; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterLabel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitLabel(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HelloVisitor ) return ((HelloVisitor<? extends T>)visitor).visitLabel(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LabelContext label() throws RecognitionException {
		LabelContext _localctx = new LabelContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_label);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(162);
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

	public static class ImmediateContext extends ParserRuleContext {
		public TerminalNode NUM() { return getToken(HelloParser.NUM, 0); }
		public ImmediateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_immediate; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterImmediate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitImmediate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HelloVisitor ) return ((HelloVisitor<? extends T>)visitor).visitImmediate(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImmediateContext immediate() throws RecognitionException {
		ImmediateContext _localctx = new ImmediateContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_immediate);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(164);
			match(NUM);
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\60\u00a9\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\3\2\3\2\6\2\67\n\2\r\2\16\28\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\5\3C\n\3\3\4\3\4\3\4\7\4H\n\4\f\4\16\4K\13\4\3\4\3\4\3\5\3\5\3\5\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6[\n\6\3\7\3\7\3\b\3\b\3\t\3\t\3"+
		"\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\5\nk\n\n\3\13\3\13\5\13o\n\13\3\f\3\f\3"+
		"\f\3\f\3\f\3\f\5\fw\n\f\3\r\3\r\3\r\3\16\3\16\3\17\3\17\3\17\3\20\3\20"+
		"\3\21\3\21\3\21\3\21\5\21\u0087\n\21\3\22\3\22\3\22\3\22\3\22\3\23\3\23"+
		"\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\5\25\u009b\n\25"+
		"\3\26\3\26\5\26\u009f\n\26\3\27\3\27\3\30\3\30\3\31\3\31\3\32\3\32\3\32"+
		"\2\2\33\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\2\6\3\2"+
		"\17\20\3\2\21\22\3\2\26!\3\2#,\u00a5\2\66\3\2\2\2\4B\3\2\2\2\6D\3\2\2"+
		"\2\bN\3\2\2\2\nZ\3\2\2\2\f\\\3\2\2\2\16^\3\2\2\2\20`\3\2\2\2\22j\3\2\2"+
		"\2\24n\3\2\2\2\26v\3\2\2\2\30x\3\2\2\2\32{\3\2\2\2\34}\3\2\2\2\36\u0080"+
		"\3\2\2\2 \u0082\3\2\2\2\"\u0088\3\2\2\2$\u008d\3\2\2\2&\u008f\3\2\2\2"+
		"(\u009a\3\2\2\2*\u009e\3\2\2\2,\u00a0\3\2\2\2.\u00a2\3\2\2\2\60\u00a4"+
		"\3\2\2\2\62\u00a6\3\2\2\2\64\67\5\4\3\2\65\67\5\6\4\2\66\64\3\2\2\2\66"+
		"\65\3\2\2\2\678\3\2\2\28\66\3\2\2\289\3\2\2\29\3\3\2\2\2:C\5\"\22\2;C"+
		"\5&\24\2<C\5(\25\2=C\5\34\17\2>C\5\30\r\2?C\5\16\b\2@C\5\n\6\2AC\5\b\5"+
		"\2B:\3\2\2\2B;\3\2\2\2B<\3\2\2\2B=\3\2\2\2B>\3\2\2\2B?\3\2\2\2B@\3\2\2"+
		"\2BA\3\2\2\2C\5\3\2\2\2DE\7\3\2\2EI\7\4\2\2FH\5\4\3\2GF\3\2\2\2HK\3\2"+
		"\2\2IG\3\2\2\2IJ\3\2\2\2JL\3\2\2\2KI\3\2\2\2LM\7\5\2\2M\7\3\2\2\2NO\5"+
		"\60\31\2OP\7\6\2\2P\t\3\2\2\2QR\5\f\7\2RS\5 \21\2S[\3\2\2\2TU\7\7\2\2"+
		"U[\5\62\32\2VW\7\7\2\2W[\5\60\31\2X[\7\b\2\2Y[\7\t\2\2ZQ\3\2\2\2ZT\3\2"+
		"\2\2ZV\3\2\2\2ZX\3\2\2\2ZY\3\2\2\2[\13\3\2\2\2\\]\7\n\2\2]\r\3\2\2\2^"+
		"_\5\20\t\2_\17\3\2\2\2`a\7\13\2\2ab\5\22\n\2bc\7\f\2\2cd\5\26\f\2d\21"+
		"\3\2\2\2ef\7\r\2\2fg\5\24\13\2gh\7\16\2\2hk\3\2\2\2ik\5 \21\2je\3\2\2"+
		"\2ji\3\2\2\2k\23\3\2\2\2lo\5 \21\2mo\5\62\32\2nl\3\2\2\2nm\3\2\2\2o\25"+
		"\3\2\2\2pq\7\r\2\2qr\5\24\13\2rs\7\16\2\2sw\3\2\2\2tw\5 \21\2uw\5\62\32"+
		"\2vp\3\2\2\2vt\3\2\2\2vu\3\2\2\2w\27\3\2\2\2xy\5\32\16\2yz\5 \21\2z\31"+
		"\3\2\2\2{|\t\2\2\2|\33\3\2\2\2}~\5\36\20\2~\177\5 \21\2\177\35\3\2\2\2"+
		"\u0080\u0081\t\3\2\2\u0081\37\3\2\2\2\u0082\u0086\7\23\2\2\u0083\u0087"+
		"\7\24\2\2\u0084\u0087\7\25\2\2\u0085\u0087\5\62\32\2\u0086\u0083\3\2\2"+
		"\2\u0086\u0084\3\2\2\2\u0086\u0085\3\2\2\2\u0087!\3\2\2\2\u0088\u0089"+
		"\5$\23\2\u0089\u008a\5 \21\2\u008a\u008b\7\f\2\2\u008b\u008c\5 \21\2\u008c"+
		"#\3\2\2\2\u008d\u008e\t\4\2\2\u008e%\3\2\2\2\u008f\u0090\5.\30\2\u0090"+
		"\u0091\5 \21\2\u0091\u0092\7\f\2\2\u0092\u0093\5\62\32\2\u0093\'\3\2\2"+
		"\2\u0094\u0095\5,\27\2\u0095\u0096\5*\26\2\u0096\u009b\3\2\2\2\u0097\u0098"+
		"\5,\27\2\u0098\u0099\5\60\31\2\u0099\u009b\3\2\2\2\u009a\u0094\3\2\2\2"+
		"\u009a\u0097\3\2\2\2\u009b)\3\2\2\2\u009c\u009f\5\62\32\2\u009d\u009f"+
		"\5 \21\2\u009e\u009c\3\2\2\2\u009e\u009d\3\2\2\2\u009f+\3\2\2\2\u00a0"+
		"\u00a1\7\"\2\2\u00a1-\3\2\2\2\u00a2\u00a3\t\5\2\2\u00a3/\3\2\2\2\u00a4"+
		"\u00a5\7/\2\2\u00a5\61\3\2\2\2\u00a6\u00a7\7.\2\2\u00a7\63\3\2\2\2\r\66"+
		"8BIZjnv\u0086\u009a\u009e";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}