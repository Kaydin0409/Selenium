package com.syntax.class06;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.sql.SQLOutput;

public class HandleAlerts {
    public static void main(String[] args) throws InterruptedException {
       String url= "http://www.uitestpractice.com/Students/Switchto";
       System.setProperty("webdriver.chrome.driver","Driver/chromedriver.exe");
       WebDriver driver=new ChromeDriver();

        driver.get(url);
        driver.manage().window().maximize();
        WebElement simpleAlertButton= driver.findElement(By.id("alert"));
        simpleAlertButton.click();
        Thread.sleep(2000);
        Alert simpleAlert=driver.switchTo().alert(); //Alert is an interface from Selenium
        simpleAlert.accept();

        WebElement confirmButton=driver.findElement(By.id("confirm"));
        confirmButton.click(); //then switch focus to alert
        Thread.sleep(2000);

        Alert confirmAlert=driver.switchTo().alert();
        String confirmAlertText=confirmAlert.getText();
        System.out.println(confirmAlertText); //prints Hello Alert that is in Alert browser window
        confirmAlert.dismiss(); //this clicks on cancel on confirm alert

        WebElement promptAlertButton=driver.findElement(By.id("prompt"));
        promptAlertButton.click();
        Alert promptAlert=driver.switchTo().alert();
        promptAlert.sendKeys("Don't replace my Chromedriver!!");
        Thread.sleep(2000);
        promptAlert.accept();

    }
}
