package principal;

public class Funcionario {
    //atributos
    private String nome;
    private String cpf;
    protected double salario; //protected = publico para os filhos, para os outros são privati

    //metodos

    //metodos de bonus
    public  double getBonificacao(){
        return this.salario * 0.05; //0.1 = 5    %
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
