package principal;

public class ControleBonificacao {
    //atributo
    private double soma;


    public void registra(Funcionario funcionario){
        double boni = funcionario.getBonificacao();// n�o sei qual metodo ira ser chamado pq depende do objeto
        this.soma = this.soma + boni;

    }

    public double getSoma() {
        return soma;
    }
}
