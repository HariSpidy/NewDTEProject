package week4day1;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class LearnAUI3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		ChromeDriver drive =new ChromeDriver();
		drive.manage().window().maximize();
		drive.get("https://jqueryui.com/sortable/");
		drive.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		WebElement frame2 = drive.findElementByClassName("demo-frame");
		drive.switchTo().frame(frame2);
		WebElement item1 = drive.findElementByXPath("//*[@id='sortable']/li[1]");
		//Point item1location = item1.getLocation();
		WebElement item2 = drive.findElementByXPath("//*[@id='sortable']/li[2]");
		//Point item2location = item2.getLocation();
		WebElement item3 = drive.findElementByXPath("//*[@id='sortable']/li[3]");
		//Point item3loction = item3.getLocation();
		//WebElement item4 = drive.findElementByXPath("//*[@id='selectable']/li[4]");
		//Point item4location = item4.getLocation();
		Actions performaction = new Actions(drive);
		performaction.clickAndHold(item1).moveByOffset(item3.getLocation().getX(), item3.getLocation().getY()+5).release().perform();
				
		
	}

}
