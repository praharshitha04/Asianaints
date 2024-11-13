package stepDefinations;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.Reporter;

import elementRepository.ShopingCartPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utilPackage.DriverFactory;
import utilityClasses.FileUtility;
import utilityClasses.WebDriverUtility;

public class FilterAndCompare {
	WebDriver driver = DriverFactory.getDriver();
	WebDriverUtility webDriverUtility = new WebDriverUtility();
	ShopingCartPage shopingCartPage = new ShopingCartPage(driver);
	FileUtility fileUtility = new FileUtility();

	@Given("Handle the popUp")
	public void handle_the_pop_up() throws Exception {
		webDriverUtility.handlePopups(driver);
		Assert.assertTrue(driver.getCurrentUrl().contains(fileUtility.getDataFromPropertiesFiles("url")));
		Reporter.log("Popup Handling is done", true);
	}

	@Given("Click on shopping cart icon")
	public void click_on_shopping_cart_icon() {
		webDriverUtility.waitForElementClickable(driver,shopingCartPage.getShopingCartIcon());
		shopingCartPage.getShopingCartIcon().click();
		webDriverUtility.waitForElementPresent(driver, shopingCartPage.getShopingCartDisplay());
		Assert.assertTrue(shopingCartPage.getShopingCartDisplay().isDisplayed());
		Reporter.log("Successfully clicked the Cart", true);
	}

	@When("Click on Shop now")
	public void click_on_shop_now() throws Exception {
		webDriverUtility.mouseHover(driver, shopingCartPage.getShopNowButton());
		shopingCartPage.getShopNowButton().click();
		String expectedUrlSubstring = fileUtility.getDataFromPropertiesFiles("interiorpaintsurl");
		webDriverUtility.waitForUrlToContain(driver, expectedUrlSubstring);
		Assert.assertTrue(driver.getCurrentUrl().contains(expectedUrlSubstring));
		Reporter.log("Successfully clicked on the Shop now Button", true);
	}

	@When("Scroll the page till Interior walls")
	public void scroll_the_page_till_interior_walls() {
		webDriverUtility.scrollToELement(driver, shopingCartPage.getInteriorWallsImage());
		Assert.assertTrue(
				shopingCartPage.getInteriorWallsImage().getAttribute("alt").contains("interior-walls-lp-thumbnail"));
		Reporter.log("Interrior Image Link is dispalyed", true);
	}

	@When("Click on Interior walls")
	public void click_on_interior_walls() {
//		webDriverUtility.waitForElementClickable(driver,shopingCartPage.getInteriorWallsImage());
		shopingCartPage.getInteriorWallsImage().click();
		Assert.assertTrue(shopingCartPage.getViewAllProductsButton().getAttribute("class")
				.contains("animated-arrow-button trackCTA"));
		Reporter.log("Successfully displayed the ViewAll Products button", true);
	}

	@When("Click on view all products")
	public void click_on_view_all_products() {
		webDriverUtility.waitForElementClickable(driver,shopingCartPage.getViewAllProductsButton());
		shopingCartPage.getViewAllProductsButton().click();
		Assert.assertTrue(shopingCartPage.getFilterButton().getAttribute("id").contains("filterButton"));
		Reporter.log("Successfully clicked on view all products", true);

	}

	@Given("Click on Filters")
	public void click_on_filters() {
		shopingCartPage.getFilterButton().click();
		webDriverUtility.waitForElementPresent(driver,shopingCartPage.getRangeDropdown());
		Assert.assertEquals(shopingCartPage.getRangeDropdown().getText(),"Range");
		Reporter.log("Successfully clicked on Filter Button", true);

	}

	@When("Click on Range button")
	public void click_on_range_button() {
		shopingCartPage.getRangeDropdown().click();
		webDriverUtility.waitForElementPresent(driver,shopingCartPage.getPrimiumOption());
		Assert.assertTrue(shopingCartPage.getPrimiumOption().isDisplayed());
		Reporter.log("Successfully clicked on Filter Button", true);

	}

	@When("Options should be displayed")
	public void options_should_be_displayed() {
		webDriverUtility.waitForElementPresent(driver,shopingCartPage.getPrimiumOption());
		Assert.assertEquals(shopingCartPage.getPrimiumOption().getText(), "Premium");
		Reporter.log("All options displayed", true);
	}

	@When("Click on Primium Option")
	public void click_on_primium_option() {
		webDriverUtility.waitForElementClickable(driver,shopingCartPage.getPrimiumOption());
		shopingCartPage.getPrimiumOption().click();
		Assert.assertEquals(shopingCartPage.getPrimiumOption().getText(),"Premium");
		Reporter.log("All options displayed", true);

	}

	@When("Click on Apply")
	public void click_on_apply() {
		
		webDriverUtility.waitForElementClickable(driver,shopingCartPage.getApplyButton());
		shopingCartPage.getApplyButton().click();
		Assert.assertTrue(shopingCartPage.getApplyButton().isEnabled());
		Reporter.log("Apply button is clicked");
	}

	@Then("Primium Products should be displayed")
	public void primium_products_should_be_displayed() {
		Assert.assertTrue(shopingCartPage.getPrimiumButton().isDisplayed());
		Reporter.log("The products are displayed", true);
	}

	@Given("Click on Compare")
	public void click_on_compare() {
		webDriverUtility.waitForElementClickable(driver,shopingCartPage.getCompareSection());
		shopingCartPage.getCompareSection().click();
//		Assert.assertTrue(shopingCartPage.getCompareSection().isEnabled());
		Reporter.log("Compare button is clicked",true);
	}

	@Given("Click on compare button of Royale Aspira")
	public void click_on_compare_button_of_royale_aspira() {
		webDriverUtility.waitForElementClickable(driver,shopingCartPage.getProduct1());
		shopingCartPage.getProduct1().click();
		
		Reporter.log("Product1 is clicked for comparsion",true);
	}

	@Given("Click on compare button of Royale Glitz")
	public void click_on_compare_button_of_royale_glitz() {
		webDriverUtility.waitForElementClickable(driver,shopingCartPage.getProduct2());
		shopingCartPage.getProduct2().click();
		Reporter.log("Product2 is clicked for comparsion",true);
	}
	@When("Click on Compare Now button")
	public void click_on_compare_now_button() throws Exception {
		webDriverUtility.waitForElementClickable(driver,shopingCartPage.getCompareNowButton());
		shopingCartPage.getCompareNowButton().click();
		String expectedUrlSubstring = fileUtility.getDataFromPropertiesFiles("compareurl");
		webDriverUtility.waitForUrlToContain(driver, expectedUrlSubstring);
		Assert.assertTrue(driver.getCurrentUrl().contains(expectedUrlSubstring));
		Reporter.log("Successfully clicked on Compare now button",true);	
	}

	@Then("Products comparisions should be displayed")
	public void products_comparisions_should_be_displayed(){
		Assert.assertEquals(shopingCartPage.getProductText().getText(), "Product");
		Reporter.log("Comparision of products is displayed", true);
	}

}
