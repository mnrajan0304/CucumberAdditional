package org.Screenshot;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class Report {
	public static void generateReport(String json) {
	
	File file = new File("C:\\Users\\mnrajan\\eclipse-workspace\\CucumberData\\target");
	Configuration configuration = new Configuration(file, "Taking screenshot");
	
	configuration.addClassifications("Browser", "Chrome");
	configuration.addClassifications("Platform", "Windows");
	configuration.addClassifications("Sprint", "24");
	
	List<String> data = new ArrayList<String>();
	data.add(json);
	
	ReportBuilder report = new ReportBuilder(data, configuration);
	report.generateReports();
}
}