package com.syntax.review01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Basics {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","Driver/chromedriver.exe");
        WebDriver driver=new ChromeDriver();

       // driver.get("https://www.google.com"); waits for all elements to load before executing next line of code
     //   driver.navigate().to("https://www.google.com"); //does not wait for all elements to load before executing next line of code

        /*driver.get("https://syntaxprojects.com/index.php");
        WebElement button1=driver.findElement(By.linkText("Start Practising"));
        button1.click();
        driver.manage().window().maximize();
        Thread.sleep(3000);
        WebElement button2=driver.findElement(By.partialLinkText("Proceed"));
        button2.click();*/

        driver.get("https://www.syntaxprojects.com/index.php");
        // can search //a in dom to see if there are links and how many there are
        List<WebElement> allLinks=driver.findElements(By.tagName("a"));







    }
}
