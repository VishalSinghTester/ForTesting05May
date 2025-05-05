package eCommerce.PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AccountLogin {
	
	WebDriver ldriver; 
	public AccountLogin(WebDriver rdriver) {
		
		ldriver = rdriver; 

		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(className= "login")
	WebElement ClickOnSignUP;
	
	public void signIN() {
		
		ClickOnSignUP.click();
	}	

	
	
}
