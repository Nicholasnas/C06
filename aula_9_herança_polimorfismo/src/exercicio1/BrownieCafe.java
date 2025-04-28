package exercicio1;

public class BrownieCafe extends Brownie {

    public BrownieCafe(String nome, double preco, String sabor, String tipoCafe) {
        super(nome, preco, sabor);

    }

    public void addCafe(){
        System.out.println(this.nome + " adicionado ao carrinho de compras com café."); 
    }
}

