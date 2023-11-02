package webbasedpopup;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Promppopup 
{
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demoapps.qspiders.com/");
		//click on pop up
		driver.findElement(By.xpath("//section[text()='Popups']")).click();
		//click on java script
		driver.findElement(By.xpath("//section[text()='Javascript']")).click();
		//click on prop
		driver.findElement(By.xpath("//a[text()='Prompt']")).click();
		//click on promp alert text box
		driver.findElement(By.xpath("//button[text()='Prompt Alert Box']")).click();
		Thread.sleep(2000);
		//		//handle prop handle pop up and accept
		//		Alert alt = driver.switchTo().alert();
		//		alt.accept();

		//		//handle pop up and dismiss
		//		Alert alt = driver.switchTo().alert();
		//		alt.dismiss();

		//handle pop up and sendkeys
		Alert alt1 = driver.switchTo().alert();
		alt1.sendKeys("yes");
		alt1.accept();
		
	}

}
