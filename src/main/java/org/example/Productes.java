package org.example;

// write the automation  program for given https://demo.nopcommerce.com/ website as per Requirements
// first go to the HomePage
//Hover the mouse in computer categories
//Then select the Desktop option
//Under this option  print Three item name


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

// Create a Product Class

public class Productes
{
    //In Java, the method is a collection of statements that performs a specific task or operation.
    // It is widely used because it provides reusability of code means that write once and use it many times.
    // It also provides easy modification. Each method has its own name by which it is called.
    // so our automation programme we need driver who can perform automatically.
    //here we are using Chrome browser so we copy chromedriver in to our one of the package which is created by us.
    //driver is a variable


    protected static WebDriver driver;

    //write a main method for performing the automation  task

    public static void main(String[] args)
    {
        //write code for java selenium access  our chromedriver for automation
        //pre define line for access "webdriver.chrome.driver"
        //it is path line where we copy and put our chrome driver "src/test/java/Driver/chromedriver.exe"

        System.setProperty("webdriver.chrome.driver","src/test/java/Driver/chromedriver.exe");

        //driver = new ChromeDriver(); WebDriver is an interface and all the methods which are declared in Webdriver interface are implemented by respective driver class.

        driver = new ChromeDriver();

        //To manage browser in Selenium, you need to call the manage()
        //The window object represents an open window in a browser.
        //To maximize browser in Selenium, you need to call the maximize()

        driver.manage().window().maximize();

        //open the home page of website
        //get() It is responsible for loading the page and waits until the page has finished loading.

        driver.get("https://demo.nopcommerce.com/");

        //findElement: A command used to uniquely identify a web element within the web page by inspect the particular location
        //The XPath function is a built-in function of selenium webdriver which is used to locate elements based on text of a web element top described a location.
        //it is unique location "//ul[@class='top-menu notmobile']/li[1]/a" for particular path here it is COMPUTER
        //click() method to help you perform various mouse-based operations for your web-application.

        driver.findElement(By.xpath("//ul[@class='top-menu notmobile']/li[1]/a")).click();

        //write the line for perform the automation for Desktop Categories

        driver.findElement(By.xpath("//ul[@class='sublist']/li[1]/a")).click();

        //write the line for the product item no 1 location.
        //The getText() method returns the innerText of an element, that is the text which is visible on the page along with its sub-elements.
        // Inner text is the text that is between the opening and closing tags.

        String a1 = driver.findElement(By.xpath("//div[@class=\"item-grid\"]/div[1]//h2/a")).getText();

        // write the line for the product item no 2 location.

        String a2 = driver.findElement(By.xpath("//div[@class=\"item-grid\"]/div[2]//h2/a")).getText();

        // write the line for the product item no 3 location.

        String a3 = driver.findElement(By.xpath("//div[@class=\"item-grid\"]/div[3]//h2/a")).getText();

        //quit() method closes all browser windows and ends the WebDriver session.

        //driver.quit();

        // write a line for print out into the console area

        System.out.println("Product Item No:1\t" + a1);
        System.out.println("Product Item No:2\t" + a2);
        System.out.println("Product Item No:3\t" + a3);

    }

}
