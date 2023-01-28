package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DrupalIdLocator0 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.drupal.org/user/login");
		
		driver.findElement(By.id("edit-name")).sendKeys("sachin");
		Thread.sleep(2000);
		
		driver.findElement(By.id("edit-pass")).sendKeys("sachin@123");
		Thread.sleep(2000);
		
		driver.findElement(By.id("edit-submit")).click();
		Thread.sleep(2000);
		driver.close();
	}
}
