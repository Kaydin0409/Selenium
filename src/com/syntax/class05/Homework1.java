package com.syntax.class05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class Homework1 {
   /* Facebook dropdown verification
    Open chrome browser
    Go to "https://www.facebook.com"
    click on create new account
    Verify:
    month dd has 12 month options
    day dd has 31 day options
    year dd has 115 year options
    Select your date of birth
    Quit browser*/
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","Driver/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        String url="https://www.facebook.com";
        driver.get(url);
        WebElement selectNewAccount=driver.findElement(By.partialLinkText("Create new"));
        selectNewAccount.click();
        Thread.sleep(1000);
        WebElement months= driver.findElement(By.id("month"));
        Select select=new Select(months);
        List<WebElement> monthOptions=select.getOptions();
        int size=monthOptions.size();
        if(size==12) {
            System.out.println("There are "+size+" options in month dropdown");
        }else{
            System.out.println("The number of months does not match expected outcome");
        }
        select.selectByValue("8");

        WebElement days= driver.findElement(By.id("day"));
        select=new Select(days);
        List<WebElement> daysOptions=select.getOptions();
        size=daysOptions.size();
        if(size==31){
            System.out.println("There are "+size+" options in days dropdown");
        }else{
            System.out.println("The number of days does not match expected outcome");
        }
        select.selectByIndex(12);

        WebElement years=driver.findElement(By.id("year"));
        select=new Select(years);
        List<WebElement> yearOptions=select.getOptions();
        size=yearOptions.size();
        if(size==115){
            System.out.println("There are "+size+" options in year dropdown");
        }else{
            System.out.println("The number of years is different than expected.  It is showing "+size+" year options");
        }
        select.selectByVisibleText("1988");

        driver.quit();

    }
}
