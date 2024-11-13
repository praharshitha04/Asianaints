package stepDefinations;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.Reporter;

import elementRepository.InteriorPaintsPage;
import elementRepository.HomePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utilPackage.DriverFactory;
import utilityClasses.JavaScriptUtil;
import utilityClasses.WebDriverUtility;

public class ExpandFAQ {
	WebDriver driver = DriverFactory.getDriver();
	HomePage homePage = new HomePage(driver);
	WebDriverUtility webDriverUtility = new WebDriverUtility();
	JavaScriptUtil javaScriptUtil = new JavaScriptUtil(driver);
	InteriorPaintsPage interiorPaintsPage = new InteriorPaintsPage(driver);

	@Given("Hover on Paints and Colours and Click on Interior Paints")
	public void hover_on_paints_and_colours_and_click_on_interior_paints() throws InterruptedException {
		webDriverUtility.mouseHover(driver, homePage.getPaintsAndColours());
		homePage.getInteriorPaints().click();
		Reporter.log("Hovered successfully on paints and colours",true);
	}

	@Given("Scroll down till the FAQ WebElement")
	public void scroll_down_till_the_faq_web_element() throws InterruptedException {
		Thread.sleep(3000);
		javaScriptUtil.jsScrollIntoView(true, interiorPaintsPage.getFaqText());
		Assert.assertTrue(interiorPaintsPage.getFaqText().isDisplayed());
		Reporter.log("FAQ is displayed", true);
	}

	@When("Click on Text")
	public void click_on_plus_icon() {
		interiorPaintsPage.getFaqText().click();
		webDriverUtility.waitForElementPresent(driver, interiorPaintsPage.getWord());
		Assert.assertTrue(interiorPaintsPage.getWord().isDisplayed());
		Reporter.log("FAQ is expanded", true);

	}

	@Then("Summery should be displayed")
	public void summery_should_be_displayed() {
		Reporter.log("Summary is displayed", true);
	}

}
