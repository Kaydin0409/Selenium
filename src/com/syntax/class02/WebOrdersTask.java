package com.syntax.class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebOrdersTask {
    /**
            * Task
 * Navigate to http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx
            * Login
 * Get title and verify
 * logout
 * close the browser
 */

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","Driver/chromedriver.exe");

        WebDriver driver=new ChromeDriver();

        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx");
        driver.findElement(By.className("txt")).sendKeys("Tester");
        driver.findElement(By.id("ctl00_MainContent_password")).sendKeys("test");
        driver.findElement(By.id("ctl00_MainContent_login_button")).click();
        String title=driver.getTitle();
        String expectedTitle="Web Orders";
        if(expectedTitle.equals(title)){
            System.out.println("The title is correct");
        }else{
            System.out.println("The title is incorrect");
        }
        driver.findElement(By.linkText("Logout")).click();

        driver.quit();

    }
}
