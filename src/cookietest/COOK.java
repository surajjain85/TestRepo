package cookietest;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class COOK {
WebDriver driver;

@Before

public void before(){
	System.setProperty("webdriver.gecko.driver", "D:\\Selenium\\Selenium Files\\geckodriver.exe");

	driver= new FirefoxDriver();
	driver.manage().window().maximize();
	driver.get("https://www.google.co.in");
}
@Test
public void testing(){
	driver.manage().deleteAllCookies();
}

}