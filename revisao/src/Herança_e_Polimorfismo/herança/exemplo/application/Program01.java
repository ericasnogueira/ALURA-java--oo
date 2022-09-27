package Herança_e_Polimorfismo.herança.exemplo.application;

import Herança_e_Polimorfismo.herança.exemplo.entities.ContaComum;
import Herança_e_Polimorfismo.herança.exemplo.entities.ContaEmpresas;
import Herança_e_Polimorfismo.herança.exemplo.entities.ContaPoupanca;

import java.util.Locale;

public class Program01 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        ContaComum conta01 = new ContaComum(1001,"alex",1000.00);
        conta01.saque(200.00);
        System.out.println(conta01.getSaldo());

        //testanto a SOBREPOSIÇÃO na classe poupança

        ContaComum conta02 = new ContaPoupanca(1002,"maria",1000.00,0.01);
        conta02.saque(200.00);
        System.out.println(conta02.getSaldo());

        //testanto a SOBREPOSIÇÃO na classe Empresa
        ContaComum conta03 = new ContaEmpresas(1003,"bob",1000.00,500.00);
        conta03.saque(200.00);
        System.out.println(conta03.getSaldo());
    }
}
