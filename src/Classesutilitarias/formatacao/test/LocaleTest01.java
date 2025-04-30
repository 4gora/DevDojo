package Classesutilitarias.formatacao.test;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Locale;

// video 115 - Locale
public class LocaleTest01 {
    @SuppressWarnings("deprecation")
    public static void main(String[] args) {
        Locale localeItaly = new Locale("it", "IT");
        Locale localeSwitzerland = new Locale("it", "CH");
        Locale localeGermany = new Locale("de", "DE");
        Locale localeBrazil = new Locale("pt", "BR");

        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.DAY_OF_MONTH, 3);
        DateFormat df1 = DateFormat.getDateInstance(DateFormat.FULL, localeItaly);
        DateFormat df2 = DateFormat.getDateInstance(DateFormat.FULL, localeSwitzerland);
        DateFormat df3 = DateFormat.getDateInstance(DateFormat.FULL,localeGermany);
        DateFormat df4 = DateFormat.getDateInstance(DateFormat.FULL, localeBrazil);

        System.out.println("Itália, " + df1.format(calendar.getTime()));
        System.out.println("Suíça, " + df2.format(calendar.getTime()));
        System.out.println(localeBrazil.getDisplayCountry() + ", " + df4.format(calendar.getTime())); // exibe o país de acordo com a JVM do seu computador
        System.out.println(localeGermany.getDisplayCountry(localeGermany) + ", " + df3.format(calendar.getTime())); // exibe o país de acordo com o locale
    }
}
