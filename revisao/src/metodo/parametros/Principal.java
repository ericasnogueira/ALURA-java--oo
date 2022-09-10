package metodo.parametros;

import java.util.Locale;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner entrada = new Scanner(System.in);

        Calculadora calculadora = new Calculadora();

        double n1 = entrada.nextDouble();
        double n2 = entrada.nextDouble();


        System.out.println(calculadora.multiplicaDoisNumeros(n1,n2));
    }
}
