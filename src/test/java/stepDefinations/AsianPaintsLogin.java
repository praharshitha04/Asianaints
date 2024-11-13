package stepDefinations;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;

import elementRepository.LoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utilPackage.DriverFactory;
import utilityClasses.FileUtility;
import utilityClasses.JavaScriptUtil;
import utilityClasses.JavaUtility;
import utilityClasses.WebDriverUtility;

public class AsianPaintsLogin {
	WebDriver driver = DriverFactory.getDriver();
	LoginPage loginPage = new LoginPage(driver);
	WebDriverUtility webDriverUtility = new WebDriverUtility();
	JavaScriptUtil javaScriptUtil = new JavaScriptUtil(driver);
	FileUtility fileUtility = new FileUtility();
	JavaUtility javaUtility = new JavaUtility();

	@Given("Click on Login icon")
	public void click_on_login_icon() throws Exception {
		webDriverUtility.waitForElementClickable(driver, loginPage.getLoginLogo());
		loginPage.getLoginLogo().click();
		String expectedUrlSubstring = fileUtility.getDataFromPropertiesFiles("loginurl");
		webDriverUtility.waitForUrlToContain(driver, expectedUrlSubstring);
		Assert.assertTrue(driver.getCurrentUrl().contains(expectedUrlSubstring));
		Reporter.log("LoginPage is successfully displayed");
	}

	@When("Enter Phonenumber of ten Digits")
	public void enter_phonenumber_of_ten_digits() throws Exception {
		webDriverUtility.waitForElementPresent(driver, loginPage.getPhoneNumberFeild());
		loginPage.getPhoneNumberFeild().sendKeys(fileUtility.getDataFromPropertiesFiles("phonenumber"));
		Assert.assertTrue(loginPage.getProceedButton().isEnabled());
		Reporter.log("Successfully Entered the number", true);

	}

	@When("Click on proceed")
	public void click_on_proceed() throws InterruptedException {

		webDriverUtility.waitForElementClickable(driver, loginPage.getProceedButton());
		loginPage.getProceedButton().click();
		Thread.sleep(15000);
		Reporter.log("Successfully logged in", true);
	}

	@Then("Validate the login")
	public void validate_the_login() {
		webDriverUtility.waitForElementClickable(driver, loginPage.getLoginLogo());
		loginPage.getLoginLogo().click();
		webDriverUtility.waitForElementPresent(driver, loginPage.getLogout());
		Assert.assertTrue(loginPage.getLogout().isDisplayed());
		Reporter.log("Successfully logged in", true);
	}

}
