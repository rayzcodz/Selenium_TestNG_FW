package test.classes;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import page.classes.FBLoginPage;
import testbase.TestBase;

public class FBLoginPageTest extends TestBase {
	
	FBLoginPage pg;

	@BeforeMethod
	public void navigate() {
		pg = new FBLoginPage(driver);
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
