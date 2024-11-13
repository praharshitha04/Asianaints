package stepDefinations;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;

import elementRepository.InteriorPaintsPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utilPackage.DriverFactory;
import utilityClasses.FileUtility;
import utilityClasses.WebDriverUtility;

public class DisplayProducts {
	WebDriver driver = DriverFactory.getDriver();
	InteriorPaintsPage interiorPaintsPage = new InteriorPaintsPage(driver);
	FileUtility fileUtility=new FileUtility();
	WebDriverUtility webDriverUtility=new WebDriverUtility();

	@When("Click on Luxury Explore")
	public void click_on_luxury_explore() throws Exception {
		webDriverUtility.waitForElementClickable(driver,interiorPaintsPage.getLuxuryEploreNowButton());
		interiorPaintsPage.getLuxuryEploreNowButton().click();
		String expectedUrlSubstring = fileUtility.getDataFromPropertiesFiles("luxuryurl");
		webDriverUtility.waitForUrlToContain(driver, expectedUrlSubstring);
		Assert.assertTrue(driver.getCurrentUrl().contains(expectedUrlSubstring));
		Reporter.log("Successfully Clicked Explore Now", true);

	}

	@When("Display All Luxury products")
	public void display_all_luxury_products() {
		Assert.assertTrue(interiorPaintsPage.getLuxuryLogo().isDisplayed());
		Reporter.log("Successfully displayed the products of Luxury Type", true);

	}

	@Then("Click on all")
	public void click_on_all() throws Exception {
		webDriverUtility.checkVisibilityOfElement(driver,interiorPaintsPage.getAllButton());
		interiorPaintsPage.getAllButton().click();
		String expectedUrlSubstring = fileUtility.getDataFromPropertiesFiles("allurl");
		webDriverUtility.waitForUrlToContain(driver, expectedUrlSubstring);
		Assert.assertTrue(driver.getCurrentUrl().contains(expectedUrlSubstring));
		Reporter.log("Successfully Clicked on AllButton", true);
	}

	@Then("All products should be displayed")
	public void all_products_should_be_displayed() {
		Assert.assertTrue(interiorPaintsPage.getAllLogo().isDisplayed());
		Reporter.log("Successfully displayed the products of All Type", true);

	}

}
