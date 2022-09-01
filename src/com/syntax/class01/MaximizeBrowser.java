package com.syntax.class01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MaximizeBrowser {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","Driver/chromedriver.exe");

        WebDriver driver=new ChromeDriver();

        driver.navigate().to("https://www.amazon.com");
        driver.manage().window().maximize(); //maximize is most common
        //driver.manage().window().fullscreen();
    }
}
