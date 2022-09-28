package Heran�a_e_Polimorfismo.heran�a.exemplo.entities;

//final -  n�o poder ser herdada por outra classe
public final class ContaPoupanca extends ContaComum{
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
    suponha que a opera��o de saque possui uma taxa no valor de 5.0. Entretanto, se a conta for do tipo poupan�a, esta
     taxa n�o dever ser cobrada.
    */
    @Override
    public final void saque(double saque) {
        saldo -= saque;
    }
}
