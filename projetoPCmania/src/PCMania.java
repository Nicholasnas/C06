import java.util.Scanner;

public class PCMania{

    public static void main(String[] args){
        // Criação de computadores
        Computador computadores[] = new Computador[3];

        computadores[0] = new Computador("Apple", 5400.00f, "macOS Sonoma", 64);
        computadores[1] =  new Computador("Samsung", 3000.00f,"Windows 11", 64);
        computadores[2] = new Computador("Dell", 2500.00f, "Ubuntu", 32);
        
        // Criação de hardwares para o computador 1
        Hardware hardware1 [] = new Hardware[3];
        hardware1[0] = new Hardware("Pentium core i3", 2200);
        hardware1[1] = new Hardware("Memoria Ram", 8);
        hardware1[2] = new Hardware("HD", 500);
        // Adicionando os hardwares ao computador 1
        computadores[0].setComponentes(hardware1);
        // Adicionando a memoria USB ao computador 1
        MemoriaUsb memoriaUsb1 = new MemoriaUsb("Pendrive", 16);
        computadores[0].setMemoriaUsb(memoriaUsb1);
        
        // Criação de hardwares para o computador 2
        Hardware hardware2 [] = new Hardware[3];
        hardware2[0] = new Hardware("Pentium core i5", 3370);
        hardware2[1] = new Hardware("Memoria Ram", 16);
        hardware2[2]= new Hardware("HD", 1000);
        // Adicionando os hardwares ao computador 2
        computadores[1].setComponentes(hardware2);
        // Adicionando a memoria USB ao computador 2
        MemoriaUsb memoriaUsb2 = new MemoriaUsb("Pendrive", 32);
        computadores[1].setMemoriaUsb(memoriaUsb2);

        // Criação de hardwares para o computador 3
        Hardware hardware3 [] = new Hardware[3];
        hardware3[0] = new Hardware("Pentium core i7", 4500);
        hardware3[1] = new Hardware("Memoria Ram", 32);
        hardware3[2] = new Hardware("HD", 2000);
        // Adicionando os hardwares ao computador 3
        computadores[2].setComponentes(hardware3);
        // Adicionando a memoria USB ao computador 3
        MemoriaUsb memoriaUsb3 = new MemoriaUsb("HD externo ", 1000);
        computadores[2].setMemoriaUsb(memoriaUsb3);


        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o nome do cliente: ");
        String nome = entrada.nextLine();
        System.out.println("Digite o CPF do cliente: ");
        long cpf = entrada.nextLong();
        Cliente cliente = new Cliente(nome, cpf);
    
        int matricula = 697;

        // Adicionando as promocoes
        computadores[0].setPreco(matricula);
        computadores[1].setPreco(matricula + 1234);
        computadores[2].setPreco(matricula + 5678);
        
        // Cliente comporando o computador
        cliente.comprarComputador(computadores);
        cliente.calculaTotalCompra();
        entrada.close();
                
       }

}