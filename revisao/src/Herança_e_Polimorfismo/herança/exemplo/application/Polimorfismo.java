package Herança_e_Polimorfismo.herança.exemplo.application;

import Herança_e_Polimorfismo.herança.exemplo.entities.ContaComum;
import Herança_e_Polimorfismo.herança.exemplo.entities.ContaPoupanca;

import java.util.Locale;

public class Polimorfismo {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        ContaComum x = new ContaComum(1020,"Alex",1000.0);
        ContaComum y = new ContaPoupanca(1023,"Maria",1000.0,0.01);

        /*
        as duas variáveis são do mesmo tipo(ContaComum) mas tiveram comportamentos diferentes
         */
        x.saque(50.0);
        y.saque(50.0);

        System.out.println(x.getSaldo());
        System.out.println(y.getSaldo());


    }
}
