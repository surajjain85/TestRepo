package TestPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Practicesite {
WebDriver driver;
WebDriverWait wait=new WebDriverWait(driver, 20);
@BeforeMethod
public void openbro(){
	System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\Selenium Files\\ChromeDriver\\chromedriver.exe");
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://www.monsterindia.com/");
}

@Test
public void testitng(){
	 //driver.findElement(By.xpath("//a[text()='Jobs']"));
	Actions ac1= new Actions(driver);
	ac1.moveToElement(driver.findElement(By.xpath("//a[text()='Jobs']")));
WebElement ele=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[text()='Advanced Job Search']")));
	ele.click();
	
}
}
