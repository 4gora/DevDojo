package Classesutilitarias.dates.test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

// Aula 121 - LocalDateTime
public class LocalDateTimeTest01 {
    public static void main(String[] args) {
        LocalDateTime localDateTime = LocalDateTime.now();
        LocalDate date = LocalDate.of(2023, Month.MAY, 1);
        LocalTime time = LocalTime.of(10, 37, 0);
        
        System.out.println("Data e hora agora = " + localDateTime);
        System.out.println("Data = " + date);
        System.out.println("Hora = " + time);

        LocalDateTime ldt1 = date.atTime(time);
        System.out.println("LocalDateTime = " + ldt1);
        
    }
}
