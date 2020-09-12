package com.org.citi.steps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class bookModule {
	
	public WebDriver driver; 
	bookModulePOM objectRepository;
	
	@Given("^User login into aircanada application$")
	public void userLoginIntoAircanadaApplication() throws Throwable {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\krishnakool\\git\\common-\\Automation\\driver\\chromedriver.exe");
		
		driver= new ChromeDriver();
		
	    driver.manage().window().maximize();
	    
	    driver.manage().deleteAllCookies();
	    
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://www.aircanada.com/ca/en/aco/home.html#/");
		
		 objectRepository = new bookModulePOM(driver);
	    
		 // navigating to book category
		 JavascriptExecutor jse = (JavascriptExecutor)driver;
		 jse.executeScript("arguments[0].click();",objectRepository.books);
		 
	}

	@Then("^User clicks book category in navigation menu$")
	public void userClicksBookCategoryInNavigationMenu() throws Throwable {
	    
	    
	}

	@Then("^User navigates to large corporation in the book category$")
	public void userNavigatesToLargeCorporationInTheBookCategory() throws Throwable {
	    
	    
	}

	@Then("^User veryfies the seeflightpasses in the webpage$")
	public void userVeryfiesTheSeeflightpassesInTheWebpage() throws Throwable {
	    
	    
	}

	@Then("^User Validates Alberta Commuter and its price$")
	public void userValidatesAlbertaCommuterAndItsPrice() throws Throwable {
	    
	    
	}

	@Then("^User logout of the aircannada application$")
	public void userLogoutOfTheAircannadaApplication() throws Throwable {
	    
	    
	}
	
}
