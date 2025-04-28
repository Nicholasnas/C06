import java.util.Random;
import java.util.Scanner;

public class Exercicio5 {
    public static void main(String [] args){
        Scanner entrada = new Scanner(System.in);
        Random rand = new Random();
        // Gerar um número aleatorio entre 0 a 25, nao inclui o 25
        // para gerar um numero entre 1 e 10 rand.nextInt(10)+1
        System.out.println("Adivinhe o número gerado pelo computador!");
        int numAleatorio = rand.nextInt(25+1);
 
        while (true) {
            System.out.print("Entre com um número entre 0 a 25: ");
            int numUser = entrada.nextInt();

            if(numAleatorio == numUser){
                System.out.println("Parabêns você acertou !!");
                break;
            }
            else{
                System.out.println("Você errou, entre com mais um número.");
            }
            
        }
        entrada.close();
    }
}
