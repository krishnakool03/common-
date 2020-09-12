package com.org.citi.steps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LowesService {
	
public static WebDriver driver;
LowesServicePOM objectRepository;
	@Given("^User login into lowes environment$")
	public void userLoginIntoLowesEnvironment() throws Throwable {
	 System.setProperty("webdriver.chrome.driver","C:\\Users\\krishnakool\\git\\common-\\Automation\\driver\\chromedriver.exe");
	 driver = new ChromeDriver();
	 
	 // to maximize the window 
	 driver.manage().window().maximize();
	 
	 // to delet all the cookies 
	 
	 driver.manage().deleteAllCookies();
	 
	 // giving implicit wait for all the webelements
	 driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);
	 
	 //logging into lowes environment 
	 driver.navigate().to("https://www.lowes.com/");
	 
	  objectRepository = new LowesServicePOM(driver);
	 
	}

	@When("^User navigate to serivce list in the navigation menu$")
	public void userNavigateToSerivceListInTheNavigationMenu() throws Throwable {
	    
		
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("arguments[0].click();", objectRepository.serviceList);
		
		Thread.sleep(2500);
		
		jse.executeScript("arguments[0].scrollIntoView(true)",objectRepository.scroll);
		Thread.sleep(2500);
		jse.executeScript("arguments[0].click();",objectRepository.scroll);
		Thread.sleep(2500);
		
	}

	@Then("^User takes a look in all services provided$")
	public void userTakesALookInAllServicesProvided() throws Throwable {
	
	    
	}

	@Then("^User choose Appliance from the Service list provided$")
	public void userChooseApplianceFromTheServiceListProvided() throws Throwable {
	    
	    
	}

	@Then("^User validates the text Appliances Lowe’s Will Install$")
	public void userValidatesTheTextAppliancesLoweSWillInstall() throws Throwable {
	    
	    
	}

	@Then("^User log out of lowes environment$")
	public void userLogOutOfLowesEnvironment() throws Throwable {
	    
	    
	}
	
	
	@Then("^User select the Attic lader from the Service list provided$")
	public void userSelectTheAtticLaderFromTheServiceListProvided() throws Throwable {
	    
	    
	}

	@Then("^User Selects Aluminium Attic stairs from the category given in the Popular Attic lader Category list$")
	public void userSelectsAluminiumAtticStairsFromTheCategoryGivenInThePopularAtticLaderCategoryList() throws Throwable {
	    
	    
	}

	@Then("^User clicks all the checkbox in the Material list$")
	public void userClicksAllTheCheckboxInTheMaterialList() throws Throwable {
	    
	    
	}

	@Then("^User validates the rate of the first product from the aluminium attic category$")
	public void userValidatesTheRateOfTheFirstProductFromTheAluminiumAtticCategory() throws Throwable {
	    
	    
	}

	@Then("^User logout of the lowes environment$")
	public void userLogoutOfTheLowesEnvironment() throws Throwable {
	    
	    
	}
	
	
	@Then("^User select the Attic lader from the service list provided$")
	public void userSelectTheAtticLaderFromTheServiceListProvided1() throws Throwable {
	    
	    
	}

	@Then("^User Selects steel Attic stairs from the category given in the Popular Attic lader Category$")
	public void userSelectsSteelAtticStairsFromTheCategoryGivenInThePopularAtticLaderCategory() throws Throwable {
	    
	    
	}

	@Then("^User validates the rate of the first product from the category$")
	public void userValidatesTheRateOfTheFirstProductFromTheCategory() throws Throwable {
	    
	    
	}


@Then("^User Selects All Attic stairs from the category given in the Popular Attic lader Category$")
public void userSelectsAllAtticStairsFromTheCategoryGivenInThePopularAtticLaderCategory() throws Throwable {
    
    
}
	
}

