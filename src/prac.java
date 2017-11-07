import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class prac {
WebDriver driver;
	@Before
	public void browser(){

		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\Selenium Files\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.get("https://paytm.com/movies/gurgaon");
	}
	
	@Test
	public void testind() throws Exception{
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//a[@ng-click='nextSlide()']")).click();
		
		driver.findElement(By.xpath("//a[@ng-click='movie.setLanguageMovies(movies[0].language);movie.sendSetLanguageTracking(movies[0].language);']")).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath("//descendant::img[@ng-if='mov.showImage'][2]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("a[text()='08:10 PM']")).click();
		Thread.sleep(5000);
		////a[text()='08:10 PM']
		driver.findElement(By.xpath("descendant::li[@ng-mouseenter='seats.setMouseHover(s)'][13]")).click();
		////descendant::li[@ng-mouseenter='seats.setMouseHover(s)'][13]
	}
}
