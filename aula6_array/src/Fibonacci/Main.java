package Fibonacci;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int fib[] = new int[11];
        Scanner entrada = new Scanner(System.in);
        System.out.println("Entre com o index para ser calculado: ");
        int num = entrada.nextInt();

        entrada.close();

        // 1 1 2 3 5 8 13 21
        // 0 1 2 3 4 5  6  7

        fib[0] = 1;
        fib[1] = 1;

        for(int i=2; i <= fib.length -1; i++){
            fib[i] = fib[i-1] + fib[i-2];
        } 
        System.out.println("Fibonacci de x: " +fib[num]);

    }
    
}
