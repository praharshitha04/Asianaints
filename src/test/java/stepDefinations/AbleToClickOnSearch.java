package stepDefinations;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.Reporter;

import elementRepository.HomePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utilPackage.DriverFactory;
import utilityClasses.JavaScriptUtil;
import utilityClasses.WebDriverUtility;
public class AbleToClickOnSearch {
	
	WebDriverUtility webDriverUtility=new WebDriverUtility();
	WebDriver driver=DriverFactory.getDriver();
	HomePage homePage=new HomePage(driver);
	JavaScriptUtil javaScriptUtil=new JavaScriptUtil(driver);
	@Given("Click on Paints and Colours")
	public void click_on_paints_and_colours() throws InterruptedException
	{
		webDriverUtility.mouseHover(driver, homePage.getPaintsAndColours());
		javaScriptUtil.jsClick(homePage.getPaintsAndColours());
		Assert.assertTrue(homePage.getPaintsAndColours().isDisplayed());
		Reporter.log("Successfully clicked on Paints&Colours",true);
		
	}

	@When("User clicks on the Search icon")
	public void user_clicks_on_the_search_icon() {
		homePage.getSearchIcon().click();
		webDriverUtility.waitForElementPresent(driver, homePage.getSearchField());
		Assert.assertTrue(homePage.getSearchField().isDisplayed());
		Reporter.log("Search bar is displayed",true);
	}

	@Then("Search bar should be diplayed")
	public void search_bar_should_be_diplayed() {
		Assert.assertTrue(homePage.getSearchField().getAttribute("placeholder").contains("Search"));
		Reporter.log("Search Field is displayed successfully",true);
	}


}
