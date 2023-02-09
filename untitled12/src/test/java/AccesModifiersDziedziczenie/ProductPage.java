package AccesModifiersDziedziczenie;

public class ProductPage extends BasePage {   //extends - dziedziczenie - rozszeza klase BasePage
    // mozna dziedziczyc tylko po jednej klasie

    public String ProductName;
    public String productPrice;

    protected ProductPage addToCart() {
        System.out.println("Produkt dodany do ksozkya");
        return null;
    }

    protected ProductPage setAmount(int amount) {
        System.out.println("Wybrano ilość: " + amount);
        return this;
    }

    protected void goToCart() {
        System.out.println(" Przejscie do koszyka");

    }
}