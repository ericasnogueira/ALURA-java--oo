package Heran�a_e_Polimorfismo.heran�a.exemplo.application;

import Heran�a_e_Polimorfismo.heran�a.exemplo.entities.ContaComum;
import Heran�a_e_Polimorfismo.heran�a.exemplo.entities.ContaPoupanca;

import java.util.Locale;

public class Polimorfismo {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        ContaComum x = new ContaComum(1020,"Alex",1000.0);
        ContaComum y = new ContaPoupanca(1023,"Maria",1000.0,0.01);

        /*
        as duas vari�veis s�o do mesmo tipo(ContaComum) mas tiveram comportamentos diferentes
         */
        x.saque(50.0);
        y.saque(50.0);

        System.out.println(x.getSaldo());
        System.out.println(y.getSaldo());


    }
}
