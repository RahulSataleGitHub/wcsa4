package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ZomatoBookIdLocator {

public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.zomatobook.com/account/login.aspx?");
		
		driver.findElement(By.id("MainContent_LoginControl_UserName")).sendKeys("sachin");
		Thread.sleep(2000);
		
		driver.findElement(By.id("MainContent_LoginControl_Password")).sendKeys("sachin@123");
		Thread.sleep(2000);
		
		driver.findElement(By.id("MainContent_LoginControl_btnLogin")).click();
		Thread.sleep(2000);
		driver.close();
	}
}
