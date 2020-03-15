// Generated from Hello.g4 by ANTLR 4.5.3
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link HelloParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface HelloVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link HelloParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(HelloParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link HelloParser#komutlar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKomutlar(HelloParser.KomutlarContext ctx);
	/**
	 * Visit a parse tree produced by the {@code interrupt_fonk}
	 * labeled alternative in {@link HelloParser#interrupt_fonksiyonu}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterrupt_fonk(HelloParser.Interrupt_fonkContext ctx);
	/**
	 * Visit a parse tree produced by the {@code label_process}
	 * labeled alternative in {@link HelloParser#label_definition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLabel_process(HelloParser.Label_processContext ctx);
	/**
	 * Visit a parse tree produced by the {@code save_pc_to_result}
	 * labeled alternative in {@link HelloParser#special_komutlar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSave_pc_to_result(HelloParser.Save_pc_to_resultContext ctx);
	/**
	 * Visit a parse tree produced by the {@code foksiyon_cagirma}
	 * labeled alternative in {@link HelloParser#special_komutlar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFoksiyon_cagirma(HelloParser.Foksiyon_cagirmaContext ctx);
	/**
	 * Visit a parse tree produced by the {@code labelli_call}
	 * labeled alternative in {@link HelloParser#special_komutlar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLabelli_call(HelloParser.Labelli_callContext ctx);
	/**
	 * Visit a parse tree produced by the {@code return_from_function}
	 * labeled alternative in {@link HelloParser#special_komutlar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturn_from_function(HelloParser.Return_from_functionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code nop_operation}
	 * labeled alternative in {@link HelloParser#special_komutlar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNop_operation(HelloParser.Nop_operationContext ctx);
	/**
	 * Visit a parse tree produced by {@link HelloParser#special_komut_ismi}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSpecial_komut_ismi(HelloParser.Special_komut_ismiContext ctx);
	/**
	 * Visit a parse tree produced by {@link HelloParser#high_level_commands}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHigh_level_commands(HelloParser.High_level_commandsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code mov_high}
	 * labeled alternative in {@link HelloParser#mov_komutu}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMov_high(HelloParser.Mov_highContext ctx);
	/**
	 * Visit a parse tree produced by the {@code jk}
	 * labeled alternative in {@link HelloParser#destination}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJk(HelloParser.JkContext ctx);
	/**
	 * Visit a parse tree produced by the {@code jn}
	 * labeled alternative in {@link HelloParser#destination}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJn(HelloParser.JnContext ctx);
	/**
	 * Visit a parse tree produced by {@link HelloParser#reg_or_immediate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReg_or_immediate(HelloParser.Reg_or_immediateContext ctx);
	/**
	 * Visit a parse tree produced by the {@code getir}
	 * labeled alternative in {@link HelloParser#source}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGetir(HelloParser.GetirContext ctx);
	/**
	 * Visit a parse tree produced by the {@code kl}
	 * labeled alternative in {@link HelloParser#source}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKl(HelloParser.KlContext ctx);
	/**
	 * Visit a parse tree produced by the {@code imm}
	 * labeled alternative in {@link HelloParser#source}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImm(HelloParser.ImmContext ctx);
	/**
	 * Visit a parse tree produced by the {@code math_komutu}
	 * labeled alternative in {@link HelloParser#math_commands}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMath_komutu(HelloParser.Math_komutuContext ctx);
	/**
	 * Visit a parse tree produced by {@link HelloParser#math_komut_ismi}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMath_komut_ismi(HelloParser.Math_komut_ismiContext ctx);
	/**
	 * Visit a parse tree produced by the {@code stack_komutu}
	 * labeled alternative in {@link HelloParser#stack_commands}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStack_komutu(HelloParser.Stack_komutuContext ctx);
	/**
	 * Visit a parse tree produced by {@link HelloParser#stack_komut_ismi}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStack_komut_ismi(HelloParser.Stack_komut_ismiContext ctx);
	/**
	 * Visit a parse tree produced by {@link HelloParser#reg_def}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReg_def(HelloParser.Reg_defContext ctx);
	/**
	 * Visit a parse tree produced by the {@code r_type_komut}
	 * labeled alternative in {@link HelloParser#r_type_komutlar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitR_type_komut(HelloParser.R_type_komutContext ctx);
	/**
	 * Visit a parse tree produced by {@link HelloParser#r_type_komut_ismi}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitR_type_komut_ismi(HelloParser.R_type_komut_ismiContext ctx);
	/**
	 * Visit a parse tree produced by the {@code i_type_komut}
	 * labeled alternative in {@link HelloParser#i_type_komutlar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitI_type_komut(HelloParser.I_type_komutContext ctx);
	/**
	 * Visit a parse tree produced by the {@code j_type_komut}
	 * labeled alternative in {@link HelloParser#j_type_komutlar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJ_type_komut(HelloParser.J_type_komutContext ctx);
	/**
	 * Visit a parse tree produced by the {@code labelli_komut}
	 * labeled alternative in {@link HelloParser#j_type_komutlar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLabelli_komut(HelloParser.Labelli_komutContext ctx);
	/**
	 * Visit a parse tree produced by {@link HelloParser#jump_to}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJump_to(HelloParser.Jump_toContext ctx);
	/**
	 * Visit a parse tree produced by {@link HelloParser#j_type_komut_ismi}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJ_type_komut_ismi(HelloParser.J_type_komut_ismiContext ctx);
	/**
	 * Visit a parse tree produced by {@link HelloParser#i_type_komut_ismi}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitI_type_komut_ismi(HelloParser.I_type_komut_ismiContext ctx);
	/**
	 * Visit a parse tree produced by {@link HelloParser#label}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLabel(HelloParser.LabelContext ctx);
	/**
	 * Visit a parse tree produced by {@link HelloParser#immediate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImmediate(HelloParser.ImmediateContext ctx);
}