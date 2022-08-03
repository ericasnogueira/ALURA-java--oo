package principal;

//n�o pode instanciar dessa classe, pq � abstrata
//classes abstratas n�o s�o OBRIGADAS a ter os metodos abstratos das superclasses
public abstract  class Funcionario {
    //atributos
    private String nome;
    private String cpf;
    protected double salario; //protected = publico para os filhos, para os outros s�o privati

    //metodos

    //metodos de bonus

    //metodo abstrato, exite s� para os filhos
    //metodo sem corpo, n�o h� imprementa��o, o filhos s�o obrigados a imprementa ela nas suas classes
    public abstract double getBonificacao();



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
