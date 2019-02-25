package object;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public abstract class BasePage {
	WebDriver driver;
	WebDriverWait wait;

	public BasePage(WebDriver driver) {
		super();
		this.driver = driver;
		PageFactory.initElements(driver, this);
		wait = new WebDriverWait(driver, 15);

	}


	public void click (WebElement el) {
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("arguments[0].style.border='3px solid red'", el);

		el.click();
	}

	public void fillText (WebElement el, String text) throws IOException {
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("arguments[0].style.border='3px solid red'", el);

		el.click();
		el.clear();
		el.sendKeys(text);

//		File file = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
//		FileUtils.copyFile(file, new File("C:\\Users\\Alex\\Desktop\\QA\\Academy\\Element With Highlight.png"), true);
	}

	public void fillText2 (WebElement el, String text) {
	
		el.sendKeys(text);
	}
	
	public void sendKey(WebElement el) {
		el.sendKeys();
	}

	public String getText (WebElement el) {
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("arguments[0].style.border='1px solid green'", el);
		return el.getText();
	}

//	public void take() throws IOException {
//		File file = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
//		FileUtils.copyFile(file, new File("C:\\Users\\Alex\\Desktop\\QA\\Academy\\Element With Highlight.png"), true);
//	}
	
	public void switchTo(WebElement el) {
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("arguments[0].style.border='10px solid red'", el);
		
		driver.switchTo().frame(el);
	}
	
	public WebElement WaitTillElementExist(String xpath) {
		WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(xpath)));
		return element;
	}
}
