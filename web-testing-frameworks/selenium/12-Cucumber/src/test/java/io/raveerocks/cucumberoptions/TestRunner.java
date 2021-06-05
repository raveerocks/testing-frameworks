package io.raveerocks.cucumberoptions;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/java/io/raveerocks/features",
        glue = "io.raveerocks.stepdefinitions")
public class TestRunner {

}
