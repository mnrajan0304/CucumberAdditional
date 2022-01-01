package com.OneDWithoutHeader;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="C:\\Users\\mnrajan\\eclipse-workspace\\CucumberData\\src\\test\\resources\\FeatureFiles\\OneD2.feature",
		glue="com.OneDWithoutHeader",
		plugin= {"pretty", "json: test-output2"},
		monochrome= true,
		snippets= SnippetType.CAMELCASE
		)

public class TestRunner {

}
