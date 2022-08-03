package principal;


//gerente é um fucionairoAutenticavel // gerente herda da class FuncionarioAutenticavel
public class Gerente extends Funcionario {
    //atributos

    //construtor


    //metodos

    //metodos de bonus
    public double getBonificacao(){
        //usando o metodo da classe funcionario
        //super.bonificacao estou chamando o metododa da classe
        return  super.getSalario();
        //getSalario é da classe funcionario
        // super faz referença para a mãe(que seria funcionario) já que salaria é da daquela class
    }
}
