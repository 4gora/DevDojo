package POO90polimorfismo.test;

import POO90polimorfismo.repositorio.Repositorio;
import POO90polimorfismo.servico.RepositorioBancoDeDados;
import POO90polimorfismo.servico.RepositorioMemoria;

import java.util.ArrayList;
import java.util.List;

public class RepositorioTest {
    public static void main(String[] args) {
        Repositorio repositorio = new RepositorioMemoria();
        repositorio.salvar();
        List<String> list = new ArrayList<>();
        list.add("Mustang");
        list.add("Camaro");
        list.add("M3");

        for (String s : list) {
            System.out.println(s);
        }
    }
}
