package aula2.src;
import java.util.Scanner;

public class zelanche{
    public static void main(String[] args){
        // Inicializando a entrada de dados para ler os dados inseridos pelo usuario
        Scanner Entrada = new Scanner(System.in);
        System.out.print("Entre com o valor do primeiro lanche: ");
        int lanche1 = Entrada.nextInt();
        System.out.print("Entre com o valor do segundo lanche: ");
        int lanche2 = Entrada.nextInt();
        System.out.print("Entre com o valor do terceiro lanche: ");
        int lanche3 = Entrada.nextInt();

        Entrada.close(); // Encerrando a leitura de dados

        int total = lanche1 + lanche2 + lanche3;
        float media = (float) total/3;

        System.out.println("O total de lanches é: " +total);
        System.out.println("A média de lanches é: " +media);
    }
}