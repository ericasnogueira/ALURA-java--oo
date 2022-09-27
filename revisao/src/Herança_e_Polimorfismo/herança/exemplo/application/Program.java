package Heran�a_e_Polimorfismo.heran�a.exemplo.application;

import Heran�a_e_Polimorfismo.heran�a.exemplo.entities.ContaComum;
import Heran�a_e_Polimorfismo.heran�a.exemplo.entities.ContaEmpresas;
import Heran�a_e_Polimorfismo.heran�a.exemplo.entities.ContaPoupanca;

import java.util.Locale;


public class Program {
    /*
   Suponha um neg�cio de banco que possui uma conta comum e uma conta para empresas, sendo que a conta para empresa
   possui todos membros da conta comum, mais um limite de empr�stimo e uma opera��o de realizar empr�stimo.
    */
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);


        ContaComum conta1 = new ContaComum(1001,"alex",0.0);
        ContaEmpresas conta2 = new ContaEmpresas(1002,"maria",0.0,500.00);

        //UPCASTING
        //um objeto da subclasse atribuindo ao objeto da superclasse
        ContaComum conta3 = conta2; // conta empresa "� UMA " conta comum
        ContaComum conta4 = new ContaEmpresas(1003,"Bob",0.0,200.00);
        ContaComum conta5 = new ContaPoupanca(1004,"Ana",0.0,0.01);

        //DOWNCASTING
        //converter um objeto da superclasse para subclasse

        // comum2.emprestimo(100.00); -> n�o vai da erroo

        //foi pq contaEmpresa � uma contaComum    (extends)
        ContaEmpresas conta6  = (ContaEmpresas) conta4;



        //n�o funcionou pq -> a subclasse poupan�a n�o pertence a subclasse empresa
        //((ContaEmpresas) comum2).emprestimo(100.00);-> assim vai
        //empresas1.emprestimo(100.0);
        /* assim -> n�o vai pq contaPoupan�a N�o � uma ContaEmpresa
        ContaEmpresas empresas2 = (ContaEmpresas) comum3;
        ((ContaEmpresas) comum3).emprestimo(100.00);
        */

        // vendo se contaPoupan�a(comum3) � do tipo de ContaEmpresa
        if(conta5 instanceof  ContaEmpresas){ //vendo se ele pertence a inst�ncia
            ContaEmpresas conta7 = (ContaEmpresas) conta5;
            conta7.emprestimo(200.00);
            System.out.println("Emprestimo");
        }
        if(conta5 instanceof ContaPoupanca){//vendo se ele pertence a inst�ncia
            ContaPoupanca conta7 = (ContaPoupanca) conta5;
            conta7.updateDoSaldo();
            System.out.println("UPDATE");
        }
        /*
        explica��o Pelo que eu entendi :
        a sub-classe pertence a superclasse -> vai funcionar

         */
    }
}
