package principal;

public class EditorVideo extends Funcionario{


    //regra de bonifica��o
    public double getBonificacao(){
        System.out.println("Editor video");
        return super.getBonificacao() + 100;
    }
}
