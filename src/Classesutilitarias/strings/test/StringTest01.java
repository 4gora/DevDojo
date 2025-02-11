package Classesutilitarias.strings.test;

public class StringTest01 {
    // video 108 - Strings

    // String são imutáveis, é preciso tomar cuidado na associação de novas variáveis de referência.
    public static void main(String[] args) {
        String nome = "William"; // String constant pool
        String nome2 = "William";
        nome = nome.concat(" Suane"); // altera referência de nome
        System.out.println(nome);
        System.out.println(nome == nome2); // para comparar Strings em referência usar ==
        // para comparar Strings, usar .equals()

        String nome3 = new String("William"); // criando 1 variável de referência, 1 objeto do tipo String, e 1 String no pool de String.
        System.out.println(nome2 == nome3);
    }
}
