package elementRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class InteriorPaintsPage {
	/*
	 * Initialize Web Elements of the InteriorPaintsPage Using PageFactory.
	 */
	public InteriorPaintsPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//h2[contains(text(),'FAQs for Interior Wall Paints')]")
	private WebElement faqText;

	public WebElement getFaqText() {
		return faqText;
	}
	@FindBy(xpath = "//u[text()='interior wall paint']")
	private WebElement word;

	public WebElement getWord() {
		return word;
	}

	@FindBy(xpath = "(//a[@class='animated-arrow-button trackCTA'])[2]")
	private WebElement luxuryEploreNowButton;

	public WebElement getLuxuryEploreNowButton() {
		return luxuryEploreNowButton;
	}

	@FindBy(xpath = "//img[@class='center-logo']")
	private WebElement luxuryLogo;

	public WebElement getLuxuryLogo() {
		return luxuryLogo;
	}

	@FindBy(xpath = "//li[@class='interiorExteriorTab ']//a[text()='All']")
	private WebElement allButton;

	public WebElement getAllButton() {
		return allButton;
	}

	@FindBy(xpath = "//img[@class='center-logo']")
	private WebElement allLogo;

	public WebElement getAllLogo() {
		return allLogo;
	}

}
