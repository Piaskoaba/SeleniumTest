package AccesModifiersDziedziczenie;

public class BasePage{

    public String title;
    public String url;
    public String userName;

    public BasePage{}

    public void goTo(String pageUrl) {
        System.out.println("Going to page: ");
    }
    public void searchForProduct(String product){

    System.out.println("Searching for product" + product);
    System.out.println(" url ");
    }
}
