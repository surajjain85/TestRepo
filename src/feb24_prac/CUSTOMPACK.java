package feb24_prac;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class CUSTOMPACK {
	WebDriver driver;
	@BeforeMethod
	
	public void open(String browser){
		
		if(browser.equalsIgnoreCase("firefox")){
			System.setProperty("webdriver.gecko.driver", "D:\\Selenium\\Selenium Files\\geckodriver.exe");
			driver= new FirefoxDriver();
			
		}
		
		else if(browser.equalsIgnoreCase("ie")){
			System.setProperty("webdriver.ie.driver", "D:\\Selenium\\Selenium Files\\IEDriverServer.exe");
			driver=new InternetExplorerDriver();
			
		}
		
		else{
			System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\Selenium Files\\chromedriver.exe");
			driver= new ChromeDriver();
			
			
		}
		driver.manage().window().maximize();
	}
	
	
	@AfterMethod
	public void close(){
		//driver.quit();
	}

}
