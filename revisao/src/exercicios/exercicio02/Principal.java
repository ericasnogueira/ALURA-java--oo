package exercicios.exercicio02;

import java.util.Locale;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        Funcionario funcionario = new Funcionario();

        System.out.print("Nome : ");
        funcionario.nome = input.nextLine();
        System.out.print("Salario Bruto : ");
        funcionario.salarioBruto = input.nextDouble();
        System.out.print("Taxa : ");
        funcionario.taxa = input.nextDouble();

        System.out.println();

        System.out.println("Funcionario : " + funcionario);
        System.out.println("Qual a porcentagem de aumento do salario : ");
        double percentage = input.nextDouble();
        funcionario.aumentarSalario(percentage);

        System.out.println("Atualização -- Funcionaior : " + funcionario);

    }
}
