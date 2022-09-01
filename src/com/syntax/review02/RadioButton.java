package com.syntax.review02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://demo.guru99.com/test/radio.html");

        WebElement optionThree=driver.findElement(By.xpath("//input[@value='Option 3']"));
        //check if radio button is selected
        boolean state=optionThree.isSelected();
        System.out.println("The state of the radio button is : "+state);
        //check if displayed
        boolean displayed= optionThree.isDisplayed();
        System.out.println("Is the radio button displayed: "+displayed);
        //check if enabled
        boolean enabled= optionThree.isEnabled();
        System.out.println("Is the radio button accessible/enabled: "+enabled);

        optionThree.click();
        state= optionThree.isSelected();
        System.out.println("Is the radio button selected: "+state);

        driver.quit();

    }
}
