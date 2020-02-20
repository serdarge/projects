package com.norvegian.pages;

import com.norvegian.utilitys.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.List;

public class ShoreExcursionPage extends BasePage {

    List<String> expectedPorts = new ArrayList<>();


    public ShoreExcursionPage() {
        PageFactory.initElements(Driver.get(), this);
    }

    @FindBy(xpath = "//span[contains(text(),'Destination')]")
    public WebElement destination;

    @FindBy(xpath = "//li[contains(text(),'Alaska Cruises')]")
    public WebElement alaska;

    @FindBy(xpath = "//span[contains(text(),'Alaska Cruises')]")
    public WebElement result;

    @FindBy (xpath = "//button[@type='submit']")
    public WebElement searchButton;

    @FindBy (xpath = ("//span[@class='items-text']"))
    public WebElement searchResult;

    @FindBy(xpath = "//ul[@id='ports']//li//label")
    public List<WebElement> ports;

    @FindBy(xpath = "//span[contains(text(),'Port')]")
    public WebElement portResults;






}
