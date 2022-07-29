package bytebank;
public class testeReferencias {
    public static void main(String[] args) {
        Conta primeiraConta = new Conta();
        primeiraConta.saldo = 300;

        System.out.println("Primeira Conta :" + primeiraConta.saldo);

        Conta segundaConta = primeiraConta;
        System.out.println("Segunda Conta : "+segundaConta.saldo);

        // as duas contas faz referencia para o mesmo objeto
        segundaConta.saldo += 100;
        System.out.println("Segunda Conta : "+segundaConta.saldo);

        System.out.println("Primeira Conta : " + primeiraConta.saldo);// faz referencia para o mesmo objeto

        if(primeiraConta == segundaConta){
            System.out.println("São as mesma conta");
        }
        System.out.println(primeiraConta);
        System.out.println(segundaConta);

    }
}
