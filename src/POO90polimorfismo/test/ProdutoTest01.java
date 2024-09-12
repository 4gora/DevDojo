package POO90polimorfismo.test;

import POO90polimorfismo.dominio.Computador;
import POO90polimorfismo.dominio.Televisao;
import POO90polimorfismo.dominio.Tomate;
import POO90polimorfismo.servico.CalculadoraImposto;

public class ProdutoTest01 {
    public static void main(String[] args) {
        Computador computador = new Computador("NUC10", 11000.00);
        Tomate tomate = new Tomate("Tomate", 10.00);
        Televisao tv = new Televisao("Samsung DU7700", 1890.90);

        CalculadoraImposto.calcularImposto(computador);
        System.out.println("-------------------------------");
        CalculadoraImposto.calcularImposto(tomate);
        System.out.println("-------------------------------");
        CalculadoraImposto.calcularImposto(tv);
    }
}
