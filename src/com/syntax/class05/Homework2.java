package com.syntax.class05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class Homework2 {
    /*
    Go to facebook sign up page
    Fill out the whole form
    Click signup
     */
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        String url = "https://www.facebook.com";
        driver.get(url);
        WebElement selectNewAccount = driver.findElement(By.partialLinkText("Create new"));
        selectNewAccount.click();
        Thread.sleep(1000);
        WebElement firstName = driver.findElement(By.cssSelector("input[aria-label='First name']"));
        firstName.sendKeys("Kel");
        WebElement lastName = driver.findElement(By.cssSelector("input[name='lastname']"));
        lastName.sendKeys("Bond");
        WebElement mobileNumber = driver.findElement(By.cssSelector("input[name='reg_email__']"));
        mobileNumber.sendKeys("555-423-7755");
        WebElement password = driver.findElement(By.id("password_step_input"));
        password.sendKeys("password123");
        WebElement months = driver.findElement(By.xpath("//select[@id='month']"));
        Select select = new Select(months);
        select.selectByValue("8");
        WebElement days=driver.findElement(By.xpath("//select[@id='day']"));
        select=new Select(days);
        select.selectByVisibleText("13");
        WebElement years=driver.findElement(By.xpath("//select[@id='year']"));
        select=new Select(years);
        select.selectByVisibleText("1989");
       /* List<WebElement> genders=driver.findElements(By.xpath("input[class='_8esa']"));
        System.out.println(genders.size());
        for(WebElement gender:genders){
            String selectGender=gender.getAttribute("value");
            if(selectGender.equals("1")){
                gender.click();
                break;
            }
        }*/
        WebElement female= driver.findElement(By.xpath("//input[@value='1']"));
        female.click();
    }
}
