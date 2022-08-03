package principal;

//implements  faz refenrecia a interface
//assim como é abstract em Autenticavel , a classe é obrigada a implementa os metodos
public class Cliente implements Autenticavel {


    private int senha;
    @Override
    public void setSenha(int senha) {
        this.senha = senha;
    }

    @Override
    public boolean autentica(int senha) {
        if (this.senha == senha){
            System.out.println("Cliente pode entrar no sistama");
            return true;
        } else {
            return false;
        }
    }
}
