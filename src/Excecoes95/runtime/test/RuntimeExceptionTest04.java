package Excecoes95.runtime.test;

//VIDEO 101 - capturando múltiplas exceções

/*Não podemos colocar um catch com uma exceção genérica na frente de uma mais específica,
pois o código irá parar no primeiro catch que se encaixa, no caso, o mais genérico.*/

import java.io.FileNotFoundException;
import java.sql.SQLException;

public class RuntimeExceptionTest04 {
    public static void main(String[] args) {
        try {
        throw new ArithmeticException();
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Dentro do ArrayIndexOutOfBoundsException");
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Dentro do IndexOutOfBoundsException");
        } catch (IllegalArgumentException e) {
            System.out.println("Dentro do IllegalArgumentException");
        }  catch (ArithmeticException e) {
            System.out.println("Dentro do ArithmeticException");
        }

// VIDEO 102 - multi catch em linha
/*O caractere "|" permite que capture exceções de LINHA DE HERANÇA DIFERENTES com o mesmo catch*/

        // mesmo código do video 101 com multi catch em linha
        try {
            throw new ArithmeticException();
        } catch (ArrayIndexOutOfBoundsException | ArithmeticException | IllegalArgumentException e) {
            System.out.println("Dentro do ArrayIndexOutOfBoundsException");
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Dentro do IndexOutOfBoundsException");

        }


        try {
            talvezLanceException();
        } catch (SQLException | FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    private static void talvezLanceException() throws SQLException, FileNotFoundException {

    }
}
