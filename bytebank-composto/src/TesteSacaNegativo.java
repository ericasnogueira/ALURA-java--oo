public class TesteSacaNegativo {
    public static void main(String[] args) {
        Conta conta = new Conta();
        conta.deposita(100);
        conta.saca(200);
        // passando o metodo saca com o argumento no sout
        System.out.println(conta.saca(200));

       conta.saca(101);

       // mostrando o  saldo mesmo ele estando privado e mostramos ele com o metodo mostraSaldo
        System.out.println(conta.getSaldo());
    }
}
