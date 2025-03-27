


public class Main{
    public static void main(String[] args){
        Cliente cliente = new Cliente("joao");
      
        Conta conta = new Conta("João", 123, cliente);
        conta.depositar(1000);
        conta.sacar(200);
        conta.showSaldo();

        conta.setSaldo(2000);
        conta.showSaldo();

    }
}