package org.baseclass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseeeClasss {

	public static WebDriver driver;

	public static WebDriver getBrowser(String browsername) throws Exception// very important method 1

	{
		try {
			if (browsername.equalsIgnoreCase("chrome")) {
				System.setProperty("webdriver.chrome.driver",
						"C:\\\\Users\\\\admin\\\\eclipse-workspace\\\\samples\\\\Driver\\\\chromedriver.exe");
				driver = new ChromeDriver();

			} else if (browsername.equalsIgnoreCase("ie")) {
				System.setProperty("webdriver.ie.driver",
						System.getProperty("user.dir") + "\\Driver\\IEDriverServer.exe");
				driver = new InternetExplorerDriver();

			} else if (browsername.equalsIgnoreCase("firefox")) {
				System.setProperty("webdriver.gecko.driver",
						System.getProperty("user.dir") + "\\Driver\\geckodriver.exe");
				driver = new FirefoxDriver();

			} else {
				throw new Exception("not a valid browser");
			}
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			return driver;
		} catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException();
		}
	}

	public static void getUrl(String url) {
		try {
			driver.get(url);
		} catch (Exception e) {
			// TODO: handle exception
		}

	}

	public static boolean elementDisplayed(WebElement element) throws Exception {
		try {
			boolean displayed = element.isDisplayed();
			return displayed;
		} catch (Exception e) {
			e.printStackTrace();
			throw new Exception();
		}

	}

	public static boolean elementEnabled(WebElement element) throws Exception {
		try {
			boolean enabled = element.isEnabled();
			return enabled;
		} catch (Exception e) {
			e.printStackTrace();
			throw new Exception();
		}

	}

	public static boolean elementSelected(WebElement element) throws Exception {
		try {
			boolean selected = element.isSelected();
			return selected;
		} catch (Exception e) {
			e.printStackTrace();
			throw new Exception();
		}

	}

	public static void waitUntillElementVisisbility(WebElement element) throws Exception {
		try {
			WebDriverWait wb = new WebDriverWait(driver, 50);
			wb.until(ExpectedConditions.visibilityOf(element));
		} catch (Exception e) {
			e.printStackTrace();
			throw new Exception();
		}

	}

	public static void elementcClear(WebElement element) throws Exception {
		try {
			waitUntillElementVisisbility(element);
			if (elementDisplayed(element) && (elementEnabled(element))) {
				element.clear();
			}

		} catch (Exception e) {
			e.printStackTrace();
			throw new Exception();
		}
	}

	public static void inputValue(WebElement element, String value) throws Exception {
		try {
			waitUntillElementVisisbility(element);
			if (elementDisplayed(element) && (elementEnabled(element))) {
				element.clear();
				element.sendKeys(value);
			}
		} catch (Exception e) {
			e.printStackTrace();
			throw new Exception();
		}

	}

	public static void elementClick(WebElement element) throws Exception {
		try {
			waitUntillElementVisisbility(element);
			if (elementDisplayed(element)) {
				element.click();
			}
		} catch (Exception e) {
			e.printStackTrace();
			throw new Exception();

		}

	}

	public static String getElementText(WebElement element) throws Exception {
		try {
			waitUntillElementVisisbility(element);
			// boolean elementDisplayed = elementDisplayed(element);
			String text = element.getText();
			return text;
		} catch (Exception e) {
			e.printStackTrace();
			throw new Exception();
		}
	}

	public static String getElementAttributeText(WebElement element) throws Exception {
		try {
			waitUntillElementVisisbility(element);
			String attribute = element.getAttribute("value");
			return attribute;
		} catch (Exception e) {
			e.printStackTrace();
			throw new Exception();
		}

	}

	public static String getTitle() throws Exception {
		try {
			String title = driver.getTitle();
			return title;
		} catch (Exception e) {
			e.printStackTrace();
			throw new Exception();

		}

	}

	public static void selectDDusingIndex(WebElement element, int index) throws Exception {
		try {
			waitUntillElementVisisbility(element);
			if (elementDisplayed(element)) {
				Select sc = new Select(element);
				sc.selectByIndex(index);
			}
		} catch (Exception e) {
			e.printStackTrace();
			throw new Exception();
		}
	}

	public static void selectDDusingValue(WebElement element, String value) throws Exception {
		try {
			waitUntillElementVisisbility(element);
			if (elementDisplayed(element)) {
				Select sc = new Select(element);
				sc.selectByValue(value);
			}
		} catch (Exception e) {
			e.printStackTrace();
			throw new Exception();
		}
	}

	public static void selectDDusingVisibilityText(WebElement element, String text) throws Exception {
		try {
			waitUntillElementVisisbility(element);
			if (elementDisplayed(element)) {
				Select sc = new Select(element);
				sc.selectByVisibleText(text);
			}
		} catch (Exception e) {
			e.printStackTrace();
			throw new Exception();
		}
	}

	public static void mouseovertoElement(WebElement element) throws Exception {
		try {
			waitUntillElementVisisbility(element);
			Actions ac = new Actions(driver);
			ac.moveToElement(element).build().perform();
		} catch (Exception e) {
			e.printStackTrace();
			throw new Exception();
		}
	}
	
	public static void dragAndDrop(WebElement source, WebElement target) throws Exception
	{
		try {
			waitUntillElementVisisbility(source);
			Actions ac = new Actions(driver);
			ac.dragAndDrop(source, target).build().perform();
		} catch (Exception e) {
			e.printStackTrace();
			throw new Exception();
		}
		
	}
	
	public static void doubleClick(WebElement element) throws Exception
	{
		try {
			waitUntillElementVisisbility(element);
			Actions ac = new Actions(driver);
			ac.contextClick(element).build().perform();
		} catch (Exception e) {
			e.printStackTrace();
			throw new Exception();
			
		}
	}
	
	public static void inputValueusingActions(WebElement element, String value) throws Exception
	{
		try {
			waitUntillElementVisisbility(element);
			Actions ac = new Actions(driver);
			ac.sendKeys(element, value).build().perform();
		} catch (Exception e) {
			e.printStackTrace();
			throw new Exception();
		}
	}
	
	public static void elementclickUsingActions(WebElement element) throws Exception
	{
		try {
			Actions ac = new Actions(driver);
			ac.click(element).build().perform();
		} catch (Exception e) {
			e.printStackTrace();
			throw new Exception();
		}
	}
	
	public static void scrollUpandDownusingElement(WebElement element) throws Exception
	{
		try {
			waitUntillElementVisisbility(element);
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("Argument[0].scrollIntoView()", element);
		} catch (Exception e) {
			e.printStackTrace();
			throw new Exception();
		}
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
