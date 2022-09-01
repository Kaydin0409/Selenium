package com.syntax.class09;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class HandlingDynamicTables {
    public static String url = "http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx";

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(url);

        WebElement username=driver.findElement(By.className("txt"));
        username.sendKeys("Tester");
        WebElement password=driver.findElement(By.id("ctl00_MainContent_password"));
        password.sendKeys("test");
        driver.findElement(By.id("ctl00_MainContent_login_button")).click();

        List<WebElement> rows=driver.findElements(By.xpath("//table[@class='SampleTable']/tbody/tr"));
        for(int i=1; i<rows.size(); i++){  //start from 1 to not get header info
            String rowText = rows.get(i).getText();
            System.out.println(rowText);
            if(rowText.contains("FamilyAlbum")){   //since table is dynamic you want to do contains info
                List<WebElement> checkboxes=driver.findElements(By.xpath("//table[@class = 'SampleTable']/tbody/tr/td[1]"));
                checkboxes.get(i-1).click();  //checkboxes are indexed differently since header is 1 of the rows and there is no checkbox there
            }
        }

    }
}
