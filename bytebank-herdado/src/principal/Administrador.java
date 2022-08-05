package principal;

public class Administrador extends Funcionario implements Autenticavel {


    private AutenticacaoUtil autencador;


    //construtor padr�o
    public Administrador(){
        this.autencador = new AutenticacaoUtil();
    }

    @Override
    public double getBonificacao() {
        return 50;
    }

    @Override
    public void setSenha(int senha) {
       this.autencador.setSenha(senha);
    }

    @Override
    public boolean autentica(int senha) {
        return this.autencador.autentica(senha);
    }
}
