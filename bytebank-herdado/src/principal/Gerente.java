package principal;


import java.awt.font.TextHitInfo;

//gerente � um fucionairo// gerente herda da class Funcionario, assina o contrato Autenticavel, � um AUTENTICAVEL
public class Gerente extends Funcionario implements Autenticavel{
    //atributos
    private int senha;
    //construtor


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
        this.senha = senha;
    }

    @Override
    public boolean autentica(int senha) {
        if (this.senha == senha){
            System.out.println("Senha correta");
            return true;
        } else {
            return false;
        }
    }
}
