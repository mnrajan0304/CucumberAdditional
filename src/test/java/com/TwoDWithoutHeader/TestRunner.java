package com.TwoDWithoutHeader;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="C:\\Users\\mnrajan\\eclipse-workspace\\CucumberData\\src\\test\\resources\\FeatureFiles\\TwoD2.feature",
		glue="com.TwoDWithoutHeader",
		plugin= {"pretty", "html:test-output4"},
		monochrome= true,
		snippets= SnippetType.CAMELCASE
		)

public class TestRunner {

}
