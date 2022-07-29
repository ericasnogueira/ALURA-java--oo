package encapsulado;


public class TestaGetESet {
    public static void main(String[] args) {
        Conta conta = new Conta(1337,24226);

        System.out.println("Numero da conta antigo : "+ conta.getNumero());

        // mudando o numero da conta
        conta.setNumero(1337);
        //novo numero da conta
        System.out.println("Novo numero da conta : "+conta.getNumero());
        conta.deposita(55);

        System.out.println("=================");
        Cliente paulo = new Cliente();
        paulo.setNome("Paulo Silvera");


        //titula agora é paulo
        conta.setTitular(paulo); //

        //mostrando o nome do titulo
        System.out.println(conta.getTitular().getNome());

        //alterando a profissao
        conta.getTitular().setProfissao("Programador");
                //agora em duas linhas :
        Cliente titularDaConta = conta.getTitular();
        titularDaConta.setProfissao("Programador");


    }
}
