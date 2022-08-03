package principal;

public class EditorVideo extends Funcionario{


    //regra de bonificação
    public double getBonificacao(){
        return super.getBonificacao() + 100;
    }
}
