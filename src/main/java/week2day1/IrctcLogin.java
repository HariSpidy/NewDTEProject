package week2day1;

import java.util.List;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class IrctcLogin {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver drive =new ChromeDriver();
		drive.manage().window().maximize();
		drive.get("https://www.irctc.co.in/eticketing/userSignUp.jsf");
		drive.findElementById("userRegistrationForm:firstName").sendKeys("Hariprasath");
		drive.findElementById("userRegistrationForm:middleName").sendKeys("SenthilKumar");
		drive.findElementById("userRegistrationForm:lastName").sendKeys("S");
		drive.findElementById("userRegistrationForm:gender:0").click();
		drive.findElementById("userRegistrationForm:maritalStatus:0").click();
		WebElement dateofbirth_day = drive.findElementById("userRegistrationForm:dobDay");
		Select day =new Select(dateofbirth_day);
		day.selectByIndex(19);
		WebElement dateofbirth_month = drive.findElementById("userRegistrationForm:dobMonth");
		Select month=new Select(dateofbirth_month);
		month.selectByValue("12");
		WebElement dateofbirth_year = drive.findElementById("userRegistrationForm:dateOfBirth");
		Select year =new Select(dateofbirth_year);
		List <WebElement> options = year.getOptions();
		
		System.out.println("Display Years in Date_of_Birth Section");
		for (WebElement display_year :options) {
			String text = display_year.getText();
			
			System.out.println(text);
		}
		
		year.selectByVisibleText("1994");
		WebElement occupation = drive.findElementById("userRegistrationForm:occupation");
		Select job =new Select(occupation);
		job.selectByVisibleText("Professional");
		drive.findElementById("userRegistrationForm:uidno").sendKeys("86952307859",Keys.TAB);
		drive.findElementById("userRegistrationForm:idno").sendKeys("W985F59AJ");
		WebElement country = drive.findElementById("userRegistrationForm:countries");
		Select ourcountry =new Select(country);
		ourcountry.selectByVisibleText("Egypt");
		drive.findElementById("userRegistrationForm:email").sendKeys("harispidycse@gmail.com");
		//drive.findElementById("userRegistrationForm:isdCode").sendKeys("+90",Keys.TAB);
		drive.findElementById("userRegistrationForm:mobile").sendKeys("7858373762");
		WebElement nationality = drive.findElementById("userRegistrationForm:nationalityId");
		Select yournationality =new Select(nationality);
		yournationality.selectByValue("94");
		
		
		
		

	}

}
