package com.org.citi.steps;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.codehaus.plexus.util.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

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
		
		objectRepository = new bookModulePOM(driver);
		
		driver.manage().window().maximize(); // to maximize the window 
	    
	    driver.manage().deleteAllCookies(); // to delete all the cookies 
	    
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); // implicit wait applicable for all the webelements
		
		driver.get("https://www.aircanada.com/ca/en/aco/home.html#/");  // entering the url of the application 
		
	}

	@Then("^User clicks book category in navigation menu$")
	public void userClicksBookCategoryInNavigationMenu() throws Throwable {
	    
		// navigating to book category
		 Actions act = new Actions(driver);
		 Thread.sleep(3000);
		 
		 act.moveToElement(objectRepository.books).perform();
		 Thread.sleep(3000);	 
		
		
	}

	@Then("^User navigates to large corporation in the book category$")
	public void userNavigatesToLargeCorporationInTheBookCategory() throws Throwable {
		
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		 jse.executeScript("arguments[0].click();",objectRepository.largeCorporation);
	    Thread.sleep(5000);
	}

	@Then("^User veryfies the seeflightpasses in the webpage$")
	public void userVeryfiesTheSeeflightpassesInTheWebpage() throws Throwable {
		

		  JavascriptExecutor jse = (JavascriptExecutor)driver;
		    jse.executeScript("arguments[0].scrollIntoView(true)",objectRepository.seeFlightPasses);
		    Thread.sleep(5000);
		//scrolling into view the web element
		
	    WebDriverWait wait = new WebDriverWait(driver,20);
	    wait.until(ExpectedConditions.visibilityOf(objectRepository.seeFlightPasses));
	    
	    jse.executeScript("arguments[0].click();",objectRepository.seeFlightPasses);
		Thread.sleep(5000);
	}

	@Then("^User Validates Alberta Commuter and its price$")
	public void userValidatesAlbertaCommuterAndItsPrice() throws Throwable {
	    
	    objectRepository.AlbertaCommuterValidate = objectRepository.AlbertaCommuter.getText();
	    
	    TakesScreenshot tss = (TakesScreenshot)driver;
	    objectRepository.source = tss.getScreenshotAs(OutputType.FILE);
	    
	    objectRepository.location ="C:\\Users\\krishnakool\\git\\common-\\Automation\\screenShot.png";
	    
	    objectRepository.Destination = new File(objectRepository.location);
	    
	    FileUtils.copyFile(objectRepository.source, objectRepository.Destination);
	    System.out.println(objectRepository.AlbertaCommuterValidate);
	}

	@Then("^User logout of the aircannada application$")
	public void userLogoutOfTheAircannadaApplication() throws Throwable {
	    
	    driver.close();
	}
	
}
