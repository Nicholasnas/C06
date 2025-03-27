package exercicio0;


public class Main {
    public static void main(String[] args){

        Cantina c1 = new Cantina("inatel");
    
        Salgado s1 = new Salgado("hamburger");
        Salgado s2 = new Salgado("Esfirra");
        Salgado s3 = new Salgado("Enroladinho");
    
    
        c1.addSalgado(s1);
        c1.addSalgado(s2);
        c1.addSalgado(s3);
    
        c1.mostrarInfo();
    }


}
