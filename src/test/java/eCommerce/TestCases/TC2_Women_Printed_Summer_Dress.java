package eCommerce.TestCases;

import org.testng.annotations.Test;

import eCommerce.PageObject.womenDressOrder;

import org.testng.annotations.BeforeClass;
import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;


public class TC2_Women_Printed_Summer_Dress extends TC1_AccountLogin {
	
	public  WebDriver driver; 
	
	@BeforeClass
	public void setup() {
		driver = super.driver; // getDriver() should be a method in TC1_AccountLogin that returns initialized WebDriver
	}
	
	
	@Test (priority =0)
	public void orderWomenDress() {
		
		womenDressOrder wDO = new womenDressOrder(driver);
		
		System.out.print("Click on women link");
		wDO.clickOnWomenLink();
		
		
		
		JavascriptExecutor js = (JavascriptExecutor) driver; 
		js.executeScript("window.scrollBy(0, 500);"); 
		
		//WebElement element = driver.findElement(By.id("elementID"));
		//js.executeScript("arguments[0].scrollIntoView(true);", element);
		
	    driver.manage().window().maximize();
		 
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20)); 
		
		wDO.printedDress();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30)); 
	
	// Enable  try catch block to check avilable stock hardcoded 	
	/*	
		try {
	   WebElement dropdown =	driver.findElement(By.id("group_1"));
	   Select dp = new Select(dropdown);
	    dp.selectByIndex(1);
		} catch (NoSuchElementException e) {
		    System.out.println("Dropdown element not found: " + e.getMessage());
		} catch (Exception e) {
		    System.out.println("An error occurred: " + e.getMessage());
		}
	*/
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20)); 
		
		
		   
		   String stockStatus = wDO.Stock();
		   
		   if (stockStatus.equalsIgnoreCase("In stock"))			   
		   {
			   
			   System.out.println("Product is avilable. So adding it into the cart");
			   
			  driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div/div/div/div[4]/form/div/div[3]/div[1]/p/button/span")).click();
			   
		   }
		   
		   else {
			   
			   
			   System.out.println("Stock Status: " + stockStatus);
			   
			   System.out.println("Product is not avilable");
		   }
		   
		   // If product is not available  then use is to change the size of product. So the product is available 
		   if(!stockStatus.equalsIgnoreCase("In stock")) {
			   
			   try {
				   WebElement dropdown =	driver.findElement(By.id("group_1"));
				   Select dp = new Select(dropdown);
				    dp.selectByIndex(1);
					} catch (NoSuchElementException e) {
					    System.out.println("Dropdown element not found: " + e.getMessage());
					} catch (Exception e) {
					    System.out.println("An error occurred: " + e.getMessage());
					}
			   
		   }
		   
		 
		  
		   }
		   }		

	

