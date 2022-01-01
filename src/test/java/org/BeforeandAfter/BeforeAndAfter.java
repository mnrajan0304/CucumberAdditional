package org.BeforeandAfter;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.When;

public class BeforeAndAfter {

	  WebDriver driver;
	@Before
	void launchBrowser() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mnrajan\\Desktop\\Softwares\\chromedriver_win32\\chromedriver.exe");
		 driver= new ChromeDriver(); 
		 driver.manage().window().maximize();
		 driver.get("https://www.naukri.com/");
		
	}
	@After
	void tearDown() {
		driver.quit();
	
	}
	
	@When("user enters Skills and Location")
	public void user_enters_skills_and_location() {
		System.out.println("user_enters_skills_and_location");
	}
	@When("user select the login button")
	public void user_select_the_login_button() {
		System.out.println("user_select_the_login_button");
	}

	@When("user enters Skills and Location again")
	public void user_enters_skills_and_location_again() {
	    System.out.println("user_enters_skills_and_location_again");
	}
	@When("user select the login button again")
	public void user_select_the_login_button_again() {
	 System.out.println("user_select_the_login_button_again");  
	}


	@When("user enters Skills and Location third")
	public void user_enters_skills_and_location_third() {
	    System.out.println("user_enters_skills_and_location_third");
	}
	@When("user select the login button third")
	public void user_select_the_login_button_third() {
	   System.out.println("user_select_the_login_button_third");
	}
}
