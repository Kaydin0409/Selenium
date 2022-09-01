package com.syntax.review02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathDemo {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","Driver/chromedriver.exe");
        WebDriver driver=new ChromeDriver();

        driver.get("https://demo.guru99.com/insurance/v1/register.php");

        WebElement surname=driver.findElement(By.xpath("/html/body/div[3]/form/div[2]/div[1]/input"));
        surname.sendKeys("Sadiq");
        WebElement firstName=driver.findElement(By.xpath("//input[@id='user_firstname']"));
        firstName.sendKeys("Moazzam");
        WebElement dateOfBirth=driver.findElement(By.xpath("//label[text()='Date of Birth']"));
        System.out.println(dateOfBirth.getText());
        WebElement licence=driver.findElement(By.xpath("//label[contains(text(),'Licence Period')]"));
        System.out.println(licence.getText());
        WebElement radioButton=driver.findElement(By.xpath("//label[text()='Full']/following-sibling::input"));
        radioButton.click();
        WebElement phoneNumber=driver.findElement(By.cssSelector("input#user_phone"));
        phoneNumber.sendKeys("4231115555");
        WebElement address=driver.findElement(By.cssSelector("input[id*='attributes_street']"));
        address.sendKeys("pakistan");

        driver.quit();
    }
}
