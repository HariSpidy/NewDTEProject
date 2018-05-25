package week4day1;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class LearnAUI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		ChromeDriver drive =new ChromeDriver();
		drive.manage().window().maximize();
		drive.get("https://jqueryui.com/draggable/");
		drive.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		WebElement frame2 = drive.findElementByClassName("demo-frame");
		drive.switchTo().frame(frame2);	
		//Point framelocation = frame2.getLocation();
		//System.out.println(framelocation);
		WebElement drag = drive.findElementById("draggable");
		Actions performaction = new Actions(drive);
		performaction.dragAndDropBy(drag, 50, 20).perform();
		
		
	}

}
