package classe_e_métodos.classe;

import java.util.Locale;
import java.util.Scanner;

public class ProdutoTeste {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner entrada = new Scanner(System.in);

        Produto produto = new Produto();
        Produto produto2 = new Produto();

        produto.nome = "Acer nitro 5";
        produto.preco = 4356.89;
        produto.desconto = 0.25;

        produto2.nome = "Caneta preta";
        produto2.preco = 12.56;
        produto2.desconto = 0.29;


        System.out.println(produto2.nome);
        System.out.println(produto.nome);

        //valores com o desconto
        System.out.printf("valor final  do acer nitro 5 foi de : %.2f%n", produto.valorFinal());
        System.out.printf("valor final da caneta  foi de : %.2f%n", produto2.valorFinal());

        //media da compra
        double media = (produto.valorFinal() + produto2.valorFinal()) / 2;
        System.out.printf("Media da compra foi de R$ %.2f", media);

    }
}
