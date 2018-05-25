package week4day2;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ComplexProgramProject {

	public static void main(String[] args) throws InterruptedException {
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
		//In Price filter, select min price to 25000
		WebElement minPrice = driver.findElementByClassName("a_eCSK");
		Select yy = new Select(minPrice);
		yy.selectByValue("25000");
		//In Price filter, select max price to 60000
		WebElement maxPrice = driver.findElementByXPath("(//select[@class='a_eCSK'])[2]");
		Select zz = new Select(maxPrice);
		zz.selectByValue("60000");
		Thread.sleep(2000);
		//Click on Screensize filter
		driver.findElementByXPath("//div[text()='Brand']").click();
		driver.findElementByXPath("//div[text()='Screen Size']").click();
		//Check 48 - 55 size box
		WebElement element = driver.findElementByXPath(("//div[text()='48 - 55']/preceding-sibling::div"));

		WebDriverWait wait = new WebDriverWait(driver, 30);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
		wait.until(ExpectedConditions.elementToBeClickable(element)).click();
		//Click on the first product 
		//Switch to New window 
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//div[@class='_1vC4OE _2rQ-NK'])[1]")));
		WebElement price = driver.findElementByXPath("(//div[@class='_1vC4OE _2rQ-NK'])[1]");
		String tvPrice = price.getText();
		wait.until(ExpectedConditions.elementToBeClickable(driver.findElementByXPath("//div[@class='_3wU53n']")))
				.click();

		Set<String> handles = driver.getWindowHandles();
		for (String string : handles) {
			driver.switchTo().window(string);

		}
		System.out.println(driver.getTitle());
		//Confirm the price on the first window is same as in second window
		WebElement price1 = driver.findElementByXPath("(//div[@class='_1uv9Cb']/div[1])[1]");
		String tvPrice1 = price1.getText();
		if (tvPrice.equalsIgnoreCase(tvPrice1)) {
			System.out.println("TV Price is Matched");
		} else
			System.out.println("TV Price did not Matched");
		//Close the window
		driver.close();
		//Switch back to parent window 
		Set<String> handles1 = driver.getWindowHandles();
		for (String string : handles1) {
			driver.switchTo().window(string);

		}
		//Check Add to Compare for the first 2 products
		driver.findElementByXPath("(//div[@class='_1p7h2j'])[15]").click();
		driver.findElementByXPath("(//div[@class='_1p7h2j'])[16]").click();
        //Click on compare button (on right bottom corner)
		driver.findElementByXPath("//span[text()='COMPARE']").click();
		//Verify the Compare appears as section title
		boolean compare=driver.findElementByXPath("//span[text()='Compare']").isDisplayed();
		if(compare)
			System.out.println("Compare appears as section title");
		else
			System.out.println("Compare does not appears as section title");

		WebElement cmp1 = driver.findElementByXPath("(//div[@class='_1vC4OE'])[3]");
		WebElement cmp2 = driver.findElementByXPath("(//div[@class='_1vC4OE'])[4]");

		String priceOne = cmp1.getText().replace(",", "").replace("₹", "");
		String priceTwo = cmp2.getText().replace(",", "").replace("₹", "");
		System.out.println(priceOne + "--" + priceTwo);
		//Print the lowest price between the two items
		if (Integer.parseInt(priceOne) < Integer.parseInt(priceTwo)) {
			System.out.println("Lowest price is " + priceOne);
		} else {
			System.out.println("The lowest price is " + priceTwo);
		}

	}

}