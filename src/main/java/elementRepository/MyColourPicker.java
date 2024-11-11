package elementRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyColourPicker {
	public MyColourPicker(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	@FindBy(xpath="//a[contains(text(),'Discover mera wala shade')  and @tabindex='-1']")
	private WebElement meraWalaShadeButton;
	public WebElement getMeraWalaShadeButton() {
		return meraWalaShadeButton;
	}
	
	@FindBy(xpath="//img[@class='ap-caption__logo']")
	private WebElement logoImage;
	public WebElement getLogoImage(){
		return logoImage;
	}
	
	@FindBy(xpath="//button[@class='ap-btn ap-btn_outline_primary ap-btn_xxx-large']")
	private WebElement letsFindYourShadeButton;
	public WebElement getLetsFindYourShadeButton() {
		return letsFindYourShadeButton;
	}
	@FindBy(xpath="//h5[@id='perosnaModalLabel']")
	private WebElement whatRepresentsYouText;
	public WebElement getWhatRepresentsYouText(){
		return whatRepresentsYouText;
	}
	@FindBy(xpath="//input[@value='creative']")
	private WebElement creativeButton;
	public WebElement getCreativeButton(){
		return creativeButton;
	}
	@FindBy(xpath="//input[@value='fashionista']")
	private WebElement fashionistaButton;
	public WebElement getFashionistaButton(){
		return fashionistaButton;
	}
	@FindBy(xpath="//input[@value='adventurous']")
	private WebElement adventurousButton;
	public WebElement getAdventurousButton(){
		return adventurousButton;
	}
	@FindBy(xpath="//button[@class='ap-btn ap-btn_primary ap-btn_large' ]//span[@class='ap-btn__label']")
	private WebElement updateButton;
	public WebElement getUpdateButton(){
		return  updateButton;
	}
	@FindBy(id="userModalName")
	private WebElement name;
	public WebElement getName() {
		return name;
	}
	@FindBy(id="userModalEmail")
	private WebElement email;
	public WebElement getEmail() {
		return email;
	}
	@FindBy(xpath="//ap-button[@class='ap-persona-submit mwscustomCta']//span[text()=\"Let's Dive in\"]")

	private WebElement letsDriveInButton;
	public WebElement getletsDriveInButton(){
		return letsDriveInButton;
	}
	
	
	@FindBy(xpath="//button[@class='ap-icon-btn ap-icon-btn_primary ap-icon-btn_circle ap-icon-btn_x-large']")
	private WebElement nextArrowButton;
	public WebElement getNextArrowButton(){
		return nextArrowButton;
	}
	@FindBy(xpath="//button[@id='gradientBtn']")
	private WebElement colourPallate;
	public WebElement getColourPallate(){
		return colourPallate;
	}
	@FindBy(xpath="(//li[@class='ap-eye-dropper ap-eye-dropper_picked'])[1]")
	private WebElement colorPicker1;
	public WebElement getColorPicker1(){
		return colorPicker1;
	}

	@FindBy(xpath="(//li[@class='ap-eye-dropper ap-eye-dropper_picked'])[2]")
	private WebElement colorPicker2;
	public WebElement getColorPicker2(){
		return colorPicker2;
	}
	@FindBy(xpath="(//li[@class='ap-eye-dropper ap-eye-dropper_picked'])[3]")
	private WebElement colorPicker3;
	public WebElement getColorPicker3(){
		return colorPicker3;
	}
	@FindBy(xpath="(//span[@class='ap-icon-btn__icon'])[4]")
	private WebElement closeButton;
	public WebElement getCloseButton(){
		return closeButton;
	}
	@FindBy(xpath="(//img[@class='ap-header__logo ap-header__logo_md'])[1]")
	private WebElement asianPaintsLogo;
	public WebElement getAsianPaintsLogo(){
		return asianPaintsLogo;
	}
	
	
	
	

	
	
	
	
	
	

	
	

}
