package com.syntax.class08;

import com.syntax.utils.CommonMethodsHW;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Homework1 extends CommonMethodsHW {
    /*
    go to https://the-internet.herokuapp.com/dynamic_controls
    click on checkbox and click on remove
    verify the text
    click on enable verify the textbox is enabled
    enter text and click disable
    verify the textbox is disabled
     */
    public static void main(String[] args) {
        openBrowserAndLaunchApplication("https://the-internet.herokuapp.com/dynamic_controls");

        WebElement checkbox = driver.findElement(By.xpath("//input[@type='checkbox']"));
        checkbox.click();
        WebElement removeButton = driver.findElement(By.xpath("//button[text()='Remove']"));
        removeButton.click();
        WebDriverWait wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[@id='message']")));
        WebElement removeText=driver.findElement(By.xpath("//p[@id='message']"));
        String text=removeText.getText();
        System.out.println(text);

        WebElement enableButton=driver.findElement(By.xpath("//button[text()='Enable']"));
        enableButton.click();
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@type='text']")));
        WebElement enableTextBox=driver.findElement(By.xpath("//input[@type='text']"));
        System.out.println("Is the textbox enabled: "+enableTextBox.isEnabled());
        enableTextBox.sendKeys("Time to disable");
        WebElement disableButton=driver.findElement(By.xpath("//button[text()='Disable']"));
        disableButton.click();
        System.out.println("Is the textbox disabled: "+enableTextBox.isEnabled());

        closeBrowser();


    }
}