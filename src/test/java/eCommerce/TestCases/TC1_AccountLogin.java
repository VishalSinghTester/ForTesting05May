package eCommerce.TestCases;


import org.testng.annotations.BeforeClass;


import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import eCommerce.PageObject.AccountLogin;
import eCommerce.PageObject.AlreadyRegisteredUser;

public class TC1_AccountLogin {

	public  WebDriver driver;
	
	@BeforeClass
	public void envirounment() {

	 System.setProperty("webdriver.chrome.driver", "E:\\Vishal My folder\\chromedriver.exe");

	 ChromeOptions options = new ChromeOptions();
     options.addArguments("--remote-allow-origins=*");
     driver = new ChromeDriver(options);
     
	 driver.get("http://www.automationpractice.pl/index.php"); 
	
	
	 AccountLogin AL = new AccountLogin(driver);
	 AL.signIN();
	
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	
	 System.out.print("Browser is open");
	
	 AlreadyRegisteredUser ARU = new AlreadyRegisteredUser(driver);
	
	 ARU.registeredID("abcvishl@gmail.com");
	 ARU.password("Vishal@123");
	 ARU.signup();
	}
	

}
