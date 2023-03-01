package Homework1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Locator_firefox {
    public static void main(String[] args) {
        System.setProperty("webdriver.gecko.driver", "C:\\Softwaretesting\\Driver\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.get("https://demo.nopcommerce.com/");
        driver.findElement(By.className("ico-login")).click();
        driver.findElement(By.id("Email")).sendKeys("patelviraj695@gmail.com");
        driver.findElement(By.className("password")).sendKeys("dke848dj");
        driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/div[1]/div[2]/form/div[3]/button")).click();

    }
}
