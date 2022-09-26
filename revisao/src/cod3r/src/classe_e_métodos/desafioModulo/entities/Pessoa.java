package classe_e_m�todos.desafioModulo.entities;

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
        return "Ol� eu sou " + nome + " e tenho "+ peso + " Kgs.";
    }
}
