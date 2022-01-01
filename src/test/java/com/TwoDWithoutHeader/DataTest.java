package com.TwoDWithoutHeader;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DataTest {
	
	WebDriver driver;

	@Given("Browser launch")
	public void browserLaunch() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mnrajan\\Desktop\\Softwares\\chromedriver_win32\\chromedriver.exe");
		 driver= new ChromeDriver(); 
		 driver.get("https://www.naukri.com/registration/createAccount?othersrcp=23531&wExp=N&utm_source=google&utm_medium=cpc&utm_campaign=Brand&gclid=EAIaIQobChMIhML9l7uJ9QIVmKztCh1y4QCMEAAYASAAEgJrpPD_BwE&gclsrc=aw.ds");
	driver.manage().window().maximize();
	}
	@When("Page title matches")
	public void pageTitleMatches() {
	    System.out.println(driver.getTitle());
	}
	@Then("Enter the Login details")
	public void enterTheLoginDetails(io.cucumber.datatable.DataTable dataTable) {
	   
		List<Map<String, String>> datas = dataTable.asMaps();
		for(int i=0; i<=2; i++) {
			Map<String, String> data = datas.get(i);
		driver.findElement(By.id("name")).sendKeys(data.get("Name")); 
		driver.findElement(By.id("email")).sendKeys(data.get("Mail"));
		driver.findElement(By.id("password")).sendKeys(data.get("Password"));
		driver.findElement(By.id("mobile")).sendKeys(data.get("Phone"));
		}
	}
	@Then("Close the browser")
	public void closeTheBrowser() {
	 driver.quit();   
	}
}
