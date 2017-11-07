package feb24_prac;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class OPENFF extends CUSTOMPACK {
	
	@Test
	public void validatetest() throws Exception {
		driver.get("https://www.snapdeal.com/");
		driver.getTitle();
		Actions ac1= new Actions(driver);
		ac1.moveToElement(driver.findElement(By.xpath("//span[text()='Sign In']")));
		ac1.build().perform();
			Thread.sleep(5000);
			
			//driver.findElement(By.linkText(linkText));
		driver.switchTo().frame(driver.findElement(By.xpath("//span[@class='accountBtn btn rippleWhite']")));
		driver.findElement(By.xpath("//a[text()='login']")).click();
		
		String name=driver.getTitle();
		Reporter.log(name);
	}

}
