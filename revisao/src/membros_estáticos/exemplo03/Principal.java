package membros_est�ticos.exemplo03;

import membros_est�ticos.exemplo03.util.Calculadora;

import java.util.Locale;
import java.util.Scanner;

public class Principal {
    // constante
    // como tem o final o valor dela sempre ser� esse

    public static void main(String[] args) {
        //PROBLEMA EXEMPLO
        /*
        Fazer um programa para ler um valor num�rico qualquer, e da� mostrar quanto seria o valor de uma circunfer�ncia
        e do volume de uma esfera para um raio daquele valor. informar tamb�m o valor de PI com duas casas decimais.
         */

        // VERS�O 02
        Locale.setDefault(Locale.US);
        Scanner entrada = new Scanner(System.in);

        double raio = entrada.nextDouble();

        /*
        como os m�todos est�o static n�o preciso mais instanciar s� chamar pela pr�pria classe.
        posso utilizar esses membros Independentes de qualquer objeto
        basta colocar o nome da classe . e chamar o que eu precisar
         */

        double circuferencia = Calculadora.circunferencia(raio);
        double volume = Calculadora.volume(raio);


        System.out.printf("C = %.2f%n", circuferencia);
        System.out.printf("V : %.2f%n",volume);
        System.out.printf("PI : %.2f%n",Calculadora.PI);
    }

}

