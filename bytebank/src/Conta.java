public class Conta {
    //atributos
    double saldo;
    int agencia ;
    int numero;
    String titular;


    // metodos
    //metodos == comportamentos
    // como n�o vai retorna nada em resposta esta void
    void deposita(double deposito){
       this.saldo += deposito; // a palavra this n�o est� no deposito pq ela n�o � um atributo de um objeto
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
            return  false;
        }
    }
}
