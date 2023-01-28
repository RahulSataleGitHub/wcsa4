package xpathlocator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathMultipleAttribute {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://in.puma.com/");
		Thread.sleep(2000);
		
		driver.findElement(By.id("cookie-banner-close-btn")).click();
		
		driver.findElement(By.xpath("//h3[@class='tw-8216tu' and (@title,'Softride Pro Coast Training Shoes')]")).click();
		
	

	}

}
