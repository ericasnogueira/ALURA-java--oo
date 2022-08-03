package principal;

//não é acessado por todos, só alguns funcionarios
public class SistemaInterno {
    private int senha = 2222;


    public void autentica(Autenticavel fa){
       boolean auntenticou =  fa.autentica(this.senha);
       if (auntenticou){
           System.out.println("Pode entrar no Sistema");
       } else {
           System.out.println("Não Pode entrar no sistema interno");
       }
    }
}
