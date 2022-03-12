package com.expleo.challengingdom.automation.stepDefinitions;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import com.expleo.challengingdom.automation.pages.ChallengingDomPage;
import io.cucumber.java.After;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class ChallengingDomSteps {

	WebDriver driver;

	@Given("application is launched")
	public void application_is_launched() {

		System.out.println("Inside application is launched");
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\ashis\\eclipse-workspace\\challenging-dom-automation\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://the-internet.herokuapp.com/challenging_dom");
	}

	@Then("user should be on the home page")
	public void user_should_be_on_the_home_page(){
		ChallengingDomPage challengingDomPage = new ChallengingDomPage(driver);
		challengingDomPage.verifyTitle();
	}

	@Then("user should be on the home page and all three buttons are present")
	public void user_should_be_on_the_home_page_and_all_three_buttons_are_present() {
		
	}

	@After
	public void cleanUp() {

		System.out.println("Inside cleanUp Method");
		driver.quit();
	}

}
