package testJava;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class LoginTestClass123 extends BaseTest123{
	@Test(priority =1)
	public void verifuRLTest() {
		
		login123.VerifyUrl("https://kite.zerodha.com/");
		Reporter.log(login123.VerifyUrl("https://kite.zerodha.com/"));
		
	}
	
	@Test(priority = 2)
	public void verifyTitleTest() {
		login123.verifyTitle("Kite - Zerodha's fast and elegant flagship trading platform");
		Reporter.log(login123.verifyTitle("Kite - Zerodha's fast and elegant flagship trading platform"));
	}
	
	@Test(priority =3)
	public void loginMethodTest() {
		login123.loginMethod("HS7848","15031092");
		
	}
	
	@Test(priority=4)
	public void loginToMain() {
		login123.loginTOmain("150310");
	}


}
