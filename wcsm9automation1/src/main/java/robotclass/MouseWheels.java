package robotclass;

import java.awt.AWTException;
import java.awt.Robot;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MouseWheels
{
	public static void main(String[] args) throws AWTException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://blustonearchitecture.com/");
		//driver.findElement(By.xpath("//span[@class='_30XB9F']")).click();
		
		Robot rbt=new Robot();
		rbt.mouseWheel(50);
		rbt.delay(2000);
		rbt.mouseWheel(-100);
		
		
	}

}
