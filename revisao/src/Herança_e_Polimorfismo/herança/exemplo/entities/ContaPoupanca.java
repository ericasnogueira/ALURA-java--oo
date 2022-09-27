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
}
