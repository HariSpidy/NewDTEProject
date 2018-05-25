package week4day2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Medium {

	public static void main(String[] args) {
		String product = "sunglasses";
		//open browser
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.myntra.com/");
		//In Searchbox type "Sunglasses" and Enter

		WebElement searchBox = driver.findElementByXPath("//input[@class='desktop-searchBar']");
		searchBox.sendKeys(product, Keys.ENTER);
		//Print all unique brand names of the Sunglasses 

		List<WebElement> brandNames = driver.findElementsByXPath("//div[@class='product-brand']");
		List<String> storingBrandName = new ArrayList<String>();
		System.out.println("All Brand products are :");
		for (WebElement brandName : brandNames) {
			storingBrandName.add(brandName.getText());
		}
		Set <String> uniqueName = new HashSet<>();
		uniqueName.addAll(storingBrandName);
		for (String eachName : uniqueName) {

			System.out.println(eachName);
		}
		//Get the count of the sunglasses with 40% discounts

		List<WebElement> discounts = driver.findElementsByXPath("//span[@class='product-discountPercentage']");
		List<String> discount40 = new ArrayList<String>();

		for (WebElement discount : discounts) {

			if(discount.getText().contains("40% OFF"))
				discount40.add(discount.getText());

		}
		System.out.println("The number of products with 40% discoount "+ discount40.size());
		// print count of the product those are Unisex

		List<WebElement> unisex = driver.findElementsByXPath("//h4[@class='product-product']");
		List<String> unisexProduct = new ArrayList<String>();
		for (WebElement eachUnisexBrand : unisex) {
			if(eachUnisexBrand.getText().contains("Unisex"))
				unisexProduct.add(eachUnisexBrand.getText());
		}
		System.out.println("The number of unisex products "+ unisexProduct.size());
		//Click on Green color Filter icon

		driver.findElementByXPath("//label[@style='background-color: rgb(94, 177, 96);']").click();
		//Click on second listed search result of the sun glasses

		List<WebElement> greenProduct = driver.findElementsByXPath("//span[@class='product-discountPercentage']");
		greenProduct.get(1).click();
		//Print the name of the product

		String productTitle = driver.findElementByXPath("//h1[@class='pdp-title']").getText();
		System.out.println("the product title is " + productTitle);
		//print the price of the product
		WebElement productPrice = driver.findElementByXPath("//strong[@class='pdp-price']");
		String productPriceText = productPrice.getText();

		//Click Add to Bag 

		driver.findElementByXPath("//button[@class='pdp-add-to-bag pdp-button']").click();

		//Click Go to Bag

		driver.findElementByXPath("//span[@class='myntraweb-sprite pdp-whiteRightArrow sprites-whiteRightArrow']").click();

		//Verfiy the product name and price is correct

		WebElement finalSelectedProduct = driver.findElementByXPath("//a[@class='c-gray']");
		String finalSelectedProductText = finalSelectedProduct.getText();
		WebElement finalSelectedProductPrice = driver.findElementByXPath("//div[@class='c-dblue total-rupees']");
		String finalSelectedProductPriceText = finalSelectedProductPrice.getText().replace(",", "");
		if(finalSelectedProductText.equals(productTitle))
		{
			System.out.println("The product which you selected is same");

		}
		if(finalSelectedProductPriceText.contains(productPriceText)) 
		{
			System.out.println("The product price is same");
		}
		// close browser
		//driver.quit();
	}



}