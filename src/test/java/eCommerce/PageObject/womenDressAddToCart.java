package eCommerce.PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class womenDressAddToCart {
	
	WebDriver ldriver; 
	
	public womenDressAddToCart(WebDriver rdriver) {
		
		ldriver = rdriver;
		
		PageFactory.initElements(rdriver, this );
		
	}
	//add o cart
	@FindBy(xpath="//span[text()='Add to cart']")
	WebElement addToCart;
	
	// Proceed To Check Out 1 time
	@FindBy(xpath="//span[contains(text(), 'Proceed to checkout')]")
	WebElement ProceedToCheckOut; 
	
	// Proceed To Check Out 2 time
	@FindBy(xpath="/html/body/div/div[2]/div/div[3]/div/p[2]/a[1]/span")
	WebElement ProceedToCheckOut1; 
	
	// Proceed To Check Out 3 time
	@FindBy(xpath="/html/body/div/div[2]/div/div[3]/div/form/p/button/span")
	WebElement ProceedToCheckOut2; 
	
	//Terms of service checkbox element
	@FindBy(id="cgv")
	WebElement checkBox; 
	
	
	
	  //'Proceed To Check' Out 4th time after "Terms of service" 
		@FindBy(xpath="/html/body/div/div[2]/div/div[3]/div/div/form/p/button/span")
		WebElement ProceedToCheckOut3; 
	
	
	
	 public void AddProduct() {
		 
		 addToCart.click();
	 }

 public void CheckOut() {
		 
	 ProceedToCheckOut.click();
	 }
 
 public void CheckOut1() {
	 
	 ProceedToCheckOut1.click();
	 }

 public void CheckOut2() {
	 
	 ProceedToCheckOut2.click();
	 }
 
 // Click on 'Terms of service' check box
 public void TermsOfService() {
	 
	 checkBox.click();
	 }
 
 // Click on 'Proceed To Check' 4th time after "Terms of service" 
 public void CheckOut3() {
	 
	 ProceedToCheckOut3.click();
	 }
 
 
}




