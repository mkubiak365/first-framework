package testuj;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageObjects.LoginPage;
import pageObjects.AccountPage;
import resources.base;

public class validateAccount extends base {
	
	public static  Logger logger  = LogManager.getLogger(validateAccount.getName());
	
	@BeforeTest
	
	public void initialize() throws IOException {
		
		driver = intializeDriver();
		driver.get(prop.getProperty("url"));
		logger.info("Validation Account is running.");

	}
	
	private static Class<?> getName() {
		// TODO Auto-generated method stub
		return null;
	}

				
	@Test
	public void Account() throws IOException {
			
			LoginPage lp = new LoginPage(driver);
			lp.getLogin().click();
			lp.getEmail().sendKeys("eoxsgf36nvmu@10minut.xyz");
			lp.getPassword().sendKeys("qwert1");
			lp.getButton().click();
			logger.info("The user is logged.");
			
			AccountPage om = new AccountPage(driver);
			om.checkOrders().click();
			logger.info("Orders are visible.");
			driver.navigate().back();
			om.checkCredits().click();
			logger.info("Credits are visible.");
			driver.navigate().back();
			om.checkAddres().click();
			logger.info("Address is visible.");
			driver.navigate().back();
			om.checkInform().click();
			logger.info("Informations are visible.");
			driver.navigate().back();
			om.checkWish().click();
			logger.info("Wishes are visible.");
		}
	
	@AfterTest
	
	public void teardown() {
		
		driver.close();
		driver=null;
		logger.info("Validation Account is done.");

		}

	}

