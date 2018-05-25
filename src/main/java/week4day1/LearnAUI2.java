package week4day1;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class LearnAUI2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		ChromeDriver drive =new ChromeDriver();
		drive.manage().window().maximize();
		drive.get("https://jqueryui.com/selectable/");
		drive.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		WebElement frame2 = drive.findElementByClassName("demo-frame");
		drive.switchTo().frame(frame2);
		WebElement item1 = drive.findElementByXPath("//*[@id='selectable']/li[1]");
		WebElement item2 = drive.findElementByXPath("//*[@id='selectable']/li[2]");
		WebElement item3 = drive.findElementByXPath("//*[@id='selectable']/li[3]");
		
		Actions performaction = new Actions(drive);
		performaction.click(item1).perform();
		drive.getKeyboard().sendKeys(Keys.CONTROL);
		performaction.click(item2).perform();
		performaction.click(item3).perform();
		performaction.release();
		
		
	}

}
