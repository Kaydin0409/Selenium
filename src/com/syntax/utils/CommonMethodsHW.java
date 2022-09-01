package com.syntax.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class CommonMethodsHW {
    public static WebDriver driver;
    public static void openBrowserAndLaunchApplication(String url){
        System.setProperty("webdriver.chrome.driver","Driver/chromedriver.exe");
        driver=new ChromeDriver();
        driver.get(url);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    }

    public static void closeBrowser(){
        driver.quit();
    }
}
