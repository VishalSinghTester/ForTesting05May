package eCommerce.PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class womenDressOrder {

	WebDriver ldriver; 
	
	public womenDressOrder(WebDriver rdriver ) {
		
		ldriver = rdriver; 
		
		PageFactory.initElements(rdriver,this);
	}
	
	@FindBy(xpath ="//a[contains(@href, 'id_category=3') and contains(@href, 'controller=category')]")
	WebElement WOMENLIKN; 
	
	
	@FindBy(xpath = "//img[@src='http://www.automationpractice.pl/img/p/1/2/12-home_default.jpg']")
	WebElement summerDress; 
	
	@FindBy(id="availability_value")
	WebElement stockCheck;
	
	
	
	public void clickOnWomenLink() {
		WOMENLIKN.click();	
	}
	
	
	public void printedDress() {
		
		summerDress.click();
	}
	
	public String Stock() {
		
		 return stockCheck.getText();

		}



	
	
}




