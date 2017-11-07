package feb24_prac;

import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class OPENCHROME extends CUSTOMPACK {

	@Test
	public void chromtesting() throws Exception{
		driver.get("https://www.compare.com/");
		Thread.sleep(7000);
		driver.findElement(By.xpath("//input[@placeholder='ENTER ZIP CODE']")).sendKeys("61801");
		driver.findElement(By.xpath("//descendant::input[@value='Start Comparing'][2]")).click();
		Thread.sleep(4000);
		//driver.findElement(By.xpath("//descendant::a[@class = 'button ng-isolate-scope'][4]")).click();;
		
		driver.findElement(By.linkText("No, I’ll do it")).click();
		String name=driver.getTitle();
		Reporter.log(name);
	}
}
