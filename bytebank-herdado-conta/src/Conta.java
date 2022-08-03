public abstract class Conta {
    //atributos
    protected double saldo;
    private int agencia ;
    private int numero = 144;

    //static = da classe // é o atributo da classe
    private static int total = 0;
    private Cliente titular; //

    //CONSTRUTORES == a inicialização de atributos é a principal responsabilidade do construtor.
    public Conta(int agencia,int numero){

        Conta.total++; // quantas contas foram instaciadas
        System.out.println("O total de contas é : " + Conta.total);
        this.agencia = agencia;
        this.numero = numero;
        System.out.println("Estou Criando uma conta, o numero da conta é : " + this.numero + " Sua agencia é " + this.agencia);
        System.out.println();
    }
    //


    // metodos
    //metodos == comportamentos
    // como não vai retorna nada em resposta esta void

    //metodo absatrato na classe mãe , faz com que os filhos impremente o metodo em sua classes
   public abstract void   deposita(double deposito);

    //quais informações você precisa passar ?
    // se conseguiu sacar ou não// pq pode ter dinheiro ou não na conta

    public boolean saca(double valor){ // na parte do boolean está prometendo que ira retorna um boolean
        // tem dinheiro na conta
        if (this.saldo >= valor){ // this.saldo o saldo da conta
            this.saldo -=  valor; // this.saldo = this.saldo - valor
            return true;
        } else {
            System.out.println("Não tem dinheiro suficiente na conta");
            return  false;
        }

    }
    public boolean transfere(double valor, Conta destino){
        if(this.saldo >= valor){
            this.saca(valor);
            destino.deposita(valor);
            System.out.println("Transferencia feita com sucesso ");
            System.out.println("O seu saldo atual é de : " + this.saldo);
            return true;
        }else {
            System.out.println("Não tem dinheiro suficiente para a transferencia");
            return false;
        }
    }
    //metodo que ira mostrar o saldo já que ele esta private não tem como só chamando ele no main só com metodo agora
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

    //modifico o numero // obs: o numero que esta no atributo foi colocado mim mesmo só para testar
    public void setNumero(int numero){
        if (numero <= 0){
            System.out.println("Error");
            System.out.println("Não pode numero menor ou igual a 0");
            return;//para a execução
        }
        //this.numero faz referencia ao atributo
        //numero só é a variavel temporaria
        this.numero = numero;
    }

    public int getAgencia() {
        return this.agencia;
    }

    public void setAgencia(int agencia) {
        if (agencia <= 0){
            System.out.println("Não pode valor menor igual a 0");
            return; // para a execução
        }
        this.agencia = agencia;
    }

    public Cliente getTitular() {
        return titular;
    }

    public void setTitular(Cliente titular) {
        this.titular = titular;
    }

    //static é da classe
    //como está static não tem como botar o this
    public static int getTotal() {
        return Conta.total;
    }
}
