// Generated from Hello.g4 by ANTLR 4.5.3
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link HelloParser}.
 */
public interface HelloListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link HelloParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(HelloParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(HelloParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#komutlar}.
	 * @param ctx the parse tree
	 */
	void enterKomutlar(HelloParser.KomutlarContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#komutlar}.
	 * @param ctx the parse tree
	 */
	void exitKomutlar(HelloParser.KomutlarContext ctx);
	/**
	 * Enter a parse tree produced by the {@code interrupt_fonk}
	 * labeled alternative in {@link HelloParser#interrupt_fonksiyonu}.
	 * @param ctx the parse tree
	 */
	void enterInterrupt_fonk(HelloParser.Interrupt_fonkContext ctx);
	/**
	 * Exit a parse tree produced by the {@code interrupt_fonk}
	 * labeled alternative in {@link HelloParser#interrupt_fonksiyonu}.
	 * @param ctx the parse tree
	 */
	void exitInterrupt_fonk(HelloParser.Interrupt_fonkContext ctx);
	/**
	 * Enter a parse tree produced by the {@code label_process}
	 * labeled alternative in {@link HelloParser#label_definition}.
	 * @param ctx the parse tree
	 */
	void enterLabel_process(HelloParser.Label_processContext ctx);
	/**
	 * Exit a parse tree produced by the {@code label_process}
	 * labeled alternative in {@link HelloParser#label_definition}.
	 * @param ctx the parse tree
	 */
	void exitLabel_process(HelloParser.Label_processContext ctx);
	/**
	 * Enter a parse tree produced by the {@code save_pc_to_result}
	 * labeled alternative in {@link HelloParser#special_komutlar}.
	 * @param ctx the parse tree
	 */
	void enterSave_pc_to_result(HelloParser.Save_pc_to_resultContext ctx);
	/**
	 * Exit a parse tree produced by the {@code save_pc_to_result}
	 * labeled alternative in {@link HelloParser#special_komutlar}.
	 * @param ctx the parse tree
	 */
	void exitSave_pc_to_result(HelloParser.Save_pc_to_resultContext ctx);
	/**
	 * Enter a parse tree produced by the {@code foksiyon_cagirma}
	 * labeled alternative in {@link HelloParser#special_komutlar}.
	 * @param ctx the parse tree
	 */
	void enterFoksiyon_cagirma(HelloParser.Foksiyon_cagirmaContext ctx);
	/**
	 * Exit a parse tree produced by the {@code foksiyon_cagirma}
	 * labeled alternative in {@link HelloParser#special_komutlar}.
	 * @param ctx the parse tree
	 */
	void exitFoksiyon_cagirma(HelloParser.Foksiyon_cagirmaContext ctx);
	/**
	 * Enter a parse tree produced by the {@code labelli_call}
	 * labeled alternative in {@link HelloParser#special_komutlar}.
	 * @param ctx the parse tree
	 */
	void enterLabelli_call(HelloParser.Labelli_callContext ctx);
	/**
	 * Exit a parse tree produced by the {@code labelli_call}
	 * labeled alternative in {@link HelloParser#special_komutlar}.
	 * @param ctx the parse tree
	 */
	void exitLabelli_call(HelloParser.Labelli_callContext ctx);
	/**
	 * Enter a parse tree produced by the {@code return_from_function}
	 * labeled alternative in {@link HelloParser#special_komutlar}.
	 * @param ctx the parse tree
	 */
	void enterReturn_from_function(HelloParser.Return_from_functionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code return_from_function}
	 * labeled alternative in {@link HelloParser#special_komutlar}.
	 * @param ctx the parse tree
	 */
	void exitReturn_from_function(HelloParser.Return_from_functionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code nop_operation}
	 * labeled alternative in {@link HelloParser#special_komutlar}.
	 * @param ctx the parse tree
	 */
	void enterNop_operation(HelloParser.Nop_operationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code nop_operation}
	 * labeled alternative in {@link HelloParser#special_komutlar}.
	 * @param ctx the parse tree
	 */
	void exitNop_operation(HelloParser.Nop_operationContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#special_komut_ismi}.
	 * @param ctx the parse tree
	 */
	void enterSpecial_komut_ismi(HelloParser.Special_komut_ismiContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#special_komut_ismi}.
	 * @param ctx the parse tree
	 */
	void exitSpecial_komut_ismi(HelloParser.Special_komut_ismiContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#high_level_commands}.
	 * @param ctx the parse tree
	 */
	void enterHigh_level_commands(HelloParser.High_level_commandsContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#high_level_commands}.
	 * @param ctx the parse tree
	 */
	void exitHigh_level_commands(HelloParser.High_level_commandsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code mov_high}
	 * labeled alternative in {@link HelloParser#mov_komutu}.
	 * @param ctx the parse tree
	 */
	void enterMov_high(HelloParser.Mov_highContext ctx);
	/**
	 * Exit a parse tree produced by the {@code mov_high}
	 * labeled alternative in {@link HelloParser#mov_komutu}.
	 * @param ctx the parse tree
	 */
	void exitMov_high(HelloParser.Mov_highContext ctx);
	/**
	 * Enter a parse tree produced by the {@code jk}
	 * labeled alternative in {@link HelloParser#destination}.
	 * @param ctx the parse tree
	 */
	void enterJk(HelloParser.JkContext ctx);
	/**
	 * Exit a parse tree produced by the {@code jk}
	 * labeled alternative in {@link HelloParser#destination}.
	 * @param ctx the parse tree
	 */
	void exitJk(HelloParser.JkContext ctx);
	/**
	 * Enter a parse tree produced by the {@code jn}
	 * labeled alternative in {@link HelloParser#destination}.
	 * @param ctx the parse tree
	 */
	void enterJn(HelloParser.JnContext ctx);
	/**
	 * Exit a parse tree produced by the {@code jn}
	 * labeled alternative in {@link HelloParser#destination}.
	 * @param ctx the parse tree
	 */
	void exitJn(HelloParser.JnContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#reg_or_immediate}.
	 * @param ctx the parse tree
	 */
	void enterReg_or_immediate(HelloParser.Reg_or_immediateContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#reg_or_immediate}.
	 * @param ctx the parse tree
	 */
	void exitReg_or_immediate(HelloParser.Reg_or_immediateContext ctx);
	/**
	 * Enter a parse tree produced by the {@code getir}
	 * labeled alternative in {@link HelloParser#source}.
	 * @param ctx the parse tree
	 */
	void enterGetir(HelloParser.GetirContext ctx);
	/**
	 * Exit a parse tree produced by the {@code getir}
	 * labeled alternative in {@link HelloParser#source}.
	 * @param ctx the parse tree
	 */
	void exitGetir(HelloParser.GetirContext ctx);
	/**
	 * Enter a parse tree produced by the {@code kl}
	 * labeled alternative in {@link HelloParser#source}.
	 * @param ctx the parse tree
	 */
	void enterKl(HelloParser.KlContext ctx);
	/**
	 * Exit a parse tree produced by the {@code kl}
	 * labeled alternative in {@link HelloParser#source}.
	 * @param ctx the parse tree
	 */
	void exitKl(HelloParser.KlContext ctx);
	/**
	 * Enter a parse tree produced by the {@code imm}
	 * labeled alternative in {@link HelloParser#source}.
	 * @param ctx the parse tree
	 */
	void enterImm(HelloParser.ImmContext ctx);
	/**
	 * Exit a parse tree produced by the {@code imm}
	 * labeled alternative in {@link HelloParser#source}.
	 * @param ctx the parse tree
	 */
	void exitImm(HelloParser.ImmContext ctx);
	/**
	 * Enter a parse tree produced by the {@code math_komutu}
	 * labeled alternative in {@link HelloParser#math_commands}.
	 * @param ctx the parse tree
	 */
	void enterMath_komutu(HelloParser.Math_komutuContext ctx);
	/**
	 * Exit a parse tree produced by the {@code math_komutu}
	 * labeled alternative in {@link HelloParser#math_commands}.
	 * @param ctx the parse tree
	 */
	void exitMath_komutu(HelloParser.Math_komutuContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#math_komut_ismi}.
	 * @param ctx the parse tree
	 */
	void enterMath_komut_ismi(HelloParser.Math_komut_ismiContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#math_komut_ismi}.
	 * @param ctx the parse tree
	 */
	void exitMath_komut_ismi(HelloParser.Math_komut_ismiContext ctx);
	/**
	 * Enter a parse tree produced by the {@code stack_komutu}
	 * labeled alternative in {@link HelloParser#stack_commands}.
	 * @param ctx the parse tree
	 */
	void enterStack_komutu(HelloParser.Stack_komutuContext ctx);
	/**
	 * Exit a parse tree produced by the {@code stack_komutu}
	 * labeled alternative in {@link HelloParser#stack_commands}.
	 * @param ctx the parse tree
	 */
	void exitStack_komutu(HelloParser.Stack_komutuContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#stack_komut_ismi}.
	 * @param ctx the parse tree
	 */
	void enterStack_komut_ismi(HelloParser.Stack_komut_ismiContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#stack_komut_ismi}.
	 * @param ctx the parse tree
	 */
	void exitStack_komut_ismi(HelloParser.Stack_komut_ismiContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#reg_def}.
	 * @param ctx the parse tree
	 */
	void enterReg_def(HelloParser.Reg_defContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#reg_def}.
	 * @param ctx the parse tree
	 */
	void exitReg_def(HelloParser.Reg_defContext ctx);
	/**
	 * Enter a parse tree produced by the {@code r_type_komut}
	 * labeled alternative in {@link HelloParser#r_type_komutlar}.
	 * @param ctx the parse tree
	 */
	void enterR_type_komut(HelloParser.R_type_komutContext ctx);
	/**
	 * Exit a parse tree produced by the {@code r_type_komut}
	 * labeled alternative in {@link HelloParser#r_type_komutlar}.
	 * @param ctx the parse tree
	 */
	void exitR_type_komut(HelloParser.R_type_komutContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#r_type_komut_ismi}.
	 * @param ctx the parse tree
	 */
	void enterR_type_komut_ismi(HelloParser.R_type_komut_ismiContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#r_type_komut_ismi}.
	 * @param ctx the parse tree
	 */
	void exitR_type_komut_ismi(HelloParser.R_type_komut_ismiContext ctx);
	/**
	 * Enter a parse tree produced by the {@code i_type_komut}
	 * labeled alternative in {@link HelloParser#i_type_komutlar}.
	 * @param ctx the parse tree
	 */
	void enterI_type_komut(HelloParser.I_type_komutContext ctx);
	/**
	 * Exit a parse tree produced by the {@code i_type_komut}
	 * labeled alternative in {@link HelloParser#i_type_komutlar}.
	 * @param ctx the parse tree
	 */
	void exitI_type_komut(HelloParser.I_type_komutContext ctx);
	/**
	 * Enter a parse tree produced by the {@code j_type_komut}
	 * labeled alternative in {@link HelloParser#j_type_komutlar}.
	 * @param ctx the parse tree
	 */
	void enterJ_type_komut(HelloParser.J_type_komutContext ctx);
	/**
	 * Exit a parse tree produced by the {@code j_type_komut}
	 * labeled alternative in {@link HelloParser#j_type_komutlar}.
	 * @param ctx the parse tree
	 */
	void exitJ_type_komut(HelloParser.J_type_komutContext ctx);
	/**
	 * Enter a parse tree produced by the {@code labelli_komut}
	 * labeled alternative in {@link HelloParser#j_type_komutlar}.
	 * @param ctx the parse tree
	 */
	void enterLabelli_komut(HelloParser.Labelli_komutContext ctx);
	/**
	 * Exit a parse tree produced by the {@code labelli_komut}
	 * labeled alternative in {@link HelloParser#j_type_komutlar}.
	 * @param ctx the parse tree
	 */
	void exitLabelli_komut(HelloParser.Labelli_komutContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#jump_to}.
	 * @param ctx the parse tree
	 */
	void enterJump_to(HelloParser.Jump_toContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#jump_to}.
	 * @param ctx the parse tree
	 */
	void exitJump_to(HelloParser.Jump_toContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#j_type_komut_ismi}.
	 * @param ctx the parse tree
	 */
	void enterJ_type_komut_ismi(HelloParser.J_type_komut_ismiContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#j_type_komut_ismi}.
	 * @param ctx the parse tree
	 */
	void exitJ_type_komut_ismi(HelloParser.J_type_komut_ismiContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#i_type_komut_ismi}.
	 * @param ctx the parse tree
	 */
	void enterI_type_komut_ismi(HelloParser.I_type_komut_ismiContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#i_type_komut_ismi}.
	 * @param ctx the parse tree
	 */
	void exitI_type_komut_ismi(HelloParser.I_type_komut_ismiContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#label}.
	 * @param ctx the parse tree
	 */
	void enterLabel(HelloParser.LabelContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#label}.
	 * @param ctx the parse tree
	 */
	void exitLabel(HelloParser.LabelContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#immediate}.
	 * @param ctx the parse tree
	 */
	void enterImmediate(HelloParser.ImmediateContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#immediate}.
	 * @param ctx the parse tree
	 */
	void exitImmediate(HelloParser.ImmediateContext ctx);
}