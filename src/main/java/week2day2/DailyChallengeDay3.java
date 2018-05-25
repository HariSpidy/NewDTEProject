package week2day2;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DailyChallengeDay3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		ChromeDriver drive =new ChromeDriver();
		drive.manage().window().maximize();
		drive.get("http://leafground.com/");
		//to click the dropdown button-->select any one option in it
		drive.findElementByXPath("//h5[text()='Drop down']").click();
		WebElement dropdown = drive.findElementById("dropdown1");
		Select option =new Select(dropdown);
		List<WebElement> selectoption = option.getOptions();
		int lastoption =selectoption.size();
				
				
		for(WebElement eachoption : selectoption)
		{
			int  i=0;
			if(i==lastoption)
			{
				eachoption.click();
			}
			i++ ;
		}
		
		//option.selectByVisibleText("Selenium");
		//to check if the check box is checked or not
		/*drive.findElementByXPath("//h5[text()='Checkbox']").click();
		boolean checkbox = drive.findElementByXPath("(//input[@type='checkbox'])[6]").isEnabled();
		System.out.println("check box is selected :"+checkbox);
		if(checkbox) {
			drive.findElementByXPath("(//input[@type='checkbox'])[6]").click();*/
		}
		
		
	}


