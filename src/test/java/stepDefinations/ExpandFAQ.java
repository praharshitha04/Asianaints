package stepDefinations;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.Reporter;

import elementRepository.InteriorPaintsPage;
import elementRepository.HomePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utilPackage.DriverFactory;
import utilityClasses.WebDriverUtility;

public class ExpandFAQ {
	WebDriver driver=DriverFactory.getDriver();
	HomePage homePage=new HomePage(driver);
	WebDriverUtility webDriverUtility=new WebDriverUtility();
	InteriorPaintsPage interiorPaintsPage=new InteriorPaintsPage(driver);
			
	
	@Given("Hover on Paints and Colours and Click on Interior Paints")
	public void hover_on_paints_and_colours_and_click_on_interior_paints() throws InterruptedException 
	{

		webDriverUtility.mouseHover(driver,homePage.getPaintsAndColours());
		homePage.getInteriorPaints().click();
		
	}

	@Given("Scroll down till the FAQ WebElement")
	public void scroll_down_till_the_faq_web_element() 
	{
		webDriverUtility.waitForElementPresent(driver, interiorPaintsPage.getFaqText());
		webDriverUtility.scrollToElementTop(driver, interiorPaintsPage.getFaqText()); 
		Reporter.log("FAQ is displayed",true);
	}

	@When("Click on plus icon")
	public void click_on_plus_icon() throws InterruptedException
	{
		   interiorPaintsPage.getPlusIcon().click();
		   
	}

	@Then("Summery should be displayed")
	public void summery_should_be_displayed()
	{
	    webDriverUtility.waitForElementClickable(driver, interiorPaintsPage.getParagraph());

		Assert.assertTrue(interiorPaintsPage.getParagraph().isDisplayed());
		Reporter.log("FAQ is Expanded",true);
	}
	

}
