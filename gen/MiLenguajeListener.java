// Generated from C:/Games/lenguajes3/grammar\MiLenguaje.g4 by ANTLR 4.12.0
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link MiLenguajeParser}.
 */
public interface MiLenguajeListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link MiLenguajeParser#s}.
	 * @param ctx the parse tree
	 */
	void enterS(MiLenguajeParser.SContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiLenguajeParser#s}.
	 * @param ctx the parse tree
	 */
	void exitS(MiLenguajeParser.SContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiLenguajeParser#srecursion}.
	 * @param ctx the parse tree
	 */
	void enterSrecursion(MiLenguajeParser.SrecursionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiLenguajeParser#srecursion}.
	 * @param ctx the parse tree
	 */
	void exitSrecursion(MiLenguajeParser.SrecursionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiLenguajeParser#routrecursion}.
	 * @param ctx the parse tree
	 */
	void enterRoutrecursion(MiLenguajeParser.RoutrecursionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiLenguajeParser#routrecursion}.
	 * @param ctx the parse tree
	 */
	void exitRoutrecursion(MiLenguajeParser.RoutrecursionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiLenguajeParser#x}.
	 * @param ctx the parse tree
	 */
	void enterX(MiLenguajeParser.XContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiLenguajeParser#x}.
	 * @param ctx the parse tree
	 */
	void exitX(MiLenguajeParser.XContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiLenguajeParser#types}.
	 * @param ctx the parse tree
	 */
	void enterTypes(MiLenguajeParser.TypesContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiLenguajeParser#types}.
	 * @param ctx the parse tree
	 */
	void exitTypes(MiLenguajeParser.TypesContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiLenguajeParser#xrecursion}.
	 * @param ctx the parse tree
	 */
	void enterXrecursion(MiLenguajeParser.XrecursionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiLenguajeParser#xrecursion}.
	 * @param ctx the parse tree
	 */
	void exitXrecursion(MiLenguajeParser.XrecursionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiLenguajeParser#built}.
	 * @param ctx the parse tree
	 */
	void enterBuilt(MiLenguajeParser.BuiltContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiLenguajeParser#built}.
	 * @param ctx the parse tree
	 */
	void exitBuilt(MiLenguajeParser.BuiltContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiLenguajeParser#bifunction}.
	 * @param ctx the parse tree
	 */
	void enterBifunction(MiLenguajeParser.BifunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiLenguajeParser#bifunction}.
	 * @param ctx the parse tree
	 */
	void exitBifunction(MiLenguajeParser.BifunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiLenguajeParser#params}.
	 * @param ctx the parse tree
	 */
	void enterParams(MiLenguajeParser.ParamsContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiLenguajeParser#params}.
	 * @param ctx the parse tree
	 */
	void exitParams(MiLenguajeParser.ParamsContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiLenguajeParser#paramsp}.
	 * @param ctx the parse tree
	 */
	void enterParamsp(MiLenguajeParser.ParamspContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiLenguajeParser#paramsp}.
	 * @param ctx the parse tree
	 */
	void exitParamsp(MiLenguajeParser.ParamspContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiLenguajeParser#xp}.
	 * @param ctx the parse tree
	 */
	void enterXp(MiLenguajeParser.XpContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiLenguajeParser#xp}.
	 * @param ctx the parse tree
	 */
	void exitXp(MiLenguajeParser.XpContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiLenguajeParser#conditional}.
	 * @param ctx the parse tree
	 */
	void enterConditional(MiLenguajeParser.ConditionalContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiLenguajeParser#conditional}.
	 * @param ctx the parse tree
	 */
	void exitConditional(MiLenguajeParser.ConditionalContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiLenguajeParser#ei}.
	 * @param ctx the parse tree
	 */
	void enterEi(MiLenguajeParser.EiContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiLenguajeParser#ei}.
	 * @param ctx the parse tree
	 */
	void exitEi(MiLenguajeParser.EiContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiLenguajeParser#else}.
	 * @param ctx the parse tree
	 */
	void enterElse(MiLenguajeParser.ElseContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiLenguajeParser#else}.
	 * @param ctx the parse tree
	 */
	void exitElse(MiLenguajeParser.ElseContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiLenguajeParser#while}.
	 * @param ctx the parse tree
	 */
	void enterWhile(MiLenguajeParser.WhileContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiLenguajeParser#while}.
	 * @param ctx the parse tree
	 */
	void exitWhile(MiLenguajeParser.WhileContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiLenguajeParser#for}.
	 * @param ctx the parse tree
	 */
	void enterFor(MiLenguajeParser.ForContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiLenguajeParser#for}.
	 * @param ctx the parse tree
	 */
	void exitFor(MiLenguajeParser.ForContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiLenguajeParser#step}.
	 * @param ctx the parse tree
	 */
	void enterStep(MiLenguajeParser.StepContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiLenguajeParser#step}.
	 * @param ctx the parse tree
	 */
	void exitStep(MiLenguajeParser.StepContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiLenguajeParser#etiq}.
	 * @param ctx the parse tree
	 */
	void enterEtiq(MiLenguajeParser.EtiqContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiLenguajeParser#etiq}.
	 * @param ctx the parse tree
	 */
	void exitEtiq(MiLenguajeParser.EtiqContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiLenguajeParser#goto}.
	 * @param ctx the parse tree
	 */
	void enterGoto(MiLenguajeParser.GotoContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiLenguajeParser#goto}.
	 * @param ctx the parse tree
	 */
	void exitGoto(MiLenguajeParser.GotoContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiLenguajeParser#routine}.
	 * @param ctx the parse tree
	 */
	void enterRoutine(MiLenguajeParser.RoutineContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiLenguajeParser#routine}.
	 * @param ctx the parse tree
	 */
	void exitRoutine(MiLenguajeParser.RoutineContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiLenguajeParser#xorempty}.
	 * @param ctx the parse tree
	 */
	void enterXorempty(MiLenguajeParser.XoremptyContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiLenguajeParser#xorempty}.
	 * @param ctx the parse tree
	 */
	void exitXorempty(MiLenguajeParser.XoremptyContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiLenguajeParser#exec}.
	 * @param ctx the parse tree
	 */
	void enterExec(MiLenguajeParser.ExecContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiLenguajeParser#exec}.
	 * @param ctx the parse tree
	 */
	void exitExec(MiLenguajeParser.ExecContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiLenguajeParser#corch}.
	 * @param ctx the parse tree
	 */
	void enterCorch(MiLenguajeParser.CorchContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiLenguajeParser#corch}.
	 * @param ctx the parse tree
	 */
	void exitCorch(MiLenguajeParser.CorchContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiLenguajeParser#mem}.
	 * @param ctx the parse tree
	 */
	void enterMem(MiLenguajeParser.MemContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiLenguajeParser#mem}.
	 * @param ctx the parse tree
	 */
	void exitMem(MiLenguajeParser.MemContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiLenguajeParser#memp}.
	 * @param ctx the parse tree
	 */
	void enterMemp(MiLenguajeParser.MempContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiLenguajeParser#memp}.
	 * @param ctx the parse tree
	 */
	void exitMemp(MiLenguajeParser.MempContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiLenguajeParser#a}.
	 * @param ctx the parse tree
	 */
	void enterA(MiLenguajeParser.AContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiLenguajeParser#a}.
	 * @param ctx the parse tree
	 */
	void exitA(MiLenguajeParser.AContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiLenguajeParser#asig}.
	 * @param ctx the parse tree
	 */
	void enterAsig(MiLenguajeParser.AsigContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiLenguajeParser#asig}.
	 * @param ctx the parse tree
	 */
	void exitAsig(MiLenguajeParser.AsigContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiLenguajeParser#asigp}.
	 * @param ctx the parse tree
	 */
	void enterAsigp(MiLenguajeParser.AsigpContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiLenguajeParser#asigp}.
	 * @param ctx the parse tree
	 */
	void exitAsigp(MiLenguajeParser.AsigpContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiLenguajeParser#b}.
	 * @param ctx the parse tree
	 */
	void enterB(MiLenguajeParser.BContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiLenguajeParser#b}.
	 * @param ctx the parse tree
	 */
	void exitB(MiLenguajeParser.BContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiLenguajeParser#bp}.
	 * @param ctx the parse tree
	 */
	void enterBp(MiLenguajeParser.BpContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiLenguajeParser#bp}.
	 * @param ctx the parse tree
	 */
	void exitBp(MiLenguajeParser.BpContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiLenguajeParser#c}.
	 * @param ctx the parse tree
	 */
	void enterC(MiLenguajeParser.CContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiLenguajeParser#c}.
	 * @param ctx the parse tree
	 */
	void exitC(MiLenguajeParser.CContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiLenguajeParser#cp}.
	 * @param ctx the parse tree
	 */
	void enterCp(MiLenguajeParser.CpContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiLenguajeParser#cp}.
	 * @param ctx the parse tree
	 */
	void exitCp(MiLenguajeParser.CpContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiLenguajeParser#d}.
	 * @param ctx the parse tree
	 */
	void enterD(MiLenguajeParser.DContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiLenguajeParser#d}.
	 * @param ctx the parse tree
	 */
	void exitD(MiLenguajeParser.DContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiLenguajeParser#dp}.
	 * @param ctx the parse tree
	 */
	void enterDp(MiLenguajeParser.DpContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiLenguajeParser#dp}.
	 * @param ctx the parse tree
	 */
	void exitDp(MiLenguajeParser.DpContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiLenguajeParser#e}.
	 * @param ctx the parse tree
	 */
	void enterE(MiLenguajeParser.EContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiLenguajeParser#e}.
	 * @param ctx the parse tree
	 */
	void exitE(MiLenguajeParser.EContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiLenguajeParser#ep}.
	 * @param ctx the parse tree
	 */
	void enterEp(MiLenguajeParser.EpContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiLenguajeParser#ep}.
	 * @param ctx the parse tree
	 */
	void exitEp(MiLenguajeParser.EpContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiLenguajeParser#f}.
	 * @param ctx the parse tree
	 */
	void enterF(MiLenguajeParser.FContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiLenguajeParser#f}.
	 * @param ctx the parse tree
	 */
	void exitF(MiLenguajeParser.FContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiLenguajeParser#g}.
	 * @param ctx the parse tree
	 */
	void enterG(MiLenguajeParser.GContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiLenguajeParser#g}.
	 * @param ctx the parse tree
	 */
	void exitG(MiLenguajeParser.GContext ctx);
}