package com.syntax.class06;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AuthenticationAlerts {
    public static String url = "https://admin:admin@the-internet.herokuapp.com/basic_auth";
    //username:password@ must be entered before url to access login for authentication alert
    //admin:admin@

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
    }
}
