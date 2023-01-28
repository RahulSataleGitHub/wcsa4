package seleniumAssignmentBasedOnScenarios;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class Scenario3 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.msedge.driver","./drivers/msedgedriver.exe");
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		
		driver.get("https://jqueryui.com/droppable/");
		Actions act = new Actions(driver);
		WebElement demo = driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
		driver.switchTo().frame(demo);
		WebElement src = driver.findElement(By.xpath("//div[@class='ui-widget-content ui-draggable ui-draggable-handle']"));
		
		WebElement drop = driver.findElement(By.xpath("//div[@class='ui-widget-header ui-droppable']"));
		
		act.dragAndDrop(src, drop).perform();
		Thread.sleep(4000);
		
	}
}
