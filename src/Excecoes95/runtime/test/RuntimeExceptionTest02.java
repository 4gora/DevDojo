package Excecoes95.runtime.test;

public class RuntimeExceptionTest02 {
    public static void main(String[] args) {
        try {
            divisao(10, 0);
        } catch (RuntimeException e) {
            e.printStackTrace();
        }
        System.out.println("Código finalizado.");
    }

    /**
     *
     * @param a Não pode ser 0.
     * @param b Não pode ser 0.
     * @return Retorna a divisão de a e b.
     */

    private static int divisao(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("Argumento ilegal, não é permitido dividir por 0");
        }

        return a / b;

    }
}
