
public class ContaCorrente extends  Conta implements Tributavel{

    //Contrutor � s� da classe n�o passa para os filhos

    //contrutor
    public ContaCorrente(int agencia, int numero){
        super(agencia,numero);//chamada do contrutor da classe M�E(padr�o ou especifico)
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

    @Override // sobreescrever um metodo
    public boolean saca(double valor) {
        double valorASacar = valor + 0.2;
        return super.saca(valorASacar);// reaproveitando o codigo na classe super
    }

    @Override
    public double getValorImposto() {
        return  super.saldo * 0.01;
    }
}
