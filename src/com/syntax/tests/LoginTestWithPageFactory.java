package com.syntax.tests;

import com.syntax.pages.DashboardPage;
import com.syntax.pages.LoginPageWithPageFactory;
import com.syntax.testbase.BaseClass;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.io.File;
import java.io.IOException;

public class LoginTestWithPageFactory{
    public static void main(String[] args) {
        BaseClass.openWithSpecificUrl("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");
        //create the objects that will be needed for the entire class first is best practice
        LoginPageWithPageFactory loginPageWithPageFactory=new LoginPageWithPageFactory();
        DashboardPage dashboardPage=new DashboardPage();

        /*loginPageWithPageFactory.userName.sendKeys("Admin");
        loginPageWithPageFactory.password.sendKeys("Hum@nhrm123");
        loginPageWithPageFactory.loginButton.click();*/
        loginPageWithPageFactory.loginActions();   //much cleaner code this way

        TakesScreenshot screenshots=(TakesScreenshot)BaseClass.driver; //BaseClass is static
        File sourceFile=screenshots.getScreenshotAs(OutputType.FILE);
        try {
            FileUtils.copyFile(sourceFile, new File("screenshots/HRMS/dashboard.png"));
        } catch (IOException e) {
            e.printStackTrace();
        }

        dashboardPage.welcomeAdmin.click();
        dashboardPage.logoutButton.click();

        BaseClass.tearDown();

    }

}
