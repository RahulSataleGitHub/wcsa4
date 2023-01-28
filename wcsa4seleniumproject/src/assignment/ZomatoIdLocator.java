package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ZomatoIdLocator {

	public static void main(String[] args) throws InterruptedException {
		
		  System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		  WebDriver driver = new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.get("https://www.zomatobook.com/account/login.aspx");
		  
		  driver.findElement(By.name("ctl00$MainContent$LoginControl$UserName")).sendKeys("8769574687");
		  Thread.sleep(2000);
		  
		  driver.findElement(By.name("ctl00$MainContent$LoginControl$Password")).sendKeys("987654");
		  Thread.sleep(2000);
		  
		  driver.findElement(By.id("MainContent_LoginControl_btnLogin")).click();
		  Thread.sleep(2000);
		  driver.close();
		  

		}
}
