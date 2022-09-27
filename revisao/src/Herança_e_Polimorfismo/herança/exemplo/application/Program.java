package Herança_e_Polimorfismo.herança.exemplo.application;

import Herança_e_Polimorfismo.herança.exemplo.entities.ContaComum;
import Herança_e_Polimorfismo.herança.exemplo.entities.ContaEmpresas;
import Herança_e_Polimorfismo.herança.exemplo.entities.ContaPoupanca;

import java.util.Locale;


public class Program {
    /*
   Suponha um negócio de banco que possui uma conta comum e uma conta para empresas, sendo que a conta para empresa
   possui todos membros da conta comum, mais um limite de empréstimo e uma operação de realizar empréstimo.
    */
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);


        ContaComum conta1 = new ContaComum(1001,"alex",0.0);
        ContaEmpresas conta2 = new ContaEmpresas(1002,"maria",0.0,500.00);

        //UPCASTING
        //um objeto da subclasse atribuindo ao objeto da superclasse
        ContaComum conta3 = conta2; // conta empresa "É UMA " conta comum
        ContaComum conta4 = new ContaEmpresas(1003,"Bob",0.0,200.00);
        ContaComum conta5 = new ContaPoupanca(1004,"Ana",0.0,0.01);

        //DOWNCASTING
        //converter um objeto da superclasse para subclasse

        // comum2.emprestimo(100.00); -> não vai da erroo

        //foi pq contaEmpresa É uma contaComum    (extends)
        ContaEmpresas conta6  = (ContaEmpresas) conta4;



        //não funcionou pq -> a subclasse poupança não pertence a subclasse empresa
        //((ContaEmpresas) comum2).emprestimo(100.00);-> assim vai
        //empresas1.emprestimo(100.0);
        /* assim -> não vai pq contaPoupança Não é uma ContaEmpresa
        ContaEmpresas empresas2 = (ContaEmpresas) comum3;
        ((ContaEmpresas) comum3).emprestimo(100.00);
        */

        // vendo se contaPoupança(comum3) é do tipo de ContaEmpresa
        if(conta5 instanceof  ContaEmpresas){ //vendo se ele pertence a instância
            ContaEmpresas conta7 = (ContaEmpresas) conta5;
            conta7.emprestimo(200.00);
            System.out.println("Emprestimo");
        }
        if(conta5 instanceof ContaPoupanca){//vendo se ele pertence a instância
            ContaPoupanca conta7 = (ContaPoupanca) conta5;
            conta7.updateDoSaldo();
            System.out.println("UPDATE");
        }
        /*
        explicação Pelo que eu entendi :
        a sub-classe pertence a superclasse -> vai funcionar

         */
    }
}
