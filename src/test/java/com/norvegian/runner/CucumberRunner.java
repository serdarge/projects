package com.norvegian.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features",
        glue = "com/norvegian/step_definitions",
        dryRun = false,
        plugin = {"html:target/default-cucumber-reports",
                "rerun:target/rerun.txt"
        }
)
public class CucumberRunner {

}
