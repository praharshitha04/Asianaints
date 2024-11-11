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
	
	public void implicitWaitAndMaximize(WebDriver driver) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();
	}	
	public void waitForElementPresent(WebDriver driver , WebElement element) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.visibilityOf(element));
	}	
	public void checkVisibilityOfElement(WebDriver driver , WebElement element) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.visibilityOf(element));
	}

	
	
	
	public void switchToTabOnUrl(WebDriver driver ,String partialUrl) {
		Set<String> childwindow = driver.getWindowHandles();
		for (String window : childwindow) {
			driver.switchTo().window(window);
			if (driver.getCurrentUrl().contains(partialUrl)) {
				break;
			}
		}
	}
	public void switchToTabOnTitle(WebDriver driver ,String partialTitle) {
		Set<String> childwindow = driver.getWindowHandles();
		for (String window : childwindow) {
			driver.switchTo().window(window);
			if (driver.getTitle().contains(partialTitle)) {
				break;
			}
		}
	}
	public void switchToFrame(WebDriver driver , int index)	{
		driver.switchTo().frame(index);
	}
	
	public void switchToFrame(WebDriver driver , String nameID)	{
		driver.switchTo().frame(nameID);
	}
	
	public void switchToFrame(WebDriver driver , WebElement element )	{
		driver.switchTo().frame(element);
	}

	public void switchToAlertAndAccept (WebDriver driver) {
		driver.switchTo().alert().accept();
	}
	
	public void switchToAlertAndCancel (WebDriver driver) {
		driver.switchTo().alert().dismiss();
	}
	
	public void select(WebElement element , String text) {
		Select sel = new Select(element);
		sel.selectByVisibleText(text);
	}
	
	
	public void select(WebElement element , int index) {
		Select sel = new Select(element);
		sel.selectByIndex(index);
	}
	
	public void mouseHover(WebDriver driver , WebElement element) {
		Actions act = new Actions(driver);
		act.moveToElement(element).perform();
	}
	
	public void doubleClick(WebDriver driver , WebElement element) {
		Actions act = new Actions(driver);
		act.moveToElement(element).perform();
	}
	public void handlePopups(WebDriver driver) throws InterruptedException {
//		HomePage homepage=new HomePage(driver);
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='__st_preview_frame_bpn']")));
		driver.findElement(By.name("notnow")).click();
		driver.switchTo().defaultContent();
		driver.findElement(By.xpath("(//button[@aria-label=\"Close\"])[5]")).click();	
		Thread.sleep(3000);
		Actions act = new Actions(driver);
		act.moveToElement(driver.findElement(By.xpath("(//img[@title='close icon'])[2]"))).click().perform();
		
//		driver.switchTo().frame(homepage.getIframe());
//		homepage.getPopUp().click();
//		driver.switchTo().defaultContent();
//	    homepage.getCloseButton().click();	
//		Thread.sleep(3000);
//		Actions act = new Actions(driver);
//		act.moveToElement(driver.findElement(By.xpath("(//img[@title='close icon'])[2]"))).click().perform();
//		
//		
//		
		
	}

	public void scrollToElementTop(WebDriver driver, WebElement element) {
	    ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
	}
	public void clickUsingJS(WebDriver driver, WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
	    js.executeScript("arguments[0].click();", element);
	}
	public void waitForElementClickable(WebDriver driver, WebElement element) {
	    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	    wait.until(ExpectedConditions.elementToBeClickable(element));
	}
	public void scrollToELement(WebDriver driver,WebElement element) {
		Actions a=new Actions(driver);
		a.scrollToElement(element).perform();
	}

	public void hoverUsingCoordinates(WebDriver driver, int xOffset, int yOffset) {
		 Actions actions = new Actions(driver);
		    actions.moveByOffset(xOffset, yOffset).perform();
		
	}

	
	
	
	
	
}
