package week2day2;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateLead {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	     //FirefoxDriver drive =new FirefoxDriver();
		 ChromeDriver drive =new ChromeDriver();
	     drive.manage().window().maximize();
	     drive.get("http://leaftaps.com/opentaps/");
	     drive.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	     drive.findElementById("username").sendKeys("DemoSalesManager");
	     drive.findElementById("password").sendKeys("crmsfa");
	     drive.findElementByClassName("decorativeSubmit").click();
	     drive.findElementByLinkText("CRM/SFA").click();
	     drive.findElementByLinkText("Leads").click();
	     //*******************************CREATE LEAD PROGRAM************************************************************
	     drive.findElementByLinkText("Create Lead").click();
	     drive.findElementById("createLeadForm_companyName").sendKeys("Alight Solutions");
	     WebElement firstname = drive.findElementById("createLeadForm_firstName");
	     firstname.sendKeys("Hariprasath");
	     String firstnametext = firstname.getText();
	     System.out.println(firstnametext);
	     WebElement source = drive.findElementById("createLeadForm_dataSourceId");
			Select option =new Select(source);
			option.selectByVisibleText("Employee");
			WebElement market = drive.findElementById("createLeadForm_marketingCampaignId");
			Select option2 =new Select(market);
			option2.selectByVisibleText("Demo Marketing Campaign");
			drive.findElementById("createLeadForm_lastNameLocal").sendKeys("S");
	     drive.findElementById("createLeadForm_firstNameLocal").sendKeys("Hari_Spidy");
	     drive.findElementById("createLeadForm_lastName").sendKeys("S");
	     drive.findElementById("createLeadForm_personalTitle").sendKeys("dear");
	     drive.findElementById("createLeadForm_generalProfTitle").sendKeys("tittle");
	     drive.findElementById("createLeadForm_annualRevenue").sendKeys("32,0000");
	     WebElement industry = drive.findElementById("createLeadForm_industryEnumId");
			Select industryoption=new Select(industry);
			industryoption.selectByIndex(3);
			drive.findElementById("createLeadForm_sicCode").sendKeys("8957625");
			WebElement ownership = drive.findElementById("createLeadForm_ownershipEnumId");
			Select ownership_option =new Select(ownership);
			ownership_option.selectByVisibleText("Corporation");
			drive.findElementById("createLeadForm_description").sendKeys("As I am working as a Demo Sales manager");
			drive.findElementById("createLeadForm_importantNote").sendKeys("no any important notes to be written");
			WebElement countrycode = drive.findElementById("createLeadForm_primaryPhoneCountryCode");
			countrycode.clear();
			countrycode.sendKeys("+91");
			drive.findElementById("createLeadForm_birthDate-button").click();
			WebElement calender =drive.findElementByXPath("//div[@class='calendar']");
			List<WebElement> selectalldaterow = calender.findElements(By.tagName("tr"));
			WebElement selectOneRow = selectalldaterow.get(5);
			List<WebElement> selectdatecolumn = selectOneRow.findElements(By.tagName("td"));
			selectdatecolumn.get(2).click();
			drive.findElementById("createLeadForm_primaryPhoneAreaCode").sendKeys("06859");
			drive.findElementById("createLeadForm_primaryPhoneExtension").sendKeys("5262");
			drive.findElementById("createLeadForm_departmentName").sendKeys("Automation Tester");
			WebElement preferedcurrency = drive.findElementById("createLeadForm_currencyUomId");
			Select anyCurrencyOption = new Select(preferedcurrency);
			anyCurrencyOption.selectByVisibleText("INR - Indian Rupee");
			drive.findElementById("createLeadForm_numberEmployees").sendKeys("1");
			drive.findElementById("createLeadForm_tickerSymbol").sendKeys("dont know");
			drive.findElementById("createLeadForm_primaryPhoneNumber").sendKeys("7528373762");
			drive.findElementById("createLeadForm_primaryPhoneAskForName").sendKeys("Hari_Spidy");
			drive.findElementById("createLeadForm_primaryWebUrl").sendKeys("www.hariprasath.s.2@alight.com");
			drive.findElementById("createLeadForm_generalToName").sendKeys("hariprasath");
			drive.findElementById("createLeadForm_generalAttnName").sendKeys("senthil kumar");
			drive.findElementById("createLeadForm_generalAddress1").sendKeys("65A sathiram,hogenakkal,pennagaram,Dharmapuri");
			drive.findElementById("createLeadForm_generalCity").sendKeys("Dharmapuri");
			WebElement country = drive.findElementById("createLeadForm_generalCountryGeoId");
			Select countryName =new Select(country);
			countryName.selectByVisibleText("India");
			WebElement State = drive.findElementById("createLeadForm_generalStateProvinceGeoId");
			Select SelectState =new Select(State);
			Thread.sleep(3000);
			SelectState.selectByValue("IN-TN");
			drive.findElementById("createLeadForm_generalPostalCode").sendKeys("6000032");
			drive.findElementById("createLeadForm_generalPostalCodeExt").sendKeys("85695");
			drive.findElementByClassName("smallSubmit").click();
			WebElement getname = drive.findElementById("viewLead_firstName_sp");
			String text = getname.getText();
			if(text.equals("Hariprasath")) {
				System.out.println("you name is "+text);
			}else
				System.out.println("your name does not matches");
			//Thread.sleep(3000);
			//drive.close();
	}

}
