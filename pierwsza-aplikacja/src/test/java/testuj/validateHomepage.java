package testuj;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import resources.base;


public class validateHomepage extends base{
	
	public static  Logger logger  = LogManager.getLogger(validateHomepage.getName());
	
	@BeforeTest
	
	public void initialize() throws IOException {
		
		driver = intializeDriver();		
		driver.get(prop.getProperty("url"));
		logger.info("Validation Homepage is running.");
		
	}
	
	private static Class<?> getName() {
		// TODO Auto-generated method stub
		return null;
	}

	@Test
	
	public void HomePage() throws IOException {
		
		HomePage hp = new HomePage(driver);
		logger.info("Shop name: " + driver.getTitle());
		Assert.assertTrue(hp.checkLogo().isDisplayed());
		logger.info("Logo is displayed.");
		Assert.assertTrue(hp.getNavigationBar().isDisplayed());
		logger.info("Navigation bar is displayed.");
		hp.checkWomen().click();
		driver.navigate().back();
		hp.checkDresses().click();
		driver.navigate().back();
		hp.checkTshirts().click();
		driver.navigate().back();
		logger.info("Category work fine.");
		Assert.assertTrue(hp.checkSlider().isDisplayed());
		hp.checkSliderPr().click();
		hp.checkSliderNe().click();
		logger.info("Slider work fine.");
		hp.checkPopular().click();
		hp.checkBest().click();
		logger.info("Best and popular filters work fine.");
		Assert.assertTrue(hp.checkContact().isDisplayed());
		logger.info("Contact info is displayed.");
		
	}
	
	@AfterTest
	
	public void teardown() {
		
		driver.close();
		driver=null;
		logger.info("Validation Homepage is done.");
		
	}

}

