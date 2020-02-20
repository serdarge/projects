package com.norvegian.step_definitions;

import com.norvegian.pages.BasePage;
import com.norvegian.pages.ShoreExcursionPage;
import com.norvegian.utilitys.ConfigurationReader;
import com.norvegian.utilitys.Driver;
import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.*;

public class GuestsExploreStepDefinitions extends BasePage {

    ShoreExcursionPage shoreExcursionPage = new ShoreExcursionPage();

    @Given("a Guest")
    public void a_Guest() {
        Driver.get().get(ConfigurationReader.getProperty("url"));
        Driver.get().manage().window().maximize();
    }

    @Given("I am on Homepage")
    public void i_am_on_Homepage() {
        String actualTitle = Driver.get().getTitle();
        String expectedTitle = "Cruises & Cruise Deals | Plan Your Cruise Vacation | NCL";
        Assert.assertEquals("Guest is not on Homepage", expectedTitle, actualTitle);
    }

    @Given("I navigated to “Shore Excursion” page")
    public void i_navigated_to_Shore_Excursion_page() {
        navigateTo("Explore", "Shore Excursions");
    }

    @When("I search for destination “Alaska Cruises”")
    public void i_search_for_destination_Alaska_Cruises() {
        WebDriverWait wait = new WebDriverWait(Driver.get(), 10);
        shoreExcursionPage.destination.click();
        Actions actions = new Actions(Driver.get());
        actions.moveToElement(shoreExcursionPage.alaska).click().perform();
        shoreExcursionPage.searchButton.click();
    }

    @Then("Shore Excursions page is present")
    public void shore_Excursions_page_is_present() {
        String actualTitle = Driver.get().getTitle();
        String expectedTitle = "Alaska Cruises | Shore Excursions | Norwegian Cruise Line";
        Assert.assertEquals("Guest is not on Shore Excursions page", expectedTitle, actualTitle);
    }

    @Then("Results are filtered by “Alaska Cruises”")
    public void results_are_filtered_by_Alaska_Cruises() {
        String expectedResults = "Alaska Cruises";
        String actualResults = shoreExcursionPage.searchResult.getText();
        Assert.assertEquals("Results are not filtered by Alaska Cruises", expectedResults, actualResults);
    }

    @Then("Filter By Ports are only belong to “Alaska, British Columbia”")
    public void filter_By_Ports_are_only_belong_to_Alaska_British_Columbia() {
        WebDriverWait wait = new WebDriverWait(Driver.get(), 5);

        Actions actions = new Actions(Driver.get());
        actions.moveToElement(shoreExcursionPage.portResults).click().perform();

        List<String> expectedPorts = new ArrayList<String>();
        expectedPorts.add("Icy Strait Point, Alaska");
        expectedPorts.add("Juneau, Alaska");
        expectedPorts.add("Ketchikan, Alaska");
        expectedPorts.add("Seward, Alaska");
        expectedPorts.add("Sitka, Alaska");
        expectedPorts.add("Skagway, Alaska");
        expectedPorts.add("Victoria, British Columbia");

        List<String> actualPorts = new ArrayList<String>();
        for (WebElement e : shoreExcursionPage.ports) {
            actualPorts.add(e.getText());
        }
        Assert.assertEquals("Filter By Ports are not only belong to “Alaska, British Columbia", expectedPorts, actualPorts);
    }

}
