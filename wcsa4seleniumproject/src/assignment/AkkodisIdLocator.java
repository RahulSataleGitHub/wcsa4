package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AkkodisIdLocator {

public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://dx.akka.eu/webui/login.html");
		
		driver.findElement(By.id("username")).sendKeys("sachin");
		Thread.sleep(2000);
		
		driver.findElement(By.id("password")).sendKeys("sachin@123");
		Thread.sleep(2000);
		
		driver.findElement(By.id("button")).click();
		Thread.sleep(2000);
		driver.close();
	}
}
