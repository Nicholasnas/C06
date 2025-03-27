package aula5.Exercicio6;

public class Main {
    public static void main(String[] args){
        Piloto p1 = new Piloto("João", true);
        Piloto p2 = new Piloto("Carlos", false);

        Kart car1 = new Kart("ferrari", "100",150 );
        Kart car2 = new Kart("mclaren", "150", 150);

        car1.piloto = p1;
        car2.piloto = p2;
        
    }
    
}
