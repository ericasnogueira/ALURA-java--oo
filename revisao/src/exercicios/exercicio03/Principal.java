package exercicios.exercicio03;

import java.util.Locale;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        Estudante estudante = new Estudante();

        estudante.nome = input.nextLine();
        estudante.primeiroTrimestre = input.nextDouble();
        estudante.segundoTrimestre = input.nextDouble();
        estudante.terceiroTrimestre = input.nextDouble();


        System.out.printf("FINAL GRADE : %.2f%n" , estudante.notaFinal());

        if(estudante.notaFinal() < 60.00) {
            System.out.println("FALID");
            System.out.printf("FALTA : %.2f PONTOS" ,estudante.pontos());
        } else{
            System.out.printf("PASS");
        }

    }
}
