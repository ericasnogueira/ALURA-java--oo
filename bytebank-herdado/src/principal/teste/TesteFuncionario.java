package principal.teste;

import principal.Funcionario;

import java.util.Locale;

public class TesteFuncionario {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);


        Funcionario funcionario = new Funcionario(); // construtor padrão
        funcionario.setNome("Erica Silva");
        funcionario.setCpf("12365478952");
        funcionario.setSalario(2600.00);

        System.out.println(funcionario.getNome());
        System.out.println("A sua bonificação foi  de : "+funcionario.boniFicacao());// chamando o metodo
    }
}
