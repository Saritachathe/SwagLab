package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class  swagLoginPage {
	
	@FindBy(xpath= "//input[@id='user-name']")private WebElement userName;
	@FindBy(xpath= "//input[@id='password']")private WebElement password;
	@FindBy(xpath= "//input[@id='login-button']")private WebElement login;
	
	public swagLoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	public void enteruserName(String user) {
		userName.sendKeys(user);
	}
	public void enterPassword(String user) {
		password.sendKeys(user);
	}
	public void clickonlogin() {
		login.click();
	}
}
