package robotclass;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class SectionPageScreenshot 
{
	public static void main(String[] args) throws IOException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("http://omayo.blogspot.com/");
//		//by using xpath identify the web element and store into reference variable
//		WebElement image = driver.findElement(By.xpath("(//div[@class=\"widget-content\"])[33]"));
//		// with the help of reference variable call the get screen shot method
//		File srs = image.getScreenshotAs(OutputType.FILE);
//		File des = new File(".//Screenshortfile//Image.png");
//		
//		//copy the file destination
//		
//		Files.copy(srs, des);
//		driver.quit();
		
		//take the screen shot of web element
		WebElement element = driver.findElement(By.xpath("//a[text()='Page One']"));
		
		//with the help of web element call get screen shot
		
		File srs = element.getScreenshotAs(OutputType.FILE);
		File des = new File(".//Screenshortfile//element.png");
		//copy the file destination
		Files.copy(srs, des);
	
		
	}

}
