package stepDefinations;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;

import elementRepository.LoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utilPackage.DriverFactory;
import utilityClasses.FileUtility;
import utilityClasses.JavaScriptUtil;
import utilityClasses.WebDriverUtility;

public class AsianPaintsLogin 
{
	WebDriver driver=DriverFactory.getDriver();
	LoginPage loginPage=new LoginPage(driver);
	WebDriverUtility webDriverUtility=new WebDriverUtility();
	JavaScriptUtil javaScriptUtil=new JavaScriptUtil(driver);
	FileUtility fileUtility=new FileUtility();
	@Given("Click on Login icon")
	public void click_on_login_icon() throws InterruptedException {
		webDriverUtility.waitForElementClickable(driver,loginPage.getLoginLogo()); 
		loginPage.getLoginLogo().click();
		
	}
	@When("Enter Phonenumber of ten Digits")
	public void enter_phonenumber_of_ten_digits() throws Exception {
		webDriverUtility.waitForElementPresent(driver,loginPage.getPhoneNumberFeild());
		loginPage.getPhoneNumberFeild().sendKeys(fileUtility.getDataFromPropertiesFiles("phonenumber"));
	}

	@When("Click on proceed")
	public void click_on_proceed() {
		webDriverUtility.waitForElementClickable(driver,loginPage.getProceedButton());
	    loginPage.getProceedButton().click();
	}

	@When("Fill all the Details")
	public void fill_all_the_details() {
	    
	}

	@Then("Click on Proceed to SignUp")
	public void click_on_proceed_to_sign_up() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("Validate the login")
	public void validate_the_login() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	

}
