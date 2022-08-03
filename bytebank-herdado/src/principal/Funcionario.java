package principal;

//não pode instanciar dessa classe, pq é abstrata
public abstract  class Funcionario {
    //atributos
    private String nome;
    private String cpf;
    protected double salario; //protected = publico para os filhos, para os outros são privati

    //metodos

    //metodos de bonus

    //metodo abstrato, exite só para os filhos
    //metodo sem corpo, não há imprementação, o filhos são obrigados a imprementa ela nas suas classes
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
