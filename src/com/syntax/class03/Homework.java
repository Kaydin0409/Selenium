package com.syntax.class03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Homework {

    /*
    Navigate to http://syntaxprojects.com
    Click on start practicing
    click on simple form demo
    enter any text on first text box
    click on show message
    quit the browser
     */

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","Driver/chromedriver.exe");

        WebDriver driver=new ChromeDriver();

        driver.get("http://syntaxprojects.com");
        driver.manage().window().maximize();
        WebElement startButton=driver.findElement(By.xpath("//a[text() =' Start Practising ']"));
        startButton.click();
        Thread.sleep(2000);
        WebElement simpleForm=driver.findElement(By.xpath("//a[text()='Simple Form Demo' and @class='list-group-item']"));
        simpleForm.click();
        WebElement enterMessage=driver.findElement(By.xpath("//input[contains(@placeholder,'Please enter')]"));
        enterMessage.sendKeys("Syntax");
        WebElement showMessage=driver.findElement(By.xpath("//button[starts-with(@onclick, 'showInput();')]"));
        showMessage.click();
        Thread.sleep(2000);
        driver.quit();





    }

}
