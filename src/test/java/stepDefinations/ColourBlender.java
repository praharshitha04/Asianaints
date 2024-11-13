package stepDefinations;

import static org.testng.Assert.assertTrue;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;

import elementRepository.MyColourPicker;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utilPackage.DriverFactory;
import utilityClasses.FileUtility;
import utilityClasses.JavaUtility;
import utilityClasses.WebDriverUtility;

public class ColourBlender {
	WebDriver driver = DriverFactory.getDriver();
	MyColourPicker myColourPicker = new MyColourPicker(driver);
	WebDriverUtility webDriverUtility = new WebDriverUtility();
	JavaUtility javaUtility = new JavaUtility();
	FileUtility fileUtility = new FileUtility();

	@Given("Click on DiscoverMeraWalaShades")
	public void click_on_discover_mera_wala_shades() throws Exception {
		myColourPicker.getMeraWalaShadeButton().click();
		String expectedUrlSubstring = fileUtility.getDataFromPropertiesFiles("merawalashadeurl");
		webDriverUtility.waitForUrlToContain(driver, expectedUrlSubstring);
		Assert.assertTrue(driver.getCurrentUrl().contains(expectedUrlSubstring));
		Reporter.log("MeraWalaShade page is successfully displayed",true);

	}

	@Given("Click on Lets Find Your Shade Button")
	public void click_on_lets_find_your_shade_button() throws Exception {
		myColourPicker.getLetsFindYourShadeButton().click();
		myColourPicker.getName().sendKeys(fileUtility.getDataFromPropertiesFiles("name"));
		String email = fileUtility.getDataFromPropertiesFiles("emailname") + javaUtility.getRandomNumber()
				+ fileUtility.getDataFromPropertiesFiles("extension");
		myColourPicker.getEmail().sendKeys(email);
		webDriverUtility.waitForElementClickable(driver, myColourPicker.getNextArrowButton());
		Assert.assertTrue(myColourPicker.getNextArrowButton().isEnabled());
		myColourPicker.getNextArrowButton().click();
		Reporter.log("Successfully entered name and email",true);
		

	}

	@When("Click on Creative and Fasionista")
	public void click_on_creative_and_fasionista() {
		myColourPicker.getCreativeButton().click();
		myColourPicker.getFashionistaButton().click();
		Assert.assertTrue(myColourPicker.getletsDriveInButton().isEnabled());
		Reporter.log("Sucessfully clicked creative and fashionista buttons",true);

	}

	@When("Click on Lets dive in button")
	public void click_on_lets_dive_in_button() throws Exception {
		webDriverUtility.waitForElementClickable(driver, myColourPicker.getletsDriveInButton());
		myColourPicker.getletsDriveInButton().click();
		String expectedUrlSubstring = fileUtility.getDataFromPropertiesFiles("colourpickerurl");
		webDriverUtility.waitForUrlToContain(driver, expectedUrlSubstring);
		Assert.assertTrue(driver.getCurrentUrl().contains(expectedUrlSubstring));
		Reporter.log("Colour Picker Page is successfully displayed",true);
		
	}

	@Then("Colour Picker page should be displayed")
	public void colour_picker_page_should_be_displayed() {
		assertTrue(myColourPicker.getAsianPaintsLogo().isDisplayed());
		Reporter.log("Colour Page is dispalyed", true);
	}

}
