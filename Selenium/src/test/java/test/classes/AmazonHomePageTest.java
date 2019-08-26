package test.classes;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import page.classes.AmazonHomePage;
import page.classes.LoginPage;
import testbase.TestBase;

public class AmazonHomePageTest extends TestBase {
	
	AmazonHomePage pg;

	@BeforeClass
	public void navigate() {
		pg = new AmazonHomePage(driver);
		driver.get("https://www.amazon.com");
		
	}

	@Test(priority = 1)
	public void displaySignInBoxTest() {
		pg.clickOnSignIn();			
	}
	
	@Test(priority = 2)
	public void enterUsernameTest() {
		pg.enterUsername("username");
	}
	
	@Test(priority = 3)
	public void enterPasswordTest() {
		pg.enterPassword("password");
	}
	
	@Test(priority = 4)
	public void clickSignInButtonB() {
		pg.clickSignInButtonB();
	}
	
	
	
	
//	
//	@AfterMethod
//	public void tearDown() {
//		driver.quit();
//	}

}
