package principal;

public class ControleBonificacao {
    //atributo
    private double soma;


    // Quanto a empresa ira pagar em bonificação
    // a bonificação total
    public void registra(Funcionario funcionario){
        double boni = funcionario.getBonificacao();
        this.soma = this.soma + boni;

    }

    public double getSoma() {
        return soma;
    }
}
