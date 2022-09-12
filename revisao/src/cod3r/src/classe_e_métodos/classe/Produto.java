package classe_e_métodos.classe;

public class Produto {
    //atributos
    String nome;
    double preco;
    double desconto;



    //metodo para o desconto
    public double valorFinal(){
        double valorInicial = preco * desconto;
        double valorFinal;
        return valorFinal = preco - valorInicial;
    }

}
