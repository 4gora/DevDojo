package Classesutilitarias.strings.test;
// video 111 - Strings pt04 - StringBuilder
public class StringBuilderTest01 {
    public static void main(String[] args) {
        String nome = "William Suane";
        nome.concat("DevDojo");
        System.out.println(nome);

        StringBuilder sb = new StringBuilder("William Suane"); // capacidade padrão do StringBuilder é 16
        sb.append(" DevDojo").append(" Academy");  // o método .append acaba se tornando muito verboso se usado muitas vezes
        // é necessario usar o método .append para concatenar uma StringBuilder
        // O método .append não cria nada no pool de Strings

        sb.reverse();
        System.out.println(sb);
        sb.reverse();
        sb.delete(0,3);
        System.out.println(sb);

    }
}
