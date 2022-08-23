package exercicios.exercicio02;

public class Funcionario {
    String nome;
    double salarioBruto;
    double taxa;


    public double netSalario(){
       return salarioBruto - taxa;

    }
    public void aumentarSalario(double percentage){
        salarioBruto += salarioBruto * percentage / 100;
    }

    @Override
    public String toString(){
        return nome  + ", $" +
                String.format(" %.2f" , netSalario());
    }

}
