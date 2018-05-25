package week2day2;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import wdMethods.SeMethods;


public class DeleteLead extends ProjectMethods {

	@Test
	public void delete() {
	
		WebElement leads = locateElement("link", "Leads");
		click(leads);
		WebElement findlead = locateElement("xpath", "//a[text()='Find Leads']");
		click(findlead);
		WebElement locateElement = locateElement("xpath", "(//span[@class='x-tab-strip-text '])[2]");
		click(locateElement);
		WebElement phoneCountryCode = locateElement("xpath", "//input[@name='phoneCountryCode']");
		type(phoneCountryCode, "+91");
		WebElement phoneAreaCode = locateElement("xpath", "//input[@name='phoneAreaCode']");
		type(phoneAreaCode, "068");
		WebElement phoneNumber = locateElement("xpath", "//input[@name='phoneNumber']");
		type(phoneNumber, "7528373762");
		WebElement findLeadButton = locateElement("xpath", "//button[text()='Find Leads']");
		click(findLeadButton);
		WebElement toSelectTheFirstName = locateElement("xpath", "//a[text()='Hariprasath']");
		click(toSelectTheFirstName);
		WebElement submitButton = locateElement("class", "subMenuButtonDangerous");
		click(submitButton);
		WebElement findLead2 = locateElement("xpath", "//a[text()='Find Leads']");
		click(findLead2);
		WebElement enterLeadID = locateElement("xpath", "(//input[contains(@class,'x-form-text x-form-field')])[28]");
		type(enterLeadID, "11541");
		WebElement findLead3 = locateElement("xpath", "//button[text()='Find Leads']");
		click(findLead3);
		closeBrowser();

		//Thread.sleep(5000);
	}

	}

