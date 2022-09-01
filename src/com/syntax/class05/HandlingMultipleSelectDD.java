package com.syntax.class05;

import javafx.scene.web.WebEngineBuilder;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class HandlingMultipleSelectDD {
    public static String url = "http://syntaxprojects.com/basic-select-dropdown-demo.php";

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        WebElement statesDD = driver.findElement(By.id("multi-select"));
        Select select = new Select(statesDD);
        Boolean isMultiple = select.isMultiple();
        System.out.println(isMultiple); //true
        

        if (isMultiple) {
            List<WebElement> states = select.getOptions();
            for (WebElement state : states) {
                String stateOption = state.getText();
                System.out.println(stateOption);
                select.selectByVisibleText(stateOption);
            }
        }
        Thread.sleep(2000);
        select.deselectByIndex(5); //Texas is deselected
        select.deselectAll();
    }


    }
