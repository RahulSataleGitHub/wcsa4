package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NikeIdLocator {

public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.nike.com/my/member/profile/login?continueUrl=https://www.nike.com/my/");
		
		driver.findElement(By.id("ab1d254f-8671-4dd9-8612-aecc5d8412cc")).sendKeys("sachin");
		Thread.sleep(2000);
		
		driver.findElement(By.id("a1bbfd0c-5418-4b74-8c8f-da7d51ad89f2")).sendKeys("sachin@123");
		Thread.sleep(2000);
		
		driver.findElement(By.id("c97fdc93-871f-4086-8fff-81e707c19a79")).click();
		Thread.sleep(2000);
		driver.close();
	}
}
