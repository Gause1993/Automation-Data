package robotclass;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class TakeScreenShot
{
	public static void main(String[] args) throws IOException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("http://omayo.blogspot.com/");

		//convert webdriver object into takescreen shot interface here we do downcasting

		TakesScreenshot shot = ((TakesScreenshot)driver);
       // call the get screen method  to create image file
		 File srs = shot.getScreenshotAs(OutputType.FILE);
		 File des = new File(".\\Screenshortfile\\homepage1.png ");
		 
		//copy image file to destination
	    Files.copy(srs, des);
	    driver.quit();
		
	}



}
