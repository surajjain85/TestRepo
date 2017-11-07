package clicklinks;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CLICKLINKS {
WebDriver driver;

@Before

public void open(){
System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\Selenium Files\\chromedriver.exe");
	
	driver= new ChromeDriver();
	//System.setProperty("webdriver.gecko.driver", "D:\\Selenium\\Selenium Files\\geckodriver.exe");
	
	//driver = new FirefoxDriver();
	
	driver.manage().window().maximize();
	driver.get("https://www.naukri.com/");
}

@Test
public void testing() throws Exception{
	System.out.println("browser started");
	//test job
	
	driver.findElement(By.xpath("//span[text()=' Search Jobs ']")).click();
	driver.findElement(By.name("qp")).sendKeys("java");
	driver.findElement(By.name("ql")).sendKeys("gurgaon");
	//use tab for selection experience
	driver.findElement(By.name("ql")).sendKeys(Keys.TAB);
	Thread.sleep(2000);
	
	driver.findElement(By.name("ql")).sendKeys(Keys.ARROW_DOWN);
	driver.findElement(By.name("ql")).sendKeys(Keys.ARROW_DOWN);
	
	Thread.sleep(2000);
	//selecte salary
	
	driver.findElement(By.name("ql")).sendKeys(Keys.TAB);
	driver.findElement(By.name("ql")).sendKeys(Keys.TAB);
	driver.findElement(By.xpath("//span[@class='close']")).click();
	//switch to frame
	
	driver.switchTo().frame(driver.findElement(By.id("tabP-1")));
	driver.findElement(By.xpath("//a[text()='Markit']")).click();
	
}

}
