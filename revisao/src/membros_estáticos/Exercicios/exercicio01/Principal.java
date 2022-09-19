package membros_estáticos.Exercicios.exercicio01;

import membros_estáticos.Exercicios.exercicio01.util.CurrencyConverter;

import java.util.Locale;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        /*
        Faça um programa para ler a cotação do dolar, e depois um valor em dólares a ser comprado por uma pessoa em
        reais. informar quantos reais a pessoa vai pagar pelos dólares, considerando ainda que a pessoa terá que pagar
       6% de IOF sobre o valor em dolar. Criar uma classe CurrencyConverter para ser responsavel pelos cálculos.
         */

        Locale.setDefault(Locale.US);
        Scanner entrada = new Scanner(System.in);


        System.out.print("Qual é o preço do dolar?");
        double dolar = entrada.nextDouble();


        System.out.print("Quantos dolares irá comprar?");
        double comprarDolar = entrada.nextDouble();

        System.out.printf("O total em reais a pagar é : %.2f%n", CurrencyConverter.valorPago(dolar,comprarDolar));
    }
}
