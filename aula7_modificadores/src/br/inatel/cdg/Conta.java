package src.br.inatel.cdg;

public class Conta {
    private float saldo;
    private int numero;
    private float limite;
    private Cliente clientes [];

    public Conta(int numero, Cliente titular) {
        setClientes(new Cliente[3]);
        this.numero = numero;
        this.saldo = 0;
        this.limite = 0;
    }
    public float getSaldo(){
        return this.saldo;
    }
    public void setSaldo(float saldo){
        this.saldo = saldo;
    }
    public void setClientes(Cliente[] clientes) {
        this.clientes = clientes;
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