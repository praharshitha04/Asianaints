package elementRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PaintStorePage {
	public PaintStorePage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	  
	@FindBy(xpath="(//a[contains(text(),'Paint store near me')])[1]")
	private WebElement paintStoreNearMeLink;
	@FindBy(id="search-input")
	private WebElement searchInputField;
	@FindBy(xpath = "//span[@class='spriteIcon-Aprevamp ctaIco']")
	private WebElement searchButton;
	@FindBy(xpath="//h4[text()=' Jai Maruthi Traders ']")
	private WebElement searchAddress;
	@FindBy(xpath="//div[@class='description']//h4[@class]")
	private WebElement conformAddress;
	
	
	 
	
	
	
	
	
	public WebElement getPaintStoreNearMeLink() {
	    return paintStoreNearMeLink;
	}

	public WebElement getSearchInputField() {
	    return searchInputField;
	}

	public WebElement getSearchButton() {
	    return searchButton;
	}

	public WebElement getSearchAddress() {
	    return searchAddress;
	}

	public WebElement getConformAddress() {
	    return conformAddress;
	}

}
