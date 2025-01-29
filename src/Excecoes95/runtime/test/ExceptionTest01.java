package Excecoes95.runtime.test;

import java.io.File;
import java.io.IOException;

public class ExceptionTest01 {
    public static void main(String[] args) {

    }
    private static void CriarNovoArquivo(){
        File file = new File("arquivo\\teste.txt");
        try {
            file.createNewFile();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
