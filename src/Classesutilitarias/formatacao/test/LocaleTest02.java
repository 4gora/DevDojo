package Classesutilitarias.formatacao.test;

import java.util.Locale;

// Aula 116 - Locale 2
public class LocaleTest02 {
    public static void main(String[] args) {
        System.out.println(Locale.getDefault());
        String[] isoConutries = Locale.getISOCountries();
        String[] isoLanguages = Locale.getISOLanguages();

        for (String isoLanguage : isoLanguages) {
            System.out.print(isoLanguage+ " ");
        }

        System.out.println();

        for (String isoCountry : isoConutries) {
            System.out.print(isoCountry+ " ");
        }

    }
}
