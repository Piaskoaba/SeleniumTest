package AccesModifiersDziedziczenie;

public class ProductPage extends BasePage{   //extends - dziedziczenie - rozszeza klase BasePage
    // mozna dziedziczyc tylko po jednej klasie

    public String ProductName;
    public String productPrice;

    protected void addToCart(){
        BasePage basePage = new BasePage();
        basePage.searchForProduct(" product: ");
        System.out.println(" Product added to cart ");
    }
}

