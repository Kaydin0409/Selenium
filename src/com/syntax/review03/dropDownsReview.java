package com.syntax.review03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class dropDownsReview {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.facebook.com");
        WebElement selectNewAccount=driver.findElement(By.partialLinkText("Create new"));
        selectNewAccount.click();
        Thread.sleep(1000);

        WebElement days= driver.findElement(By.id("day")); //using select class we are only using 1 element with select tag
        Select select=new Select(days);
        List<WebElement> dayOptions=select.getOptions();
       /* for(WebElement day:dayOptions){
            System.out.println(day.getText());
        }  //prints out all day options*/

        int size = dayOptions.size();

       /* for(int i=0; i<size; i++){
            System.out.println(dayOptions.get(i).getText());
            select.selectByIndex(i);
            Thread.sleep(2000);
        }*/

        select.selectByIndex(3); //day 4 because indexing starts at 0

        select.selectByValue("22"); //selects day 22

        select.selectByVisibleText("7"); //selects day 7

        driver.quit();

    }
}
