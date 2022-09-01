package com.syntax.class06;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Homework11 {
    /*
     Navigate to https://syntaxprojects.com/bootstrap-iframe.php
     verify the header text Sorry, We Couldn't Find Anything For “Asksn” is displayed
     verify enroll today button is enabled
   */
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        String URL = "https://syntaxprojects.com/bootstrap-iframe.php";
        driver.get(URL);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        driver.switchTo().frame("FrameOne");
        WebElement header=driver.findElement(By.xpath("//h1[@class='heading-13']"));
        String headerText=header.getText();
        if(header.isDisplayed()){
            System.out.println("Header is displayed");
            if(headerText.equals("Sorry, We Couldn't Find Anything For “Asksn”")){
                System.out.println("Header text is displaying the correct text: "+headerText);
            }
        }else{
            System.out.println("Header with text: "+headerText+" is not displayed");
        }

        driver.switchTo().defaultContent();
        driver.switchTo().frame("FrameTwo");
        WebElement enrollTodayButton=driver.findElement(By.xpath("//p[@class='paragraph']/following-sibling::a"));
        if(enrollTodayButton.isEnabled()){
            System.out.println("Enroll Today Button is enabled");
        }else{
            System.out.println("Enroll Today Button is not enabled");
        }


    }
}
