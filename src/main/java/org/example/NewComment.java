package org.example;

import org.openqa.selenium.By;
// import web drive
import org.openqa.selenium.WebDriver;
//import chrome driver
import org.openqa.selenium.chrome.ChromeDriver;

public class NewComment
{
    public static WebDriver driver;

    public static void main(String[] args)
    {
        // calling chrome web driver

        System.setProperty("webdriver.chrome.driver","src/test/java/Driver/chromedriver.exe") ;
        driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://demo.nopcommerce.com/");
        // use xpath locator

        driver.findElement(By.xpath("//div[@class=\"news-item\"]/div[3]/a[@href=\"/nopcommerce-new-release\"]")).click();
        //use class locator

        driver.findElement(By.className("enter-comment-title")).sendKeys("Alpesh Panchal");
        //use class locator

        driver.findElement(By.className("enter-comment-text")).sendKeys("Excellent Update");
        //use class locator

        driver.findElement(By.className("buttons")).click();

        // for getting text

        String regMsg = driver.findElement(By.className("result")). getText();

        // for printing in console

        System.out.println("confirm massage for posting a Comment:\t " + regMsg);

        driver.quit();


    }


}
