package com.syntax.review03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;

public class WindowHandling {
    public static String url = "https://accounts.google.com/signin/v2/identifier?continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&service=mail&sacu=1&rip=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin";

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(url);

        WebElement help=driver.findElement(By.linkText("Help"));
        WebElement privacy=driver.findElement(By.linkText("Privacy"));
        WebElement terms=driver.findElement(By.linkText("Terms"));
        help.click();
        privacy.click();
        terms.click();

        String mainPageHandle=driver.getWindowHandle();


        //get all the window handles
        Set<String> allWindowHandles=driver.getWindowHandles();

        //create an iterator to iterate
        Iterator<String> it=allWindowHandles.iterator();

        while(it.hasNext()){
            String handle=it.next();        //gets first window handle
            driver.switchTo().window(handle);  //switches focus
            String title=driver.getTitle();  //gets title of that particular window handle to see which window is current one
            if(title.contains("Privacy Policy")){
                System.out.println(title+"   :    "+handle);

                break;
            }

        }
        WebElement checkup=driver.findElement(By.xpath("//a[text()='Take the Privacy Checkup']"));
        checkup.click();






    }
}
