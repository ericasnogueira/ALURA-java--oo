package principal;

public class EditorVideo extends Funcionario{


    //regra de bonifica��o
    public double getBonificacao(){
        return super.getBonificacao() + 100;
    }
}
