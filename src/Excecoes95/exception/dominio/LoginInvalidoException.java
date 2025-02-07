package Excecoes95.exception.dominio;
// video 104
public class LoginInvalidoException extends Exception{
    // exceção personalizada que extende a classe Exception
    public LoginInvalidoException() {
        super("Login inválido");
    }

    // classe com 2 construtores, um com uma mensagem genérica, e outro com um parâmetro para mensagem específica.

    public LoginInvalidoException(String message) {
        super(message);
    }
}
