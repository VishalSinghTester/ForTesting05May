package eCommerce.PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AlreadyRegisteredUser {

	WebDriver ldriver; 
	public AlreadyRegisteredUser(WebDriver rdriver) {
		
		ldriver = rdriver; 
		
		PageFactory.initElements(rdriver, this );
		
	}
	
	
	@FindBy(id = "email")
	WebElement registeredEmail;

	
	@FindBy(id ="passwd")
	WebElement LoginPassword; 
	
	@FindBy(id="SubmitLogin")
	WebElement SignIn; 
	

	public void registeredID(String EmailID) {
	registeredEmail.sendKeys(EmailID);	
	}
	
	public void password(String Pass) {
		LoginPassword.sendKeys(Pass);
	}
	
	public void signup() {
		SignIn.click();	
	}
	
	
}

