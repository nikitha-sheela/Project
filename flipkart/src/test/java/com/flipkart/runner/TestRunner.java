package com.flipkart.runner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@RunWith(Cucumber.class)
@CucumberOptions(features = "./src/main/resources/features/TC_WISHLIST_001.feature", glue = {
		"com\\flipkart\\addtocartstepdefination" },
//plugin = {"pretty","html:target/htmlreports"},

		dryRun = false, monochrome = true, format = { "pretty", "html:Reports", "json:Reports/cucumber.json",
				"junit:Reports/cucumber" }, snippets = SnippetType.CAMELCASE)

public class TestRunner extends AbstractTestNGCucumberTests {

}

