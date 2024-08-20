package POO87interfaces.test;

import POO87interfaces.dominio.DatabaseLoader;
import POO87interfaces.dominio.FileLoader;

public class DataLoaderTest01 {

    public static void main(String[] args) {
        DatabaseLoader databaseLoader = new DatabaseLoader();

        FileLoader fileLoader = new FileLoader();
        databaseLoader.load();
        fileLoader.load();
    }
}
