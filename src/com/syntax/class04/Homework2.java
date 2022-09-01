package com.syntax.class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.List;

public class Homework2 {
    /*
    TC 1: Amazon link count:
    Open chrome browser
    Go to "https://www.amazon.com/"
    Get all links
    Get number of links that has text
    Print to console only the links that has text
     */

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","Driver/chromedriver.exe");
        WebDriver driver=new ChromeDriver();

        driver.get("https://www.amazon.com");
        List<WebElement> allLinks=driver.findElements(By.tagName("a"));

        int numberOfLinks=0;
        for(WebElement links:allLinks){
            String linkText=links.getText();
            String fullLink=links.getAttribute("href");
            if(!linkText.isEmpty()){
                System.out.println(linkText+"      "+fullLink);
                numberOfLinks++;
            }

        }
        System.out.println("The number of links with text is: "+numberOfLinks);

    }


}
