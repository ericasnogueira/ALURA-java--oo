package principal;

public class ControleBonificacao {
    //atributo
    private double soma;


    // Quanto a empresa ira pagar em bonifica��o
    // a bonifica��o total
    public void registra(Funcionario funcionario){
        double boni = funcionario.getBonificacao();
        this.soma = this.soma + boni;

    }

    public double getSoma() {
        return soma;
    }
}
