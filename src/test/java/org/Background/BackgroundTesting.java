package org.Background;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class BackgroundTesting {
	
	WebDriver driver;

	@Given("User is on Login page")
	public void user_is_on_login_page() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mnrajan\\Desktop\\Softwares\\chromedriver_win32\\chromedriver.exe");
		 driver= new ChromeDriver(); 
		 driver.manage().window().maximize();
		 driver.get("https://www.naukri.com/");
	}
	@When("user enters Skills and Location")
	public void user_enters_username_and_password() {
		driver.findElement(By.id("qsb-keyword-sugg")).sendKeys("Software Tester");
		   driver.findElement(By.id("qsb-location-sugg")).sendKeys("Chennai");
	}
	@When("user select the login button")
	public void user_select_the_login_button() {
		driver.findElement(By.className("btn")).click();
	}
	
	@When("User select the details")
	public void user_select_the_details(){
		System.out.println(driver.getTitle());
		driver.quit();	
	}
	
	@When("User select the details again")
	public void user_select_the_details_again(){
		System.out.println(driver.getTitle());
		driver.quit();	
	}
}
