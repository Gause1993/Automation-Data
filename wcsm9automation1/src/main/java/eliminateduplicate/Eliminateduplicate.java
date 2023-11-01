package eliminateduplicate;

import java.time.Duration;
import java.util.HashSet;
import java.util.List;

import org.checkerframework.checker.units.qual.s;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Eliminateduplicate
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("file:///D:/Basic%20of%20html/dropdown.html");
		WebElement menudropdown = driver.findElement(By.id("idddd"));
		
		//get all the option of dropdown
		Select sel=new Select(menudropdown);
		List<WebElement> allops = sel.getOptions();
		
		//to eliminate duplicate we use hash set
		HashSet<String> hs = new HashSet<String>();
		
		//read the list by using for loop and eliminate duplicates
		for(int i=0;i<allops.size();i++)
		{
			WebElement op = allops.get(i); 
			
			//get the text of webelement
			String dropdownoption = op.getText();
			
			//add the dropdown into hashset and remove the duplicate from dropdown
			hs.add(dropdownoption);
		}
		Thread.sleep(2000);
		
		//read he option from hashset by using for each loop
		for(String opt:hs)
		{
			System.out.println(opt);
			
		}
		
		
		
	}

}
