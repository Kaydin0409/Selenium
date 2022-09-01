package com.syntax.class06;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Homework22 {
    /*
        Go to https://syntaxprojects.com/javascript-alert-box-demo.php
        click on each button and handle the alert accordingly

     */
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        String URL = "https://syntaxprojects.com/javascript-alert-box-demo.php";
        driver.get(URL);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        WebElement simpleAlertButton=driver.findElement(By.xpath("//button[@class='btn btn-default']"));
        simpleAlertButton.click();
        Alert alert=driver.switchTo().alert();
        alert.accept();

        WebElement comfirmAlertButton=driver.findElement(By.xpath("//p[@id='confirm-demo']/preceding-sibling::button"));
        comfirmAlertButton.click();
        alert=driver.switchTo().alert();
        alert.dismiss();

        WebElement promptAlertButton=driver.findElement(By.xpath("//button[text()='Click for Prompt Box']"));
        promptAlertButton.click();
        alert=driver.switchTo().alert();
        alert.sendKeys("Kellie");
        alert.accept();

        driver.quit();

    }
}

