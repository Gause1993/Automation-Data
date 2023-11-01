package methodofwebelement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetLocation
{
	public static void main(String[] args)
	{
	   WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("http://omayo.blogspot.com/");
		Point location = driver.findElement(By.name("fname")).getLocation();
		System.out.println(" postion of x axis  "+location   .x);
		System.out.println(" position of y axis "+location   .y);
		
	}

}
