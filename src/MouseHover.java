import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class MouseHover {
	
	WebDriver driver;
	
	public void openbro()
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\Selenium Files\\chromedriver\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.get("http://www.naukri.com/");
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	@Test
	public void tesing(){
		
		Actions ac1= new Actions(driver);
		WebElement ele1= driver.findElement(By.xpath("//descendant::div[@class='mTxt'][5]"));
		ac1.moveToElement(ele1);
		ac1.build().perform();
		
		
		driver.findElement(By.xpath("//a[text()='MCA']")).click();
	}
}
