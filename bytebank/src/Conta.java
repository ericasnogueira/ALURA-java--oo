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
}
