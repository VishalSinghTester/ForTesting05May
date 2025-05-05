package eCommerce.TestCases;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.logging.FileHandler;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
//import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import eCommerce.PageObject.womenDressAddToCart;

public class TC3_AddToCartAndCheckout extends TC2_Women_Printed_Summer_Dress {
	
	
	
	private WebDriver driver; 
	public int intScreenShot = 1;
	
	@BeforeClass
	public void setup1() {
		driver = super.driver; // getDriver() should be a method in TC1_AccountLogin that returns initialized WebDriver
	}
	
	@Test(priority =1)
	public void CheckOut() throws IOException {
		
		System.out.println("Add to cart process is Start");
	    womenDressAddToCart wDATC = new womenDressAddToCart(driver);
	   
	// Some time AddToCart is not visible on 1st attempt. Its a website issue so to get rid of this just changing the size of cloth. 
	   
	   try {
		    // Wait for page load
		
		    WebElement addToCartButton = driver.findElement(By.xpath("//span[text()='Add to cart']")); 
		    
		    if (addToCartButton.isDisplayed()) {
		        addToCartButton.click();
		        
		    } 
		    else {
		    	
		    	WebElement dropdown =	driver.findElement(By.id("group_1"));
				   Select dp = new Select(dropdown);
				    dp.selectByIndex(2);
				    
		    	
		    } }
		    	catch (NoSuchElementException e) {
		    	    System.out.println("Element not found: " + e.getMessage());
		    	} catch (Exception e) {
		    	    System.out.println("Unexpected error: " + e.getMessage());
		    	}
		    
		    
	   //Click on add product
	   System.out.println("1. Click on add product");
	   wDATC.AddProduct();   
	
	   //Click on "Proceed to checkout" button 
	   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	   System.out.println("2. Click on \"Proceed to checkout\" button ");
	   wDATC.CheckOut();
	   
	  
	   //Click on "Proceed to checkout" next page button 
	   System.out.println("3. Procced to checkout1 is Start");	
	   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	   wDATC.CheckOut1();
	   
	  //Click on "Proceed to checkout 2" next page button 
	   System.out.println("4. Procced to checkout2 is Start");	
	   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	   wDATC.CheckOut2();
	   
	    //Click on "Terms of service" 
	   System.out.println("5.click on terms of service");	
	   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	   wDATC.TermsOfService(); 
	   
	   // Click on "Proceed to checkout 3" next page button 
	   System.out.println("6. Procced to checkout2 is Start");	
	   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	   wDATC.CheckOut3(); 
	   
	   
	   // Take a screen Shot ------------------
	   TakesScreenshot screenshot = (TakesScreenshot) driver;
       // Capture the screenshot and save it as a file
       File srcFile = screenshot.getScreenshotAs(OutputType.FILE);
       // Specify the destination path where you want to save the screenshot
       File destFile = new File("E:\\Screenshots\\Fail"+intScreenShot+"\\");
       // Copy the screenshot to the specified location
       FileUtils.copyFile(srcFile, destFile);
       System.out.println("Screenshot saved at: " + destFile.getAbsolutePath());  
	 
    // Take a screen Shot -done -----------------
       
	        intScreenShot++;
	   
	}

}
