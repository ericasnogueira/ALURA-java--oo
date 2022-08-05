public class CalculadorDeImposto {

    private double totalImposto;

    //metodo
    public void registra(Tributavel t){
       double valor =  t.getValorImposto();
       this.totalImposto += valor;
    }

    public double getTotalImposto() {
        return totalImposto;
    }
}
