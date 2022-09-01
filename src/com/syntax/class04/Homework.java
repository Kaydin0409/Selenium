package com.syntax.class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Homework {
    /*
    Task
    Open chrome browser
    Go to "http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login"
    Enter valid username and password (username - Admin, password - Hum@nhrm123)
    Click on login button
    Then verify Syntax Logo is displayed.
     */
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","Driver/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");
        driver.manage().window().maximize();
        WebElement userName=driver.findElement(By.cssSelector("input#txtUsername"));
        userName.sendKeys("Admin");
        WebElement password=driver.findElement(By.cssSelector("input[name^='txtPassword']"));
        password.sendKeys("Hum@nhrm123");
        Thread.sleep(2000);
        WebElement loginButton=driver.findElement(By.cssSelector("input.button"));
        loginButton.click();
        Thread.sleep(2000);
        WebElement syntaxLogo=driver.findElement(By.cssSelector("img[alt^='Orange']"));
        if(!syntaxLogo.isDisplayed()){
            System.out.println("The logo is not displayed");
        }else{
            System.out.println("The syntax logo is visible");
        }
        driver.close();


    }
}
