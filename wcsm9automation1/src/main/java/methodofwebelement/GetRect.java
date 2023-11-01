package methodofwebelement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetRect {

	public static void main(String[] args)
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("http://omayo.blogspot.com/");
		Rectangle rect = driver.findElement(By.xpath("//a[text()='Page One']")).getRect();
	    int xaxis = rect.getX();
		int yaxis = rect.getY();
		//get location
		System.out.println("x axis"  + xaxis);
		System.out.println("y axis"  + yaxis);
		// get size
		int height = rect.getHeight();
		int width = rect.getWidth();
		System.out.println("height" + height);
		System.out.println("width"+ width);
		
		
		
		


	}

}
