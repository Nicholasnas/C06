package aula5.Exercicio5;

public class Arma {
    String nome, destricao;
    int poder, resistencia;

    Arma(String nome, String destricao, int poder, int resistencia){
        this.nome = nome;
        this.destricao = destricao;
        this.poder = poder;
        this.resistencia = resistencia;
    }
    
    public void MosrtarInfoArma(){
        System.out.println("Nome: "+nome);
        System.out.println("Descrição: "+destricao);
        System.out.println("Poder: "+poder);
        System.out.println("Resistência: "+resistencia);
    }
    
}
