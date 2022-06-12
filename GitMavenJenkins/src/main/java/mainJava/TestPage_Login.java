package mainJava;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class TestPage_Login extends BaseClass123 {
	@FindBy(xpath = "//input[@id='userid']")
	WebElement username;
	
	@FindBy(id="password")
	WebElement id;
	
	@FindBy(xpath ="//button[@type='submit']")
	WebElement loginbtn1;
	
	@FindBy(id="pin")
	WebElement pin;
	
	@FindBy(xpath ="//button[@type='submit']")
	WebElement loginbtn2;
	
	public TestPage_Login(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
	}
	
	public String verifyTitle(String exptitle) {
		String title =driver.getTitle();
		Assert.assertEquals(title,exptitle );
		return title;
		
	}
	
	public String VerifyUrl(String expurl) {
		String actUrl=driver.getCurrentUrl();
		Assert.assertEquals(actUrl,expurl );
		return actUrl;
	}
	
	public void loginMethod( String usernamegive,String giveid) {   // Write methods
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		username.sendKeys(usernamegive);
		id.sendKeys(giveid);
		loginbtn1.click();
			
	}
	
	public void loginTOmain(String givpin) {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		pin.sendKeys(givpin);
		loginbtn2.click();
		}
}
