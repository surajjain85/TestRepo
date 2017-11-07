import org.apache.commons.collections4.bag.SynchronizedSortedBag;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class VerifyName {
	
	WebDriver driver;
@Before

public void open(){
	/*System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\Selenium Files\\chromedriver.exe");
	
	driver= new ChromeDriver();*/
	System.setProperty("webdriver.gecko.driver", "D:\\Selenium\\Selenium Files\\geckodriver.exe");
	
	driver = new FirefoxDriver();
	
	driver.manage().window().maximize();
	driver.get("https://www.snapdeal.com/products/mobiles-mobile-phones?q=Price%3A499%2C1999%7C&sort=plrty");

}
@Test
public void testing(){
	String text = driver.findElement(By.id("breadCrumbWrapper")).getText();
	System.out.println(text);
	
	
	/*if(text.endsWith("Mobile Phones")){
		System.out.println("User is on Mobile Page");
	}
	
	else{
		System.out.println("User is not on Mobile Page");
		
		throw new RuntimeException("User is not on Mobile Page");
	}*/
	
	//============================
	
	Assert.assertTrue(text.endsWith("Mobile Phones"));
	System.out.println("Done");
	
	//=================================
	/*
	String arr[] = text.split("/");
	
	System.out.println(arr.length);
	
	for(int i = 0; i<arr.length; i++){
		System.out.println(arr[i]);
		
		if(arr[i].contains("Mobile Phones")){
			System.out.println("Found");*/
		
		
		String name1=driver.findElement(By.xpath("//h1[@category='Mobile Phones']")).getText();
		//System.out.println(name1);
		System.out.println(name1);
	
}

}
