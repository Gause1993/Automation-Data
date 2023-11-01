package robotclass;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.google.common.io.Files;

public class Bluestone 
{
	public static void main(String[] args) throws IOException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.bluestone.com/");
		driver.findElement(By.id("denyBtn")).click();
		
		WebElement coins = driver.findElement(By.xpath("//a[text()='Coins ']"));
		
		//use action class
		Actions act=new Actions(driver);
		act.moveToElement(coins).click().perform();
		
		WebElement coins1 = driver.findElement(By.xpath("//img[@alt='1 gram 24 KT Gold Coin']"));
		File srs = coins1.getScreenshotAs(OutputType.FILE);
		File des = new File(".//Screenshortfile//coins.png");
		
		//copy the destination
		Files.copy(srs, des);
		
		driver.quit();
		
	}

}
