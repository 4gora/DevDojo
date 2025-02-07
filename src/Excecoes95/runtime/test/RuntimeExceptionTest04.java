package Excecoes95.runtime.test;

//VIDEO 101 - capturando múltiplas exceções

/*Não podemos colocar um catch com uma exceção genérica na frente de uma mais específica,
pois o código irá parar no primeiro catch que se encaixa, no caso, o mais genérico.*/

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
    }
}
