package org.example.pages;

import org.example.utilities.BrowserUtils;
import org.example.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;
import java.util.List;

public class ExamplePage {

    public ExamplePage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//tagName[@type='exampleSearchBox']")
    public WebElement exampleSearchBox;

    @FindBy(xpath = "//tagName")
    public List<WebElement> exampleTableData;

    @FindBy(xpath = "//option")
    public List<WebElement> exampleOptions;


    public List<String> getExampleInfo(){

        List<String> exampleInfo = new ArrayList<>();

        exampleInfo.add(exampleTableData.get(1).getText());
        exampleInfo.add(exampleTableData.get(2).getText());
        exampleInfo.add(exampleTableData.get(3).getText());

        return exampleInfo;
    }

    public void searchExample (String bookName){

        exampleSearchBox.sendKeys(bookName);

        BrowserUtils.waitFor(3);
    }


}
