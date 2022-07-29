package principal.teste;

import principal.Gerente;

import java.util.Locale;

public class TesteGerente {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Gerente g1 = new Gerente();
        //como gerente herda do funcionario ele já aparece tanto os set como os get como se fosse o dele
        //pegando os atributos da classe funcionario e usando já que foi herdado pelo o gerente
        g1.setNome("Erica SN");
        g1.setCpf("12365245632");
        g1.setSalario(6000.0);

        System.out.println(g1.getNome());
        System.out.println(g1.getCpf());
        System.out.println(g1.getSalario());


        System.out.println("=====================");

        g1.setSenha(6125666);
        //usando só metodo da classe gerente
        g1.autentica(6125666);

        //devolvendo false ou true para a senha
        boolean autenticou = g1.autentica(6125666);

        System.out.println(autenticou);

    }
}
