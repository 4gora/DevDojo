package Excecoes95.exception.dominio;

public class Funcionario extends Pessoa{

    public void salvar() throws LoginInvalidoException{
        System.out.println("Salvando funcionário");
    }
}
