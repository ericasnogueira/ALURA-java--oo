package exercicios.exercicio03;

public class Estudante {
    String nome;
    double primeiroTrimestre,segundoTrimestre,terceiroTrimestre;


    public  double notaFinal(){
        return primeiroTrimestre + segundoTrimestre + terceiroTrimestre;
    }
    public double pontos(){
        if(notaFinal() < 60.0){
            return  60.0 - notaFinal();
        } else {
            return 0.0;
        }
    }
}
