package com.syntax.class06;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Homework2 {
    /*
        Go to https://syntaxprojects.com/javascript-alert-box-demo.php
        click on each button and handle the alert accordingly

     */
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","Driver/chromedriver.exe");
        WebDriver driver=new ChromeDriver();

        String URL="https://syntaxprojects.com/javascript-alert-box-demo.php";
        driver.get(URL);

        WebElement simpleAlert=driver.findElement(By.xpath("//button[@onclick='myAlertFunction()']"));
        simpleAlert.click();
        Alert alert=driver.switchTo().alert();
        alert.accept();
        Thread.sleep(2000);
        WebElement confirmAlert=driver.findElement(By.xpath("//button[@onclick='myConfirmFunction()']"));
        confirmAlert.click();
        driver.switchTo().alert();
        Thread.sleep(2000);
        alert.dismiss();
    }
}
