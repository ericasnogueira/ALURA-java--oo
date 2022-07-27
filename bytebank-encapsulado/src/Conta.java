import javax.swing.plaf.synth.SynthOptionPaneUI;

public class Conta {
    //atributos
    private double saldo;
    private int agencia ;
    private int numero = 144;
    //static = da classe // � o atributo da classe
    private static int total;
    private Cliente titular; //

    //CONSTRUTORES == a inicializa��o de atributos � a principal responsabilidade do construtor.
    public Conta(int agencia,int numero){

        Conta.total++; // quantas contas foram instaciadas
        System.out.println("O total de contas � : " + Conta.total);
        this.agencia = agencia;
        this.numero = numero;
        System.out.println("Estou Criando uma conta : " + this.numero + " Sua agencia � " + this.agencia);
        System.out.println();
    }
    //


    // metodos
    //metodos == comportamentos
    // como n�o vai retorna nada em resposta esta void
    void deposita(double deposito){
        if (deposito >= 30) {
            this.saldo += deposito; // a palavra this n�o est� no deposito pq ela n�o � um atributo de um objeto
            System.out.println("================================");
            System.out.println("Deposito realizado com sucesso ");
            System.out.println("Valor : " + deposito + " adicionado na conta");
            System.out.println("Saldo : " + this.saldo);
        } else {
            //depositos menores que 30
            System.out.println("N�o � possivel fazer depositos de valores menores que R$30");
        }
    }

    //quais informa��es voc� precisa passar ?
    // se conseguiu sacar ou n�o// pq pode ter dinheiro ou n�o na conta

    public boolean saca(double valor){ // na parte do boolean est� prometendo que ira retorna um boolean
        // tem dinheiro na conta
        if (this.saldo >= valor){ // this.saldo o saldo da conta
            this.saldo -=  valor; // this.saldo = this.saldo - valor
            return true;
        } else {
            System.out.println("N�o tem dinheiro suficiente na conta");
            return  false;
        }

    }
    public boolean transfere(double valor, Conta destino){
        if(this.saldo >= valor){
            this.saldo -= valor;
            destino.deposita(valor);
            System.out.println("Transferencia feita com sucesso ");
            return true;
        }else {
            System.out.println("N�o tem dinheiro suficiente para a transferencia");
            return false;
        }
    }
    //metodo que ira mostrar o saldo j� que ele esta private n�o tem como s� chamando ele no main s� com metodo agora
    /*public double mostraSaldo(){ //
        return this.saldo;
    }
    */ // em vez de fazer um metodo como o de cima pode usar o get
    public double getSaldo() {
        return this.saldo;
    }

    //acessando conta
    public  int getNumero(){
        return this.numero;
    }

    //modifico o numero // obs: o numero que esta no atributo foi colocado mim mesmo s� para testar
    public void setNumero(int numero){
        if (numero <= 0){
            System.out.println("Error");
            System.out.println("N�o pode numero menor ou igual a 0");
            return;//para a execu��o
        }
        //this.numero faz referencia ao atributo
        //numero s� � a variavel temporaria
        this.numero = numero;
    }

    public int getAgencia() {
        return this.agencia;
    }

    public void setAgencia(int agencia) {
        if (agencia <= 0){
            System.out.println("N�o pode valor menor igual a 0");
            return; // para a execu��o
        }
        this.agencia = agencia;
    }

    public Cliente getTitular() {
        return titular;
    }

    public void setTitular(Cliente titular) {
        this.titular = titular;
    }

    //static � da classe
    //como est� static n�o tem como botar o this
    public static int getTotal() {
        return Conta.total;
    }
}
