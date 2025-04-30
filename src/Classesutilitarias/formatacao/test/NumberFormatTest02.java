package Classesutilitarias.formatacao.test;

import java.text.NumberFormat;
import java.util.Locale;

// aula 117 - formatação de moedas
public class NumberFormatTest02 {
    @SuppressWarnings("deprecation")
	public static void main(String[] args) {
        @SuppressWarnings("unused") // Suprime o aviso de variável não utilizada para 'localeDefault'
        Locale localeDefault = Locale.getDefault();
        Locale localeBR = new Locale("pt", "PT");
        Locale localeJP = Locale.JAPAN;
        Locale localeIT = Locale.ITALY;
        NumberFormat[] nfa = new NumberFormat[4];
        nfa[0] = NumberFormat.getCurrencyInstance();
        nfa[1] = NumberFormat.getCurrencyInstance(localeJP);
        nfa[2] = NumberFormat.getCurrencyInstance(localeBR);
        nfa[3] = NumberFormat.getCurrencyInstance(localeIT);
        double  valor =  100_000_000.2130;
        for (NumberFormat numberFormat : nfa) {
            System.out.print(numberFormat.getMaximumFractionDigits());
            System.out.println(numberFormat.format(valor));
        }
    }
}
