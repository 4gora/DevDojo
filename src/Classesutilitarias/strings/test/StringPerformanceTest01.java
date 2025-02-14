package Classesutilitarias.strings.test;

// video 110 - String pt 03 - desempenho
public class StringPerformanceTest01 {
    public static void main(String[] args) {
        long inicio = System.currentTimeMillis();
        concatString(300000);
        long fim = System.currentTimeMillis();
        System.out.println("Tempo gasto para String " + (fim - inicio) + "ms");

        inicio = System.currentTimeMillis();
        concatStringBuilder(300000);
        fim = System.currentTimeMillis();
        System.out.println("Tempo gasto para StringBuilder " + (fim - inicio) + "ms");

        inicio = System.currentTimeMillis();
        concatStringBuffer(300000);
        fim = System.currentTimeMillis();
        System.out.println("Tempo gasto para StringBuffer " + (fim - inicio) + "ms");
    }

    private static void concatString(int tamanho) {
        String texto = "";
        for (int i = 0; i < tamanho; i++) { // Strings em grandes quantidades demoram para executar
            texto += i;

        }
    }

    private static void concatStringBuilder(int tamanho) {
        StringBuilder sb = new StringBuilder(); // StringBuilder tem um desempenho muito superior em relação a Strings
        for (int i = 0; i < tamanho; i++) {
            sb.append(i);

        }
    }
        private static void concatStringBuffer(int tamanho){
            StringBuffer sbuffer = new StringBuffer(); // StringBuilder tem um desempenho muito superior em relação a Strings
            for (int i = 0; i < tamanho; i++) {
                sbuffer.append(i);

            }
        }

}
