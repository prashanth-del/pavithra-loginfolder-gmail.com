package resources;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class base{
    public static WebDriver driver;
   public Properties prop ;
   
   public WebDriver initializedriver() throws IOException
   {
	   prop=new Properties();
	   FileInputStream fis = new FileInputStream("C:\\login\\src\\main\\java\\resources\\data.properties");
	   prop.load(fis);
	   String browser = prop.getProperty("browsername");
	   
	   if(browser.equals("Chrome"))
	   {
		  System.setProperty("Webdriver.Chrome.driver","C:\\\\Users\\\\Pavithra\\\\Desktop\\\\automation\\\\chromedriver.exe");
		  driver = new ChromeDriver();
	   }
	   else
	   {
		   
		   //System.setProperty("Webdriver.gecko.driver","C:\\\\Users\\\\Pavithra\\\\Desktop\\\\automation\\\\chromedriver.exe");
			//  driver = new geckoDriver();
	   }
	   return driver;
   }
   

}
