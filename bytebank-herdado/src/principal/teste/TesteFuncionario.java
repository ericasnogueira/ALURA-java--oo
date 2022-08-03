package principal.teste;

import principal.Funcionario;
import principal.Gerente;

import java.util.Locale;

public class TesteFuncionario {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);


        Gerente funcionario = new Gerente(); // construtor padrão
        funcionario.setNome("Erica Silva");
        funcionario.setCpf("12365478952");
        funcionario.setSalario(2600.00);

        System.out.println(funcionario.getNome());
        System.out.println(funcionario.getSalario());
        System.out.println("A sua bonificação foi  de : " + funcionario.getBonificacao());// chamando o metodo


    }
}
