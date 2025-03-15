package exercicio0;
public class Cantina {

    String nome;
    Salgado salgados[] = new Salgado[5];

    Cantina(String nome){
        this.nome = nome;
    }

    public void addSalgado(Salgado novoSalgado){
        // Adicionar no array
        for(int i=0; i < salgados.length; i++){
            if(salgados[i] == null){
                salgados[i] = novoSalgado;
                break;
            }
        }
    }

    public void mostrarInfo(){
        System.out.println("Salgadaria: " +nome);
        // System.out.println("Tem " +salgados.length+ " salgados.");
        for (Salgado sg: salgados){
            if(sg != null){
                System.out.println("Salgado: " +sg.nome);
            }
        }
    }
    
}
