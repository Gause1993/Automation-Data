package javascriptexecutor;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class Omayoblogspo
{
	public static void main(String[] args) throws IOException
	{  
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("http://omayo.blogspot.com/");
		//perform scroll operation
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,800)");
		
		js.executeScript("document.getElementById('tb2').value='automation script'");
		WebElement element = driver.findElement(By.id("tb2"));
		//get screen shot
		File srs = element.getScreenshotAs(OutputType.FILE);
	    File des = new File("./Screenshortfile/omayo.png");
	    
	    Files.copy(srs, des);
	}

}
