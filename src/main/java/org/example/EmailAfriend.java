package org.example;

import org.openqa.selenium.By;
// import web drive
import org.openqa.selenium.WebDriver;
//import chrome driver
import org.openqa.selenium.chrome.ChromeDriver;

public class EmailAfriend
{
    public static WebDriver driver;

    public static void main(String[] args)
    {

        // calling chrome web driver

        System.setProperty("webdriver.chrome.driver","src/test/java/Driver/chromedriver.exe");
        driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://demo.nopcommerce.com/");
// use xpath locator

        driver.findElement(By.xpath("//div[@class=\"product-grid home-page-product-grid\"]/div[2]/div[2]/div/div//h2/a")).click();
// use xpath locator
        driver.findElement(By.xpath("//div[@class=\"overview-buttons\"]/div[3]")).click();
// use xpath locator
        driver.findElement(By.xpath("//input[@class=\"friend-email\"]")).sendKeys("alpeshpan123@gmail.com");
//use class locator
        driver.findElement(By.className("your-email")).sendKeys("alpeshpan123@gmail.com");
//use id locator
        driver.findElement(By.id("PersonalMessage")).sendKeys("hi");
//use class locator
        driver.findElement(By.className("buttons")).click();
// use xpath locator gor getting text
        String regMsg = driver.findElement(By.xpath("//div[@class=\"page-body\"]/form/div/ul/li")). getText();
// use for in console print
        System.out.println("Validation Messege: \t" + regMsg);


    }
}
