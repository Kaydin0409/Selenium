package com.syntax.class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementCommands {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","Driver/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("http://syntaxprojects.com/basic-radiobutton-demo.php");
        WebElement ageRadioButton=driver.findElement(By.xpath("//label[text()='5 to 15']"));

        System.out.println(ageRadioButton.isEnabled()); //can you can click on the radio button

        boolean isAgeRadioButtonDisplayed=ageRadioButton.isDisplayed();
        System.out.println(isAgeRadioButtonDisplayed); //you can see it on the web page

        boolean isAgeRadioButtonSelected=ageRadioButton.isSelected();
        System.out.println(isAgeRadioButtonSelected); //false because it isn't selected(clicked)

        ageRadioButton.click();
        System.out.println(isAgeRadioButtonSelected); //false because we did not have radio button element located, only label

        ageRadioButton= driver.findElement(By.cssSelector("input[value='5 - 15']")); //now radio button element is the WebElement value
        ageRadioButton.click();
        isAgeRadioButtonSelected=ageRadioButton.isSelected(); //reassigning isAgeRadioButtonSelected
        System.out.println("After clicking and reassigning"+isAgeRadioButtonSelected); //now it is true

        driver.quit();



    }
}
