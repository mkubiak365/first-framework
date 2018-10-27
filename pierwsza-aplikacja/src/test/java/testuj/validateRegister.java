package testuj;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.Locale;

import pageObjects.RegisterPage;
import resources.base;

public class validateRegister extends base{
	
	public static  Logger logger  = LogManager.getLogger(validateRegister.getName());

	@BeforeTest
	
	public void initialize() throws IOException {
		
		driver = intializeDriver();
		driver.get(prop.getProperty("url"));
		logger.info("Validation Register is running.");

	}
	
	private static Class<?> getName() {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Test
	public void Register() throws IOException {
		
		
		RegisterPage reg = new RegisterPage(driver);
		reg.getLogin().click();
		reg.getEmailCreate().sendKeys("testbest1234@gmail.com");
		reg.getSubmitEmail().click();
		reg.getFirstName().sendKeys("Stefan");
		reg.getLastName().sendKeys("Graham");
		reg.getUserPassword().sendKeys("tester1234");
		reg.getAddress().sendKeys("Kolumba");
		reg.getCity().sendKeys("Warszawa");
		reg.getPostalCode().sendKeys("55-555");
		reg.getPhoneNumber().sendKeys("555666777");
		reg.getIdState();
		reg.getSubmitRegistration().click();
		
		RegisterPage rc = new RegisterPage(driver);
		Assert.assertTrue(rc.getCheckErrors().isDisplayed());
		if(rc.getCheckErrors().isDisplayed()) {
		logger.info(rc.getCheckErrors().getText());
		logger.info("Registration is incorrect.");
		}
		else {
			logger.info("Registration is correct.");
		}
		
	}
	
	@AfterTest
	
	public void teardown() {
		
		driver.close();
		driver=null;
		logger.info("Validation Register is done.");
	}
		
}
