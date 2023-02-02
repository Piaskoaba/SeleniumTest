import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1 {

    @Test
    public void demoTest() {


        int pierwszaZmienna = 2;
        int drugaZmienna = 4;
        int trzeciaZmienna = 2;

        boolean warunek = pierwszaZmienna == trzeciaZmienna;
        boolean warunek2 = 2==2;
        boolean warunek3 = pierwszaZmienna != trzeciaZmienna;

        boolean warunek4 = pierwszaZmienna < drugaZmienna;
        boolean warunek5 = pierwszaZmienna > trzeciaZmienna;
        boolean warunek6 = pierwszaZmienna <= trzeciaZmienna;
        boolean warunek7 = pierwszaZmienna >= trzeciaZmienna;

        boolean prawda =true;
        boolean falsz = false;

        boolean warunek8 = !prawda;
        boolean warunek9 = falsz && prawda; //koniunkcja
        boolean warunek10 = falsz || prawda; //alternatywa
        boolean warunek11 = falsz == prawda;
        boolean warunek12 = falsz != prawda;

        String pierwszaCzesc = "Na sniadanie";
        String drugaCzesc = " zjadłem dzisiaj";
        String trzeciaCzesc = "jajecnzice";

        String text = pierwszaCzesc + drugaCzesc + trzeciaCzesc;
        int liczba = 123;

        String textLiczba = text + liczba;
        boolean jablko = false;

        String textBoolean = text + jablko;
    }




    }


