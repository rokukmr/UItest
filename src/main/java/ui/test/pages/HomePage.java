package ui.test.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage {
	WebDriver driver;
	String header  = "header[class$='header--home']";
	String globalBox = ".gcom__typeahead-query-field-cover";
	WebDriverWait wait = new WebDriverWait(driver ,10);
	
	public void HomePageHeader() {
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(header)));
	}
	
	public void  enterSearchQuery() {
		driver.findElement(By.cssSelector(globalBox)).sendKeys("Nuts");
	}	
}
