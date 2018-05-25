package week3day4;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.chrome.ChromeDriver;

public class LearnManageWibdows {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		ChromeDriver drive =new ChromeDriver();
		drive.manage().window().maximize();
		drive.get("https://www.irctc.co.in/eticketing/loginHome.jsf");
		drive.findElementByLinkText("Contact Us").click();
		
		System.out.println(drive.getTitle());
		Set<String> allwindow = drive.getWindowHandles();
		System.out.println(allwindow.size());
		
		List <String> listofwindow = new ArrayList<String>();
		listofwindow.addAll(allwindow);
		String secondwindow = listofwindow.get(2);
		drive.switchTo().window(secondwindow);
		System.out.println(drive.getTitle());
		drive.quit();
		
	}

}
