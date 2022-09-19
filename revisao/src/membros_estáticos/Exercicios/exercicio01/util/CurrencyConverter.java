package membros_estáticos.Exercicios.exercicio01.util;

public  class  CurrencyConverter  {

    static double dolar;
    static  double comprarDolar;

    public static double setDolar(double dolar) {
      return   CurrencyConverter.dolar = dolar;
    }

    public static double setComprarDolar(double comprarDolar) {
        return CurrencyConverter.comprarDolar = comprarDolar;
    }

    public  static double valorPago(){
         return ((dolar * comprarDolar) *0.06) + (dolar * comprarDolar);
    }
}

