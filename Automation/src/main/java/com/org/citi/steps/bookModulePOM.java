package com.org.citi.steps;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class bookModulePOM {
	public bookModulePOM(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}	
		
	@FindBy(xpath="(//*[text()='Book'])[3]")
	public WebElement books;
	
	@FindBy(xpath="//*[text()='Large Corporations']")
	public WebElement largeCorporation;
	
	@FindBy(xpath="//*[text()='See Flight Passes']")
	public WebElement seeFlightPasses;
	
	@FindBy(xpath="//*[@id='zoneDetailsTitle-0']")
	public WebElement AlbertaCommuter ;
	
	String AlbertaCommuterValidate ;
	
	File source;
	
	File Destination; 
	
	String location; 
}