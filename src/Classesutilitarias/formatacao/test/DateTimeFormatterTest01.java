package Classesutilitarias.formatacao.test;

import Exercicios.POO70exercicioassociacao.Local;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

// aula 129 - DateTimeFormatter
public class DateTimeFormatterTest01 {
    public static void main(String[] args) {

        System.out.println("------------------");
        System.out.println("LocalDate");

        LocalDate date = LocalDate.now();
        String s1 = date.format(DateTimeFormatter.BASIC_ISO_DATE);
        String s2 = date.format(DateTimeFormatter.ISO_DATE);
        String s3 = date.format(DateTimeFormatter.ISO_LOCAL_DATE);
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
    // LocalDateTime
        System.out.println("------------------");
        System.out.println("LocalDateTime");
        LocalDateTime now = LocalDateTime.now();
        String s4 = now.format(DateTimeFormatter.ISO_DATE_TIME);
        System.out.println(s4);

        DateTimeFormatter formatterBR = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String formatBR = LocalDate.now().format(formatterBR);
        System.out.println(formatBR);
        LocalDate parseBR = LocalDate.parse("10/05/2023", formatterBR);
        System.out.println(parseBR);
    }
}
