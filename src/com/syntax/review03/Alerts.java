package com.syntax.review03;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://syntaxprojects.com/javascript-alert-box-demo.php");

        //click on alert
        WebElement simpleAlert=driver.findElement(By.xpath("//button[@onclick='myAlertFunction()']"));
        simpleAlert.click();
        Alert alertX=driver.switchTo().alert();
        Thread.sleep(2000);
        alertX.accept();
        //simple alert you only accept.  Confirmation alert you either do alert.accept() or alert.dismiss()



    }
}
