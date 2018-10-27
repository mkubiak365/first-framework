package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class RegisterPage {

	public WebDriver driver;
	
	By signin = By.xpath("//a[@title='Log in to your customer account']");
	By emailcreate = By.xpath("//input[@id='email_create']");
	By submitcreate = By.xpath("//*[@id='SubmitCreate']");
	By firstname = By.id("customer_firstname");
	By lastname = By.id("customer_lastname");
	By password = By.id("passwd");
	By address = By.id("address1");
	By city = By.id("city");
	By postalcode = By.id("postcode");
	By phonenumber = By.id("phone_mobile");
	By submitaccount = By.xpath("//button[@id='submitAccount']//span");
	By submitregistration = By.xpath("//*[@id='submitAccount']");
	By checkerror = By.xpath("//div[@class='alert alert-danger']");
	
	public RegisterPage(WebDriver driver) {
		
		this.driver = driver;
	}
	
	public WebElement getLogin() {
		
		return driver.findElement(signin);
	}
	
	public WebElement getEmailCreate() {
		
		return driver.findElement(emailcreate);
	}
	
	public WebElement getSubmitEmail() {
		
		return driver.findElement(submitcreate);
	}
	
	public WebElement getFirstName() {
		
		return driver.findElement(firstname);
	}
	
	public WebElement getLastName() {
		
		return driver.findElement(lastname);
	}
	
	public WebElement getUserPassword() {
		
		return driver.findElement(password);
	}
	
	public WebElement getAddress() {
		
		return driver.findElement(address);
	}
	
	public WebElement getCity() {
		
		return driver.findElement(city);
	}
	
	public WebElement getPostalCode() {
		
		return driver.findElement(postalcode);
	}
	
	public WebElement getPhoneNumber() {
		
		return driver.findElement(phonenumber);
	}
	
	public WebElement getSubmitAccount() {
		
		return driver.findElement(submitaccount);
	}
	
	public WebElement getSubmitRegistration() {
		
		return driver.findElement(submitregistration);
	}
	
	public WebElement getCheckErrors() {
		
		return driver.findElement(checkerror);
	}
	
	public void getIdState() {
		
		Select s = new Select(driver.findElement(By.id("id_state")));
		s.selectByValue("5");			
	}	

}
