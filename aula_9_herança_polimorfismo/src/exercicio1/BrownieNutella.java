package exercicio1;

public class BrownieNutella extends Brownie {

    public BrownieNutella(String nome, double preco, String sabor) {
        super(nome, preco, sabor);
    }

    public void addNutella() {
        System.out.println(this.nome + " adicionado ao carrinho de compras com Nutella.");
    }

}
