package com.syntax.class05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class Homework33 {
    /*
  Go to ebay.com
  get all the categories and print them in the console
  select Computers/Tables & Networking
  click on search
  verify the header
   */
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        String url = "https://www.ebay.com/";
        driver.get(url);

        WebElement categories= driver.findElement(By.xpath("//select[@class='gh-sb ']"));
        Select select=new Select(categories);
        List<WebElement> allCategories=select.getOptions();
        System.out.println(allCategories);
        select.selectByVisibleText("Computers/Tablets & Networking");

        WebElement searchButton=driver.findElement(By.id("gh-btn"));
        searchButton.click();


    }
}
