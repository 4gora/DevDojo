package Classesutilitarias.dates.test;

import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;
//import java.util.Calendar;
import java.util.Date;

// video 119 - LocalDate
public class LocalDateTest01 {
    public static void main(String[] args) {
        System.out.println(new Date());

        // System.out.println(Calendar.getInstance());
        LocalDate date = LocalDate.of(2024, Month.MAY, 21); // recomendavel usar Month.NOME_DO_MES
        LocalDate agora = LocalDate.now();
        System.out.println("Ano = " + date.getYear());
        System.out.println("Número do mês = " + date.getMonthValue());
        System.out.println("Tamanho do mês = " + date.lengthOfMonth());

        System.out.println("Agora = " + agora);

        DateTimeFormatter df = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.println("Agora formatado = " + agora.format(df));
    }
}
