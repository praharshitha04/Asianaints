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

public class DisplayProducts {
	WebDriver driver=DriverFactory.getDriver();
	InteriorPaintsPage interiorPaintsPage= new InteriorPaintsPage(driver);
@When("Click on Luxury Explore")
public void click_on_luxury_explore() 
{
	interiorPaintsPage.getLuxuryEploreNowButton().click();
	Reporter.log("Successfully Clicked Explore Now",true);

}

@When("Display All Luxury products")
public void display_all_luxury_products() 
{
	Assert.assertTrue(interiorPaintsPage.getLuxuryLogo().isDisplayed());
	Reporter.log("Successfully displayed the products of Luxury Type",true);
	
}

@Then("Click on all")
public void click_on_all() 
{
	    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	    
	    // Wait for the "All" button to be visible
	    wait.until(ExpectedConditions.visibilityOf(interiorPaintsPage.getAllButton()));
	    
	    // Click on the "All" button
	    interiorPaintsPage.getAllButton().click();
	    Reporter.log("Successfully Clicked on AllButton", true);
	
//    interiorPaintsPage.getAllButton().click();
//    Reporter.log("Successfully Clicked on AllButton",true);
}

@Then("All products should be displayed")
public void all_products_should_be_displayed() {
	Assert.assertTrue(interiorPaintsPage.getAllLogo().isDisplayed());
	Reporter.log("Successfully displayed the products of All Type",true);
	
	
}


}
