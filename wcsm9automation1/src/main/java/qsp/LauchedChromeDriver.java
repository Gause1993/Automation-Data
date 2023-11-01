package qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LauchedChromeDriver {

	public static void main(String[] args) throws InterruptedException
// to launched  the ChromeBrowser we need to create an object for ChromeDriver()
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		System.out.println("Chromeriver is open");
		// stop the execution for 2sec using Thred.Sleep()
		Thread.sleep(4000);
		driver.close();
		
	}

}
