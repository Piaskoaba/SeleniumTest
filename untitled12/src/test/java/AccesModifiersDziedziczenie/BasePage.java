package AccesModifiersDziedziczenie;

public class BasePage{

    String title;
    String url;
    String userName;

    void goTo(String pageUrl) {
        System.out.println("Going to page: ");
    }
    void searchForProduct(String product){

    System.out.println("Searching for product" + product);
    }
}
