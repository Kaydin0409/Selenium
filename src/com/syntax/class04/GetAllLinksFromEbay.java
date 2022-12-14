package com.syntax.class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class GetAllLinksFromEbay {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","Driver/chromedriver.exe");
        WebDriver driver=new ChromeDriver();

        driver.get("https://www.ebay.com");
        driver.manage().window().maximize();

        List<WebElement> allLinks=driver.findElements(By.tagName("a"));
        System.out.println("Number of Links "+allLinks.size());
        for(WebElement link:allLinks){
            String linkText=link.getText();
            String fullLink=link.getAttribute("href");
            if(!linkText.isEmpty()) {
                System.out.println(linkText+"     "+fullLink);
            }
        }
        //links are stored in href attribute
    }
}
