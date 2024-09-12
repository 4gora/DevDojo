package POO90polimorfismo.servico;

import POO90polimorfismo.dominio.Produto;

public class CalculadoraImposto {
    public static void calcularImposto(Produto produto) {
        System.out.println("RELATÓRIO DE IMPOSTO");
        double imposto = produto.calcularImposto();
        System.out.println("Produto: " + produto.getNome());
        System.out.printf("Preço: R$ %,.2f%n" , produto.getValor());
        System.out.printf("Imposto a ser pago: R$ %,.2f%n", imposto);

    }
}
