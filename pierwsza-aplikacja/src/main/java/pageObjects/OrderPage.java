package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class OrderPage {

	public WebDriver driver;
	
	By menu = By.xpath("//a[@title='Women']");
	By category = By.linkText("Summer Dresses");
	By item = By.linkText("Printed Chiffon Dress");
	By itemdesc = By.id("short_description_content");
	By submit = By.name("Submit");
	By proceed = By.cssSelector("a.btn.btn-default.button.button-medium");
	By price = By.id("our_price_display");
	By proceed2 = By.linkText("Proceed to checkout");
	By proceed3 = By.xpath("//button[@name='processAddress']");
	By proceed4 = By.xpath("//button[@name='processCarrier']//span");
	By agree = By.id("cgv");
	By totalprice = By.id("total_price_container");
	By payment = By.xpath("//a[@title='Pay by bank wire']");
	By confirm = By.xpath("//p[@id='cart_navigation']//span");
	
	public OrderPage(WebDriver driver) {
		
		this.driver = driver;
	}
	
	public WebElement checkMenu() {
		
		return driver.findElement(menu);
	}
	
	public WebElement checkCategory() {
		
		return driver.findElement(category);
	}
	
	public WebElement getItem() {
		
		return driver.findElement(item);
	}
	
	public WebElement getDesc() {
		
		return driver.findElement(itemdesc);
	}
	
	public WebElement checkSubmit() {
		
		return driver.findElement(submit);
	}
	
	public WebElement checkPrice() {
		
		return driver.findElement(price);
	}
	
	public WebElement checkProceed() {
		
		return driver.findElement(proceed);
	}
	
	public void proceed() {
		
		WebDriverWait wait = new WebDriverWait(driver, 15);
	    wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("a.btn.btn-default.button.button-medium")));
	}
	
	public WebElement checkProceed2() {
		
		return driver.findElement(proceed2);
	}
	
	public WebElement checkProceed3() {
		
		return driver.findElement(proceed3);
	}
	
	public WebElement markAgree() {
		
		return driver.findElement(agree);
	}

	public WebElement checkProceed4() {
		
		return driver.findElement(proceed4);
	}
	
	public WebElement checkTotalPrice() {
		
		return driver.findElement(totalprice);
	}
	
	public WebElement choosePayment() {
		
		return driver.findElement(payment);
	}
	
	public WebElement confirmOrder() {
		
		return driver.findElement(confirm);
	}

}
