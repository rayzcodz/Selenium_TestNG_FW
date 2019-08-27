package page.classes;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AmazonHomePageLinks {
	
	WebDriver driver;
	
	
	
	//Members
	
	//After opening the URL page we will get all links. Log in is not required.
	//Getting all links.
	//@FindBy(tagName = "//a[contains(@href, '://')]")
	@FindBy(tagName = "//a")
	List<WebElement> alllinks;
	
	
	//Using this constructor and PageFactory class we will initialize all the elements on this page.
	//PageFactory.initElements() must be used after page object instantiation to find elements marked with @FindBy annotation.
	public AmazonHomePageLinks(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	
	
	//Actions
	public List<WebElement> getAllActiveLinks() {
		//Retrieving all links and saving into links list
		alllinks = driver.findElements(By.tagName("a"));
		
		//adding all image links as some links can be shown under image
		alllinks.addAll(driver.findElements(By.tagName("img")));
		System.out.println("All links = " + alllinks.size());
		
		//getting active links
		List<WebElement> activeLinks = new ArrayList<WebElement>();
		System.out.println("Active links = " + alllinks.size());
		
		for (int i = 0; i < alllinks.size(); i++) {
			
			//exclude all links that are empty or does not have any href attribute
			if (alllinks.get(i).getAttribute("href") != null && (!alllinks.get(i).getAttribute("href").contains("javascript"))) {
				//excluding empty link, otherwise it would give "java.net.MalformedURLException: no protocol" error.
				if (! alllinks.get(i).getAttribute("href").equals("")) {
					activeLinks.add(alllinks.get(i));
					//System.out.println(alllinks.get(i).getText()); //Conditions of Use
					System.out.println(alllinks.get(i).getAttribute("href")); //https://www.amazon.com/gp/help/customer/display.html?ie=UTF8&nodeId=508088&ref_=footer_cou	
				}
						
			}

			
		}
		
		return activeLinks;
		
	}
	
	

}
