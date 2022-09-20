package encapsulamento.entities;

public class Produto {
    private String nome;
    private double preco;
    private int quantidadeEstoque;

    public Produto(String nome, double preco, int quantidadeEstoque) {
        this.nome = nome;
        this.preco = preco;
        this.quantidadeEstoque = quantidadeEstoque;
    }
    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    //set e get


    // retornando o atributo
    public String getNome() {
        return nome;
    }

    // set - consigo mudar o que esta refenrte no atributo
    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQuantidadeEstoque() {
        return quantidadeEstoque;
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
