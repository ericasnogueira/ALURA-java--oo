package encapsulamento;

import encapsulamento.entities.Produto;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);


        System.out.println("Entre com os produtos: ");
        System.out.print("Nome : ");
        String nome = input.nextLine();

        System.out.print("Pre�o : ");
        double preco = input.nextDouble();



        Produto produto = new Produto(nome,preco);// informando os dados do produto na instancia��o
        // do mesmo

        produto.setNome("computador");
        System.out.println();
        System.out.println("Atualiza��o do nome : " + produto.getNome());

        // alterando e mostrando o novo pre�o do produto
        produto.setPreco(1200.00);
        System.out.println( produto.getNome() +" R$ " + produto.getPreco());

        System.out.println();
        // CHAMANDO O METODO TEXTO
        // onde esta o texto formatado para aparecer a mensagemf
        System.out.println("Produto : " + produto.texto());
        System.out.println();

        System.out.print("Entre com o numero de produtos para adicionar no estoque : ");
        int quantidade = input.nextInt();

        //chmando o metodo e passado a quantidade tambem
        produto.adicionandoProduto(quantidade);// atualizando

        System.out.println("Atualiza��o :" + produto.texto());
        System.out.println();

        System.out.print("Entre com o numero de produtos para remover no estoque : ");
        quantidade = input.nextInt();
        produto.removendoProduto(quantidade);

        System.out.println();
        System.out.println("Atualiza��o :" + produto.texto());

        input.close();
    }
}

