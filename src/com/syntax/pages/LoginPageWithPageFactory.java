package com.syntax.pages;

import com.syntax.utils.CommonMethods;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPageWithPageFactory extends CommonMethods {

    @FindBy(id = "txtUsername")
    public WebElement userName;

    @FindBy(xpath = "//input[@name='txtPassword']")
    public WebElement password;

    @FindBy(css = "input#btnLogin")
    public WebElement loginButton;

    //for example List would be List<WebElement> multipleElements; below @FindBy

    public void loginActions(){
        sendText(userName,"Admin");
        sendText(password,"Hum@nhrm123");
        loginButton.click();
    }

    //creating constructor to initialize all variables in this class.  Always need to do this at the end

    /**
     * this method will login
     */

    //you can put in login actions and use common methods within
    public LoginPageWithPageFactory(){
        PageFactory.initElements(driver,this);
        //need to initialize the variables
        //provide what initializes variables (driver), specify where elements are stored: "this" page
    }

}
