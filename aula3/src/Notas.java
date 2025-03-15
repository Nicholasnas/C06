
import java.util.Scanner;

public class Notas {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Entre com a sua nota NPA: ");
        float npa = entrada.nextFloat();

        if (npa < 60) {
            // Fazer np3
            System.out.print("Entre com a nota da NP3: ");
            float np3 = entrada.nextFloat();
            float nota_final = (np3 + npa) / 2;

            if (nota_final >= 50) {
                System.out.println("Parabens está aprovado!");
            } else {
                System.out.println("Você está reprovado!");
            }

        } else {
            System.out.println("Parabens está aprovado!");
        }
        entrada.close();

    }

}
