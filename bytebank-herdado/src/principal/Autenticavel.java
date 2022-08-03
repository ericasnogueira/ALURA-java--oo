package principal;

//classes abstratas não são OBRIGADAS a ter os metodos abstratos das superclasses
public abstract class Autenticavel  {

    private int senha;

    public void setSenha(int senha) {
        this.senha = senha;
    }

    public boolean autentica(int senha){
        if(this.senha == senha){
            System.out.println("Senha correta");
            return true;
        } else {
            System.out.println("Senha incorreta");
            return false;
        }
    }
}
