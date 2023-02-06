package AccesModifiersDziedziczenie;

public class ProductPage extends BasePage{   //extends - dziedziczenie - rozszeza klase BasePage
    // mozna dziedziczyc tylko po jednej klasie

    String ProductName;
    String productPrice;

    void addToCart() {
    System.out.println("Product added to cart");
    }
}

