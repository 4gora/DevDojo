package Excecoes95.exception.test;
// VIDEO 103 - Try with resources

import Excecoes95.exception.dominio.Leitor1;
import Excecoes95.exception.dominio.Leitor2;

import java.io.*;

public class TryWithResourcesTest01 {
    public static void main(String[] args) {
        lerArquivo();
    }

    public static void lerArquivo() { //  try with resources permite a exclusão do catch, mas obriga o uso de throws
        try (Leitor1 leitor1 = new Leitor1();
             Leitor2 leitor2 = new Leitor2()) {
            // recursos com try with resources são fechados na ordem inversa, neste caso, o leitor2 é fechado antes do leitor1.

        } catch (IOException e) {

        }

    }

    // try with resources se encarrega de finalizar os recursos do objeto criado

    public static void lerArquivo2() {
        Reader reader = null;
        try {
            reader = new BufferedReader(new FileReader("teste.txt"));
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                if (reader != null) {
                    reader.close();
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
