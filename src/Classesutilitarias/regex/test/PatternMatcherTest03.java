package Classesutilitarias.regex.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

// Aula 132 - Regex pt03 - Range
public class PatternMatcherTest03 {
    public static void main(String[] args) {
        // META CARACTERES:
        // \d = Todos os dígitos
        // \D = Tudo que não for dígito
        // \s = Espaços em branco \t \n \f \r
        // \S = Todos caracteres que não estão em branco
        // \w = a-z, A-Z, dígitos, _
        // \W = Tudo o que não for incluso no \w
        // [] - Range de caracteres

        //String regex = "[abcABC]";
        String regex = "[a-zA-C]";
        String texto2 = "cafeBEBE";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(texto2);
        System.out.println("texto: " + texto2);
        System.out.println("indice: 0123456789");
        System.out.println("regex " +regex);
        System.out.println("Posições encontradas");
        while (matcher.find()) {
            System.out.print("Caracter = " + matcher.group() + ", Index = " + matcher.start() + "\n");
        }

        int numeroHex = 0xFFFFFF;
        System.out.println(numeroHex);
    }
}
