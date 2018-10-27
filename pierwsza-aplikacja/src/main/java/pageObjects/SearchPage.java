package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SearchPage {
	
	public WebDriver driver;
	
	By search = By.id("search_query_top");

	public SearchPage(WebDriver driver) {
		
		this.driver = driver;
	}
	
	public WebElement checkSearch() {
		
		return driver.findElement(search);
	}
	
	public void checkSearchMenu() {
		
		WebDriverWait wait = new WebDriverWait(driver, 15);
	    wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Printed Chiffon Dress"))).click();
	}
	
	public void lowestPrice() {
		
		Select s = new Select(driver.findElement(By.id("selectProductSort")));
		s.selectByVisibleText("Price: Lowest first");
	}
	
}
