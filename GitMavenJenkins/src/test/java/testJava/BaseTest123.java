package testJava;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import io.github.bonigarcia.wdm.WebDriverManager;
import mainJava.BaseClass123;
import mainJava.TestPage_Login;



public class BaseTest123 extends BaseClass123 {
	@BeforeClass
	public void initializeBrowser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://kite.zerodha.com/");
		driver.manage().window().maximize();
		
		
	}
	
	@BeforeClass
	public void pageObjects() {
		 login123 = new TestPage_Login(driver); // All page objects are stored in one method
	}
	
	@AfterClass
	public void tearDownBrowser() {
		driver.quit();
	}

}
