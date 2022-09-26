package classe_e_métodos.desafioModulo.entities;

public class Pessoa {

    //atributo
   public String nome;
    public double peso;

    public Pessoa(String nome, double peso) {
        this.nome = nome;
        this.peso = peso;
    }

    public void comer(Comida comida){
        if(comida != null){
            this.peso += comida.peso;
        }
    }

    public String apresentar (){
        return "Olá eu sou " + nome + " e tenho "+ peso + " Kgs.";
    }
}
