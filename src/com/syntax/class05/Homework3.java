package com.syntax.class05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.Iterator;
import java.util.List;

public class Homework3 {
    /*
    Go to ebay.com
    get all the categories and print them in the console
    select Computers/Tables & Networking
    click on search
    verify the header
     */
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","Driver/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        String url="https://www.ebay.com/";
        driver.get(url);
        WebElement categories=driver.findElement(By.id("gh-cat"));
        Select select=new Select(categories);
        List<WebElement> allCategories=select.getOptions();
        Iterator<WebElement> it= allCategories.iterator();
        while(it.hasNext()){
            WebElement categoryDD=it.next();
            String catText= categoryDD.getText();
            System.out.println(catText);
        }
        select.selectByValue("58058");
        WebElement search=driver.findElement(By.xpath("//input[@value='Search']"));
        search.click();
        WebElement header=driver.findElement(By.xpath("//span[contains(text(),'Computers')]"));
        System.out.println("The header is "+header.getText());

    }
}
