package test.classes;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import page.classes.AmazonHomePageLinks;
import page.classes.SilvercarHomePageLinks;
import testbase.TestBase;

public class SilvecarHomePageLinksTest extends TestBase {
	
	SilvercarHomePageLinks pg;
	
	@BeforeClass
	public void navigateTo() {
		pg = new SilvercarHomePageLinks(driver);
		driver.get("https://www.silvercar.com/");
		
	}
	
	
	@Test(priority = 1)
	public void testAllLinks() throws MalformedURLException, IOException {
		List<WebElement> activeLinks = pg.getAllActiveLinks();
		for(int i = 0; i < activeLinks.size(); i++) {
			//System.out.println(activeLinks.get(i).getAttribute("href"));
			//Checking each URL using HttpURLConnection
			HttpURLConnection connection = (HttpURLConnection) new URL(activeLinks.get(i).
					getAttribute("href")).
					openConnection();
			//connecting/opening the URL
			connection.connect();
			String response = connection.getResponseMessage(); //ok
			connection.disconnect();
			System.out.println(activeLinks.get(i).getAttribute("href") + " ---> " + response);
			
		}
		
		
		
		
		
	}
	
	
	

}
