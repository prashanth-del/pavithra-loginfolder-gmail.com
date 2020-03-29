package gmailteseting.login;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import pageobjects.gmailemail;
import resources.base;

public class Testcase1 extends base {

	@Test
	public void login() throws IOException
	{
	  driver=initializedriver();	
	  driver.get(prop.getProperty("URL"));
	  
	  gmailemail ge = new gmailemail(driver);
	  
	  ge.getemail().sendKeys("Pavythrapavythra@gmail.com");
	  ge.next().click();
	  
	  
	}

}
