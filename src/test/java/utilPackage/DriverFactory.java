package utilPackage;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import utilityClasses.FileUtility;

public class DriverFactory {
	public static ThreadLocal<WebDriver> driver = new ThreadLocal();

	public static void setUpBrowser() throws Exception {
		FileUtility fileUtility = new FileUtility();
		String browserName = fileUtility.getDataFromPropertiesFiles("browser");
//		String browserName=System.getProperty("browser","chrome");
		String url = fileUtility.getDataFromPropertiesFiles("url");
		if (browserName.equals("chrome")) {
			driver.set(new ChromeDriver());
		} else if (browserName.equals("edge")) {
			driver.set(new EdgeDriver());
		} else if (browserName.equals("firefox")) {
			driver.set(new FirefoxDriver());
		} else {
			driver.set(new ChromeDriver());
		}
		driver.get().manage().window().maximize();
		driver.get().get(url);
		driver.get().manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	}
	/**
	 * This method help us to get the driver reference
	 * @return
	 */

	public static WebDriver getDriver() {
		return driver.get();
	}
	/**
	 * this method is used to quit the browser
	 */
	public static void quitBrowser() {
		if (driver != null)
			driver.get().quit();
	}
}
