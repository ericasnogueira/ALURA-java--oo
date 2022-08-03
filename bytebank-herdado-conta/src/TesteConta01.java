public class TesteConta01 {
    public static void main(String[] args) {
        ContaCorrente cc = new ContaCorrente(111,111);// passando os parametros de agencia e numero

        //depositando
        cc.deposita(100.0);

        //reutilização dos metodos (deposita) da classe conta
        ContaPoupanca cp = new ContaPoupanca(222,222);
        cp.deposita(200.0);

        System.out.println("==================");
        //transferindo
        cc.transfere(50.0,cp);

        System.out.println("=========================");
        System.out.println("Saldo da conta corrente é "+cc.getSaldo());// mostrando o saldo da conta cp
        System.out.println("Saldo da conta poupanção é "+cp.getSaldo());// mostrando o saldo da conta cp




    }
}
