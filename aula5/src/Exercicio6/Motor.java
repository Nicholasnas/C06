package aula5.Exercicio6;

public class Motor {
    String cilindradas;
    float velocidadeMaxima;

    Motor(String cilindradas, float velocidadeMaxima){
        this.cilindradas = cilindradas;
        this.velocidadeMaxima = velocidadeMaxima;
    }

    public void mostrarInfo(){
        System.out.println("Cilindradas do motor: " +cilindradas);
        System.out.println("Velocidade Máxima do motor: " +velocidadeMaxima);
    }
}
