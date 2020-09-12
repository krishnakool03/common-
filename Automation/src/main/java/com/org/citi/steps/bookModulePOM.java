package com.org.citi.steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class bookModulePOM {
	public bookModulePOM(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}	
		
	@FindBy(xpath="//*[text()='Book']")
	public WebElement books;
	
	@FindBy(xpath="//*[text()='Large Corporations']")
	public WebElement largeCorporation;
	
	@FindBy(xpath="//*[text()='Flight Passes for Business']")
	public WebElement flightPasses;
	
	@FindBy(xpath="//*[text()='See Flight Passes']")
	public WebElement seeFlightPasses;
	
	
}