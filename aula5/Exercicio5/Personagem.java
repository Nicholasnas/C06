package aula5.Exercicio5;

import java.util.Scanner;

public class Personagem {
    String nome;
    int pontos;
    int vida;
    Arma arma;
    // TODO: estou fazendo uma composição é nao um agregação
    // Agregação deve ser feito na main - estou obrigando o personagem a ter uma arma


    Personagem(String nome) {
        this.nome = nome;
        pontos = 0;
        vida = 100;
    }

    public void usarArma() {
        System.out.println("Personagem " + nome + " usando arma");
        arma.resistencia -= 2;

    }

    public void TomarDano() {
        if (vida > 0) {
            System.out.println("Personagem " + nome + " tomou dano");
            vida -= 5;
        }
        System.out.println("Personagem " + nome + " está morto");

    }

}
