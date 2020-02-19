package com.norvegian.step_definitions;

import com.norvegian.pages.BasePage;
import com.norvegian.pages.ShoreExcursionPage;
import com.norvegian.utilitys.BrowserUtils;
import com.norvegian.utilitys.ConfigurationReader;
import com.norvegian.utilitys.Driver;
import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GuestsExploreStepDefinitions extends BasePage {

    ShoreExcursionPage shoreExcursionPage = new ShoreExcursionPage();

  //  @Given("a Guest")
   // public void a_Guest() {
   //     Driver.get().manage().window().maximize();
  //  }

    @Given("I am on Homepage")
    public void i_am_on_Homepage() {
        Driver.get().get(ConfigurationReader.getProperty("url"));
        Driver.get().manage().window().maximize();

    }

    @Given("I navigated to “Shore Excursion” page")
    public void i_navigated_to_Shore_Excursion_page() {
        navigateTo("Explore","Shore Excursions");
        BrowserUtils.wait(3);



    }

    @When("I search for destination “Alaska Cruises”")
    public void i_search_for_destination_Alaska_Cruises() {
        Actions actions = new Actions(Driver.get());
        WebDriverWait wait = new WebDriverWait(Driver.get(), 10);
        //actions.moveToElement(shoreExcursionPage.destination).click().perform();
        shoreExcursionPage.destination.click();
        BrowserUtils.wait(2);
        actions.moveToElement(shoreExcursionPage.alaska).click().perform();


    }

    @Then("Shore Excursions page is present")
    public void shore_Excursions_page_is_present() {
        String actualTitle = Driver.get().getTitle();
        String expectedTitle = "Shore Excursion Search | Norwegian Cruise Line";
        Assert.assertEquals(actualTitle,expectedTitle);
        String ActualURL = Driver.get().getCurrentUrl();
        String ExpectedURL = "https://www.ncl.com/shore-excursions";
        Assert.assertEquals(ActualURL,ExpectedURL);
    }

    @Then("Results are filtered by “Alaska Cruises”")
    public void results_are_filtered_by_Alaska_Cruises() {
        String expectedResults = "ALASKA CRUISES";
        String actualResults = shoreExcursionPage.result.getText();
        Assert.assertEquals(actualResults,expectedResults);
    }

    @Then("Filter By Ports are only belong to “Alaska, British Columbia”")
    public void filter_By_Ports_are_only_belong_to_Alaska_British_Columbia() {
        System.out.println(shoreExcursionPage.getPorts());

    }

}
