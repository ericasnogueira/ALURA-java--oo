package Construtores.problemaExemplo.entities;

public class Produto {
       public String nome;
       public double preco;
       public int quantidadeEstoque;

    public Produto(String nome, double preco, int quantidadeEstoque) {
        this.nome = nome;
        this.preco = preco;
        this.quantidadeEstoque = quantidadeEstoque;
    }

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


