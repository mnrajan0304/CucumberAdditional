package org.Screenshot;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="C:\\Users\\mnrajan\\eclipse-workspace\\CucumberData\\src\\test\\resources\\FeatureFiles\\SS.feature",
		glue="org.Screenshot",
		monochrome= true,
		plugin= {"pretty", "html:test-output5",
				"json:target/MyReports/report.xml",
				"de.monochromata.cucumber.report.PrettyReports:target/CucuReport"}
		)
public class TestRunner {

	@AfterClass
	public static void afterClass() {
		Report.generateReport("C:\\Users\\mnrajan\\eclipse-workspace\\CucumberData\\src\\test");
	}
}
