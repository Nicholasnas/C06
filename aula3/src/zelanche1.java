
import java.util.Scanner;

public class zelanche1{
    public static void main(String [] args){
        Scanner entrada = new Scanner(System.in);

        System.out.print("Entre com o lanche 1: ");
        int lanche1 = entrada.nextInt();
        System.out.print("Entre com o lanche 2: ");
        int lanche2 = entrada.nextInt();
        System.out.print("Entre com o lanche 3: ");
        int lanche3 = entrada.nextInt();
        entrada.close();

        int total = lanche1 + lanche2 + lanche3;
        float media = (float) total/3;
        if(total <= 0){
            System.out.println("Como mais lanche!");
        }
        else{
            System.out.println("Coma uma sobremessa!");
        }

        System.out.println("O total de lanches é: " +total);
        System.out.println("A média de lanches é: " +media);

    }
}