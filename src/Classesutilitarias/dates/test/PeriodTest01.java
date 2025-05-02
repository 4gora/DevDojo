package Classesutilitarias.dates.test;

import java.time.LocalDate;
import java.time.Period;

// video 124 - Period
public class PeriodTest01 {
    public static void main(String[] args) {

        LocalDate now = LocalDate.now();
        LocalDate nowAfterTwoYears = LocalDate.now().plusYears(2).plusDays(5);

        Period period1 = Period.between(now, nowAfterTwoYears);
        
        System.out.println(period1);
    }
}
