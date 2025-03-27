package aula5.Exercicio6;

public class Piloto {
    String nome;
    boolean vilao;

    Piloto(String nome, boolean vilao){
        this.nome = nome;
        this.vilao = vilao;
    }

    public void soltaSuperPoder(){
        System.out.println("Personagem: "+nome+ " soltando super poder!");
    }
    
}
