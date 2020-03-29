package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class gmailemail {
	public WebDriver driver;
	
	By email=By.cssSelector("input[type='email']");
	By next = By.xpath("//*[@id=\"identifierNext\"]/span/span");
	
	public gmailemail(WebDriver driver) {
		
		this.driver=driver;
	}

	//using pagefactory intialize those webelements
	public WebElement getemail()
	{
		return driver.findElement(email);
		
	}
	
	public WebElement next()
	{
		return driver.findElement(next);
	}
	
	
}
