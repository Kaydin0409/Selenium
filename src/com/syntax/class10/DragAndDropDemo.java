package com.syntax.class10;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

public class DragAndDropDemo {
    public static String url = "https://jqueryui.com/droppable/";

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        WebElement draggable=driver.findElement(By.id("draggable"));
        WebElement droppable=driver.findElement(By.id("droppable"));

        driver.switchTo().frame(0);

        Actions action=new Actions(driver);
        action.dragAndDrop(draggable,droppable).perform();

    }
}
