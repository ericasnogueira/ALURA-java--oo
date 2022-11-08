package Herança_e_Polimorfismo.herança.exemplo.application;

import Herança_e_Polimorfismo.herança.exemplo.entities.ContaComum;
import Herança_e_Polimorfismo.herança.exemplo.entities.ContaEmpresas;
import Herança_e_Polimorfismo.herança.exemplo.entities.ContaPoupanca;

import java.util.Locale;

public class Polimorfismo {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        //superclasse       // subclasse
        //tipo generico    // tipo especifico
        ContaComum a = new ContaEmpresas(1000,"Erica",1000.0,5000.0);
       // ContaComum x = new ContaComum(1020,"Alex",1000.0);
        ContaComum y = new ContaPoupanca(1023,"Maria",1000.0,0.01);
        /*
        as duas variáveis são do mesmo tipo(ContaComum) mas tiveram comportamentos diferentes
         */
        //x.saque(50.0);
        y.saque(50.0);
        a.saque(50.0);

        //System.out.println("Conta comum : "+x.getSaldo());
        System.out.println("Conta Poupanca : " + y.getSaldo());
        System.out.println("Conta Empresa : " + a.getSaldo());

    }
}
