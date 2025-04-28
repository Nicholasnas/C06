package aula5.Exercicio6;

public class Kart {
    String nome;
    Motor motor;
    Piloto piloto;

    Kart(String nome, String cilindradas, float velocidadeMaxima ){
        this.nome = nome;
        this.motor = new Motor(cilindradas, velocidadeMaxima);
    }
 
    public void pular(){
        System.out.println("Kart " +nome+  " pulando!");

    }
    public void soltarTurbo(){
        motor.velocidadeMaxima = 150;
        System.out.println(nome+ " usando Turbo!");

    }
    public void fazerDrift(){
        System.out.println("Kart " +nome+ " Fazendo Drift!");
    }
    
}
