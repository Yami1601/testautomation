package com.expleo.challengingdom.automation.pages;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ChallengingDomPage {
	
	WebDriver driver;
	WebDriverWait wait;
	
	@FindBy(xpath="//h3[text()='Challenging DOM']")
	WebElement title;
	
	@FindBy(xpath="//a[@class='button alert']")
	WebElement alertButton;
	
	@FindBy(xpath="//a[@class='button success']")
	WebElement successButton;
	
	@FindBy(xpath="//a[@class='button']")
	WebElement bazButton;
	
	@FindBy(xpath="//div//p")
	WebElement subTitle;
	
	@FindBy(xpath="//a[@href='https://github.com/tourdedave/the-internet']")
	WebElement gitHubLink;
	
	@FindBy(xpath="//a[@href='#edit']")
	List<WebElement> edit;
	
	@FindBy(xpath="//a[@href='#delete']")
	List<WebElement> delete;
	
	@FindBy(xpath="//a[@href='http://elementalselenium.com/']")
	WebElement seleniumLink;
	
	public ChallengingDomPage(WebDriver driver)
	{
		this.driver=driver;
        PageFactory.initElements(driver, this);
        wait = new WebDriverWait(driver,10);
	}
	
	public void verifyTitle() {
		
		wait.until(ExpectedConditions.visibilityOf(title));
		Assert.assertTrue("Title is not displayed", title.isDisplayed());
	}
	
	public void verifyButtons() {
		wait.until(ExpectedConditions.visibilityOf(title));
		Assert.assertTrue("Alert button is not displayed", alertButton.isDisplayed());
	}
}
