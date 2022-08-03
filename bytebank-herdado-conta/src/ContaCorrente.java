
public class ContaCorrente extends  Conta{

    //Contrutor � s� da classe n�o passa para os filhos

    //contrutor
    public ContaCorrente(int agencia, int numero){
        super(agencia,numero);//chamada do contrutor da classe M�E(padr�o ou especifico)
    }

    @Override // sobreescrever um metodo
    public boolean saca(double valor) {
        double valorASacar = valor + 0.2;
        return super.saca(valorASacar);// reaproveitando o codigo na classe super
    }
}
