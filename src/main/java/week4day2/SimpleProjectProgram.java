package week4day2;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SimpleProjectProgram {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
		driver.findElementById("email").sendKeys("harispidy.s.v.d.a@gmail.com");
		driver.findElementById("pass").sendKeys("");
		driver.findElementById("loginbutton").click();
		Thread.sleep(3000);
		// driver.switchTo().alert().dismiss();
		driver.findElementByClassName("_1frb").sendKeys("TestLeaf", Keys.ENTER);

		try {
			WebElement likeButton = driver.findElementByXPath("(//button[text()='Like'])[1]");
			if (likeButton.isDisplayed()) {
				{
					likeButton.click();
				}
			}

		} catch (WebDriverException e) {

			System.out.println("Already liked the TestLeaf page");
		}
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.elementToBeClickable(driver.findElementByLinkText("TestLeaf"))).click();
		driver.findElementByLinkText("Reviews").click();
		String text = driver.findElementByXPath("(//div[@class=\"mvm uiP fsm\"])[2]").getText();
		System.out.println("Total Number of Reviews for TestLeaf is: " + text);


	}

}