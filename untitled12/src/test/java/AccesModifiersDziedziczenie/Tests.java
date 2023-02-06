package AccesModifiersDziedziczenie;

import org.junit.jupiter.api.Test;

public class Tests {

@Test
public void productPriceTest(){

    ProductPage productPage = new ProductPage();
   productPage.goTo("jakis url");  //po .ctrl+spacja --->go to
   String price = productPage.productPrice;


   HomePage homePage = new HomePage();

}

}
