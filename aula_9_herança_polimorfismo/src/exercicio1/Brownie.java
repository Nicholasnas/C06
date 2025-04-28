
package exercicio1;

public class Brownie{

    protected  String nome;
    protected  double preco;
    protected String sabor;

    public Brownie(String nome, double preco, String sabor){
        this.nome = nome;
        this.preco = preco;
        this.sabor = sabor;
    }
    public void addCarrinhoCompras(){
        System.out.println("Adicionando brownie " + nome + " ao carrinho de compras.");
    }

    public void calcularValorTotalCompras(){
        System.out.println("O valor total da compra de um " +nome+ ": " +preco);
    }
}