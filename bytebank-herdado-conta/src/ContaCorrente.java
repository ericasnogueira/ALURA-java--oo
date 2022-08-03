
public class ContaCorrente extends  Conta{

    //Contrutor é só da classe não passa para os filhos

    //contrutor
    public ContaCorrente(int agencia, int numero){
        super(agencia,numero);//chamada do contrutor da classe MÃE(padrão ou especifico)
    }

    @Override // sobreescrever um metodo
    public boolean saca(double valor) {
        double valorASacar = valor + 0.2;
        return super.saca(valorASacar);// reaproveitando o codigo na classe super
    }
}
