package com.syntax.class06;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Homework1 {
    /*
       Navigate to https://syntaxprojects.com/bootstrap-iframe.php
       verify the header text Sorry, We Couldn't Find Anything For “Asksn” is displayed
       verify enroll today button is enabled
     */
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","Driver/chromedriver.exe");
        WebDriver driver=new ChromeDriver();

        String URL="https://syntaxprojects.com/bootstrap-iframe.php";
        driver.get(URL);
        driver.switchTo().frame("FrameOne");
        WebElement header= driver.findElement(By.className("heading-13"));
        if(header.isDisplayed()){
            System.out.println("The Text of the header is "+header.getText());
        }else{
            System.out.println("The mentioned header is not displayed");
        }
        driver.switchTo().defaultContent();
        driver.switchTo().frame("FrameTwo");
        WebElement enrollTodayButton=driver.findElement(By.xpath("//p[@class='paragraph']/following-sibling::a"));
        if(enrollTodayButton.isEnabled()){
            System.out.println("Test passed: enroll button is enabled");
        }else{
            System.out.println("Test failed: enroll button disabled");
        }




    }

}
