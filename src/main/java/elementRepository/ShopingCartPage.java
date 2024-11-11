package elementRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ShopingCartPage 
{
	public ShopingCartPage(WebDriver driver){
		PageFactory.initElements(driver,this);
	}
	@FindBy(xpath="//img[@alt='cart-button']")
	private WebElement shopingCartIcon;
	public WebElement getShopingCartIcon() {
		return shopingCartIcon;
	}
	@FindBy(xpath="//div[@class='cta animated-btn-black round-corner-radius-button']")
	private WebElement shopNowButton;
	public WebElement getShopNowButton() {
		return shopNowButton;
	}
	@FindBy(xpath="//img[@alt='interior-walls-lp-thumbnail']")
	private WebElement interiorWallsImage;
	public WebElement getInteriorWallsImage() {
		return interiorWallsImage;
	}
	@FindBy(xpath="//div[@class='walpaints-banner-right-section']//a[@class='animated-arrow-button trackCTA' ]")
	private WebElement viewAllProductsButton;
	public WebElement getViewAllProductsButton() {
		return viewAllProductsButton;
	}
	@FindBy(id="filterButton")
	private WebElement filterButton;
	public WebElement getFilterButton() {
		return filterButton;
	}
	@FindBy(xpath = "//button[@class='compare-brands-button']")
	private WebElement compareSection;
	public WebElement getCompareSection(){
		return compareSection;
	}
	@FindBy(xpath="//div[@data-attr-prodname='Royale Aspira']//span[@class='labelName']")
	private WebElement product1;
	public WebElement getProduct1(){
		return product1;
	}
	@FindBy(xpath="//div[@data-attr-prodname='Apcolite All Protek Matt']//span[@class='labelName']")
	private WebElement product2;
	public WebElement getProduct2(){
		return product2;
	}
	@FindBy(xpath="//legend[text()='range']")
	private WebElement rangeDropdown;
	public WebElement getRangeDropdown(){
		return rangeDropdown;
	}
	@FindBy(xpath="//ul[@class='filter-accordion-options']//span[text()='premium']")
	private WebElement primiumOption;
	public WebElement getPrimiumOption(){
		return primiumOption;
	}
	@FindBy(xpath="//div[text()='premium']")
	private WebElement primiumButton;
	public WebElement getPrimiumButton(){
		return primiumButton;
	}
	@FindBy(xpath="//div[@class='cta compare-now-button animated-btn-yellow-onhover-black round-corner-radius-button brandsPopUp']")
	private WebElement compareNowButton;
	public WebElement getCompareNowButton(){
		return compareNowButton;
	}
	@FindBy(xpath="//h4[text()='Product']")
	private WebElement productText;
	public WebElement getProductText(){
		return productText;
	}
	@FindBy(xpath="//button[@class='apply-button']")
	private WebElement applyButton;
	public WebElement getApplyButton(){
		return applyButton;
	}
}
