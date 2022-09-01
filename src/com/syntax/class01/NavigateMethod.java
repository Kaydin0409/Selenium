package com.syntax.class01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateMethod {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","Driver/chromedriver.exe");

        WebDriver driver=new ChromeDriver();
        //method chaining
        driver.navigate().to("http://www.google.com");
        driver.get("http://www.facebook.com");
        driver.navigate().back();
        driver.navigate().forward();
        Thread.sleep(4000); //pause the execution for 2 seconds
        driver.navigate().refresh();

        driver.close(); //will close the current tab
        //driver.quit(); will close the whole browser (all tabs)

    }
}
