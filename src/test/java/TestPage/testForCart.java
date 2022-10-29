package TestPage;

import org.testng.annotations.BeforeMethod;

import Pojo.Browser;
import org.testng.annotations.Test
import Utility.PageElement;

public class testForCart extends PageElement {
	
	
	@BeforeMethod
	public void LaunchBrowser()
	{
		driver= Browser.openBrowser();
	}
	
	@Test
	public void addToCart()
	{
		
	}
	

}
