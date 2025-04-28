
public class Arma {
    String nome, destricao;
    int poder, resistencia;

    Arma(String nome, String descricao, int poder, int resistencia){
        this.nome = nome;
        this.destricao = descricao;
        this.poder = poder;
        this.resistencia = resistencia;
    }
    
    public void MostrarInfoArma(){
        System.out.println("Nome: "+nome);
        System.out.println("Descrição: "+destricao);
        System.out.println("Poder: "+poder);
        System.out.println("Resistência: "+resistencia);
    }
    
}
