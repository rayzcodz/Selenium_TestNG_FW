package test.classes;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import page.classes.LoginPage;
import testbase.TestBase;

public class LoginPageTest extends TestBase {
	
	LoginPage pg;

	@BeforeMethod
	public void navigate() {
		pg = new LoginPage(driver);
		driver.get("https://www.facebook.com/");
		
	}

	@Test(priority = 1)
	public void loginTest() {
		pg.enterUserName("test@gmail.com");
		pg.enterPasswrord("123456");
		pg.clickLogin();
		
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	
}
