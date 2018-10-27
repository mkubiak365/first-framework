package testuj;

import java.io.IOException;
import org.apache.logging.log4j.Logger;

import org.apache.logging.log4j.LogManager;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageObjects.LoginPage;
import resources.base;

public class validateLogin extends base {
	
	public static  Logger logger  = LogManager.getLogger(validateLogin.getName());

	@BeforeTest
	
	public void initialize() throws IOException {
		
		driver = intializeDriver();
		driver.get(prop.getProperty("url"));
		logger.info("Validation Login is running.");

	}
	
	private static Class<?> getName() {
		// TODO Auto-generated method stub
		return null;
	}

	@Test(dataProvider="getData")
	public void Login(String Username, String Password, String Text) throws IOException {
		
		LoginPage lp = new LoginPage(driver);
		lp.getLogin().click();
		lp.getEmail().sendKeys(Username);
		lp.getPassword().sendKeys(Password);
		lp.getButton().click();
		logger.info(Text);

	}
	
	@AfterTest
	
	public void teardown() {
		
		driver.close();
		driver=null;
		logger.info("Validation Login is done.");
		
	}
	
	@DataProvider
	public Object[][] getData() {
		Object[][] data = new Object[3][3];
		data[0][0] = "firsttestemail@com";
		data[0][1] = "123456";
		data[0][2] = "First user login is incorrect.";
		
		data[1][0] = "secondtestemail@com";
		data[1][1] = "123456";
		data[1][2] = "Second user login is incorrect.";
		
		data[2][0] = "eoxsgf36nvmu@10minut.xyz";
		data[2][1] = "qwert1";
		data[2][2] = "Third user login is correct.";	
		
		return data;
		
	}

}
