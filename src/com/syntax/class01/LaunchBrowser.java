package com.syntax.class01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","Driver/chromedriver.exe");
        //setting the property to use chrome driver.  make sure to use .exe for windows

        WebDriver driver=new ChromeDriver(); //launches the browser

        driver.get("http://www.google.com");
        String url=driver.getCurrentUrl();
        System.out.println(url);
        String title=driver.getTitle();
        System.out.println(title);
        driver.quit();


    }
}
