package com.OneDWithHeader;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
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
		 driver.get("https://www.amazon.com/");
	}
	@When("Page title matches")
	public void pageTitleMatches() {
	   System.out.println(driver.getTitle());
	}
	@Then("Enter the Searchitems details")
	public void enterTheSearchitemsDetails(io.cucumber.datatable.DataTable dataTable) {
		
		//List<String> string = dataTable.asList();
		//driver.findElement(By.id("twotabsearchtextbox")).sendKeys(string.get(3));
		
		for(String string : dataTable.asList()) {
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys(string);
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys(Keys.ENTER);
		}
	}
	
	@Then("Close the browser")
	public void closeTheBrowser() {
	    driver.quit();
	}

}




    




