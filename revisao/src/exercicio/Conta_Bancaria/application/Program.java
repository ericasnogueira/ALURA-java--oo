package exercicio.Conta_Bancaria.application;

import exercicio.Conta_Bancaria.entities.Banco;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner entrada = new Scanner(System.in);

        System.out.print("Entre com o numero: ");
        int numero = entrada.nextInt();

        System.out.print("Entre com o nome : ");
        String nome = entrada.nextLine(); //chamando  para ter quebra de linha
        nome = entrada.nextLine();

        System.out.print("Irá depositar um valor inicial (s/n)? ");
        String resposta = entrada.nextLine();

        Banco banco = new Banco(numero,nome);


        if (resposta.equals("s")){
            System.out.print("Entre com o valor inicial: ");
            double valor = entrada.nextDouble();
            banco.saldoConta(valor);
        } else {
            System.out.println();
        }

        System.out.println();

        System.out.println("Atualização: ");
        System.out.println(banco.atualizando());
        System.out.println();

        System.out.print("Entre com o deposito: ");
        double deposito = entrada.nextDouble();
        banco.saldoConta(deposito);
        System.out.println("Atualização da conta: ");
        System.out.println(banco.atualizando());

        System.out.println();

        System.out.print("Entre com o valor do saque: ");
        double saque = entrada.nextDouble();
        banco.saqueDinherio(saque);

        System.out.println(banco.atualizando() );
    }
}
