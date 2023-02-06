package AccesModifiers2ModyfDost;

import AccesModifiersDziedziczenie.BasePage;

public class ProductPage extends BasePage {

    public String ProductName;
    public String productPrice;

    protected void addToCart(){
        BasePage basePage = new BasePage();
        basePage.searchForProduct(" product: ");
        System.out.println(" Product added to cart ");
}
