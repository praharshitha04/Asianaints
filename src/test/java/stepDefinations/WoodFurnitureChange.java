package stepDefinations;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.Reporter;

import elementRepository.HomePage;
import elementRepository.WoodFinishPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utilPackage.DriverFactory;
import utilityClasses.FileUtility;
import utilityClasses.JavaScriptUtil;
import utilityClasses.JavaUtility;
import utilityClasses.WebDriverUtility;

public class WoodFurnitureChange {
	WebDriver driver = DriverFactory.getDriver();
	HomePage homePage = new HomePage(driver);
	WoodFinishPage woodFinishPage = new WoodFinishPage(driver);
	WebDriverUtility webDriverUtility = new WebDriverUtility();
	JavaScriptUtil javaScriptUtil = new JavaScriptUtil(driver);
	FileUtility fileUtility = new FileUtility();
	String roomType;

	@Given("Hover on Paints and Colours and click on Wood Finish Visualizer")
	public void hover_on_paints_and_colours_and_click_on_wood_finish_visualizer() {
		webDriverUtility.mouseHover(driver, homePage.getPaintsAndColours());
		homePage.getWoodFinishVisualizer().click();
	}

	@Given("Scroll to Spaces with Wood Finish Text")
	public void scroll_to_spaces_with_wood_finish_text() throws InterruptedException {
		javaScriptUtil.jsScrollBy(0, 2200);
		Thread.sleep(2000);

	}

	@When("Click on Particular {int}")
	public void click_on_particular(Integer room) throws Exception {

		roomType = fileUtility.getDataFromExcel("Rooms", room, 0);
		switch (roomType) {
		case "LivingRoom":
			woodFinishPage.getLivingRoom().click();
			webDriverUtility.checkVisibilityOfElement(driver, woodFinishPage.getLivingRoomImage());
			Reporter.log("Room Type is Selected Successfully");
			break;

		case "Kitchen":
			woodFinishPage.getKitchen().click();
			webDriverUtility.checkVisibilityOfElement(driver, woodFinishPage.getKitchenImage());
			Reporter.log("Room Type is Selected Successfully");
			break;
		case "BedRoom":
			woodFinishPage.getBedRoom().click();
			webDriverUtility.checkVisibilityOfElement(driver, woodFinishPage.getBedRoomImage());
			Reporter.log("Room Type is Selected Successfully");
			break;
		}

	}

	@When("Click on Side Arrow and view the room")
	public void click_on_side_arrow_and_view_the_room() {
		if (roomType.equals("LivingRoom")) {
			webDriverUtility.waitForElementClickable(driver, woodFinishPage.getLivingRoomNextButton());
			woodFinishPage.getLivingRoomNextButton().click();
		} else if (roomType.equals("Kitchen")) {
			webDriverUtility.waitForElementClickable(driver, woodFinishPage.getKitchenNextButton());
			woodFinishPage.getKitchenNextButton().click();

		} else if (roomType.equals("BedRoom")) {
			webDriverUtility.waitForElementClickable(driver, woodFinishPage.getBedRoomNextButton());
			woodFinishPage.getBedRoomNextButton().click();

		}
		Reporter.log("Arrow Button is clicked");

	}

	@Then("Room should be displayed")
	public void room_should_be_displayed() {
		Reporter.log("Room is displayed");

	}

}
