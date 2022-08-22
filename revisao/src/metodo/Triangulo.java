package metodo;

public class Triangulo {
    double a;
    double b;
    double c;


    //metodo
    //calculando a area do triangulo
    public double area(){
        //variavel local
        double p = (a + b + c) / 2;
        double resultado = Math.sqrt(p * (p - a) * (p - b) * (p - c));
        return  resultado;
    }
    
}
