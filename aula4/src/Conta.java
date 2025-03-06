public class Conta {
    float saldo;
    float limite;
    String cliente;
    int numDaConta;
    public Conta(String cliente, int numDaConta){
        this.cliente = cliente;
        this.numDaConta = numDaConta;
        this.saldo = 0;
        this.limite = 100;
    }

    public void sacar(float valor){
        if(this.saldo > valor){
            this.saldo -= valor;
        }
        else{
            System.out.println("Saldo insuficiente!");
        }
    }
    public void depositar(float valor){
        this.saldo += valor;
    }

    public void transferir(Conta destino, float valor){
        if(this.saldo > valor){
            this.saldo -= valor;
            destino.depositar(valor);
        }
        else{
            System.out.println("Saldo insuficiente!");
    }
    }
}
    
