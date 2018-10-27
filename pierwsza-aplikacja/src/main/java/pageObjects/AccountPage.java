package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AccountPage {
	
	public WebDriver driver;
	
	By order = By.xpath("//a[@title='Orders']");
	By credit = By.xpath("//a[@title='Credit slips']");
	By addres = By.xpath("//a[@title='Addresses']");
	By inform = By.xpath("//a[@title='Information']");
	By wish = By.xpath("//a[@title='My wishlists']");
	
	public AccountPage(WebDriver driver) {
		
		this.driver = driver;	
	}
	
	public WebElement checkOrders() {
		
		return driver.findElement(order);
	}
	
	public WebElement checkCredits() {
		
		return driver.findElement(credit);
	}
	
	public WebElement checkAddres() {
		
		return driver.findElement(addres);
	}
	
	public WebElement checkInform() {
		
		return driver.findElement(inform);
	}
	
	public WebElement checkWish() {
		
		return driver.findElement(wish);
	}	

}
