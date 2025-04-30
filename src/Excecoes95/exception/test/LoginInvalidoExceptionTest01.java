package Excecoes95.exception.test;

// video 104 - exceções customizadas

import Excecoes95.exception.dominio.LoginInvalidoException;

import java.util.Scanner;

public class LoginInvalidoExceptionTest01 {
    public static void main(String[] args) {

        try {
            logar();
        } catch (LoginInvalidoException e) {
            e.printStackTrace();
        }
    }

    private static void logar() throws LoginInvalidoException { // precisa de throws
        try (Scanner sc = new Scanner(System.in)) {
            String usernameDB = "Goku";
            String senhaDB = "ssj";

            System.out.println("Usuário");
            String usernameDigitado = sc.nextLine();
            System.out.println("Senha");
            String senhaDigitada = sc.nextLine();

            // verificando se o usuário digitado e o usuário do "banco de dados" são iguais.
            if (!usernameDB.equals(usernameDigitado) || !senhaDB.equals(senhaDigitada)) {
                throw new LoginInvalidoException("Usuário ou senha inválidos");
                // exceção que precisa ser tratada, precisa usar throws

            }
            System.out.println("Usuário logado com sucesso");
        }
    }
}
