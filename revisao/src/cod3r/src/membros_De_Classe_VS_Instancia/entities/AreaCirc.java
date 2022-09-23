package membros_De_Classe_VS_Instancia.entities;

public class AreaCirc {
    //atributos
    public double raio;

    //está associado diretamente a classe
    //static public  double pi = 3.14; // como  esta com static ela pertence à classe
    public static  final double PI = 3.1415;
     //construtor

    public AreaCirc(double raioInicial) {
        this.raio = raioInicial;
    }

    //metodo
    public double area(){
        return  PI * raio * raio;
    }

    public  static double area(double raio){
        return PI * Math.pow(raio,2);
    }
}
