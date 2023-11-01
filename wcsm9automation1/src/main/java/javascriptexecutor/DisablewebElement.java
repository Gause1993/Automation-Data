package javascriptexecutor;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DisablewebElement 
{
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demoapps.qspiders.com/");
		
		driver.findElement(By.xpath("//p[text()='Disabled Mode']")).click();
		
		//explicit type cast into java script executor
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
	    //username
		js.executeScript("document.getElementById('name').value='Shaikh'\r\n");
		Thread.sleep(2000);
		//mail
		js.executeScript("document.getElementById('email').value='shaikh@1993'\r\n");
		
		//password
		js.executeScript("document.getElementById('password').value='Pune'");
		
		//identify the register button
		WebElement register = driver.findElement(By.xpath("//button[text()='Register']"));
		
		if(register.isDisplayed())
		{
			//js.executeScript("arguments[0].click\r\n",register);
			js.executeScript("arguments[0].click\r\n",register,driver.findElement(By.xpath("//button[@type='submit']")));
			 
			System.out.println("click");
		}
		else
		{
			System.out.println("not click");
		}
		driver.quit();
		
		
		
		
	}

}
