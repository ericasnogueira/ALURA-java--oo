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
        System.out.println("Implementação Múltiplas interfaces");
        System.out.println("==================");


        System.out.println();
        dataBaseLoader.remove();
        fileLoader.remove();

        System.out.println();
        System.out.println("======================");
        System.out.println("A implementação do metodo fica na inferface mesmo ");
        System.out.println("Não foi preciso fazer na class");
        System.out.println("Só se quiser");

        dataBaseLoader.checkPermission();// foi implementado na sua classe
        fileLoader.checkPermission();// a implementação da propria interface
    }
}
