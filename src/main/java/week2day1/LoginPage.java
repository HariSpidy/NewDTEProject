package week2day1;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByTagName;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LoginPage {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		ChromeDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/");
		driver.findElementById("username").sendKeys("DemoSalesManager");
		driver.findElementById("password").sendKeys("crmsfa");
		driver.findElementByClassName("decorativeSubmit").click();
		//Thread.sleep(3000);
		driver.findElementByLinkText("CRM/SFA").click();
		driver.findElementByLinkText("Leads").click();
		driver.findElementByLinkText("Create Lead").click();
		
		driver.findElementById("createLeadForm_companyName").sendKeys("Alight Solutions");
		driver.findElementById("createLeadForm_firstName").sendKeys("Hariprasath");
		WebElement birthdate =driver.findElementById("createLeadForm_birthDate-button");
		birthdate.click();
		WebElement calender = driver.findElementByClassName("calendar");
	
		
		List <WebElement> allrows =calender.findElements(By.tagName("tr"));
		int rowcount =allrows.size();
		System.out.println(rowcount);
		WebElement firstrow=allrows.get(4);
	    List<WebElement> columns=firstrow.findElements(By.tagName("td"));
	    System.out.println(columns.size());
	    columns.get(2).click();
		
		
		
		//to select an option from dropdown
		WebElement source = driver.findElementById("createLeadForm_dataSourceId");
		Select option =new Select(source);
		option.selectByVisibleText("Employee");
		driver.findElementById("createLeadForm_firstNameLocal").sendKeys("Hari_Spidy");
		driver.findElementById("createLeadForm_personalTitle").sendKeys("dear");
		driver.findElementById("createLeadForm_generalProfTitle").sendKeys("tittle");
		driver.findElementById("createLeadForm_annualRevenue").sendKeys("32,0000");
		WebElement industry = driver.findElementById("createLeadForm_industryEnumId");
		Select industryoption=new Select(industry);
		industryoption.selectByIndex(3);
		//to store and display all options in the dropdown
		
		WebElement market = driver.findElementById("createLeadForm_marketingCampaignId");
		Select option2 =new Select(market);
		List <WebElement> alloptions = option2.getOptions();
		for(WebElement eachoption :alloptions)
		{
			 String text=eachoption.getText();
			 System.out.println(text);

		}
		
		//drive.findElementByName("submitButton").click();
		
		
		

	}
	
		
	}


