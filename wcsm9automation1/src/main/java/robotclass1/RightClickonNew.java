package robotclass1;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClickonNew 
{
	public static void main(String[] args) throws InterruptedException, AWTException
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.selenium.dev/");
		
		
		//identify the web element and store into web element
	  WebElement target = driver.findElement(By.xpath("//h2[text()='Getting Started']"));
	  Thread.sleep(2000);
	  
	  //perform right click on getting start by using action class
	  Actions act=new Actions(driver);
	  act.contextClick(target).build().perform();
	  
	  //perform key board action on inspect
	  
	  Robot rbt=new Robot();
	  
	  for(int i=0;i<10;i++)
	  {
		  Thread.sleep(2000);
		  rbt.keyPress(KeyEvent.VK_PAGE_DOWN);
		  rbt.keyRelease(KeyEvent.VK_PAGE_DOWN);
	  }
	  //hit on enter button
	  
	  rbt.keyPress(KeyEvent.VK_ENTER);
	  rbt.keyRelease(KeyEvent.VK_ENTER);
	  
	  
	 
	}

}
