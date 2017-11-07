package handlecontrols;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HANDLECONTROLS {
	WebDriver driver;
	
	@Before
	public void open(){
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\Selenium Files\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.seleniumframework.com/Practiceform/");
		
	}
	
	@Test
	public void test() throws Exception{
		driver.findElement(By.id("button1")).click();
		Thread.sleep(2000);
		
		String window1=  driver.getWindowHandle();
		driver.switchTo().window(window1).close();
	}

}
