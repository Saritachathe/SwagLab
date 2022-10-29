package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class addToCart  {

	//@FindBy(xpath="//div[text()='Sauce Labs Bolt T-Shirt']")private WebElement addtocart;
	@FindBy(xpath="//button[@id='add-to-cart-sauce-labs-bolt-t-shirt']")private WebElement addtoCart;
	@FindBy(xpath ="//a[@class='shopping_cart_link']")private WebElement cartLink;
	@FindBy(xpath = "//button[@id='remove-sauce-labs-bolt-t-shirt']")private WebElement remove;
	@FindBy(xpath ="//button[@id='continue-shopping']")private WebElement continueShopping;
	@FindBy(xpath ="//button[@id='checkout']")private WebElement checkOut;
	
	public addToCart(WebDriver driver) 
	{
		PageFactory.initElements(driver,this);
	}
	 public void clickonaddtoCart()
	 {
		 addtoCart.click();
	 }
	 public void clickoncartlink()
	 {
		 cartLink.click();
	 }public void clickonremove()
	 {
		 remove.click();
	 }
	 public void continueshopping()
	 {
		 continueShopping.click(); 
	 }
	 public void Checkout()
	 {
		 checkOut.click();
	 }
	
	
}
