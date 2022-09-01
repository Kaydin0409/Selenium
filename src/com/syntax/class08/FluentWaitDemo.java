package com.syntax.class08;

import com.syntax.utils.CommonMethodsHW;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class FluentWaitDemo{

    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        Wait<WebDriver> wait=new FluentWait<>(driver)
                .withTimeout(Duration.ofSeconds(20))
                .pollingEvery(Duration.ofSeconds(5)) //looks for an element every 5 seconds
                .ignoring(NoSuchElementException.class);


    }
}
