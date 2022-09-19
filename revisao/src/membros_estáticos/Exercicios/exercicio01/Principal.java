package membros_est�ticos.Exercicios.exercicio01;

import membros_est�ticos.Exercicios.exercicio01.util.CurrencyConverter;

import java.util.Locale;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        /*
        Fa�a um programa para ler a cota��o do dolar, e depois um valor em d�lares a ser comprado por uma pessoa em
        reais. informar quantos reais a pessoa vai pagar pelos d�lares, considerando ainda que a pessoa ter� que pagar
       6% de IOF sobre o valor em dolar. Criar uma classe CurrencyConverter para ser responsavel pelos c�lculos.
         */

        Locale.setDefault(Locale.US);
        Scanner entrada = new Scanner(System.in);


        System.out.print("Qual � o pre�o do dolar?");
        double dolar = entrada.nextDouble();


        System.out.print("Quantos dolares ir� comprar?");
        double comprarDolar = entrada.nextDouble();

        System.out.printf("O total em reais a pagar � : %.2f%n", CurrencyConverter.valorPago(dolar,comprarDolar));
    }
}
