package exercicio1;

public class Main {
    public static void main(String[] args) {
        Brownie brownie1 = new Brownie("Brownie de Chocolate", 10.0, "Chocolate");
        BrownieCafe brownieCafe1 = new BrownieCafe("Brownie de Café", 12.0, "Café", "Expresso");
        BrownieNutella brownieNutella1 = new BrownieNutella("Brownie de Nutella", 15.0, "Nutella");

        brownie1.addCarrinhoCompras();
        brownieCafe1.addCarrinhoCompras();
        brownieNutella1.addCarrinhoCompras();

    }
}
