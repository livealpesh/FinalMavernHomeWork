package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewComment
{
    public static WebDriver driver;

    public static void main(String[] args)
    {
        System.setProperty("webdriver.chrome.driver","src/test/java/Driver/chromedriver.exe") ;
        driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://demo.nopcommerce.com/");

        driver.findElement(By.xpath("//div[@class=\"news-item\"]/div[3]/a[@href=\"/nopcommerce-new-release\"]")).click();

        driver.findElement(By.className("enter-comment-title")).sendKeys("Alpesh Panchal");

        driver.findElement(By.className("enter-comment-text")).sendKeys("Excellent Update");

        driver.findElement(By.className("buttons")).click();

        String regMsg = driver.findElement(By.className("result")). getText();

        System.out.println("confirm massage for posting a Comment:\t " + regMsg);

        driver.quit();


    }


}
