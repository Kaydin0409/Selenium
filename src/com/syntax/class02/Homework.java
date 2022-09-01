package com.syntax.class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Homework {
    /*
navigate to https://parabank.parasoft.com/parabank/register.htm;jsessionid=B8DD31FF0AFEDBDF4454B27BBC5C05B0%22
fill out the form
click on register
close the browser

navigate to fb.com
click on create new account
fill up all the textboxes
click on sign up button
close the pop up
close the browser
     */
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","Driver/chromedriver.exe");

        WebDriver driver=new ChromeDriver();

        driver.get("https://parabank.parasoft.com/parabank/register.htm;jsessionid=B8DD31FF0AFEDBDF4454B27BBC5C05B0%22");
        WebElement firstName=driver.findElement(By.id("customer.firstName"));
        firstName.sendKeys("Kellie");
        WebElement lastName=driver.findElement(By.name("customer.lastName"));
        lastName.sendKeys("Aydin");
        WebElement address=driver.findElement(By.id("customer.address.street"));
        address.sendKeys("123 Bentley Parc");
        WebElement city=driver.findElement(By.name("customer.address.city"));
        city.sendKeys("Johnson City");
        WebElement state=driver.findElement(By.id("customer.address.state"));
        state.sendKeys("TN");
        WebElement zipCode=driver.findElement(By.id("customer.address.zipCode"));
        zipCode.sendKeys("37615");
        WebElement phoneNum=driver.findElement(By.xpath("//input[@name = 'customer.phoneNumber']"));
        phoneNum.sendKeys("423-123-4567");
        WebElement ssn=driver.findElement(By.name("customer.ssn"));
        ssn.sendKeys("123456789");
        WebElement userName=driver.findElement(By.id("customer.username"));
        userName.sendKeys("kaydin");
        WebElement password=driver.findElement(By.id("customer.password"));
        password.sendKeys("password");
        WebElement confirmPassword=driver.findElement(By.id("repeatedPassword"));
        confirmPassword.sendKeys("password");
        WebElement register=driver.findElement(By.xpath("//input[@type = 'submit']"));
        Thread.sleep(5000);
        register.click();
        driver.quit();
            }
}
