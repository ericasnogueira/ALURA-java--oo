package principal;


//gerente � um fucionairoAutenticavel // gerente herda da class FuncionarioAutenticavel
public class Gerente extends Funcionario {
    //atributos

    //construtor


    //metodos

    //metodos de bonus
    public double getBonificacao(){
        //usando o metodo da classe funcionario
        //super.bonificacao estou chamando o metododa da classe
        return  super.getSalario();
        //getSalario � da classe funcionario
        // super faz referen�a para a m�e(que seria funcionario) j� que salaria � da daquela class
    }
}
