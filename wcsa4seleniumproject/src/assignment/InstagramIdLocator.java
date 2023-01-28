package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class InstagramIdLocator {

public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com/");
		
		driver.findElement(By.name("text")).sendKeys("rahulsatale2001@gmail.com");
		Thread.sleep(2000);
		
		driver.findElement(By.name("password")).sendKeys("rahul@123");
		Thread.sleep(2000);
		
		driver.findElement(By.id("submit")).click();
		Thread.sleep(2000);
		driver.close();
	}
}
