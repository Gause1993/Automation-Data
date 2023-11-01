package robotclass;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Fileupload 
{
	public static void main(String[] args) throws AWTException, InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	    //lauched the URL
	    driver.get("https://demoqa.com/upload-download");
	    driver.findElement(By.xpath("//input[@id='uploadFile']")).sendKeys("C:\\Users\\91956\\Desktop");
//	   WebElement button = driver.findElement(By.xpath("//input[@id='uploadFile']"));
//	   Actions act=new Actions(driver);
//	   act.moveToElement(button).click().perform();
//	    
//	   Robot rb=new Robot();
//	   rb.delay(2000);
//	   //copy the click board path
//	   StringSelection ss = new StringSelection("C:\\Users\\91956\\Desktop");
//	   Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
//	   //perform the crtl+V action on file
//	   rb.keyPress(KeyEvent.VK_CONTROL);
//	   rb.keyPress(KeyEvent.VK_V);
//	   
//	   rb.keyRelease(KeyEvent.VK_CONTROL);
//	   rb.keyRelease(KeyEvent.VK_V);
//	   
//	   rb.keyPress(KeyEvent.VK_ENTER);
//	   rb.keyRelease(KeyEvent.VK_ENTER);
	}
	
	

}
