package bytebank;
public class CriaConta {
    public static void main(String[] args) {
       Conta primeiraConta =  new Conta();// instaciando o objeto do tipo conta

        primeiraConta.saldo = 200; // saldo da primeira conta  // atribuindo o valor

        System.out.println( primeiraConta.saldo);

        primeiraConta.saldo += 100;
        System.out.println(primeiraConta.saldo);

        Conta segundaConta = new Conta();
        segundaConta.saldo = 50;
        System.out.println("Primeira conta tem : " + primeiraConta.saldo);
        System.out.println("Segunda Conta tem : " + segundaConta.saldo);

        System.out.println(primeiraConta.agencia);
        System.out.println(primeiraConta.numero);
        System.out.println(segundaConta.agencia);

        segundaConta.agencia = 146;
        System.out.println("Agora a segunda conta esta na agencia : " + segundaConta.agencia );

        if(primeiraConta == segundaConta){
         System.out.println("São as mesma conta");
        } else {
         System.out.println("Contas diferentes ");
        }

         System.out.println(primeiraConta);
         System.out.println(segundaConta);

    }
}
