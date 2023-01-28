package qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class LaunchEdgeBrowser {
	static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
	
		System.setProperty("webdriver.msedge.driver","./drivers/msedgedriver.exe");
		driver = new EdgeDriver();
		driver.get("https://www.instagram.com/");
		Thread.sleep(2000);
	}

}
