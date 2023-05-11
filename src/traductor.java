public class traductor extends MiLenguajeBaseListener{
    @Override public void enterConditional(MiLenguajeParser.ConditionalContext ctx) {

        System.out.print("if"+"("+ ctx.b().getText()+") "+ "{\n");

    }
    @Override public void exitConditional(MiLenguajeParser.ConditionalContext ctx) {

        System.out.print("\n}\n");

    }
    @Override public void enterEi(MiLenguajeParser.EiContext ctx) {
        if(ctx.else_()==null){
            System.out.print("}else if("+ctx.b().getText()+"){\n");
        }
    }


    @Override public void enterWhile(MiLenguajeParser.WhileContext ctx) {

        System.out.print("while (");
        System.out.print(ctx.getChild(2).getText());
        System.out.print(") {\n");
    }
    @Override public void exitWhile(MiLenguajeParser.WhileContext ctx) {
        System.out.println("\n}\n");
    }
    @Override public void enterFor(MiLenguajeParser.ForContext ctx) {
        System.out.print("for (");
        String id=ctx.a().ID().getText()+ctx.a().asig().corch().getText();
        System.out.print(ctx.a().getText());
        System.out.print(";");

        System.out.print(id);
        System.out.print("<");
        System.out.print(ctx.getChild(3).getText());
        System.out.print(";");
        if(ctx.getChild(4).getText()!=""){
            System.out.print(ctx.getChild(1).getChild(0).getText());
            System.out.print("=");
            System.out.print(ctx.getChild(1).getChild(0).getText());
            System.out.print("+");
            System.out.print(ctx.getChild(4).getChild(1).getText());
        }else{
            System.out.print(ctx.getChild(1).getChild(0).getText());
            System.out.print("+");
            System.out.print("+");
        }
        System.out.print(") {\n");



    }
    @Override public void exitFor(MiLenguajeParser.ForContext ctx) {
        System.out.print("\n}\n");
    }

    @Override public void enterRoutine(MiLenguajeParser.RoutineContext ctx) {
        System.out.print("Function() {\n");
        System.out.print(ctx.ID().getText());
    }
    @Override public void exitRoutine(MiLenguajeParser.RoutineContext ctx) {
        System.out.print("\n}");
    }


    }

