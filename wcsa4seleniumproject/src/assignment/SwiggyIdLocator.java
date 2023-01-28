package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwiggyIdLocator {

	public static void main(String[] args) throws InterruptedException {
		
		  System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		  WebDriver driver = new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.get("https://www.swiggy.com/");
		  
		  driver.findElement(By.name("mobile")).sendKeys("8769574687");
		  Thread.sleep(2000);
		  
		  driver.findElement(By.name("name")).sendKeys("Rahul");
		  Thread.sleep(2000);
		  
		  driver.findElement(By.name("email")).sendKeys("rahul@123");
		  Thread.sleep(2000);
		  
		  driver.findElement(By.id("")).click();
		  Thread.sleep(2000);
		  driver.close();
		  

		}
}
