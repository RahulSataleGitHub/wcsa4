package popup;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopUp {

public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("file:///C:/RAHUL%20FOLDER/Selenium%20Data/WebElements/Alert2.html");
		
		WebElement button = driver.findElement(By.xpath("//button[.='Click me!']"));
		button.click();
		
		//now switch ur control to alert pop up..
		
		Alert al = driver.switchTo().alert();
		Thread.sleep(2000);
		
		//accept the Alert pop up
		
		//al.accept();
		
		//dismiss the Alert pop up
		
		//al.dismiss();
		
		String textOfAlert = al.getText();
		System.out.println(textOfAlert);
		
		//al.sendKeys("admin");
		
		Thread.sleep(2000);
		driver.close();
		
}
}
