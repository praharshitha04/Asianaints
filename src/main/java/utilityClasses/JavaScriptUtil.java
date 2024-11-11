package utilityClasses;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class JavaScriptUtil {

	private JavascriptExecutor javaScript;
	
	public JavaScriptUtil(WebDriver driver) {
		javaScript = (JavascriptExecutor) driver;
	}
	

	public void jsClick(WebElement element) {
		javaScript.executeScript("arguments[0].click();", element);
	}


	public void jsSendkeys(String data,WebElement element) {
		javaScript.executeScript("arguments[0].value='"+data+"';", element);
	}
	

	public void jsScrollBy(int X,int Y) {
		javaScript.executeScript("window.scrollBy("+X+","+Y+")");
	}


	public void jsScrollTo(int X,int Y) {
		javaScript.executeScript("window.scrollTo("+X+","+Y+")");
	}


	public void jsScrollIntoView(boolean bool,WebElement element) {
		javaScript.executeScript("arguments[0].scrollIntoView("+bool+")",element);
	}

	public void jsScrollToBottomOfThePage() {
		javaScript.executeScript("arguments[0].scrollBy(0,document.body.scrollHeight')");
	}
	

	public String jsFetchVale(WebElement element) {
		return (String)javaScript.executeScript("return arguments[0].value",element);
	}	

	public void jsRefresh() {
		javaScript.executeScript("history.go(0)");
	}

	public void jsClear(WebElement element) {
		javaScript.executeScript("arguments[0].value='';",element);
	}
}
