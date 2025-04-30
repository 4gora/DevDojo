package Excecoes95.exception.test;

// video 105 - exceção e regras de sobrescrita

import Excecoes95.exception.dominio.Funcionario;
import Excecoes95.exception.dominio.LoginInvalidoException;
import Excecoes95.exception.dominio.Pessoa;

public class SobrescritaComExceptionTest01 {
    public static void main(String[] args) {
        @SuppressWarnings("unused")
        Pessoa pessoa = new Pessoa();
        Funcionario funcionario = new Funcionario();

        try {
            funcionario.salvar();
        } catch (LoginInvalidoException e) {
            throw new RuntimeException(e);
        }
    }
}
