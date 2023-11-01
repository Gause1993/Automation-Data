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

public class ScreenshotofWebElement
{
	public static void main(String[] args) throws IOException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.selenium.dev/");
		//identify the web element and store into reference variable
		WebElement element = driver.findElement(By.xpath("//h4[@class='h3 mb-3 selenium-ide']"));
		
		//with the help of object refernece variable call get screen shot method
		
	    File srs = element.getScreenshotAs(OutputType.FILE);
	    File des = new File(".//Screenshortfile//webelement.png");
	    
	    //copy the destination
	    
	    Files.copy(srs, des);
		
		
	}

}
