package Classesutilitarias.dates.test;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.ChronoField;
import java.time.temporal.TemporalAdjusters;

// Aula 126 - temporalAdjusters
public class TemporalAdjustersTest01 {
    public static void main(String[] args) {
        LocalDate now = LocalDate.now();
        now = now.with(ChronoField.DAY_OF_MONTH, 19); // altera apenas o campo selecionado. ex. dia.

        System.out.println("Agora = " + now);
        System.out.println("Agora2 = " + now.getDayOfWeek());



        now = LocalDate.now().with(TemporalAdjusters.nextOrSame(DayOfWeek.THURSDAY));

        System.out.println("Agora = " + now);
        System.out.println("Agora2 = " + now.getDayOfWeek());

        
    }
}
