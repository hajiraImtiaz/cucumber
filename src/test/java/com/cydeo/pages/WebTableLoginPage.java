package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WebTableLoginPage {

    public WebTableLoginPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(name = "username")
    public WebElement inputUsername;

    @FindBy(name = "password")
    public WebElement inputPassword;

    @FindBy(xpath = "//button[.='Login']")
    public WebElement loginButton;

    /*
    -no parameters
    -when we call this method, it will directly login using:
    -username:test
    -password:tester
     */
    public void login(){

        this.inputUsername.sendKeys("Test");
        this.inputPassword.sendKeys("Tester");
        this.loginButton.click();

    }

}
