import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1 {

    @Test
    public void demoTest() {
        byte number;
        number = 8;

        int intNumber=21;
        long longNumber = 123456L;
        float floatNumber = 123.67F;
        double doubleNumber = 888.63;
        boolean isTrue = false;
        char letterA = 'a';
        char alsoLetterA = '\u0061';
        System.out.println(letterA);
        String text ="Moja ulubiona książka to \"Władca Pierścieni\""; //Moja ulubiona książka to "Władca Pierścieni";
    }
}