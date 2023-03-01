package Homework1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locator_googlechrome {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Softwaretesting\\Driver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.nopcommerce.com/");
        driver.findElement(By.className("ico-login")).click();
        driver.findElement(By.className("email")).sendKeys("patelviraj695@gmail.com");
        driver.findElement(By.id("Password")).sendKeys("ifjre94585");
        driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/div[1]/div[2]/form/div[3]/button")).click();
    }
}
