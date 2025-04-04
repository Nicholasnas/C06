package src.br.inatel.cdg;

import java.lang.instrument.ClassFileTransformer;

public class Main{
    public static void main(String[] args){
        Cliente cliente = new Cliente("joao",123456789);
        Cliente cliente2 - new Cliente('maria',987654321);
        Cliente cliente3 = new Cliente("jose", 123456789);
        Conta conta = new Conta(123, cliente);
        conta.depositar(1000);
        conta.sacar(200);
        conta.showSaldo();

        conta.setSaldo(2000);
        conta.showSaldo();

    }
}