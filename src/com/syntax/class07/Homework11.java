package com.syntax.class07;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class Homework11 {

        /*
        Go to https://demoqa.com/browser-windows
        click on New Tab and print the text from new tab in the console
        click on New Window and print the text from new window in the console
        click on New Window Message and print the text from new window in the console
        Verify (compare) the titles for each page
        Print out the title of the all pages

         */
        public static String url="https://demoqa.com/browser-windows";
        public static void main(String[] args) throws InterruptedException {
            System.setProperty("webdriver.gecko.driver", "Driver/geckodriver.exe");
            WebDriver driver = new FirefoxDriver();
            driver.get(url);
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
            String mainWindowHandle= driver.getWindowHandle();

            WebElement newTabButton=driver.findElement(By.xpath("//button[text()='New Tab']"));
            newTabButton.click();
            WebElement newWindowButton=driver.findElement(By.cssSelector("button#windowButton"));
            newWindowButton.click();
            //System.out.println(driver.getTitle());

            Set<String> allWindowHandles=driver.getWindowHandles();
            Iterator<String> it= allWindowHandles.iterator();
            mainWindowHandle=it.next();
            String newTabWindowHandle=it.next();
            String newWindowPageHandle=it.next();
            driver.switchTo().window(newTabWindowHandle);
            WebElement newTabText=driver.findElement(By.xpath("//h1[@id='sampleHeading']"));
            System.out.println(newTabText.getText());
            //System.out.println(driver.getTitle());

            driver.switchTo().window(newWindowPageHandle);
            WebElement newWindowText=driver.findElement(By.id("sampleHeading"));
            System.out.println(newWindowText.getText());
            //String title=driver.getTitle();

            it=allWindowHandles.iterator();
            while(it.hasNext()){
                String handle=it.next();
                driver.switchTo().window(handle);
                String title=driver.getTitle();
                if(title.isEmpty()){
                    System.out.println("This page has no title");
                }else{
                    System.out.println(title);
                }
            }






        }
    }

