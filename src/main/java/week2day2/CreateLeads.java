package week2day2;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import week6day1.ReadExcel;

import java.io.IOException;

import org.openqa.selenium.WebElement;

public class CreateLeads extends ProjectMethods{
	@BeforeClass
	@DataProvider(name="fetchdata")
	public Object[][] getdata() throws IOException 
	{
		ReadExcel excelsheet =new ReadExcel();
		  return excelsheet.excel("./data/CreateLead.xlsx");
	
}
	
	
	@Test(dataProvider ="fetchdata")
	public void run(String cname,String fname,String lname, String salu,String title,String Annualrevenue,String siccode,String cno,String mail) throws InterruptedException {
		WebElement leads = locateElement("link", "Leads");
		click(leads);
		WebElement createLead = locateElement("link", "Create Lead");
		click(createLead);
		WebElement source = locateElement("id", "createLeadForm_dataSourceId");
		selectDropDownUsingText(source, "Employee");
		WebElement companyName = locateElement("createLeadForm_companyName");
		type(companyName, cname);
		WebElement firstname = locateElement("createLeadForm_firstName");
		type(firstname, fname);
		WebElement marketingChampaign = locateElement("id", "createLeadForm_marketingCampaignId");
		selectDropDownUsingText(marketingChampaign, "Demo Marketing Campaign");
		WebElement localName = locateElement("createLeadForm_lastNameLocal");
		type(localName, "S");
		WebElement firstLocalName = locateElement("createLeadForm_firstNameLocal");
		type(firstLocalName, "Hari_Spidy");
		WebElement lastName = locateElement("createLeadForm_lastName");
		type(lastName, lname);
		WebElement salutation = locateElement("createLeadForm_personalTitle");
		type(salutation,salu);
		WebElement tittle = locateElement("createLeadForm_generalProfTitle");
		type(tittle,title);
		WebElement annual = locateElement("createLeadForm_annualRevenue");
		type(annual, Annualrevenue);
		WebElement industry = locateElement("createLeadForm_industryEnumId");
		selectDropDownUsingText(industry, "Media");
		WebElement sicCode = locateElement("createLeadForm_sicCode");
		type(sicCode,siccode);
		WebElement ownership = locateElement("createLeadForm_ownershipEnumId");
		selectDropDownUsingText(ownership, "Corporation");
		WebElement description = locateElement("createLeadForm_description");
		type(description, "As I am working as a Demo Sales manager");
		WebElement importntNote = locateElement("createLeadForm_importantNote");
		type(importntNote, "no any important notes to be written");
		WebElement countrycode = locateElement("createLeadForm_primaryPhoneCountryCode");
		type(countrycode, "+91");
		WebElement birthdate = locateElement("createLeadForm_birthDate-button");
		click(birthdate);
		WebElement calender = locateElement("xpath", "//div[@class='calendar']");
		countRowsAndColumn(calender, 5, 5);
		WebElement phoneAreaCode = locateElement("createLeadForm_primaryPhoneAreaCode");
		type(phoneAreaCode, "068");
		WebElement phoneExtension = locateElement("createLeadForm_primaryPhoneExtension");
		type(phoneExtension, "5262");
		WebElement departmentName = locateElement("createLeadForm_departmentName");
		type(departmentName, "Automation tester");
		WebElement preferedCurrency = locateElement("createLeadForm_currencyUomId");
		selectDropDownUsingText(preferedCurrency, "INR - Indian Rupee");
		WebElement noOfEmployees = locateElement("createLeadForm_numberEmployees");
		type(noOfEmployees, "2");
		WebElement ticketsymbol = locateElement("createLeadForm_tickerSymbol");
		type(ticketsymbol, "dont know");
		WebElement primaryphonenumber = locateElement("createLeadForm_primaryPhoneNumber");
		type(primaryphonenumber,cno);
		WebElement primaryphoneAskName = locateElement("createLeadForm_primaryPhoneAskForName");
		type(primaryphoneAskName, "Hari_spidy");
		WebElement primaryWebURL = locateElement("createLeadForm_primaryWebUrl");
		type(primaryWebURL, mail);
		WebElement toName = locateElement("createLeadForm_generalToName");
		type(toName, "Hariprasath");
		WebElement attnName = locateElement("createLeadForm_generalAttnName");
		type(attnName, "Senthil Kumar");
		WebElement address = locateElement("createLeadForm_generalAddress1");
		type(address, "65A sathiram,hogenakkal,pennagaram,Dharmapuri");
		WebElement cityName = locateElement("createLeadForm_generalCity");
		type(cityName, "Dharmapuri");
		WebElement counry = locateElement("createLeadForm_generalCountryGeoId");
		selectDropDownUsingText(counry, "India");
		Thread.sleep(3000);
		WebElement stateName = locateElement("createLeadForm_generalStateProvinceGeoId");
		selectDropDownUsingText(stateName, "TAMILNADU");
		WebElement postalCode = locateElement("createLeadForm_generalPostalCode");
		type(postalCode, "6000032");
		WebElement postCodeExt = locateElement("createLeadForm_generalPostalCodeExt");
		type(postCodeExt, "2865");
		WebElement submit_createLead = locateElement("class", "smallSubmit");
		click(submit_createLead);
		
		
		
	}
	
		
	}
	
	


