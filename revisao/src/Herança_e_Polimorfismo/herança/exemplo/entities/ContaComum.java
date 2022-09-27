package Heran�a_e_Polimorfismo.heran�a.exemplo.entities;

public class ContaComum {
    /*
   Suponha um neg�cio de banco que possui uma conta comum e uma conta para empresas, sendo que a conta para empresa
   possui todos membros da conta comum, mais um limite de empr�stimo e uma opera��o de realizar empr�stimo.
    */
    private  int numeroConta;
    private String titular;
    protected double saldo;

    public ContaComum() { //construtor padr�o
    }

    public ContaComum(int numeroConta, String titular, double saldo) {
        this.numeroConta = numeroConta;
        this.titular = titular;
        this.saldo = saldo;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    /*
    suponha que a opera��o de saque possui uma taxa no valor de 5.0. Entretanto, se a conta for do tipo poupan�a, esta
    taxa n�o dever ser cobrada.
     */
    public void saque(double saque){
        saldo -= saque + 5.0;
    }
    public void deposito(double deposito){
        saldo += deposito;
    }
}
