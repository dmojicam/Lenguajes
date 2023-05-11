import java.sql.SQLOutput;

public class traductor extends MiLenguajeBaseListener{
    @Override public void enterTypes(MiLenguajeParser.TypesContext ctx) {

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

