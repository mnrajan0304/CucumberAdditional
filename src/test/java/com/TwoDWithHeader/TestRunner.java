package com.TwoDWithHeader;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="C:\\Users\\mnrajan\\eclipse-workspace\\CucumberData\\src\\test\\resources\\FeatureFiles\\TwoD1.feature",
		glue="com.TwoDWithHeader",
		plugin= {"pretty", "html:test-output3"},
		monochrome= true,
		snippets= SnippetType.CAMELCASE
		)

public class TestRunner {

}
