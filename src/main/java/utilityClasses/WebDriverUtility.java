package utilityClasses;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Listeners;

import elementRepository.HomePage;

public class WebDriverUtility {
	/**
	 * This method will help us to maximize the Window
	 * 
	 * @param driver
	 */
	public void implicitWaitAndMaximize(WebDriver driver) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().window().maximize();
	}

	/**
	 * This method will help us to wait till the Element is Present
	 * 
	 * @param driver
	 * @param element
	 */

	public void waitForElementPresent(WebDriver driver, WebElement element) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.visibilityOf(element));
	}

	/**
	 * This method will help us to check the visibility of the element
	 * 
	 * @param driver
	 * @param element
	 */
	public void checkVisibilityOfElement(WebDriver driver, WebElement element) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.visibilityOf(element));
	}

	/**
	 * Waits until the URL of the current page contains the specified substring.
	 * Uses an internal default timeout of 20 seconds.
	 * 
	 * @param driver    The WebDriver instance.
	 * @param substring The substring to wait for in the URL.
	 */
	public void waitForUrlToContain(WebDriver driver, String substring) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.urlContains(substring));
	}

	/**
	 * This method will help us to navigate to another tab based on url
	 * 
	 * @param driver
	 * @param partialUrl
	 */

	public void switchToTabOnUrl(WebDriver driver, String partialUrl) {
		Set<String> childwindow = driver.getWindowHandles();
		for (String window : childwindow) {
			driver.switchTo().window(window);
			if (driver.getCurrentUrl().contains(partialUrl)) {
				break;
			}
		}
	}

	/**
	 * This method will help us to navigate to another tab based on Title
	 * 
	 * @param driver
	 * @param partialTitle
	 */
	public void switchToTabOnTitle(WebDriver driver, String partialTitle) {
		Set<String> childwindow = driver.getWindowHandles();
		for (String window : childwindow) {
			driver.switchTo().window(window);
			if (driver.getTitle().contains(partialTitle)) {
				break;
			}
		}
	}

	/**
	 * This method is used to switch to iframe element based on index
	 * 
	 * @param driver
	 * @param index
	 */
	public void switchToFrame(WebDriver driver, int index) {
		driver.switchTo().frame(index);
	}

	/**
	 * This method is used to switch to iframe element based on name
	 * 
	 * @param driver
	 * @param nameID
	 */

	public void switchToFrame(WebDriver driver, String nameID) {
		driver.switchTo().frame(nameID);
	}

	/**
	 * This method is used to switch to iframe element based on element
	 * 
	 * @param driver
	 * @param element
	 */

	public void switchToFrame(WebDriver driver, WebElement element) {
		driver.switchTo().frame(element);
	}

	/**
	 * This method is used to switch to alert and Accept it
	 * 
	 * @param driver
	 */

	public void switchToAlertAndAccept(WebDriver driver) {
		driver.switchTo().alert().accept();
	}

	/**
	 * This method is used to switch to alert and dismiss it
	 * 
	 * @param driver
	 */

	public void switchToAlertAndCancel(WebDriver driver) {
		driver.switchTo().alert().dismiss();
	}

	/**
	 * This method is used to select the dropdown value by using VisibleText
	 * 
	 * @param element
	 * @param text
	 */

	public void select(WebElement element, String text) {
		Select sel = new Select(element);
		sel.selectByVisibleText(text);
	}

	/**
	 * This method is used to select the dropdown value by using index
	 * 
	 * @param element
	 * @param index
	 */

	public void select(WebElement element, int index) {
		Select sel = new Select(element);
		sel.selectByIndex(index);
	}

	/**
	 * This method is used to Hover on the Particular WebElement
	 * 
	 * @param driver
	 * @param element
	 */

	public void mouseHover(WebDriver driver, WebElement element) {
		Actions act = new Actions(driver);
		act.moveToElement(element).perform();
	}

	/**
	 * This method is used for Double Clicking
	 * 
	 * @param driver
	 * @param element
	 */
	public void doubleClick(WebDriver driver, WebElement element) {
		Actions act = new Actions(driver);
		act.moveToElement(element).perform();
	}

	/**
	 * This will help us to handle the popups of the homepage
	 * 
	 * @param driver
	 * @throws InterruptedException
	 */

	public void handlePopups(WebDriver driver) throws InterruptedException {
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='__st_preview_frame_bpn']")));
		driver.findElement(By.name("notnow")).click();
		driver.switchTo().defaultContent();
		driver.findElement(By.xpath("(//button[@aria-label=\"Close\"])[5]")).click();
		Actions act = new Actions(driver);
		act.moveToElement(driver.findElement(By.xpath("(//img[@title='close icon'])[2]"))).click().perform();

	}

	/**
	 * 
	 * @param driver
	 * @param element This method will help us to wait until the element is clicked
	 */

	public void waitForElementClickable(WebDriver driver, WebElement element) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(element));
	}

	/**
	 * 
	 * @param driver
	 * @param element This method will help us to scroll till the element
	 */

	public void scrollToELement(WebDriver driver, WebElement element) {
		Actions a = new Actions(driver);
		a.scrollToElement(element).perform();
	}

	/**
	 * 
	 * @param driver
	 * @param xOffset
	 * @param yOffset This element will help us to hover according to the
	 *                co-ordinates
	 */
	public void hoverUsingCoordinates(WebDriver driver, int xOffset, int yOffset) {
		Actions actions = new Actions(driver);
		actions.moveByOffset(xOffset, yOffset).perform();

	}

	/**
	 * 
	 * @param driver
	 * @param element This method will help us to wait till the element is scrolled
	 */

	public void waitAndScrollToElement(WebDriver driver, WebElement element) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOf(element));
		scrollToElementTop(driver, element);
	}

	/**
	 * 
	 * @param driver
	 * @param element This method will help us to scroll to the element by using
	 *                actions class
	 */

	public void scrollToElementUsingActions(WebDriver driver, WebElement element) {
		Actions actions = new Actions(driver);
		actions.moveToElement(element).perform();
	}

	/**
	 * 
	 * @param driver
	 * @param element This method will help us to scroll of bottom to the element by
	 *                using actions class
	 */

	public void scrollToElementBottomUsingActions(WebDriver driver, WebElement element) {
		Actions actions = new Actions(driver);
		actions.moveToElement(element).perform();
		actions.scrollByAmount(0, 100).perform();
	}

	public void scrollToElementTop(WebDriver driver, WebElement element) {
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
	}

	public void clickUsingJS(WebDriver driver, WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", element);
	}

}
