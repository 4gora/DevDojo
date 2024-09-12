package POO90polimorfismo.servico;

import POO90polimorfismo.repositorio.Repositorio;

public class RepositorioMemoria implements Repositorio {
    @Override
    public void salvar() {
        System.out.println("Salvando na memória.");
    }
}
