package com.norvegian.pages;

import com.norvegian.utilitys.BrowserUtils;
import com.norvegian.utilitys.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ArrayList;
import java.util.List;

public class BasePage {

    public BasePage() {
        //this method requires to provide webdriver object for @FindBy
        //and page class
        //this means this page class
        PageFactory.initElements(Driver.get(), this);
    }

    public void navigateTo(String moduleName, String subModuleName) {
        Actions actions = new Actions(Driver.get());
        String moduleLocator = "//a[@href='#'][@title='" + moduleName + "']";
        BrowserUtils.wait(3);
        String subModuleLocator = "//a[@class='linkItem'][@title='" + subModuleName + "']";

        WebDriverWait wait = new WebDriverWait(Driver.get(), 20);
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(moduleLocator)));

        WebElement module = Driver.get().findElement(By.xpath(moduleLocator));
        actions.moveToElement(module).click().perform();

        WebElement submodule = Driver.get().findElement(By.xpath(subModuleLocator));
        wait.until(ExpectedConditions.visibilityOf(module));
        wait.until(ExpectedConditions.elementToBeClickable(module));
        submodule.click();
    }

}
