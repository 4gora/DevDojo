package Classesutilitarias.regex.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

// Aula 132 - Regex pt02
public class PatternMatcherTest02 {
    public static void main(String[] args) {
        // META CARACTERES:
        // \d = Todos os dígitos
        // \D = Tudo que não for dígito
        // \s = Espaços em branco \t \n \f \r
        // \S = Todos caracteres que não estão em branco
        // \w = a-z, A-Z, dígitos, _
        // \W = Tudo o que não for incluso no \w

        String regex = "\\w"; // \ usado 2 vezes por que é um caradter de escape.
        String texto2 = "naia asa43 4432asdas4 d3j43";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(texto2);
        System.out.println("texto: " + texto2);
        System.out.println("indice: 0123456789");
        System.out.println("regex " +regex);
        System.out.println("Posições encontradas");
        while (matcher.find()) {
            System.out.print("Caracter = " + matcher.group() + ", Index = " + matcher.start() + "\n");
        }
    }
}
