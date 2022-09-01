package com.syntax.review03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class CheckBoxes {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://ironspider.ca/forms/checkradio.htm");

        //get all the checkboxes in a List
        List<WebElement> colorCheckboxes=driver.findElements(By.xpath("//input[@name='color']"));

        for(WebElement checkbox:colorCheckboxes){
            String color=checkbox.getAttribute("value");
            if(color.equalsIgnoreCase("purple")){
                checkbox.click();
            }
        }
        driver.quit();
    }
}
