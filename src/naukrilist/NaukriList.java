package naukrilist;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NaukriList {
	WebDriver driver;

	@Before

	public void openbefore(){
		System.setProperty("webdriver.gecko.driver", "D:\\Selenium\\Selenium Files\\geckodriver.exe");

		driver= new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.naukri.com/");
}
	
	@Test
	public void starttest(){
		Set<String> set1= driver.getWindowHandles();
		System.out.println("no. of windows :"+ set1.size());
		System.out.println("windows id are:"+ set1);
		
		List<String> list1= new ArrayList<String>();
		Iterator<String> iterator1=set1.iterator();
		
		for(int i=0; i<set1.size();i++){
			list1.add(iterator1.next());
			
		}
		
		driver.switchTo().window(list1.get(0));
		System.out.println(driver.getTitle());
		driver.close();
		
		driver.switchTo().window(list1.get(2));
		System.out.println(driver.getTitle());
		
	}
}
