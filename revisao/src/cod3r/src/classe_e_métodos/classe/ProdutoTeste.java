package classe_e_métodos.classe;

import java.util.Locale;
import java.util.Scanner;

public class ProdutoTeste {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner entrada = new Scanner(System.in);

        Produto produto = new Produto("Notebook", 4356.89); //
        Produto produto2 = new Produto();

        produto2.nome = "Caneta preta";
        produto2.preco = 12.56;

        Produto.desconto = 0.50; //modificando o desconto de todos os produtos

        System.out.println(produto.nome);
        System.out.println(produto2.nome);


        //valores com o desconto
        System.out.printf("valor final  do acer nitro 5 foi de : %.2f%n", produto.valorFinal());
        System.out.printf("valor final da caneta  foi de : %.2f%n", produto2.valorFinal(0.1));

        //media da compra
        double media = (produto.valorFinal() + produto2.valorFinal()) / 2;
        System.out.printf("Media da compra foi de R$ %.2f%n", media);


    }
}
