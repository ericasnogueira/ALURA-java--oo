
public class ContaPoupanca extends Conta{


    public ContaPoupanca(int agencia, int numero){
        super(agencia, numero);//chamada do contrutor da classe M�E(padr�o ou especifico)
    }

    @Override
    public void deposita(double deposito) {
        if(deposito >= 30){
            super.saldo = super.saldo + deposito;
            System.out.println("Deposito feito com SUCESSO");
        } else {
            System.out.println("Valor do deposito  s� maior que 30");
        }
    }
}
