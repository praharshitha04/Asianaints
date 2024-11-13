package elementRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilityClasses.FileUtility;

public class LoginPage {
	/*
	 * Initialize Web Elements of the LoginPage Using PageFactory.
	 */

	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//img[@class='before-login'and @alt='profile-button']")
	private WebElement loginLogo;

	public WebElement getLogout() {
		return logout;
	}

	@FindBy(id = "phoneInput")
	private WebElement phoneNumberFeild;

	public WebElement getLoginLogo() {
		return loginLogo;
	}

	@FindBy(id = "phoneSubmit")
	private WebElement proceedButton;

	public WebElement getPhoneNumberFeild() {
		return phoneNumberFeild;
	}

	@FindBy(id = "nameInput")
	private WebElement nameField;

	public WebElement getProceedButton() {
		return proceedButton;
	}

	@FindBy(id = "emailInput")
	private WebElement emailField;

	public WebElement getNameField() {
		return nameField;
	}

	@FindBy(xpath = "(//input[@name='profile.zip'])[2]")
	private WebElement pincodeField;

	public WebElement getEmailField() {
		return emailField;
	}

	@FindBy(id = "registrationSubmit")
	private WebElement registrationButton;

	public WebElement getPincodeField() {
		return pincodeField;
	}

	@FindBy(id = "gigya-checkbox-4232687272998768")
	private WebElement checkboxField;

	public WebElement getCheckboxField() {
		return checkboxField;
	}

	@FindBy(xpath = "//div[@class='cta animated-btn-black round-corner-radius-button gigya-profile-logout-button']")
	private WebElement logout;

	public WebElement getRegistrationButton() {
		return registrationButton;
	}
}
