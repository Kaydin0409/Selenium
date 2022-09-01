package com.syntax.class08;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaitTask2 {

    public static void main(String[] args) {
        /*
         *  navigate http://syntaxprojects.com/dynamic-elements-loading.php
         *  click on start button
         *  get the text
         *  print out in console
         */
            System.setProperty("webdriver.chrome.driver","Driver/chromedriver.exe");
            WebDriver driver=new ChromeDriver();

            String URL="http://syntaxprojects.com/dynamic-elements-loading.php";
            driver.get(URL);

        WebElement startButton=driver.findElement(By.id("startButton"));
        startButton.click();

        WebDriverWait wait=new WebDriverWait(driver,20);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h4[contains(text(),'Welcome')]")));

        WebElement welcomeMessage= driver.findElement(By.xpath("//*[contains(text(),'Welcome')]"));
        String text=welcomeMessage.getText();
        System.out.println(text);
    }
}
