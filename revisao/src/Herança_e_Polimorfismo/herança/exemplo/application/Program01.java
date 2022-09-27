package Heran�a_e_Polimorfismo.heran�a.exemplo.application;

import Heran�a_e_Polimorfismo.heran�a.exemplo.entities.ContaComum;
import Heran�a_e_Polimorfismo.heran�a.exemplo.entities.ContaEmpresas;
import Heran�a_e_Polimorfismo.heran�a.exemplo.entities.ContaPoupanca;

import java.util.Locale;

public class Program01 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        ContaComum conta01 = new ContaComum(1001,"alex",1000.00);
        conta01.saque(200.00);
        System.out.println(conta01.getSaldo());

        //testanto a SOBREPOSI��O na classe poupan�a

        ContaComum conta02 = new ContaPoupanca(1002,"maria",1000.00,0.01);
        conta02.saque(200.00);
        System.out.println(conta02.getSaldo());

        //testanto a SOBREPOSI��O na classe Empresa
        ContaComum conta03 = new ContaEmpresas(1003,"bob",1000.00,500.00);
        conta03.saque(200.00);
        System.out.println(conta03.getSaldo());
    }
}
