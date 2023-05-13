import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.TokenStreamRewriter;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class traductor extends MiLenguajeBaseListener{

    static TokenStreamRewriter rewriter;

    public traductor(TokenStream tokens){
        rewriter = new TokenStreamRewriter(tokens);
    }
    Set<String> setGuardaIDsArrays = new HashSet<String>();
    Set<String> setGuardaIDs = new HashSet<String>();
    @Override public void enterTypes(MiLenguajeParser.TypesContext ctx) {

        if (ctx.xp() != null){
            if (ctx.xp().asig() != null){
                if (ctx.xp().asig().corch() != null){
                    MiLenguajeParser.CorchContext hijo = ctx.xp().asig().corch();
                    String corchs = "";
                    String beforeArrays = "";
                    // Si después del hijo hay más corchetes?
                    /*if (hijo.b().c().d().e().f().g().mem() != null){
                        if (hijo.b().c().d().e().f().g().mem().memp() != null){
                            if (hijo.b().c().d().e().f().g().mem().memp().corch() != null){
                                System.out.println("hay corch");
                            }else{
                                System.out.println("no hay corch");
                            }
                        } else{
                            System.out.println("no hay corch");
                        }
                    }else {
                        System.out.println("no hay corch");
                    }
                    a[t[5]] x
                    */

                    if (!setGuardaIDsArrays.contains(ctx.ID() + corchs)) {
                        setGuardaIDsArrays.add(ctx.ID() + corchs);
                        beforeArrays = beforeArrays + "var "+ctx.ID() + corchs+" = {};\n";
                        // System.out.println("var "+ctx.ID() + corchs+" = {}");
                    }

                    while (hijo.memp().corch() != null) {
                        corchs = corchs + hijo.getChild(0).getText()+hijo.getChild(1).getText()+hijo.getChild(2).getText();
                        // System.out.println("hijo actual: "+hijo.getChild(0).getText()+hijo.getChild(1).getText()+hijo.getChild(2).getText());
                        // System.out.println("ggg"+hijo.memp().corch().getText());
                        if (!setGuardaIDsArrays.contains(ctx.ID() + corchs)) {
                            setGuardaIDsArrays.add(ctx.ID() + corchs);
                            beforeArrays = beforeArrays + ctx.ID() +corchs+" = {};\n";
                            // System.out.println(ctx.ID() + corchs+" = {}");
                        }

                        hijo = hijo.memp().corch();
                    }
                    rewriter.insertBefore(ctx.ID().getSymbol(), beforeArrays);
                }else {
                    if (!setGuardaIDs.contains(ctx.ID().getText())){
                        setGuardaIDs.add(ctx.ID().getText());
                        rewriter.insertBefore(ctx.ID().getSymbol(), "var ");
                        //System.out.print("var ");
                    }
                }
            }
        } else if (ctx.COMMENTS()!= null){
            rewriter.replace(ctx.COMMENTS().getSymbol(), "// " + ctx.COMMENTS().getText().substring(1,ctx.COMMENTS().getText().length()));
            //System.out.print("// " + ctx.COMMENTS().getText().substring(1,ctx.COMMENTS().getText().length()));
        }

        Iterator itr = setGuardaIDs.iterator();
        /*while (itr.hasNext()) {
            System.out.println("SET GUARDA IDS: "+itr.next());
        }*/

        if (ctx.ID() != null){
            if (ctx.xp().etiq() != null){
                rewriter.insertBefore(ctx.ID().getSymbol(), "//");
            }else {
                //System.out.print(ctx.ID());
            }


        }
    }

    @Override public void enterX(MiLenguajeParser.XContext ctx) {

    }

    @Override public void exitTypes(MiLenguajeParser.TypesContext ctx) {
        rewriter.insertAfter(ctx.stop, "\n");
    }

    @Override public void enterXp(MiLenguajeParser.XpContext ctx) {
        if (ctx.exec() != null){
            System.out.print("();");
        }else if (ctx.asig() != null){
            //System.out.print(ctx.asig().getText()+";");
        }
        else{
            rewriter.replace(ctx.start, ":   --- This functionality is not available.");
        }
    }

    @Override public void enterElse(MiLenguajeParser.ElseContext ctx) {
        if (ctx.getChild(0)!=null){
            rewriter.replace(ctx.getStart(), "} else {\n");
        }

    }
    @Override public void enterConditional(MiLenguajeParser.ConditionalContext ctx) {
        rewriter.replace(ctx.getStart(), "if ");
        rewriter.replace( ((TerminalNode)ctx.getChild(4)).getSymbol() , "{\n" );

    }
    @Override public void exitConditional(MiLenguajeParser.ConditionalContext ctx) {

        rewriter.replace(ctx.stop,"}\n");

    }
    @Override public void enterEi(MiLenguajeParser.EiContext ctx) {
        if(ctx.else_()==null){
            rewriter.replace(ctx.getStart(), "} else if ");
            rewriter.replace( ((TerminalNode)ctx.getChild(4)).getSymbol() , "{\n" );
        }
    }


    @Override public void enterWhile(MiLenguajeParser.WhileContext ctx) {

        rewriter.replace(ctx.getStart(), "while ");
        rewriter.insertBefore(ctx.xorempty().getStart(), " {\n" );

    }
    @Override public void exitWhile(MiLenguajeParser.WhileContext ctx) {
        rewriter.replace(ctx.stop,"}\n" );
    }
    @Override public void enterFor(MiLenguajeParser.ForContext ctx) {

        rewriter.replace(ctx.getStart(), "for (");

        String id;
        if (ctx.a().asig().corch() != null){
            id=ctx.a().ID().getText()+ctx.a().asig().corch().getText();
        }else{
            id=ctx.a().ID().getText();
        }
        // Adds ";" after a()
        rewriter.insertAfter(ctx.a().getStop(), "; " );
        // Rewrites "To" into id < ...
        rewriter.replace(((TerminalNode)ctx.getChild(2)).getSymbol(), id + "<" );
        // Adds ";" after b()
        rewriter.insertAfter(ctx.b().getStop() , ";" );

        if(ctx.getChild(4).getText()!=""){
            rewriter.replace(ctx.step().getStart(), id + "= " + id + "+");
        }else{
            rewriter.replace(ctx.step().getStart(), id + "= " + id + "+1");

        }

        rewriter.insertBefore(ctx.xorempty().getStart(), ") {\n" );



    }
    @Override public void exitFor(MiLenguajeParser.ForContext ctx) {
        rewriter.replace(ctx.stop,"}\n" );
    }

    @Override public void enterRoutine(MiLenguajeParser.RoutineContext ctx) {
        rewriter.replace(ctx.getStart(), "function ");
        rewriter.insertBefore(ctx.xorempty().getStart(), "() {\n" );

    }
    @Override public void exitRoutine(MiLenguajeParser.RoutineContext ctx) {
        rewriter.replace(ctx.stop,"}\n" );
    }

}

