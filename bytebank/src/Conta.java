public class Conta {
    //atributos
    double saldo;
    int agencia ;
    int numero;
    String titular;


    // metodos
    //metodos == comportamentos
    // como não vai retorna nada em resposta esta void
    void deposita(double deposito){
       this.saldo += deposito; // a palavra this não está no deposito pq ela não é um atributo de um objeto
    }

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
            this.saldo -= valor;
            destino.deposita(valor);
            System.out.println("Transferencia feita com sucesso ");
            return true;
        }else {
            System.out.println("Não tem dinheiro suficiente para a transferencia");
            return  false;
        }
    }
}
