package principal;

//implements  faz refenrecia a interface
//assim como � abstract em Autenticavel , a classe � obrigada a implementa os metodos
public class Cliente implements Autenticavel {


    private  AutenticacaoUtil autenticador;

    //construtor padr�o
    public  Cliente(){
        this.autenticador = new AutenticacaoUtil();
    }
    @Override
    public void setSenha(int senha) {
        //quem vai guarda agora a senha � o autenticacaoUtil
        this.autenticador.setSenha(senha);
    }

    @Override
    public boolean autentica(int senha) {
       boolean autenticou =  this.autenticador.autentica(senha);
            return autenticou;
    }
}
