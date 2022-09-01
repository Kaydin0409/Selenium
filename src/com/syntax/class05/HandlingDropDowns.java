package com.syntax.class05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class HandlingDropDowns {
        public static String url="http://syntaxprojects.com/basic-select-dropdown-demo.php";

        public static void main(String[] args) throws InterruptedException {
            System.setProperty("webdriver.chrome.driver","Driver/chromedriver.exe");
            WebDriver driver=new ChromeDriver();
            driver.get(url);
            WebElement daysDD=driver.findElement(By.id("select-demo"));
            Select select=new Select(daysDD);
            select.selectByIndex(3); //Tuesday due to deselected option that says please select
            Thread.sleep(2000);
            select.selectByVisibleText("Thursday");
            Thread.sleep(2000);
            select.selectByValue("Friday");

            List<WebElement> allOptions=select.getOptions();
            int size= allOptions.size();
            System.out.println(size);

            /*for(WebElement option:allOptions){
                System.out.println(option.getText());
            }*/

            for(int i=1; i<size; i++){
                String option=allOptions.get(i).getText();
                select.selectByIndex(i);
                Thread.sleep(1000);
                System.out.println(option);
            }
            //prints out all options in the dropdown list
    }
}
