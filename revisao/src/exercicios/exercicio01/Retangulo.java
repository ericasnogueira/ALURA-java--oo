package exercicios.exercicio01;

public class Retangulo {
    double largura;
    double altura;

    public double area(){
        double resultado;
        return resultado = altura * largura;
    }
    public double perimetro(){
        double resultado;
        return  resultado = 2 * (altura + largura);
    }
    public  double diagonal (){
        double resultado ;
        //sqrt = raiz quadrada
        //pow =  elevado a potencia
        // o numero 2 é  potencia que gostariamos
        return  resultado = Math.sqrt(Math.pow(altura,2) + Math.pow(largura,2));
    }
}
