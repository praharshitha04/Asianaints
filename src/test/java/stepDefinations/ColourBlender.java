package stepDefinations;

import static org.testng.Assert.assertTrue;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;

import elementRepository.MyColourPicker;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utilPackage.DriverFactory;
import utilityClasses.JavaUtility;
import utilityClasses.WebDriverUtility;

public class ColourBlender 
{
	WebDriver driver=DriverFactory.getDriver();
	MyColourPicker myColourPicker=new MyColourPicker(driver);
	WebDriverUtility webDriverUtility=new WebDriverUtility();
	JavaUtility javaUtility=new JavaUtility();
	
	@Given("Click on DiscoverMeraWalaShades")
	public void click_on_discover_mera_wala_shades()  {
		myColourPicker.getMeraWalaShadeButton().click();
	}

	@Given("Click on Lets Find Your Shade Button")
	public void click_on_lets_find_your_shade_button() throws InterruptedException {
		myColourPicker.getLetsFindYourShadeButton().click();
		myColourPicker.getName().sendKeys("harshitha");
		String email="gpraharshitha"+javaUtility.getRandomNumber()+"@gmail.com";
		myColourPicker.getEmail().sendKeys(email);
		myColourPicker.getNextArrowButton().click();
		Thread.sleep(5000);
	}

	@When("Click on Creative and Fasionista")
	public void click_on_creative_and_fasionista() throws InterruptedException 
	{
	    myColourPicker.getCreativeButton().click();
	    Thread.sleep(2000);
	    myColourPicker.getFashionistaButton().click();
	    Thread.sleep(2000); 
	}
	@When("Click on Lets dive in button")
	public void click_on_lets_dive_in_button() {
		webDriverUtility.waitForElementClickable(driver,myColourPicker.getletsDriveInButton());
		myColourPicker.getletsDriveInButton().click();
	}

	@Then("Colour Picker page should be displayed")
	public void colour_picker_page_should_be_displayed() 
	{
		assertTrue(myColourPicker.getAsianPaintsLogo().isDisplayed());
	    Reporter.log("Colour Page is dispalyed",true);
	}


}
