public class Main {
    public static void main(String[] args) {
        Conta conta_joao = new Conta(
            "jooa", 1234
        );
        conta_joao.depositar(1000);
        conta_joao.sacar(500);
        System.out.println("Saldo joao depois: "+conta_joao.saldo);
    }
}
