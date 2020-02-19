package com.norvegian.pages;

import com.norvegian.utilitys.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.List;

public class ShoreExcursionPage extends BasePage {

    public ShoreExcursionPage() {
        PageFactory.initElements(Driver.get(), this);
    }

    @FindBy(xpath = "//span[contains(text(),'Destination')]")
    public WebElement destination;

    @FindBy(xpath = "//li[contains(text(),'Alaska Cruises')]")
    public WebElement alaska;

    @FindBy(xpath = "//span[contains(text(),'Alaska Cruises')]")
    public WebElement result;

    @FindBy(xpath = "//select[@id='search_ports']")
    public WebElement ports;


    public List<String> getPorts() {
        Select select = new Select(ports);
        List<String> portList = new ArrayList<>();
        List<WebElement> ports = select.getOptions();
        for (WebElement option : ports) {
            portList.add(option.getText());
        }
        return portList;
    }


}
