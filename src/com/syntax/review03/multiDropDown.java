package com.syntax.review03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class multiDropDown {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demoqa.com/select-menu");


        WebElement mDD=driver.findElement(By.xpath("//select[@id='cars']"));
        //check if the drop down is multi-select or not
        Select select=new Select(mDD);
        boolean isMultiple=select.isMultiple();
        System.out.println("Dropdown is multi-select: "+isMultiple);

        select.selectByIndex(0);

        select.selectByVisibleText("Opel");

        select.selectByValue("saab");

        select.deselectByVisibleText("Opel");


    }
}
