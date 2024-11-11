package stepDefinations;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;

import elementRepository.PaintStorePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utilPackage.DriverFactory;
import utilityClasses.FileUtility;
import utilityClasses.JavaScriptUtil;
import utilityClasses.WebDriverUtility;

public class PaintStoresNearMe {
    WebDriver driver = DriverFactory.getDriver();
    WebDriverUtility webDriverUtility = new WebDriverUtility();
//    FileUtility fileUtility = new FileUtility();
    JavaScriptUtil javaScriptUtil=new JavaScriptUtil(driver);
    PaintStorePage paintStoresNearMe = new PaintStorePage(driver);

    @Given("Click on Paint Store Near Me")
    public void click_on_paint_store_near_me() {
    	webDriverUtility.waitForElementClickable(driver,paintStoresNearMe.getPaintStoreNearMeLink());
    	paintStoresNearMe.getPaintStoreNearMeLink().click();
        Reporter.log("Paint Store near me link is clicked");
    }

    @When("Pincode should be entered")
    public void pincode_should_be_entered() throws Exception {
    	
    	
    	
    	
        webDriverUtility.scrollToElementTop(driver, paintStoresNearMe.getSearchInputField());
        Reporter.log("Pincode is entered", true);
    }

    @When("Click on search button")
    public void click_on_search_button() {
        javaScriptUtil.jsClick(paintStoresNearMe.getSearchButton());
        webDriverUtility.waitForElementClickable(driver,paintStoresNearMe.getSearchButton());
        Reporter.log("Search button is clicked using JavaScriptExecutor");
    }

    @Then("Address should be displayed")
    public void address_should_be_displayed() {
    	webDriverUtility.waitForElementClickable(driver,paintStoresNearMe.getSearchAddress());
    	paintStoresNearMe.getSearchAddress().click();
        Reporter.log("Address is clicked", true);
    }

    @Then("Validate the address")
    public void validate_the_address() {
    	webDriverUtility.checkVisibilityOfElement(driver,paintStoresNearMe.getConformAddress());
        Assert.assertTrue(paintStoresNearMe.getConformAddress().isDisplayed());
        Reporter.log("Address Validation is done", true);
    }
}

