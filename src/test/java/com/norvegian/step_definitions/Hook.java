package com.norvegian.step_definitions;

import io.cucumber.core.api.Scenario;
import io.cucumber.java.*;


public class Hook {

    @Before
    public void setup() {
        System.out.println("Test Setup");
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
    }


}
