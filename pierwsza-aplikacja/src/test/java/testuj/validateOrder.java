package testuj;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageObjects.LoginPage;
import pageObjects.OrderPage;
import resources.base;

public class validateOrder extends base {
	
	public static  Logger logger  = LogManager.getLogger(validateOrder.getName());
	
	@BeforeTest
	
	public void initialize() throws IOException {
		
		driver = intializeDriver();
		driver.get(prop.getProperty("url"));
		logger.info("Validation Order is running.");

		
	}
	
	private static Class<?> getName() {
		// TODO Auto-generated method stub
		return null;
	}


	@Test
	public void Order() throws IOException {
						
			LoginPage lp = new LoginPage(driver);
			lp.getLogin().click();
			lp.getEmail().sendKeys("eoxsgf36nvmu@10minut.xyz");
			lp.getPassword().sendKeys("qwert1");
			lp.getButton().click();
			logger.info("The user is logged.");
		    
		    OrderPage op = new OrderPage(driver);
		    WebElement menu = op.checkMenu();
		    Actions build = new Actions(driver);
		    build.moveToElement(menu).build().perform();
		    op.checkCategory().click();
		    logger.info("The user sees items on the category.");
		    op.getItem().click();
		    logger.info("The user sees an item details:");
		    logger.info(op.getDesc().getText());
		    logger.info(op.checkPrice().getText());
		    op.checkSubmit().click();
		    op.proceed();
		    op.checkProceed().click();
		    logger.info("The item is on the basket.");
		    op.checkProceed2().click();
		    op.checkProceed3().click();
		    logger.info("The user sees shipping price.");
		    op.markAgree().click();
		    op.checkProceed4().click();
		    logger.info("The user sees total price:");
		    logger.info(op.checkTotalPrice().getText());
		    op.choosePayment().click();
		    op.confirmOrder().click();
		    logger.info("The orders is complete.");   
		    
	}

	@AfterTest
	
	public void teardown() {
		
		driver.close();
		driver=null;
		logger.info("Validation Order is done.");

	}

}
