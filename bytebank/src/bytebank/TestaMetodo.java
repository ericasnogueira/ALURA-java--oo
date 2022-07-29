package bytebank;
public class TestaMetodo {
    public static void main(String[] args) {

        Conta contaUsuario = new Conta();
        contaUsuario.saldo = 100;
        contaUsuario.deposita(50);// depositando
        contaUsuario.deposita(500);
        System.out.println("valor em saldo disponivel : "+contaUsuario.saldo);
        Conta contaErica = new Conta();
        System.out.println("Valor do saldo disponivel conta Erica : "+contaErica.saldo);

        // tirando 20 da conta
        boolean conseguiuRetira = contaUsuario.saca(20); // guardando o valor dentro de uma variavel
        System.out.println("valor em saldo disponivel depois da retirada referente a conta Usuario : " +contaUsuario.saldo);

        System.out.println(conseguiuRetira);// irar aparecer true ou false como foi feito no metodo

        System.out.println();// pulando linha

        //transferir valor de uma conta para outra
        //transferir um valor(300) da conta usuario para conta erica
        System.out.println("Tranferindo o valor da conta Usuario para conta Erica");
        //transferencia foi ?
        contaUsuario.transfere(300,contaErica);

        System.out.println("Valor atual da conda Usuario : "+contaUsuario.saldo);
        System.out.println("Valor atual da conta Erica : " + contaErica.saldo);

        System.out.println();
        contaUsuario.titular = "Paulo Silva"; // nome do dono da conta
        System.out.println(contaUsuario.titular);

    }
}
