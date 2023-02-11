package BankierTests;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestJava {

    @Test
    public void demoTest() {

        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://www.bankier.pl");


    }


}

