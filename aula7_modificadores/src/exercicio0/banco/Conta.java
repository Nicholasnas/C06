
public class Conta {
    private float saldo;
    private String nome;
    private int numero;
    private Cliente titular;
    private float limite;

    Conta(String nome, int numero, Cliente titular) {
        this.nome = nome;
        this.numero = numero;
        this.titular = titular;
        this.saldo = 0;
        this.limite = 0;
    }
    public float getSaldo(){
        return this.saldo;
    }
    public void setSaldo(float saldo){
        this.saldo = saldo;
    }
    
    void depositar(float valor) {
        System.out.println("Depósito realizado com sucesso!");
        this.saldo += valor;
    }
    void showSaldo() {
        System.out.println("Saldo: "+this.saldo);
    }

    void sacar(float valor) {
        if (this.saldo > valor) {
            System.out.println("Saque realizado com sucesso!");
            this.saldo -= valor;
        }
        else {
            System.out.println("Saldo insuficiente!");
        }
    }
}