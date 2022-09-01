package com.syntax.review04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Frames {
    public static String url="https://chercher.tech/practice/frames";
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(url);

        driver.switchTo().frame("frame1");
        WebElement topic = driver.findElement(By.id("topic"));
        System.out.println(topic.getText());

        driver.switchTo().defaultContent();

        driver.switchTo().frame(1);

        WebElement animals=driver.findElement(By.xpath("//select[@id='animals']"));

        Select select=new Select(animals);
        select.selectByVisibleText("Big Baby Cat");

        driver.switchTo().defaultContent();

        driver.switchTo().frame("frame1");
        driver.switchTo().frame("frame3");
        WebElement checkBox=driver.findElement(By.xpath("//input[@type='checkbox']"));
        checkBox.click();




    }
}
