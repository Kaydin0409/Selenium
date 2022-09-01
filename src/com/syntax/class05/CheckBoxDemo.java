package com.syntax.class05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class CheckBoxDemo {
       public static String url="http://syntaxprojects.com/basic-checkbox-demo.php";
       //must be static b/c nonstatic instance variable cannot be inside static method
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","Driver/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        // String url="http://syntaxprojects.com/basic-radiobutton-demo.php";//local variable b/c inside main method
        driver.get(url);
        List<WebElement> optionCheckboxes=driver.findElements(By.xpath("//input[@class = 'cb1-element']"));
        int size=optionCheckboxes.size();
        System.out.println(size);

        for(WebElement option: optionCheckboxes){
            String checkBoxValue=option.getAttribute("value");
            if(checkBoxValue.equals("Option-2")){
                option.click();
                break;
            }
        }
    }
}
