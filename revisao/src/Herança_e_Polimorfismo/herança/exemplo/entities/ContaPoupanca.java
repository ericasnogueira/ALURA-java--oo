package Herança_e_Polimorfismo.herança.exemplo.entities;

public class ContaPoupanca extends ContaComum{
    private double taxaDeJuros;


    public ContaPoupanca(){
        super();
    }

    public ContaPoupanca(int numeroConta, String titular, double saldo, double taxaDeJuros) {
        super(numeroConta, titular, saldo);// construtor da superClasse
        this.taxaDeJuros = taxaDeJuros;
    }

    public double getTaxaDeJuros() {
        return taxaDeJuros;
    }

    public void setTaxaDeJuros() {
        this.taxaDeJuros = taxaDeJuros;
    }

    public void updateDoSaldo(){
           saldo += saldo * taxaDeJuros;
    }
    /*
    suponha que a operação de saque possui uma taxa no valor de 5.0. Entretanto, se a conta for do tipo poupança, esta
     taxa não dever ser cobrada.
    */
    @Override
    public void saque(double saque) {
        saldo -= saque;
    }
}
