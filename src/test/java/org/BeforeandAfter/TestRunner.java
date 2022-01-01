package org.BeforeandAfter;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="C:\\Users\\mnrajan\\eclipse-workspace\\CucumberData\\src\\test\\resources\\FeatureFiles\\BeforeAndAfter.feature",
		glue="org.BeforeandAfter",
		monochrome= true,
		plugin= {"pretty", "html:test-output5"}
		)
public class TestRunner {

}
