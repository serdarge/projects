package com.norvegian.step_definitions;

import com.norvegian.utilitys.ConfigurationReader;
import com.norvegian.utilitys.Driver;
import io.cucumber.core.api.Scenario;
import io.cucumber.java.*;


public class Hook {

    @Before

    public void setup() {
        System.out.println("=============================");
        System.out.println("Test Setup");
        Driver.get().get(ConfigurationReader.getProperty("url"));
        Driver.get().manage().window().maximize();
    }

    @After
    public void teardown(Scenario scenario) {
        if (scenario.isFailed()) {
            System.out.println("Test Failed");
        } else {
            System.out.println("Cleanup");
            System.out.println("Test completed!");
        }
        System.out.println("=============================");

        Driver.get().close();
    }



}
