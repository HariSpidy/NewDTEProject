
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Naveen {

	public static void main(String[] args) throws InterruptedException {
	   //Lauching of chrome driver
		/*System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElementByXPath("/html/body/div[2]/div/div/button").click();
		Actions perform = new Actions(driver);
		WebElement electronicsButton = driver.findElementByXPath("//span[text()='Electronics']");
		WebElement samsungbutton = driver.findElementByXPath("//span[text()='Samsung']");
		perform.moveToElement(electronicsButton);
		Thread.sleep(2000);
*/
		//Lauching of chrome driver
				System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		        ChromeDriver driver = new ChromeDriver();
				driver.manage().window().maximize();
				driver.get("https://www.flipkart.com/");
				driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

				//Close the login screen
				driver.findElementByXPath("//button[@class='_2AkmmA _29YdH8']").click();
				Actions builder = new Actions(driver);
				//Mouse over to TVs & Appliances
				WebElement tvElect = driver.findElementByXPath("//span[text()='TVs & Appliances']");
				builder.moveToElement(tvElect).perform();
				Thread.sleep(2000);
				//Click on Samsung product
				WebElement samsung = driver.findElementByXPath("(//span[contains(text(),'Samsung')])[2]/..");
				samsung.click();
	}
}
