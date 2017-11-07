package myPack01;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class TC01 {
	WebDriver driver;
	
	@Before
	public void launchBrowser(){
		System.setProperty("webdriver.gecko.driver", "D:\\Selenium\\Selenium Files\\chromedriver.exe");
		
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		
		driver.get("http://www.gmail.com");
	}
	
	@Test
	public void atTest01(){
		System.out.println(driver.getTitle());
	}
	
	@After
	public void quitBrowser(){
		driver.quit();
		//driver.close();
	}
}
