import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class traductor extends MiLenguajeBaseListener{
    Set<String> setGuardaIDsArrays = new HashSet<String>();
    Set<String> setGuardaIDs = new HashSet<String>();
    @Override public void enterTypes(MiLenguajeParser.TypesContext ctx) {

        if (ctx.xp() != null){
            if (ctx.xp().asig() != null){
                if (ctx.xp().asig().corch() != null){
                    MiLenguajeParser.CorchContext hijo = ctx.xp().asig().corch();
                    String corchs = "";
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
                    */
                    if (!setGuardaIDsArrays.contains(ctx.ID() + corchs)) {
                        setGuardaIDsArrays.add(ctx.ID() + corchs);
                        System.out.println("var "+ctx.ID() + corchs+" = {}");
                    }

                    while (hijo.memp().corch() != null) {
                        corchs = corchs + hijo.getChild(0).getText()+hijo.getChild(1).getText()+hijo.getChild(2).getText();
                        // System.out.println("hijo actual: "+hijo.getChild(0).getText()+hijo.getChild(1).getText()+hijo.getChild(2).getText());
                        // System.out.println("ggg"+hijo.memp().corch().getText());
                        if (!setGuardaIDsArrays.contains(ctx.ID() + corchs)) {
                            setGuardaIDsArrays.add(ctx.ID() + corchs);
                            System.out.println(ctx.ID() + corchs+" = {}");
                        }

                        hijo = hijo.memp().corch();
                    }
                }else {
                    if (!setGuardaIDs.contains(ctx.ID().getText())){
                        System.out.print("var ");
                        setGuardaIDs.add(ctx.ID().getText());
                    }


                }
            }
        } else if (ctx.COMMENTS()!= null){
            System.out.print("// " + ctx.COMMENTS().getText().substring(1,ctx.COMMENTS().getText().length()));

        }

        Iterator itr = setGuardaIDs.iterator();
        /*while (itr.hasNext()) {
            System.out.println("SET GUARDA IDS: "+itr.next());
        }*/

        if (ctx.ID() != null){
            if (ctx.xp().etiq() != null){
                System.out.print("// "+ctx.ID()+": ");
            }else {
                System.out.print(ctx.ID());
            }


        }
    }

    @Override public void exitTypes(MiLenguajeParser.TypesContext ctx) {
        System.out.println();
    }

    @Override public void enterXp(MiLenguajeParser.XpContext ctx) {
        if (ctx.exec() != null){
            System.out.print("();");
        }else if (ctx.asig() != null){
            System.out.print(ctx.asig().getText()+";");
        }
        else{
            System.out.print("// This functionality is not available.");
        }
    }

    @Override public void enterElse(MiLenguajeParser.ElseContext ctx) {
        if (ctx.getChild(0)!=null){
            System.out.print("} else{\n");
        }

    }
    @Override public void enterConditional(MiLenguajeParser.ConditionalContext ctx) {

        System.out.print("if"+"("+ ctx.b().getText()+") "+ "{\n");

    }
    @Override public void exitConditional(MiLenguajeParser.ConditionalContext ctx) {

        System.out.print("}");

    }
    @Override public void enterEi(MiLenguajeParser.EiContext ctx) {
        if(ctx.else_()==null){
            System.out.print("}else if("+ctx.b().getText()+"){\n");
        }
    }


    @Override public void enterWhile(MiLenguajeParser.WhileContext ctx) {

        System.out.print("while (");
        System.out.print(ctx.b().getText());
        System.out.print(") {\n");

    }
    @Override public void exitWhile(MiLenguajeParser.WhileContext ctx) {
        System.out.println("}");
    }
    @Override public void enterFor(MiLenguajeParser.ForContext ctx) {
        System.out.print("for (");
        String id = "";
        if (ctx.a().asig().corch() != null){
            id=ctx.a().ID().getText()+ctx.a().asig().corch().getText();
        }else{
            id=ctx.a().ID().getText();
        }
        System.out.print(ctx.a().getText());
        System.out.print("; ");

        System.out.print(id);
        System.out.print("<");
        System.out.print(ctx.getChild(3).getText());
        System.out.print("; ");
        if(ctx.getChild(4).getText()!=""){
            System.out.print(id);
            System.out.print("=");
            System.out.print(id);
            System.out.print("+");
            System.out.print(ctx.getChild(4).getChild(1).getText());
        }else{
            System.out.print(id);
            System.out.print("+");
            System.out.print("+");
        }
        System.out.print(") {\n");



    }
    @Override public void exitFor(MiLenguajeParser.ForContext ctx) {
        System.out.print("}");
    }

    @Override public void enterRoutine(MiLenguajeParser.RoutineContext ctx) {
        System.out.print("function "+ctx.ID().getText()+"() {\n");

    }
    @Override public void exitRoutine(MiLenguajeParser.RoutineContext ctx) {
        System.out.print("}\n");
    }


    }

