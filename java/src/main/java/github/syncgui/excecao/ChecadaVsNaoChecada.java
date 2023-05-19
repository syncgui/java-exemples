package github.syncgui.excecao;

public class ChecadaVsNaoChecada {

    public static void main(String[] args) throws Exception {
        try {
            geraErro1();
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }
        try {
            geraErro2();
        } catch (Throwable e) {
            System.out.println(e.getMessage());;
        }

        System.out.println("Fim");
    }
    // Exceção NÃO checada ou NÃO verificada
    static void geraErro1() {
        throw new RuntimeException("Erro 1");
    }
    // Exceção checada ou verificada
    static void geraErro2() throws Exception {
        throw new Exception("Erro 1");
    }
}
