package test;


import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;


public abstract class BaseTest {
	WebDriver driver;
	
	@BeforeClass
	public void setup() {
	
		System.setProperty("webdriver.chrome.driver", "C:\\automation\\browser drivers\\chromeDriver 2.45\\chromeDriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//driver.get("https://www.alljobs.co.il/");
		driver.get("https://form.jotform.me/90504571146453");
	}
	
	

	@AfterClass
	public void tearDown() throws IOException {
		Runtime.getRuntime().exec("taskkill /F /IM chromedriver.exe");
		driver.quit();
	}




	
}
