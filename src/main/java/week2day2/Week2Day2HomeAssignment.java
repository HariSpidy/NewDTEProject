package week2day2;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class Week2Day2HomeAssignment {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		//System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver_64bit.exe");
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
     //FirefoxDriver driver =new FirefoxDriver();
		ChromeOptions op =new ChromeOptions();
		op.addArguments("disable-infobars");
		op.addArguments("start-maximized");
		//op.setHeadless(true);
	 ChromeDriver driver =new ChromeDriver(op);
     //driver.manage().window().maximize();
     driver.get("http://leaftaps.com/opentaps/");
     driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
     JavascriptExecutor jse = (JavascriptExecutor)driver;
     jse.executeScript("document.getElementById('username').value='DemoSalesManager'");
     //driver.findElementById("username").sendKeys("DemoSalesManager");
     driver.findElementById("password").sendKeys("crmsfa");
     WebElement loginbutton = driver.findElementByClassName("decorativeSubmit");
     JavascriptExecutor executor =(JavascriptExecutor) driver ;
     executor.executeScript("arguments[0].click()", loginbutton);
     //driver.findElementByClassName("decorativeSubmit").click();
     driver.findElementByLinkText("CRM/SFA").click();
     driver.findElementByLinkText("Leads").click();
   //*******************************CREATE LEAD PROGRAM************************************************************
     driver.findElementByLinkText("Create Lead").click();
     driver.findElementById("createLeadForm_companyName").sendKeys("Alight Solutions");
     WebElement firstname = driver.findElementById("createLeadForm_firstName");
     firstname.sendKeys("Hariprasath");
     String firstnametext = firstname.getText();
     System.out.println(firstnametext);
     WebElement source = driver.findElementById("createLeadForm_dataSourceId");
		Select option =new Select(source);
		option.selectByVisibleText("Employee");
		WebElement market = driver.findElementById("createLeadForm_marketingCampaignId");
		Select option2 =new Select(market);
		option2.selectByVisibleText("Demo Marketing Campaign");
		driver.findElementById("createLeadForm_lastNameLocal").sendKeys("S");
     driver.findElementById("createLeadForm_firstNameLocal").sendKeys("Hari_Spidy");
     driver.findElementById("createLeadForm_lastName").sendKeys("S");
     driver.findElementById("createLeadForm_personalTitle").sendKeys("dear");
     driver.findElementById("createLeadForm_generalProfTitle").sendKeys("tittle");
     driver.findElementById("createLeadForm_annualRevenue").sendKeys("32,0000");
     WebElement industry = driver.findElementById("createLeadForm_industryEnumId");
		Select industryoption=new Select(industry);
		industryoption.selectByIndex(3);
		driver.findElementById("createLeadForm_sicCode").sendKeys("8957625");
		WebElement ownership = driver.findElementById("createLeadForm_ownershipEnumId");
		Select ownership_option =new Select(ownership);
		ownership_option.selectByVisibleText("Corporation");
		driver.findElementById("createLeadForm_description").sendKeys("As I am working as a Demo Sales manager");
		driver.findElementById("createLeadForm_importantNote").sendKeys("no any important notes to be written");
		WebElement countrycode = driver.findElementById("createLeadForm_primaryPhoneCountryCode");
		countrycode.clear();
		countrycode.sendKeys("+91");
		
		driver.findElementById("createLeadForm_birthDate-button").click();
		
		WebElement calender =driver.findElementByXPath("//div[@class='calendar']");
		List<WebElement> selectalldaterow = calender.findElements(By.tagName("tr"));
		WebElement selectOneRow = selectalldaterow.get(5);
		List<WebElement> selectdatecolumn = selectOneRow.findElements(By.tagName("td"));
		selectdatecolumn.get(2).click();
		
		driver.findElementById("createLeadForm_primaryPhoneAreaCode").sendKeys("06859");
		driver.findElementById("createLeadForm_primaryPhoneExtension").sendKeys("5262");
		driver.findElementById("createLeadForm_departmentName").sendKeys("Automation Tester");
		WebElement preferedcurrency = driver.findElementById("createLeadForm_currencyUomId");
		Select anyCurrencyOption = new Select(preferedcurrency);
		anyCurrencyOption.selectByVisibleText("INR - Indian Rupee");
		driver.findElementById("createLeadForm_numberEmployees").sendKeys("1");
		driver.findElementById("createLeadForm_tickerSymbol").sendKeys("dont know");
		driver.findElementById("createLeadForm_primaryPhoneNumber").sendKeys("7528373762");
		driver.findElementById("createLeadForm_primaryPhoneAskForName").sendKeys("Hari_Spidy");
		driver.findElementById("createLeadForm_primaryWebUrl").sendKeys("www.hariprasath.s.2@alight.com");
		driver.findElementById("createLeadForm_generalToName").sendKeys("hariprasath");
		driver.findElementById("createLeadForm_generalAttnName").sendKeys("senthil kumar");
		driver.findElementById("createLeadForm_generalAddress1").sendKeys("65A sathiram,hogenakkal,pennagaram,Dharmapuri");
		driver.findElementById("createLeadForm_generalCity").sendKeys("Dharmapuri");
		WebElement country = driver.findElementById("createLeadForm_generalCountryGeoId");
		Select countryName =new Select(country);
		countryName.selectByVisibleText("India");
		WebElement State = driver.findElementById("createLeadForm_generalStateProvinceGeoId");
		Select SelectState =new Select(State);
		Thread.sleep(3000);
		SelectState.selectByValue("IN-TN");
		driver.findElementById("createLeadForm_generalPostalCode").sendKeys("6000032");
		driver.findElementById("createLeadForm_generalPostalCodeExt").sendKeys("85695");
		driver.findElementByClassName("smallSubmit").click();
		WebElement getname = driver.findElementById("viewLead_firstName_sp");
		String text = getname.getText();
		if(text.equals("Hariprasath")) {
			System.out.println("you name is "+text);
		}else
			System.out.println("your name does not matches");
		Thread.sleep(3000);
		driver.close();
     //***************EDIT LEADS PROGRAM ***************************************************
    /* drive.findElementByXPath("//a[text()='Find Leads']").click();
     drive.findElementByXPath("(//input[@name='firstName'])[3]").sendKeys("Hariprasath");
     drive.findElementByXPath("//button[text()='Find Leads']").click();
     drive.findElementByXPath("//a[text()='12081']").click();
     String currentUrl = drive.getCurrentUrl();
     System.out.println("The URL of the current page is :"+currentUrl);
     drive.findElementByXPath("(//a[@class='subMenuButton'])[3]").click();
     WebElement updateCompanyName = drive.findElementById("updateLeadForm_companyName");
     updateCompanyName.clear();
     updateCompanyName.sendKeys("Verizon");
     drive.findElementByXPath("//input[@name='submitButton']").click();
     WebElement getNewCompanyNameText = drive.findElementById("viewLead_companyName_sp");
     String newCompanyText = getNewCompanyNameText.getText();
     if(newCompanyText.contains("Verizon")) {
    	 System.out.println("Your new company name text is :"+newCompanyText);
     }else
    	 System.out.println("Your New company name is wrong");
     
     drive.close();*/
     //*******************DELETE LEAD***************************
     driver.findElementByXPath("//a[text()='Find Leads']").click();
    driver.findElementByXPath("(//span[@class='x-tab-strip-text '])[2]").click();
     WebElement phoneCountryCode = driver.findElementByXPath("//input[@name='phoneCountryCode']");
     phoneCountryCode.clear();
     phoneCountryCode.sendKeys("+91",Keys.TAB);
     driver.findElementByXPath("//input[@name='phoneAreaCode']").sendKeys("068",Keys.TAB);
     driver.findElementByXPath("//input[@name='phoneNumber']").sendKeys("7528373762");
     driver.findElementByXPath("//button[text()='Find Leads']").click();
     driver.findElementByXPath("//a[text()='Hariprasath']").click();
     driver.findElementByClassName("subMenuButtonDangerous").click();
     driver.findElementByXPath("//a[text()='Find Leads']").click();
     
     WebElement leadid = driver.findElementByXPath("(//input[@type='text'])[29]");
     //Thread.sleep(5000);
     leadid.sendKeys("2099");
     driver.findElementByXPath("//button[text()='Find Leads']").click();
     Thread.sleep(5000);
     driver.close();
     
     //*******************DUPLICATE LEAD*******************
    /* drive.findElementByXPath("(//a[@class='x-tab-right'])[3]").click();
     drive.findElementByXPath("//input[@name='emailAddress']").sendKeys("hariprasath.s.2@alight.com");
     File source = drive.getScreenshotAs(OutputType.FILE);
     File destination = new File("./Downloads/img.png");
     FileUtils.copyFile(source, destination);*/
     
     
     
	}
	

}
