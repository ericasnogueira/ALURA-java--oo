package classe_e_métodos.classe;

public class Produto {
    //atributos
    String nome;
    double preco;
    double desconto;



    //metodo para o desconto
    // botar o metodo aqui foi minha ideia, já que no curso ainda não tinha falado sobre isso
    public double valorFinal(){
        double valorInicial = preco * desconto;
        double valorFinal;
        return valorFinal = preco - valorInicial;
    }


}
