package com.syntax.tests;

import com.syntax.pages.LoginPage;
import com.syntax.testbase.BaseClass;

public class LoginPageTest {
    public static void main(String[] args) {
        BaseClass.openWithSpecificUrl("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");
        LoginPage loginPage=new LoginPage();
        loginPage.userName.sendKeys("Admin");
        loginPage.password.sendKeys("Hum@nhrm123");
        loginPage.loginButton.click();

        BaseClass.tearDown();
    }
}
