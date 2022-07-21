public class TestaBanco {
    public static void main(String[] args) {

        // referencia para o cliente
        Cliente paulo = new Cliente();
        paulo.nome = "Paulo Silva";
        paulo.cpf = "222.222.222-22";
        paulo.profissao = "programador";

        Conta contaPaulo = new Conta();
        contaPaulo.deposita(100);

        contaPaulo.titular = paulo; // fazendo referencia ao cliente 
        System.out.println(contaPaulo.titular.nome);

        System.out.println();

        // mostrando que a referencia é a mesma para o mesmo objeto
        System.out.println("Mesma referencia do objeto : ");
        System.out.println(contaPaulo.titular);
        System.out.println(paulo);
    }
}
