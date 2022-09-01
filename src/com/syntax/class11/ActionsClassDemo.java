package com.syntax.class11;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActionsClassDemo {
    public static String url = "http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx";

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
    }
}
