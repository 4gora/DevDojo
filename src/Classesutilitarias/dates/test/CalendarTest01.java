package Classesutilitarias.dates.test;
// video 113 - Calendar
import java.util.Calendar;
import java.util.Date;

public class CalendarTest01 {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance(); // classe abstrata; Não pode ser instanciada.
        if (c.getFirstDayOfWeek() == Calendar.SUNDAY) {
            System.out.println("Domingo primeiro dia da semana");
        }
        System.out.println("Dia da semana = " + c.get(Calendar.DAY_OF_WEEK));
        System.out.println("Dia do ano = " + c.get(Calendar.DAY_OF_YEAR));
        System.out.println("Dia do mês = " + c.get(Calendar.DAY_OF_MONTH));
        System.out.println("Dia da semana no mês = " + c.get(Calendar.DAY_OF_WEEK_IN_MONTH));

        Date date = c.getTime();
        System.out.println(date);
    }
}
