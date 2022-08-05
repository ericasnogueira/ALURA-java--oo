package principal;


import java.awt.font.TextHitInfo;

//gerente � um fucionairo// gerente herda da class Funcionario, assina o contrato Autenticavel, � um AUTENTICAVEL
public class Gerente extends Funcionario implements Autenticavel{
    //atributos
    private AutenticacaoUtil autenticador;


    //construtor padr�o
    public Gerente(){
        this.autenticador = new AutenticacaoUtil();
    }


    //metodos

    //metodos de bonus
    public double getBonificacao(){
        //usando o metodo da classe funcionario
        //super.bonificacao estou chamando o metododa da classe
        System.out.println("Chamando o m�todo de bonifica��o do GERENTE");
        return  super.getSalario();
        //getSalario � da classe funcionario
        // super faz referen�a para a m�e(que seria funcionario) j� que salaria � da daquela class
    }

    @Override
    public void setSenha(int senha) {
        this.autenticador.setSenha(senha);
    }

    @Override
    public boolean autentica(int senha) {
       return this.autenticador.autentica(senha);
    }
}
