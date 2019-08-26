package page.classes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AmazonLoginPage {
	
	WebDriver driver;
	Actions actions;

	
	//Members
	@FindBy(xpath = "//*[text()='Hello, Sign in']")
	WebElement signInDisplayer;

	@FindBy(xpath = "//*[text()='Sign in']")
	WebElement signInButtonA;
	
	@FindBy(id = "ap_email")
	WebElement username;
	
	@FindBy(id = "ap_password")
	WebElement password;
	
	@FindBy(id = "signInSubmit")
	WebElement signInButtonB;
	
	
	
	
	
	
	
	//Initializing AmazonHomePage elements
	public AmazonLoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	//Actions/methods
	
	//bringing Sign In button into view
	public void clickOnSignIn() {
		//hovering over
		actions = new Actions(driver);
		actions.moveToElement(signInDisplayer);
		actions.build().perform();
		//clicking on Sign In
		actions.moveToElement(signInButtonA);
		actions.click().build().perform();
	}
	
	//entering user name
	public void enterUsername(String usn) {
		username.clear();
		username.sendKeys(usn);
	}
	
	//entering user password
	public void enterPassword(String psw) {
		password.clear();
		password.sendKeys(psw);
	}
	
	//entering user password
	public void clickSignInButtonB() {
		signInButtonB.click();
	}
	
	
	
	
	
	

}
