package com.syntax.class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatingElements {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","Driver/chromedriver.exe");

        WebDriver driver=new ChromeDriver();
        driver.get("http://www.fb.com");
        driver.findElement(By.id("email")).sendKeys("syntax@gmail.com");
        driver.findElement(By.id("pass")).sendKeys("syntax123");
        driver.findElement(By.name("login")).click();
        //driver.findElement(By.linkText("Forgot password?")).click();
        driver.findElement(By.partialLinkText("Forgot")).click();

    }
}
