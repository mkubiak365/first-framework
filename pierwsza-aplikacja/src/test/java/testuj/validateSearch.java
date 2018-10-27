package testuj;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageObjects.SearchPage;
import resources.base;

public class validateSearch extends base {
	
	public static  Logger logger  = LogManager.getLogger(validateSearch.getName());
	
	@BeforeTest
	
	public void initialize() throws IOException {
		
		driver = intializeDriver();
		driver.get(prop.getProperty("url"));
		logger.info("Validation Search is running.");

	}
	
	private static Class<?> getName() {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Test
	public void Search() throws IOException {
		
		SearchPage sp = new SearchPage(driver);
		Actions a = new Actions(driver);
		WebElement menu = sp.checkSearch();
		a.moveToElement(menu).click().sendKeys("printed").doubleClick().build().perform();
		logger.info("The user choose an item.");
		sp.checkSearchMenu();
		driver.navigate().back();
		logger.info("Return to HomePage.");
		sp.checkSearch().sendKeys("printed");
		sp.checkSearch().sendKeys(Keys.ENTER);
		logger.info("The user sees items on the category.");
		sp.lowestPrice();
		logger.info("The users sees items with the lowest price");
	
	}
	
	@AfterTest
	
	public void teardown() {
		
		driver.close();
		driver=null;
		logger.info("Validation Search is done.");

	}

}
