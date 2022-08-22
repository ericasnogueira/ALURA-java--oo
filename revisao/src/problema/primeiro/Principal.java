package problema.primeiro;


import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Locale;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        Produto produto = new Produto();



        System.out.println("Entre com os produtos: ");
        System.out.print("Nome : ");
        produto.nome = input.nextLine();
        System.out.print("Preço : ");
        produto.preco = input.nextDouble();
        System.out.print("Quantidade no estoque :");
        produto.quantidadeEstoque = input.nextInt();

        System.out.println();
        // CHAMANDO O METODO TEXTO
        // onde esta o texto formatado para aparecer a mensagem
        System.out.println("Produto : " + produto.texto());
        System.out.println();

        System.out.print("Entre com o numero de produtos para adicionar no estoque : ");
        int quantidade = input.nextInt();

        //chmando o metodo e passado a quantidade tambem
        produto.adicionandoProduto(quantidade);// atualizando

        System.out.println("Atualização :" + produto.texto());
        System.out.println();

        System.out.print("Entre com o numero de produtos para remover no estoque : ");
        quantidade = input.nextInt();
        produto.removendoProduto(quantidade);

        System.out.println();
        System.out.println("Atualização :" + produto.texto());

        input.close();
    }
}
