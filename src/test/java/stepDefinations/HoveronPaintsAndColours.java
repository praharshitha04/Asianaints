package stepDefinations;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;

import elementRepository.HomePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utilPackage.DriverFactory;
import utilityClasses.FileUtility;
import utilityClasses.JavaScriptUtil;
import utilityClasses.JavaUtility;
import utilityClasses.WebDriverUtility;

public class HoveronPaintsAndColours 
{
	WebDriver driver=DriverFactory.getDriver();
	WebDriverUtility webDriverUtility=new WebDriverUtility();
	FileUtility fileUtility=new FileUtility();
	HomePage homePage=new HomePage(driver); 
	@Given("Browser is Launched and url is navigated")
	public void browser_is_launched_and_url_is_navigated() throws Exception
	{
		Assert.assertEquals(driver.getCurrentUrl(),fileUtility.getDataFromPropertiesFiles("url"));
		Reporter.log("The browser is launched and url is navigated");
	}
	
	@When("User should hover on PaintsAndColours")
	public void user_should_hover_on_paints_and_colours() throws InterruptedException 
	{
//		webDriverUtility.switchToFrame(driver,homePage.getIframe());
//		homePage.getPopUp().click();
//		driver.switchTo().defaultContent();
//		webDriverUtility.mouseHover(driver,homePage.getImage());
//		JavascriptExecutor js = (JavascriptExecutor) driver;
//		js.executeScript("arguments[0].click();", homePage.getCloseButton());
		
		 webDriverUtility.mouseHover(driver,homePage.getPaintsAndColours());
		 Reporter.log("Sucessfully hovered on Paints&Colours",true);
		

	}
	@Then("All Options should be displayed")
	public void all_options_should_be_displayed() throws InterruptedException 
	{
		
	 Assert.assertEquals(homePage.getInteriorPaints().getText(),"");
	 Reporter.log("Yes Options are displayed..",true);
	}
}
