package week2day1;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnToFindandPrintNoOfButtons {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		ChromeDriver drive =new ChromeDriver();
		drive.manage().window().maximize();
		drive.get("http://leafground.com/");
		drive.findElementByLinkText("Button").click();
		//to find the total no of buttons
	    List <WebElement> allbuttons =drive.findElementsByTagName("button");
	    int count =allbuttons.size();
	    System.out.println(count);
	    //to print all button names
	    for(WebElement eachbutton : allbuttons) 
	    {
	    	System.out.println(eachbutton.getText());
	    	
	    }
	    //
	    WebElement ele=allbuttons.get(count);
	    System.out.println(ele);
	    //ele.click();
	}

}
