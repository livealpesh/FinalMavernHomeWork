package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class EmailAfriend
{
    public static WebDriver driver;

    public static void main(String[] args)
    {
        System.setProperty("webdriver.chrome.driver","src/test/java/Driver/chromedriver.exe");
        driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://demo.nopcommerce.com/");

        driver.findElement(By.xpath("//div[@class=\"product-grid home-page-product-grid\"]/div[2]/div[2]/div/div//h2/a")).click();

        driver.findElement(By.xpath("//div[@class=\"overview-buttons\"]/div[3]")).click();

        driver.findElement(By.xpath("//input[@class=\"friend-email\"]")).sendKeys("alpeshpan123@gmail.com");

        driver.findElement(By.className("your-email")).sendKeys("alpeshpan123@gmail.com");

        driver.findElement(By.id("PersonalMessage")).sendKeys("hi");

        driver.findElement(By.className("buttons")).click();

        String regMsg = driver.findElement(By.xpath("//div[@class=\"page-body\"]/form/div/ul/li")). getText();

        System.out.println("Validation Messege: \t" + regMsg);


    }
}
