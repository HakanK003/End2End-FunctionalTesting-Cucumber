package org.example.pages;

import org.example.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

    public HomePage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//tagName[@id='exampleMenuBar']")
    public WebElement exampleMenuBar;

    @FindBy(xpath = "//tagName[@href='exampleTab']")
    public WebElement exampleTab;


}
