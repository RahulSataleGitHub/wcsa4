package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NikeXpathLoginPage {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.nike.com/my/member/profile/login?continueUrl=https://www.nike.com/my/");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@placeholder='Email address']")).sendKeys("rahulsatale2001@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("rahul@123");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='c97fdc93-871f-4086-8fff-81e707c19a79']")).click();
		Thread.sleep(2000);
		driver.quit();
	}
}
