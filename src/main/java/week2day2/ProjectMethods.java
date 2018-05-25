package week2day2;


import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

import wdMethods.SeMethods;
import week6day1.ReadExcel;

public class ProjectMethods extends SeMethods
{

	// TODO Auto-generated method stub
	@Parameters({"browser","url","username","password"})
	@BeforeMethod	
	public void login(String browser,String url,String uname,String passwrd) 
	{
		startApp(browser, url);
		WebElement userName = locateElement("id","username");
		type(userName, uname);
		WebElement passWord = locateElement("id", "password");
		type(passWord, passwrd);
		WebElement login = locateElement("class", "decorativeSubmit");
		click(login);	
		WebElement crmsfaImage = locateElement("link", "CRM/SFA");
		click(crmsfaImage);
		

	}
	
	@AfterMethod
	public void close() 
	{
		closeBrowser();
		

	}
	
}





