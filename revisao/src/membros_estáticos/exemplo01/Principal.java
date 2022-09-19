package membros_est�ticos.exemplo01;

import java.util.Locale;
import java.util.Scanner;

public class Principal {

    // constante
    // como tem o final o valor dela sempre ser� esse
    public static  final double PI = 3.14159;

    public static void main(String[] args) {
        //PROBLEMA EXEMPLO
        /*
        Fazer um programa para ler um valor num�rico qualquer, e da� mostrar quanto seria o valor de uma circunfer�ncia
        e do volume de uma esfera para um raio daquele valor. informar tamb�m o valor de PI com duas casas decimais.
         */

    // VERS�O 1 =  na propria classe
        Locale.setDefault(Locale.US);
        Scanner entrada = new Scanner(System.in);

        double raio = entrada.nextDouble();

        double circuferencia = circunferencia(raio);
        double volume = volume(raio);


        System.out.printf("C = %.2f%n", circuferencia);
        System.out.printf("V : %.2f%n",volume);
        System.out.printf("PI : %.2f%n",PI);
    }

    public static double circunferencia(double raio) {
        return 2 * PI * raio;
    }

    public static double volume(double raio){
        return 4.0 * PI * raio * raio * raio / 3.0;
    }
}
