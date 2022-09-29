package Heran�a_e_Polimorfismo.heran�a.exemplo.entities;

// Como a classe ContaEmpresa est� com extends ela ter� todos os atributos e metodos da classe ContaComum

public class ContaEmpresas extends ContaComum {
    /*
    Suponha um neg�cio de banco que possui uma conta comum e uma conta para empresas, sendo que a conta para empresa
    possui todos membros da conta comum, mais um limite de empr�stimo e uma opera��o de realizar empr�stimo.
     */

    private double limite;

    public ContaEmpresas(){ // construtor padr�o
        super();
    }

    //construtor
    public ContaEmpresas(int numeroConta, String titular, double saldo, double limite) {
        super(numeroConta, titular, saldo);// construtor da Super classe
        this.limite = limite;
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    public void emprestimo(double emprestimo){
        /*
        para realizar um empr�stimo, � descontada uma taxa no valor de 10.0
         */
        if(emprestimo <= limite){
            saldo += emprestimo - 10.0;
            //deposito(emprestimo);
        }
    }
    /*
    a regra para saque seja realizar o saque normalmente da superclasse, e descontar mais 2.0
     */
    @Override
    public void saque(double saque) {
        super.saque(saque); // reutilizando o c�digo da superclasse
        saldo -= 2.00;// est� tirando 7 ( 5 da conta comum + 2 da conta empresa)
    }
}
