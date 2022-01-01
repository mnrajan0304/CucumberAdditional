package com.TwoDWithHeader;

import java.util.List;

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
	  
		/*List<List<String>> datas = dataTable.asLists();
	      List<String> data =  datas.get(0);
		driver.findElement(By.id("name")).sendKeys(data.get(0));
		driver.findElement(By.id("email")).sendKeys(data.get(1));
		driver.findElement(By.id("password")).sendKeys(data.get(2));
		driver.findElement(By.id("mobile")).sendKeys(data.get(3)); */
		
		/*List<List<String>> datas = dataTable.asLists();
		
		for(int i=0; i<=2; i++) {
			List<String> data =  datas.get(i);
		driver.findElement(By.id("name")).sendKeys(data.get(0)); 
		driver.findElement(By.id("email")).sendKeys(data.get(1));
		driver.findElement(By.id("password")).sendKeys(data.get(2));
		driver.findElement(By.id("mobile")).sendKeys(data.get(3));
		} */
		
		List<List<String>> datas = dataTable.asLists();
		for (List<String> data : dataTable.asLists()){
			driver.findElement(By.id("name")).sendKeys(data.get(0)); 
			driver.findElement(By.id("email")).sendKeys(data.get(1));
			driver.findElement(By.id("password")).sendKeys(data.get(2));
			driver.findElement(By.id("mobile")).sendKeys(data.get(3));
		}
	}
	@Then("Close the browser")
	public void closeTheBrowser() {
	  driver.quit();
	}
}
