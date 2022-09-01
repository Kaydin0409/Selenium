package com.syntax.class08;

import com.syntax.utils.CommonMethodsHW;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.Iterator;
import java.util.List;

public class HandleStaticWebTables2 extends CommonMethodsHW {
    public static void main(String[] args) {
        openBrowserAndLaunchApplication("http://syntaxprojects.com/table-search-filter-demo.php");

        List<WebElement> rowData=driver.findElements(By.xpath("//table[@id='task-table']/tbody/tr"));
        System.out.println(rowData.size());

        Iterator<WebElement> it= rowData.iterator();
        while(it.hasNext()){
           WebElement row=it.next();
           String rowText=row.getText();
            System.out.println(rowText);
        }

        System.out.println("----------------------------------------------------------");

        List<WebElement> column2Data=driver.findElements(By.xpath("//table[@id='task-table']/tbody/tr/td[2]"));
        System.out.println(column2Data.size());

        for(WebElement colData:column2Data){
            String colText=colData.getText();
            System.out.println(colText);
        }
    }
}
