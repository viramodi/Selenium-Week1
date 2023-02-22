package Homework1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FIrefoxbrowser {
    public static void main(String[] args) throws InterruptedException{
        System.setProperty("webdriver.gecko.driver", "C:\\Softwaretesting\\Driver\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.get("https://demo.nopcommerce.com/");

    }
}
