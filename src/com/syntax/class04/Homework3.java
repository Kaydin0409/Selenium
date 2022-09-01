package com.syntax.class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Homework3 {
    /*HRMS Application Negative Login:
    Open chrome browser
    Go to "http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login"
    Enter valid username
    Leave password field empty
    Click on login button
    Verify error message with text "Password cannot be empty" is displayed.*/

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","Driver/chromedriver.exe");
        WebDriver driver=new ChromeDriver();

        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");
        driver.manage().window().maximize();
        WebElement userName=driver.findElement(By.cssSelector("input#txtUsername"));
        userName.sendKeys("Admin");
        WebElement loginButton= driver.findElement(By.cssSelector("input[name='Submit']"));
        loginButton.click();
        WebElement errorMessage= driver.findElement(By.xpath("//span[contains(text(),'Password cannot')]"));
        if(errorMessage.isDisplayed()){
            System.out.println("Error message 'Password cannot be empty' is visible");
        }else{
            System.out.println("Error message 'Password cannot be empty' is not displayed");
        }

        driver.close();
    }
}
