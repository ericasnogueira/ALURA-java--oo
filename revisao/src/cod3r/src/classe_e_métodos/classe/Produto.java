package classe_e_m�todos.classe;

public class Produto {
    //atributos
    String nome;
    double preco;
    double desconto;



    //metodo para o desconto
    // botar o metodo aqui foi minha ideia, j� que no curso ainda n�o tinha falado sobre isso
    public double valorFinal(){
        double valorInicial = preco * desconto;
        double valorFinal;
        return valorFinal = preco - valorInicial;
    }


}
