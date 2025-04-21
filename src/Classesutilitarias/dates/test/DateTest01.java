package Classesutilitarias.dates.test;

import java.util.Date;

public class DateTest01 {
    public static void main(String[] args) {
        // Date está obsoleto
        Date date = new Date(); // long 100000 em ms desde 1969
        date.setTime(date.getTime() + 3_600_000);
        System.out.println(date);
    }
}
