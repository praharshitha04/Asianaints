package utilityClasses;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class JavaScriptUtil {

	private JavascriptExecutor javaScript;

	/**
	 * This constructor will Type Cast the driver reference to JavascriptExecutor
	 * 
	 * @param driver
	 */
	public JavaScriptUtil(WebDriver driver) {
		javaScript = (JavascriptExecutor) driver;
	}

	/**
	 * This method helps us to click the web element
	 * 
	 * @param element
	 */
	public void jsClick(WebElement element) {
		javaScript.executeScript("arguments[0].click();", element);
	}

	/**
	 * 
	 * @param data
	 * @param element This method will help us to set a value to the element
	 */

	public void jsSendkeys(String data, WebElement element) {
		javaScript.executeScript("arguments[0].value='" + data + "';", element);
	}

	/**
	 * 
	 * @param X
	 * @param Y This method will help us to scroll the page according to the
	 *          co-ordinates
	 */
	public void jsScrollBy(int X, int Y) {
		javaScript.executeScript("window.scrollBy(" + X + "," + Y + ")");
	}

	/**
	 * 
	 * @param X
	 * @param Y This method will help us to scroll the page according to the
	 *          co-ordinates
	 */
	public void jsScrollTo(int X, int Y) {
		javaScript.executeScript("window.scrollTo(" + X + "," + Y + ")");
	}

	/**
	 * 
	 * @param bool
	 * @param element This method will help us to scroll the page till the element
	 */
	public void jsScrollIntoView(boolean bool, WebElement element) {
		javaScript.executeScript("arguments[0].scrollIntoView(" + bool + ")", element);
	}

	/**
	 * This method will help us to scroll the page till the bottom
	 */
	public void jsScrollToBottomOfThePage() {
		javaScript.executeScript("arguments[0].scrollBy(0,document.body.scrollHeight')");
	}

	/**
	 * 
	 * @param driver
	 * @param element This method will help us to scroll the bottom of the element
	 */
	public void scrollToElementBottom(WebDriver driver, WebElement element) {
		int yOffset = element.getLocation().getY();
		javaScript.executeScript("window.scrollTo(0, arguments[0]);", yOffset + 100);

	}

	/**
	 * 
	 * @param element
	 * @return This method will help us to fetch the values
	 */
	public String jsFetchVale(WebElement element) {
		return (String) javaScript.executeScript("return arguments[0].value", element);
	}

	/**
	 * This method will help us to refresh the page
	 */

	public void jsRefresh() {
		javaScript.executeScript("history.go(0)");
	}

	/**
	 * 
	 * @param element this method will help us to clear the data
	 */

	public void jsClear(WebElement element) {
		javaScript.executeScript("arguments[0].value='';", element);
	}

}
