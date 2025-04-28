
public class Main {
    public static void main(String[] args){
        Personagem p1 = new Personagem("Marcelo");
        Arma a1 = new Arma("katana", "arma japonesa", 70,80);
        p1.usarArma();
        p1.arma = a1;
        p1.arma.MostrarInfoArma();
        p1.usarArma();
        p1.TomarDano();
        p1.arma.MostrarInfoArma();
        p1.usarArma();
        p1.usarArma();
        p1.arma.MostrarInfoArma();

    }


}
