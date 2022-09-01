package com.syntax.class06;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleFrames {
    public static void main(String[] args) {
        String url= "http://www.uitestpractice.com/Students/Switchto";
        System.setProperty("webdriver.chrome.driver","Driver/chromedriver.exe");
        WebDriver driver=new ChromeDriver();

        driver.get(url);
        driver.manage().window().maximize();

        driver.switchTo().frame(0); //first iframe found.
        WebElement textbox=driver.findElement(By.id("name"));
        textbox.sendKeys("Batch 13 4eva"); //now can type text in iframe text box
        driver.switchTo().defaultContent();  //now switching back to main webpage html

        WebElement alertButton=driver.findElement(By.id("alert"));
        alertButton.click();
        Alert alert=driver.switchTo().alert();
        alert.accept();
        /*when working with alerts you switch manually but once you are done with alerts, your focus is automatically
        regained to webpage.  But with frames once you are done with frames you must switch back manually */

        driver.switchTo().frame("iframe_a");
        textbox.clear(); //clears out textbox which contains Batch 13 4eva
        textbox.sendKeys("We are back to the frame");
        driver.switchTo().defaultContent();

        WebElement frameElement=driver.findElement(By.xpath("//iframe[@src='/Demo.html']"));
        driver.switchTo().frame(frameElement); //used webElement to navigate to frame this time
        textbox.clear();
        textbox.sendKeys("Hold your horses!!");
    }
}
