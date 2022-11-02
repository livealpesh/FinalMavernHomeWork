package org.example;

import org.openqa.selenium.By;
// import web drive
import org.openqa.selenium.WebDriver;
//import chrome driver
import org.openqa.selenium.chrome.ChromeDriver;

public class HomePageCategories
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
        String a1 = driver.findElement(By.xpath("//ul[@class='top-menu notmobile']/li[1]/a")).getText();
        //use for in console print
        System.out.println("First Category:\t"  + a1);
        // use xpath locator
        String a2 = driver.findElement(By.xpath("//ul[@class='top-menu notmobile']/li[2]/a")).getText();
        // use for in console print

        System.out.println("Second Category:\t" + a2);
        // use xpath locator
        String a3 = driver.findElement(By.xpath("//ul[@class='top-menu notmobile']/li[3]/a")).getText();
        // use for in console print

        System.out.println("Third Category:\t"  + a3);
        // use xpath locator
        String a4 = driver.findElement(By.xpath("//ul[@class='top-menu notmobile']/li[4]/a")).getText();
        // use for in console print

        System.out.println("Fourth Category:\t" + a4);
        // use xpath locator
        String a5 = driver.findElement(By.xpath("//ul[@class='top-menu notmobile']/li[5]/a")).getText();
        // use for in console print

        System.out.println("Fifth Category:\t"  + a5);
        // use xpath locator
        String a6 = driver.findElement(By.xpath("//ul[@class='top-menu notmobile']/li[6]/a")).getText();
        // use for in console print

        System.out.println("Sixth Category:\t"  + a6);
        // use xpath locator
        String a7 = driver.findElement(By.xpath("//ul[@class='top-menu notmobile']/li[7]/a")).getText();
        // use for in console print

        System.out.println("Seventh Category:\t" + a7);

        driver.quit();

    }
}
