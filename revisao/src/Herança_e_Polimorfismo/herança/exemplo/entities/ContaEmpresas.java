package Herança_e_Polimorfismo.herança.exemplo.entities;

// Como a classe ContaEmpresa está com extends ela terá todos os atributos e metodos da classe ContaComum

public class ContaEmpresas extends ContaComum {
    /*
    Suponha um negócio de banco que possui uma conta comum e uma conta para empresas, sendo que a conta para empresa
    possui todos membros da conta comum, mais um limite de empréstimo e uma operação de realizar empréstimo.
     */

    private double limite;

    public ContaEmpresas(){ // construtor padrão
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
        para realizar um empréstimo, é descontada uma taxa no valor de 10.0
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
        super.saque(saque); // reutilizando o código da superclasse
        saldo -= 2.00;// está tirando 7 ( 5 da conta comum + 2 da conta empresa)
    }
}
