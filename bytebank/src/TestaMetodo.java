public class TestaMetodo {
    public static void main(String[] args) {

        Conta contaUsuario = new Conta();
        contaUsuario.saldo = 100;
        contaUsuario.deposita(50);// depositando
        contaUsuario.deposita(500);
        System.out.println(contaUsuario.saldo);
        Conta contaErica = new Conta();
        System.out.println(contaErica.saldo);
    }
}
