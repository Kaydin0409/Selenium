package com.syntax.class07;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Homework2 {
    /*
    navigate to http://www.uitestpractice.com/Students/Contact
    click on the link
    get text
    print out in the console
     */
        public static String url="http://www.uitestpractice.com/Students/Contact";

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        WebElement ajaxLink=driver.findElement(By.partialLinkText("This is"));
        ajaxLink.click();

        WebElement linkText= driver.findElement(By.xpath("//div[@class='ContactUs']"));
        System.out.println(linkText.getText());
    }

}
