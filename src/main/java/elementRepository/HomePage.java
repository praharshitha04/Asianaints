package elementRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	/*
	 * Initialize Web Elements of the HomePage Using PageFactory.
	 */

	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[@data-target='#Paintscolours']")
	private WebElement paintsAndColours;

	public WebElement getPaintsAndColours() {
		return paintsAndColours;
	}

	@FindBy(xpath = "(//a[contains(text(),'Interior paints')])[1]")
	private WebElement interiorPaints;

	public WebElement getInteriorPaints() {
		return interiorPaints;
	}

	@FindBy(xpath = "//iframe[@class='__st_preview_frame_bpn']")
	private WebElement iframe;

	public WebElement getIframe() {
		return iframe;
	}

	@FindBy(name = "notnow")
	private WebElement popUp;

	public WebElement getPopUp() {
		return popUp;
	}

	@FindBy(xpath = "//img[@title='close icon' and @height='26']")
	private WebElement closeButton;

	public WebElement getCloseButton() {
		return closeButton;
	}

	@FindBy(xpath = "//img[@alt='mobile-home-decor-image']")
	private WebElement image;

	public WebElement getImage() {
		return image;
	}

	@FindBy(xpath = "//img[@title='search-button' and @fetchpriority='high']")
	private WebElement searchIcon;

	public WebElement getSearchIcon() {
		return searchIcon;
	}

	@FindBy(xpath = "//input[@placeholder='Search']")
	private WebElement searchField;

	public WebElement getSearchField() {
		return searchField;
	}

	@FindBy(xpath = "//a[@data-type='see all results']")
	private WebElement seeAllResultsButton;

	public WebElement getSeeAllResultsButton() {
		return seeAllResultsButton;
	}

	@FindBy(xpath = "//div[contains(text(),'Colours')]")
	private WebElement coloursText;

	public WebElement getColoursText() {
		return coloursText;
	}

	@FindBy(xpath = "(//a[@class='track_third_level'  and contains(text(),'Wood finish visualizer')])[1]")
	private WebElement woodFinishVisualizer;

	public WebElement getWoodFinishVisualizer() {
		return woodFinishVisualizer;
	}

}
