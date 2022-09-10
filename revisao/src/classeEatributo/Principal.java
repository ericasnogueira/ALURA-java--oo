package classeEatributo;

import java.util.Locale;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner entrada = new Scanner(System.in);

        Triangulo x = new Triangulo();
        Triangulo y = new Triangulo();


        System.out.println("Entre com as medidas do x :");
        x.a = entrada.nextDouble();
        x.b = entrada.nextDouble();
        x.c = entrada.nextDouble();
        System.out.println("Entre com as medidas do y :");
        y.a = entrada.nextDouble();
        y.b = entrada.nextDouble();
        y.c = entrada.nextDouble();


        double p = (x.a + x.b + x.c) / 2.0;
        double areaX = Math.sqrt(p * (p - x.a) * (p - x.b) * (p - x.c));

        //calculando a area do triangulo y
        p = (y.a + y.b + y.c) / 2.0;
        double areaY = Math.sqrt(p * (p - y.a) * (p - y.b) * (p - y.c));

        System.out.printf("Triangulo X area : %.4f%n", areaX);
        System.out.printf("Triangulo Y area : %.4f%n", areaY);

        if (areaX > areaY){
            System.out.println("Area X maior");
        } else {
            System.out.println("Area Y maior");
        }
    }
}
