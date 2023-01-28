package synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchActiTime {

public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		driver.get("http://laptop-pon6rpv8/login.jsp");
		
		String actualLoginPageTitle = driver.getTitle();
		if (actualLoginPageTitle.equals("actiTIME - Login")) 
		{
			System.out.println("Login page Title Is Match : Test case is passed!");
			
		}
		else {
			System.out.println("Login page Title Is not Match : Test case is failed!");
			
		}
		
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("admin");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys("manager");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[.='Login']")).click();
		Thread.sleep(8000);
		
		 String actualHomePageTitle = driver.getTitle();
		 if (actualHomePageTitle.equals("actiTIME - Enter Time-Track")) 
			{
				System.out.println("Homepage Title Is Match : Test case is passed!");
				
			}
			else {
				System.out.println("Homepage Title Is not Match : Test case is failed!");
				}
		 
}
}
