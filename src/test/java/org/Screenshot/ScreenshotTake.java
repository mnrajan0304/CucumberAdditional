package org.Screenshot;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.Scenario;
import io.cucumber.java.After;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ScreenshotTake {
	WebDriver driver;

	@Given("Browser launch")
	public void browser_launch() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mnrajan\\Desktop\\Softwares\\chromedriver_win32\\chromedriver.exe");
		 driver= new ChromeDriver(); 
		 driver.manage().window().maximize();
		 driver.get("https://www.amazon.com/");
	}
	@When("Page title matches")
	public void page_title_matches() {
	    System.out.println(driver.getTitle());
	}
	@Then("Enter the Searchitems details")
	public void enter_the_searchitems_details() {
	    driver.findElement(By.id("twotabsearchtextboxs")).sendKeys("Mobile");
	}
	@Then("Close the browser")
	public void close_the_browser() {
	    driver.quit();
	}
	
	@After
	void afterScenario(Scenario s) {
		if (s.isFailed()) {
		TakesScreenshot ts = (TakesScreenshot) driver;
		final byte[] SS = ts.getScreenshotAs(OutputType.BYTES);
		s.embed(SS, "image/png");
		}
	}
	
}
