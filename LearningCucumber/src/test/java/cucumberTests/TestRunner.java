package cucumberTests;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "FeatureFiles", glue = {"stepDefinition"})
public class TestRunner {

}
