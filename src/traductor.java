public class traductor extends MiLenguajeBaseListener{

    @Override public void enterXorempty(MiLenguajeParser.XoremptyContext ctx) {
        if ("While".equals(ctx.getParent().getChild(0).getText())){
            System.out.print(") {\n\n");
        }
    }

    @Override public void enterWhile(MiLenguajeParser.WhileContext ctx) {
        System.out.print("while (");
    }
    @Override public void exitWhile(MiLenguajeParser.WhileContext ctx) {
        System.out.println("\n}\n");
    }
    @Override public void enterFor(MiLenguajeParser.ForContext ctx) {
        System.out.print("for (");
        System.out.print(ctx.getChild(1).getText());
        System.out.print(";");

        System.out.print(ctx.getChild(1).getChild(0).getText());
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
    @Override public void enterStep(MiLenguajeParser.StepContext ctx) {
        System.out.print(";");
    }

    @Override public void enterEtiq(MiLenguajeParser.EtiqContext ctx) {
        System.out.print(ctx.TKN_COLON().getText());
    }
    @Override public void enterRoutine(MiLenguajeParser.RoutineContext ctx) {
        System.out.print("Function() {\n");
        System.out.print(ctx.ID().getText());
    }
    @Override public void exitRoutine(MiLenguajeParser.RoutineContext ctx) {
        System.out.print("\n}");
    }
    @Override public void enterExec(MiLenguajeParser.ExecContext ctx) {
        System.out.print("(");
        System.out.print(")");
    }
    @Override public void enterMem(MiLenguajeParser.MemContext ctx) {
        System.out.print(ctx.ID().getText());
    }
    @Override public void enterA(MiLenguajeParser.AContext ctx) {
        System.out.print(ctx.ID());
    }
    @Override public void enterMemp(MiLenguajeParser.MempContext ctx) {
        if("[".equals(ctx.getParent().getChild(0).getText())){
            System.out.print("]");
        }

    }
    @Override public void enterCorch(MiLenguajeParser.CorchContext ctx) {
        System.out.print("[");
    }
    @Override public void enterAsigp(MiLenguajeParser.AsigpContext ctx) {
        System.out.print("=");
    }
    @Override public void enterBp(MiLenguajeParser.BpContext ctx) {
        if((ctx.getChild(0)!=null)) {
            if ((ctx.getChild(0).getText().equals("And"))) {
                System.out.print("&&");

            } else if ((ctx.getChild(0).getText().equals("Or"))) {
                System.out.print("||");
            }
        }



    }
    @Override public void enterCp(MiLenguajeParser.CpContext ctx) {
        if(ctx.TKN_DIFF()!=null) {
            System.out.print("!=");
        }else if(ctx.TKN_EQUALS()!=null) {
            System.out.print("==");
        }else if(ctx.TKN_GEQ()!=null) {
            System.out.print(">=");
        }else if(ctx.TKN_GREATER()!=null) {
            System.out.print(">");
        }else if(ctx.TKN_LEQ()!=null) {
            System.out.print("<=");
        }else if(ctx.TKN_LESS()!=null) {
            System.out.print("<");
        }
    }
    @Override public void enterDp(MiLenguajeParser.DpContext ctx) {
        if(ctx.TKN_MINUS()!=null) {
            System.out.print("-");
        }else if(ctx.TKN_PLUS()!=null) {
            System.out.print("+");
        }
    }
    @Override public void enterEp(MiLenguajeParser.EpContext ctx) {
        if(ctx.TKN_DIV()!=null){
            System.out.print("/");
        }else if(ctx.TKN_TIMES()!=null){
            System.out.print("*");
        }
    }
    @Override public void enterF(MiLenguajeParser.FContext ctx) {
        if(ctx.TKN_MINUS()!=null){
            System.out.print(ctx.TKN_MINUS());
        }
    }
    @Override public void enterG(MiLenguajeParser.GContext ctx) {
        if(ctx.TKN_NUMBER()!=null){
            System.out.print(ctx.TKN_NUMBER());
        }
        else if(ctx.TKN_TEXT()!=null){
            System.out.print(ctx.TKN_TEXT());
        }
        else if(ctx.TRUE()!=null){
            System.out.print("true");
        }
        else if(ctx.FALSE()!=null){
            System.out.printf("false");
        }
        else if(ctx.TKN_LEFT_PAREN()!=null){
            System.out.printf("(");
        }

    }
    @Override public void exitG(MiLenguajeParser.GContext ctx) {
        if(ctx.TKN_RIGHT_PAREN()!=null){
            System.out.printf(")");
        }
    }
    }

