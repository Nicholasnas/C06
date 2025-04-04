
public class Computador{
    public String marca;
    public float preco;
    private SistemaOperacional sistemaOperacional;
    private Hardware componentes[];
    private MemoriaUsb memoriaUsb; // memoria é opcional 0 ou 1
    public boolean disponivel = true;

    public Computador(String marca, float preco, String nomeSistemaOperacional, int tipo){
        this.marca = marca;
        this.preco = preco;
        this.sistemaOperacional = new SistemaOperacional(nomeSistemaOperacional, tipo);
        this.componentes = new Hardware[3];

    }

    public void setComponentes(Hardware [] componentes){
        this.componentes = componentes;
    }

    public float getPreco(){
        return preco;
    }
    public void setPreco(float preco){
        this.preco = preco;
    }

    public void setMemoriaUsb(MemoriaUsb memoriaUsb){
        this.memoriaUsb = memoriaUsb;
    }
    public void setSistemaOperacional(SistemaOperacional sistemaOperacional){
        this.sistemaOperacional = sistemaOperacional;
    }
    

    public void mostrarPcConfigs(){
        System.out.println("--------------------------------------------------");
        System.out.println("Computador: " + marca);
        System.out.println("Preco: R$" + preco);
        System.out.println("Sistema Operacional: " +sistemaOperacional.nome+ " Tipo: (" + sistemaOperacional.tipo+ ")");
        System.out.println("Hardwares: ");
        
        for(Hardware componente : componentes){
            System.out.println(componente.nome+ " de capacidade: " + componente.capacidade);
        }

        if (memoriaUsb != null){
            System.out.println("Acompanha USB: " + memoriaUsb.nome+ " de " + memoriaUsb.capacidade);
        }
        else{
            System.out.println("Nenhuma memoria USB conectada");
        }
        System.out.println("--------------------------------------------------");
    }
}