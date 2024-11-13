package elementRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WoodFinishPage {
	/*
	 * Initialize Web Elements of the WoodFinishPage Using PageFactory.
	 */
	public WoodFinishPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "(//h3[text()='Range of Wood Finishes'])[4]")
	private WebElement rangeOfWoodFinishesText;

	public WebElement getRangeOfWoodFinishesText() {
		return rangeOfWoodFinishesText;
	}

	@FindBy(xpath = "(//li[text()='Living Room'])[1]")

	private WebElement livingRoom;

	public WebElement getLivingRoom() {
		return livingRoom;
	}

	@FindBy(xpath = "(//li[text()='Kitchen'])[1]")
	private WebElement kitchen;

	public WebElement getKitchen() {
		return kitchen;
	}

	@FindBy(xpath = "(//li[text()='Bedroom'])[1]")
	private WebElement bedRoom;

	public WebElement getBedRoom() {
		return bedRoom;
	}

	@FindBy(xpath = "(//li[text()='Kids Room'])[1]")
	private WebElement kidsRoom;

	public WebElement getKidsRoom() {
		return kidsRoom;
	}

	@FindBy(xpath = "(//picture[@class='tabsImageCarouselImg']//img[@alt='bottom-image-cta'])[9]")
	private WebElement kitchenImage;

	public WebElement getKitchenImage() {
		return kitchenImage;
	}

	@FindBy(xpath = "(//picture[@class='tabsImageCarouselImg']//img[@alt='bottom-image-cta'])[2]")
	private WebElement livingRoomImage;

	public WebElement getLivingRoomImage() {
		return livingRoomImage;
	}

	@FindBy(xpath = "(//picture[@class='tabsImageCarouselImg']//img[@alt='bottom-image-cta'])[14]")
	private WebElement bedRoomImage;

	public WebElement getBedRoomImage() {
		return bedRoomImage;
	}

	@FindBy(xpath = "(//button[@class='slick-next slick-arrow'])[1]")
	private WebElement livingRoomNextButton;

	public WebElement getLivingRoomNextButton() {
		return livingRoomNextButton;
	}

	@FindBy(xpath = "(//button[@class='slick-next slick-arrow'])[2]")
	private WebElement kitchenNextButton;

	public WebElement getKitchenNextButton() {
		return kitchenNextButton;
	}

	@FindBy(xpath = "(//button[@class='slick-next slick-arrow'])[3]")
	private WebElement bedRoomNextButton;

	public WebElement getBedRoomNextButton() {
		return bedRoomNextButton;
	}

}
