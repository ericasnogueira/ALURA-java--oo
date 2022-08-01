package principal;

public class EditorVideo extends Funcionario{


    //regra de bonificação
    public double getBonificacao(){
        System.out.println("Editor video");
        return super.getBonificacao() + 100;
    }
}
