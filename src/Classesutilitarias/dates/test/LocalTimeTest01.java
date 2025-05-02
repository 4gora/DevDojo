package Classesutilitarias.dates.test;
// video 120 - LocalTime
import java.time.LocalTime;

public class LocalTimeTest01 {
    public static void main(String[] args) {
        LocalTime agora = LocalTime.now().minusHours(3); // usando método para compensar fuso horario
        System.out.println("Hora agora = " + agora);
        
        LocalTime time = LocalTime.of(10, 37, 0);
        System.out.println("Hora = " + time);
    }

}
