package POO90polimorfismo.test;

import POO90polimorfismo.dominio.Computador;
import POO90polimorfismo.dominio.Produto;
import POO90polimorfismo.dominio.Tomate;
import POO90polimorfismo.servico.CalculadoraImposto;

public class ProdutoTest03 {
    public static void main(String[] args) {
        Produto produto = new Computador("Ryzen 9", 3000.00);

        Tomate tomate = new Tomate("Tomate", 10.00);
        tomate.setDataValidade("20/09/2024");
        Computador computador = new Computador("Computador", 3000.00);

        CalculadoraImposto.calcularImposto(tomate);
        System.out.println("-----------------------------");
        CalculadoraImposto.calcularImposto(computador);


    }
}
