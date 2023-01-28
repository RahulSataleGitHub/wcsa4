package assignment;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssignmentWindowHandle {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.flipkart.com/");
		
		driver.findElement(By.xpath("//button[.='✕']")).click();
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("iphone 14 pro max",Keys.ENTER);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[.='APPLE iPhone 14 Pro Max (Deep Purple, 128 GB)']")).click();
		Thread.sleep(3000);
		Set<String> han = driver.getWindowHandles();
		for(String win:han)
		{
			driver.switchTo().window(win);
		}
		driver.findElement(By.xpath("(//div[@class='_2C41yO'])[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2U9uOA _3v1-ww']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='_10vWcL td-FUv WDiNrH']/descendant::div[.='Remove']")).click();																														
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//div[.='Remove'])[1]")).click();
		Thread.sleep(2000);
		
		
	}

}
