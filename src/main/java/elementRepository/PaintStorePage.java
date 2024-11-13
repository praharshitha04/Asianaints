package elementRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PaintStorePage {
	/*
	 * Initialize Web Elements of the PaintStorePage Using PageFactory.
	 */
	public PaintStorePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "(//a[contains(text(),'Paint store near me')])[1]")
	private WebElement paintStoreNearMeLink;

	public WebElement getPaintStoreNearMeLink() {
		return paintStoreNearMeLink;
	}

	@FindBy(id = "search-input")
	private WebElement searchInputField;

	public WebElement getSearchInputField() {
		return searchInputField;
	}

	@FindBy(xpath = "//span[@class='spriteIcon-Aprevamp ctaIco']")
	private WebElement searchButton;

	public WebElement getSearchButton() {
		return searchButton;
	}

	@FindBy(xpath = "//h4[text()=' Sree Ganapathy Hardware [sgh] ']")
	private WebElement searchAddress;

	public WebElement getSearchAddress() {
		return searchAddress;
	}

	@FindBy(xpath = "//h4[text()='Sree Ganapathy Hardware [sgh]']")
	private WebElement conformAddress;

	public WebElement getConformAddress() {
		return conformAddress;
	}

}
