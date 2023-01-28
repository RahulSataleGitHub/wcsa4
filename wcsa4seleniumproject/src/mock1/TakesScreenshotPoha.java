package mock1;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class TakesScreenshotPoha {
	
	public static void main(String[] args) throws InterruptedException, IOException {
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		
		driver.switchTo().activeElement().sendKeys("poha");
		Thread.sleep(2000);
		List<WebElement> suggestions = driver.findElements(By.xpath("//div[@class='wM6W7d']"));
		
		for (WebElement suggest : suggestions) 
		{
			String opt = suggest.getText();
			Thread.sleep(2000);
			System.out.println(opt);
		}
		
	
		File src = driver.getScreenshotAs(OutputType.FILE);
		File dest = new File("./ScreenShot/Screenshot1.jpg");
		Files.copy(src, dest);
		
	}

}
