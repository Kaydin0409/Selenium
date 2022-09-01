package com.syntax.class08;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.List;

public class HandleStaticWebTables {
    public static String url = "http://syntaxprojects.com/table-search-filter-demo.php";

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        List<WebElement> rowData=driver.findElements(By.xpath("//table[@id='task-table']/tbody/tr"));
        System.out.println(rowData.size());

        Iterator<WebElement> it=rowData.iterator();
        //only printing the rows from table, excludes the header
        ////table[@id='task-table']/tbody/tr[1]  this is an example of indexing that would only print the first row
        while(it.hasNext()){
            WebElement row=it.next();
            String rowText=row.getText();
            System.out.println(rowText);
        }

        System.out.println("---------------------------");
        //print the columns of data from the header
        List<WebElement> colsData=driver.findElements(By.xpath("//table[@id='task-table']/thead/tr/th"));
        for(WebElement colData:colsData){
            String colText=colData.getText();
            System.out.println(colText);
        }




    }
}
