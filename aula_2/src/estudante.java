package aula2.src;
import java.util.Scanner;

public class estudante {
    public static void main(String[] args){
        Scanner Entrada = new Scanner(System.in);

        System.out.print("Entre com a nota da NPA: ");;
        float nota_npa = Entrada.nextFloat();

        if(nota_npa >= 60){
            System.out.println("Parabens voce foi aprovado!");
        }
        else{
            
        }
        Entrada.close();


    }
    
}
