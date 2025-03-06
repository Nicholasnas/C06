package aula5.Zumbi_exemplos;

public class Zumbi {
    String nome;
    String genero;
    int vida;
    int forca;
    boolean careca;

    Zumbi(String nome, String genero, int forca, boolean careca){
        this.nome = nome;
        this.genero = genero;
        this.forca = forca;
        this.careca = careca;
    }

    public void correr(){
        System.out.println("Zumbi "+nome+" correndo");
    }
    public void atacar(){
        System.out.println("Zumbi "+nome+" atacando");
        vida++;
    }
    public double mostrarVida(){
        return vida;
    }
    public boolean transfereVida(Zumbi zumbi_alvo, double quantidade){
        if (vida < quantidade){
            System.out.println("Zumbi "+nome+" não tem vida suficiente para transferir");
            return false;
        }
        vida -= quantidade;
        zumbi_alvo.vida += quantidade;
        return true;
    }
    public void morrer(){
        vida = 0;
        System.out.println("Zumbi "+nome+" morrendo");
    }
}
