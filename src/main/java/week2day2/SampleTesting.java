package week2day2;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SampleTesting 
{

public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();

		//Load the URL
		driver.get("http://testleaf.herokuapp.com/pages/Dropdown.html");

		//maximize the window
		driver.manage().window().maximize();

		WebElement  sample=driver.findElementById("dropdown1");


		Select drop=new Select(sample);

		List<WebElement> alloption = drop.getOptions();

		int lastoption = alloption.size()-1;

		for (WebElement eachop : alloption) 
		{


			int i = 0;
			if ( i==lastoption) 
			{
				eachop.click();
				System.out.println(eachop);
			}
			i++;
		}		
	}
}
