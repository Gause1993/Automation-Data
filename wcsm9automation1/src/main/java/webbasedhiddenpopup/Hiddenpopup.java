package webbasedhiddenpopup;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hiddenpopup 
{
	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.letskodeit.com/practice");
		driver.findElement(By.id("hide-textbox")).click();
		//use JavascriptExecutor 
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("document.getElementById('displayed-text').value='Danish'\r\n");
		driver.findElement(By.id("show-textbox")).click();
		
	}

}
