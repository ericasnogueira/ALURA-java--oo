package principal;


import java.awt.font.TextHitInfo;

//gerente é um fucionairo// gerente herda da class Funcionario, assina o contrato Autenticavel, é um AUTENTICAVEL
public class Gerente extends Funcionario implements Autenticavel{
    //atributos
    private int senha;
    //construtor


    //metodos

    //metodos de bonus
    public double getBonificacao(){
        //usando o metodo da classe funcionario
        //super.bonificacao estou chamando o metododa da classe
        System.out.println("Chamando o método de bonificação do GERENTE");
        return  super.getSalario();
        //getSalario é da classe funcionario
        // super faz referença para a mãe(que seria funcionario) já que salaria é da daquela class
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
