package org.example.pages;

import org.example.utilities.ConfigurationReader;
import org.example.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    public LoginPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id = "exampleEmailBox")
    public WebElement usernameInputBox;

    @FindBy(id = "examplePasswordBox")
    public WebElement passwordInputBox;

    @FindBy(tagName = "exampleSignInButton")
    public WebElement signInButton;


    public void loginAsUser(){
        usernameInputBox.sendKeys(ConfigurationReader.getProperty("exampleUsername"));
        passwordInputBox.sendKeys(ConfigurationReader.getProperty("examplePassword"));
        signInButton.click();
    }


    public void loginAsAdmin(){
        usernameInputBox.sendKeys(ConfigurationReader.getProperty("exampleAdminUsername"));
        passwordInputBox.sendKeys(ConfigurationReader.getProperty("exampleAdminPassword"));
        signInButton.click();
    }

}
