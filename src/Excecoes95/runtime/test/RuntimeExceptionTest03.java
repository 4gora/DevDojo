package Excecoes95.runtime.test;

//VIDEO 100 - bloco Finally
public class RuntimeExceptionTest03 {
    public static void main(String[] args) {

        abreConexao();
    }

    private static String abreConexao() {
        try {
            System.out.println("Abrindo arquivo");
            System.out.println("Escrevendo dados no arquivo");
            System.out.println("Fechando recurso liberado pelo SO");
            return "conexão aberta";
        } catch (Exception e) {
            e.printStackTrace();

        } finally { // finally sempre será executado, independente do que ocorrer
            System.out.println("Fechando recurso liberado pelo SO");

        }
        return null;
    }
}
