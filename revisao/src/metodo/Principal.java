package metodo;

import java.util.Locale;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        // sera usado o mesmo exemplo que foi na de classeEatributo
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        Triangulo x = new Triangulo();
        Triangulo y = new Triangulo();

        System.out.println("Entre com as medidas do X : ");
        x.a = input.nextDouble();
        x.b = input.nextDouble();
        x.c = input.nextDouble();
        System.out.println("Entre com as medidas de Y : ");
        y.a = input.nextDouble();
        y.b = input.nextDouble();
        y.c = input.nextDouble();



                        // chamando o metodo para fazer o calculo
        double areaX = x.area();
        double areaY = y.area();

        System.out.printf("Triangulo x area : %.4f%n", areaX);
        System.out.printf("Triangulo y area : %.4f%n", areaY);


        if(areaX > areaY){
            System.out.println("Area X é maior");
        } else {
            System.out.println("Area Y é maior");
        }


    }
}
