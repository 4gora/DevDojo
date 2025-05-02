package Classesutilitarias.dates.test;

import java.time.LocalDateTime;
import java.time.Month;
import java.time.temporal.ChronoUnit;

// video 125 - ChronoUnit
public class ChronoUnitTest01 {
    public static void main(String[] args) {

        System.out.println("");
        
        LocalDateTime aniversario = LocalDateTime.of(2003, Month.MAY, 26, 21,10,12);
        LocalDateTime now = LocalDateTime.now();
        System.out.println("Horas desde aniversário = " + ChronoUnit.HOURS.between(aniversario, now));
        System.out.println("Dias desde aniversário = " + ChronoUnit.DAYS.between(aniversario, now));
        System.out.println("Semanas desde aniversário = " + ChronoUnit.WEEKS.between(aniversario, now));
        System.out.println("Meses desde aniversário = " + ChronoUnit.MONTHS.between(aniversario, now));
        System.out.println("Anos desde aniversário = " + ChronoUnit.YEARS.between(aniversario, now));

    }
}
