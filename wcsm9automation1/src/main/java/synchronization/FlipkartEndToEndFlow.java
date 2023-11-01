package synchronization;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartEndToEndFlow 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://omayo.blogspot.com/");
		driver.findElement(By.id("alert1")).click();
		Alert alert = driver.switchTo().alert();
		Thread.sleep(3000);
		String text = alert.getText();
		System.out.println(text);
		driver.quit();
	
		
		
		
		
	}

}
