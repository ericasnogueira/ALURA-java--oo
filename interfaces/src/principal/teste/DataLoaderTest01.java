package principal.teste;

import principal.DataBaseLoader;
import principal.FileLoader;

public class DataLoaderTest01 {
    public static void main(String[] args) {
        DataBaseLoader dataBaseLoader = new DataBaseLoader();
        FileLoader fileLoader = new FileLoader();

        //chamando o metodo load
        //OBS: o metodo load foi primeiro feito na interface e implementado nas classes
        dataBaseLoader.load();
        fileLoader.load();
    }
}
