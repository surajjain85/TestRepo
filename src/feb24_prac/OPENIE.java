package feb24_prac;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class OPENIE extends CUSTOMPACK{

	@Test
	public void testingie() throws Exception{
		driver.get("http://www.naukri.com/");
		Thread.sleep(7000);
		driver.findElement(By.xpath("//span[text()=' Search Jobs ']")).click();
		driver.findElement(By.name("qp")).sendKeys("java");
		driver.findElement(By.name("ql")).sendKeys("noida");
		//use tab and select experience
		
		driver.findElement(By.name("ql")).sendKeys(Keys.TAB);
		driver.findElement(By.name("ql")).sendKeys(Keys.ARROW_DOWN);
		driver.findElement(By.name("ql")).sendKeys(Keys.ARROW_DOWN);
		driver.findElement(By.name("ql")).sendKeys(Keys.ARROW_DOWN);
		driver.findElement(By.name("ql")).sendKeys(Keys.ARROW_DOWN);
		driver.findElement(By.name("ql")).sendKeys(Keys.ARROW_DOWN);
		driver.findElement(By.id("qsbFormBtn")).click();
		
		//verify text
		
		String prt=driver.findElement(By.xpath("//h1[@class='small_title']")).getText();
		System.out.println(prt);
		Reporter.log(prt);
	
	}
}
