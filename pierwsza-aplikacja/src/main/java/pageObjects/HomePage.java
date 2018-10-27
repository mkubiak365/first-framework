package pageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {

	public WebDriver driver;
	
	By logo = By.xpath("//img[@class='logo img-responsive']");
	By NavBar = By.xpath("//ul[@class='sf-menu clearfix menu-content sf-js-enabled sf-arrows']");
	By womenCat = By.xpath("//a[@title='Women']");
	By tshirtsCat = By.linkText("T-SHIRTS");
	By slider = By.xpath("//a[@title='sample-2']");
	By sliderP = By.cssSelector("a.bx-prev");
	By sliderN = By.cssSelector("a.bx-next");
	By popular = By.xpath("//a[@class='homefeatured']");
	By best = By.xpath("//a[@class='blockbestsellers']");
	By contact = By.xpath("//section[@id='block_contact_infos']//div");
	
	public HomePage(WebDriver driver) {
		
		this.driver = driver;
	}

	public WebElement checkLogo() {
		
		return driver.findElement(logo);
	}

	public WebElement checkWomen() {
		
		return driver.findElement(womenCat);
	}
	
	public WebElement checkDresses() {
		
		List<WebElement> listOfElements = driver.findElements(By.xpath("//a[@title='Dresses']"));
		listOfElements.get(1);
		
		return listOfElements.get(1);
	}
	
	public WebElement checkTshirts() {
		
		return driver.findElement(tshirtsCat);
	}
	
	public WebElement getNavigationBar() {
		
		return driver.findElement(NavBar);
	}
	
	public WebElement checkSlider() {
		
		return driver.findElement(slider);
	}
	
	public WebElement checkSliderPr() {
		
		return driver.findElement(sliderP);
	}
	
	public WebElement checkSliderNe() {
		
		return driver.findElement(sliderN);
	}
	
	public WebElement checkPopular() {
		
		return driver.findElement(popular);
	}
	
	public WebElement checkBest() {
		
		return driver.findElement(best);
	}
	
	public WebElement checkContact() {
		
		return driver.findElement(contact);
	}

}
