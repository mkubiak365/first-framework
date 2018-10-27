package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {

	public WebDriver driver;
	
	By signin = By.xpath("//a[@title='Log in to your customer account']");
	By email = By.xpath("//input[@id='email']");
	By password = By.xpath("//input[@id='passwd']");
	By button = By.xpath("//button[@id='SubmitLogin']//span");
	
	
	public LoginPage(WebDriver driver) {
		
		this.driver = driver;
	}
	
	public WebElement getLogin() {
		
		return driver.findElement(signin);
	}
	
	public WebElement getEmail() {
		
		return driver.findElement(email);
	}
	
	public WebElement getPassword() {
		
		return driver.findElement(password);
	}
	
	public WebElement getButton() {
		
		return driver.findElement(button);
	}
}
