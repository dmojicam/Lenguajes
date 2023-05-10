public class traductor extends MiLenguajeBaseListener{
    @Override public void enterA(MiLenguajeParser.AContext ctx) {
        System.out.print(ctx.ID());
    }
    @Override public void enterMemp(MiLenguajeParser.MempContext ctx) {
        if("era"=="hola"){
            System.out.print(ctx.getParent());
        }
        System.out.print(ctx.getParent().getChild(0));

    }
    @Override public void enterCorch(MiLenguajeParser.CorchContext ctx) {
        System.out.print("[");
    }
    @Override public void enterAsigp(MiLenguajeParser.AsigpContext ctx) {
        System.out.print("=");
    }
    @Override public void enterBp(MiLenguajeParser.BpContext ctx) {
        if(ctx.getChild(0)!=null){
            System.out.print(ctx.getChild(0));
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

