package principal;

public class Funcionario {
    //atributos
    private String nome;
    private String cpf;
    private double salario;

    //construtor


    //metodos

    //metodos de bonus
    public  double boniFicacao(){
        return this.salario * 0.1; //0.1 = 10%
    }

    public String getNome() {

        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
