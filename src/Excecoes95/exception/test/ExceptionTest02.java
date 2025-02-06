package Excecoes95.exception.test;

import java.io.File;
import java.io.IOException;

public class ExceptionTest02 {
    public static void main(String[] args) throws IOException {
        criarNovoArquivo();
    }

    private static void criarNovoArquivo() throws IOException {
        File file = new File("arquivo\\teste.txt");
        try {
            boolean wasCreated = file.createNewFile();
            System.out.println("Arquivo criado " + wasCreated);
        } catch (IOException e) {
            e.printStackTrace();
            throw e;
        }
    }
}
