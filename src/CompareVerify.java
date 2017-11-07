import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CompareVerify {
	
	WebDriver driver;
	@Before
	public void open(){
		/*System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\Selenium Files\\chromedriver.exe");
		
		driver= new ChromeDriver();*/
		System.setProperty("webdriver.gecko.driver", "D:\\Selenium\\Selenium Files\\geckodriver.exe");
		
		driver = new FirefoxDriver();
		
		driver.manage().window().maximize();
		driver.get("https://motor.compare.com/#/zipcode");

	}

@Test
public void starttest() throws Exception{
	
	driver.findElement(By.id("zipcode")).sendKeys("95620");
	Thread.sleep(5000);
	driver.findElement(By.id("zipcodeContinue")).click();
	Thread.sleep(5000);
	String atext=driver.findElement(By.xpath("//label[text()='Year']")).getText();
	System.out.println(atext);
	
	Assert.assertTrue(atext.equals(atext));
	System.out.println("test is pass");
	
}
}
