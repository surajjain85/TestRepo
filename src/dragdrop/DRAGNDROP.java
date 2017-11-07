package dragdrop;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DRAGNDROP {
	WebDriver driver;
	
	@Before
	public void open(){
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\Selenium Files\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.seleniumframework.com/Practiceform/");
	
	}
	
	@Test
	public void test(){
		/*
		WebElement dragme= driver.findElement(By.id("draga"));
		Actions ac1= new Actions(driver);
		ac1.dragAndDropBy(dragme, 200, 300).perform();   */
		driver.findElement(By.id("alert")).click();
		Alert a1= driver.switchTo().alert();
		a1.dismiss();
		
		
		
				
		
	}

}
