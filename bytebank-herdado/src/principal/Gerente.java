package principal;


//gerente � um fucionairo // gerente herda da class Funcionario
public class Gerente extends Funcionario{
    //atributos
    private int senha;
    //construtor


    //metodos
    //metodo s� para o gerente
    //                         parametro do metodo
    public boolean autentica(int senha){
        if (this.senha == senha){
            System.out.println("Ola " + this.getNome());
            System.out.println("senha correta ");
            return true;
        } else {
            System.out.println("Senha incorreta");
            return false;
        }
    }

    public void setSenha(int senha) {
        this.senha = senha;
    }
    //metodos de bonus
    public double getBonificacao(){
        //usando o metodo da classe funcionario
        //super.bonificacao estou chamando o metododa da classe
        return super.getBonificacao() + super.getSalario();
        //getSalario � da classe funcionario
        // super faz referen�a para a m�e(que seria funcionario) j� que salaria � da daquela class
    }
}
