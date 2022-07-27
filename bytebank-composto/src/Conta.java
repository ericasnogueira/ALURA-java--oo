public class Conta {
    //atributos
    private double saldo;
    int agencia ;
    int numero;
    Cliente titular; //
    

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
            return false;
        }
    }
    //metodo que ira mostrar o saldo já que ele esta private não tem como só chamando ele no main só com metodo agora
    /*public double mostraSaldo(){ //
        return this.saldo;
    }
    */ // em vez de fazer um metodo como o de cima pode usar o get
    public double getSaldo() {
        return saldo;
    }

}
