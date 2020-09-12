package com.org.citi.steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LowesServicePOM {

	public LowesServicePOM(WebDriver driver) {
	PageFactory.initElements(driver, this);
	
	}
	
	
	@FindBy(xpath="//*[text()='Services']")
	public WebElement serviceList ;
	
	@FindBy(xpath="//*[@alt='View all services.']")
	public WebElement scroll ;
}
