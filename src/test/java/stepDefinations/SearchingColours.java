package stepDefinations;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;

import elementRepository.HomePage;
import elementRepository.ShopingCartPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utilPackage.DriverFactory;
import utilityClasses.FileUtility;
import utilityClasses.WebDriverUtility;

public class SearchingColours {

	WebDriver driver = DriverFactory.getDriver();
	WebDriverUtility webDriverUtility = new WebDriverUtility();
	ShopingCartPage shopingCartPage = new ShopingCartPage(driver);
	HomePage homePage = new HomePage(driver);
	FileUtility fileUtility = new FileUtility();

	@Given("User should hover and Click on PaintsAndColours")
	public void user_should_hover_and_click_on_paints_and_colours() {
//		webDriverUtility.mouseHover(driver, homePage.getSearchIcon());
		homePage.getSearchIcon().click();
//		webDriverUtility.waitForElementPresent(driver,homePage.getSearchField());
//		Assert.assertTrue(homePage.getSearchField().isDisplayed());
		Reporter.log("successfully clicked", true);
	}

	@When("Click on search")
	public void click_on_search() {
		homePage.getSearchField().click();
		Reporter.log("successfully clicked", true);
	}

	@When("Enter the {int} colour Name")
	public void enter_the_colour_name(Integer color) throws Exception {
		String colorName = fileUtility.getDataFromExcel("colours", color, 0);
		homePage.getSearchField().sendKeys(colorName);
		Reporter.log("successfully entered the values", true);

	}

	@When("Click on see all results button")
	public void click_on_see_all_results_button() {

		// Wait for the "See All Results" button to become clickable
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(homePage.getSeeAllResultsButton()));
		homePage.getSeeAllResultsButton().click();
		Reporter.log("successfully clicked", true);

	}

	@Then("Related colourname colours should be displayed")
	public void related_colourname_colours_should_be_displayed() {

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement coloursTextElement = wait.until(ExpectedConditions.visibilityOf(homePage.getColoursText()));

		String coloursText = coloursTextElement.getText();
		Assert.assertTrue(coloursText.contains("Colours"),
				"The related colour name colours were not displayed as expected.");
		Reporter.log("Successfully displayed colours related to colour", true);


	}

}
