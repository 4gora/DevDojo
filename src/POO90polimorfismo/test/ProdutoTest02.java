package POO90polimorfismo.test;

import POO90polimorfismo.dominio.Computador;
import POO90polimorfismo.dominio.Produto;
import POO90polimorfismo.dominio.Tomate;

public class ProdutoTest02 {
    public static void main(String[] args) {
        Produto produto = new Computador("Ryzen 9", 3000.00);
        System.out.println(produto.getNome());
        System.out.println(produto.getValor());

        Produto produto2 = new Tomate("Tomate", 10.00);


    }
}
