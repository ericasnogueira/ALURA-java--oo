package problema.primeiro;

public class Produto {
    String nome;
    double preco;
    int quantidadeEstoque;


    public double totalValor(){
        double totalValor;
        return totalValor= preco * quantidadeEstoque;
    }
    public void adicionandoProduto(int quantidade){
       quantidadeEstoque = quantidadeEstoque + quantidade;
    }

    public void removendoProduto(int quantidade){
        quantidadeEstoque = quantidadeEstoque - quantidade;
    }

    public String texto(){
        return  nome + ", $ " +
                String.format("%.2f", preco) +
                ", " +
                quantidadeEstoque +
                " Unidades , total: $ " +
                String.format("%.2f", totalValor());
    }

}
