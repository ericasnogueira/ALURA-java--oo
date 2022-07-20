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
}
