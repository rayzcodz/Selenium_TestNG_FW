package page.classes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FBLoginPage {
	WebDriver driver;

	// Members
	@FindBy(id = "email")
	WebElement username;

	@FindBy(id = "pass")
	WebElement password;

	@FindBy(id = "u_0_2")
	WebElement login;

	public FBLoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	// Actions
	public void enterUserName(String destCity) {
		username.clear();
		username.sendKeys(destCity);
	}

	public void enterPasswrord(String destCity) {
		password.clear();
		password.sendKeys(destCity);
	}

	public void clickLogin() {
		login.click();
	}

}
