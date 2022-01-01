package com.OneDWithHeader;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="C:\\Users\\mnrajan\\eclipse-workspace\\CucumberData\\src\\test\\resources\\FeatureFiles\\OneD1.feature",
		glue="com.OneDWithHeader",
		plugin= {"pretty", "html:target/test-outputoneD11.html"},
		monochrome= true,
		snippets= SnippetType.CAMELCASE
		)

public class TestRunner {

}
