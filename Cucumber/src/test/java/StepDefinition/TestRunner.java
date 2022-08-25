package StepDefinition;

import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;

import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/FeatureFile/ExampleKeyword.feature", glue = {
		"StepDefinition"}, tags = "@ExampleTest", monochrome = true, plugin = { "html:target/webreport" }

)

public class TestRunner {

}

// plugin syntax to generate reports 

// plugin = { "html:target/webreport" } to generate html report 
// plugin = { "json:target/cucumber.json" } to generate the report in json format 
// Plugin = {"junit:target/cucumber.xml"}