package principal.teste;

import principal.dominio.DataBaseLoader;
import principal.dominio.FileLoader;

public class DataLoaderTest01 {
    public static void main(String[] args) {
        DataBaseLoader dataBaseLoader = new DataBaseLoader();
        FileLoader fileLoader = new FileLoader();

        //chamando o metodo load
        //OBS: o metodo load foi primeiro feito na interface e implementado nas classes
        dataBaseLoader.load();
        fileLoader.load();

        System.out.println();

        System.out.println("===============");
        System.out.println("Implementa��o M�ltiplas interfaces");
        System.out.println("==================");


        System.out.println();
        dataBaseLoader.remove();
        fileLoader.remove();

        System.out.println();
        System.out.println("======================");
        System.out.println("A implementa��o do metodo fica na inferface mesmo ");
        System.out.println("N�o foi preciso fazer na class");
        System.out.println("S� se quiser");

        dataBaseLoader.checkPermission();// foi implementado na sua classe
        fileLoader.checkPermission();// a implementa��o da propria interface
    }
}
