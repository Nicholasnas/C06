
import java.util.Scanner;

public class Cliente {
    public String nome;
    public long cpf;
    public Computador compras[];
    public int qtdCompras;

    public Cliente(String nome, long cpf) {
        this.nome = nome;
        this.cpf = cpf;
        this.qtdCompras = 0;
    }

    public void comprarComputador(Computador computadores []){
        int escolha;
        Scanner entrada = new Scanner(System.in);
        compras = new Computador[computadores.length];
        
        while (true) { 
            System.out.println("--- Computadores Disponiveis em promoções ---");
            System.out.println("Escolha o computador que deseja comprar");
            for (int i = 0; i < computadores.length; i++){
                if (computadores[i].disponivel){
                    System.out.println("Promoção " +(i+1));
                    computadores[i].mostrarPcConfigs();
                }
            }
            // Estrutura de controle para computadores ja escolhidos
            System.out.println("Qual promocao deseja comprar? (0 para sair)");
            escolha = entrada.nextInt();
            System.out.println("Você escolheu o computador: " + escolha);
            System.out.println("O produto foi adicionado ao carrinho!");

            if (escolha == 0){
                System.out.println("Obrigado pela compra, " + nome + "!");
                System.out.println("Computadores comprados: ");
                for (Computador computador : compras){
                    if (computador != null){
                        computador.mostrarPcConfigs();
                    }
                }
                System.out.println("Total da compra: R$" + calculaTotalCompra());
                break;
            }

            if (escolha < 1 || escolha > computadores.length || !computadores[escolha-1].disponivel){
                System.out.println("Escolha inválida ou computador já comprado. Tente novamente.");
                continue;
            }
            computadores[escolha-1].disponivel = false;
            compras[qtdCompras] = computadores[escolha-1];
            qtdCompras++;
            
            System.out.println("Você comprou o computador: " + computadores[escolha-1].marca);
            System.out.println("O preço do computador é: " + computadores[escolha-1].preco);
            
        }
        entrada.close();

    }

    public float calculaTotalCompra(){
        float total = 0;
        for(Computador computador : compras){
            if (computador != null){
                total += computador.preco;
            }
        }
        return total;
    }
}
