package com.syntax.class05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class Homework11 {
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
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","Driver/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        String url="https://www.facebook.com";
        driver.get(url);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        WebElement createAccountButton=driver.findElement(By.xpath("//a[contains(text(),'Create new')]"));
        createAccountButton.click();
        WebElement monthDropDown= driver.findElement(By.xpath("//select[@id='month']"));

        Select select=new Select(monthDropDown);
        List<WebElement> allMonths=select.getOptions();
        int noOfMonths=allMonths.size();
        if(noOfMonths==12){
            System.out.println("There are 12 months in the dropdown as expected");
        }else{
            System.out.println("There are "+noOfMonths+" months in the dropdown which does not match expected 115 options");
        }

        WebElement dayDropDown=driver.findElement(By.xpath("//select[@id='day']"));
        select=new Select(dayDropDown);
        List<WebElement> days=select.getOptions();
        int numOfDays=days.size();
        if(numOfDays==31){
            System.out.println("There are 31 days in the dropdown as expected");
        }else{
            System.out.println("There are "+numOfDays+" months in the dropdown which does not match expected");
        }

        WebElement yearDropDown=driver.findElement(By.xpath("//select[@id='year']"));
        select=new Select(yearDropDown);
        List<WebElement> allYears=select.getOptions();
        int noOfYears=allYears.size();
        if(noOfYears==115){
            System.out.println("There are 115 year options in the dropdown as expected");
        }else{
            System.out.println("There are "+noOfYears+" year options in the dropdown which does not match expected");
        }




    }
}
