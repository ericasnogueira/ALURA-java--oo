package principal;

public class AutenticacaoUtil {

    private int senha;



    public void setSenha(int senha) {
        this.senha = senha;
    }

    public boolean autentica(int senha) {
        if (this.senha == senha){
            System.out.println("Cliente pode entrar no sistama");
            return true;
        } else {
            return false;
        }
    }



}
