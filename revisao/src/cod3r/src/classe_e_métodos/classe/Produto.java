package classe_e_m�todos.classe;

public class Produto {
    //atributos
    String nome;
    double preco;
    static double desconto = 0.25;

    public Produto(){

    }

    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    //metodo para o desconto
    // botar o metodo aqui foi minha ideia, j� que no curso ainda n�o tinha falado sobre isso
    public double valorFinal(){ // pre�o com o desconto
        double valorInicial = preco * desconto;
        double valorFinal;
        return valorFinal = preco - valorInicial;
    }
    public double valorFinal(double gerente){
        return preco * (1 - desconto + gerente);
    }




}
