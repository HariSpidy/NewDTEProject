package week2day2;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

import java.util.Set;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;


import wdMethods.SeMethods;

public class MergeLead extends ProjectMethods {

	//@Test(enabled = false)
	@Test
	public void merge() {

	
		click(locateElement("link", "Leads"));
		click(locateElement("link", "Merge Leads"));
		click(locateElement("xpath","//img[@alt='Lookup']"));
		switchToWindow(2);

		clickWithNoSnap(locateElement("xpath","//a[@class='linktext']"));

		switchToWindow(0);
		click(locateElement("xpath","(//img[@alt='Lookup'])[2]"));
		switchToWindow(2);
		clickWithNoSnap(locateElement("xpath","(//a[@class='linktext'])[6]"));
		switchToWindow(0);
		clickWithNoSnap(locateElement("class", "buttonDangerous"));

		acceptAlert();
		click(locateElement("link", "Find Leads"));
		type(locateElement("xpath", "//input[@name='id']" ), "10092");
		click(locateElement("xpath","(//button[@class='x-btn-text'])[7]"));

	}



}


