package Week3Day3;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClassWorkLearnAlertandFrame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		ChromeDriver drive =new ChromeDriver();
		drive.manage().window().maximize();
		drive.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt");
		drive.switchTo().frame("iframeResult");
		drive.findElementByXPath("//button[text()='Try it']").click();
		
		Alert myalert = drive.switchTo().alert();
		myalert.sendKeys("testleaf");
		myalert.accept();
		WebElement verifyname = drive.findElementByXPath("//p[contains(text(),'testleaf')]");
		String text = verifyname.getText();
		if(text.contains("testleaf"))
		{
			System.out.println("the text test leaf contains");
		}
			else
				System.out.println("no such text is present");
		
		drive.switchTo().defaultContent();
		//drive.close();
		
	}

}
