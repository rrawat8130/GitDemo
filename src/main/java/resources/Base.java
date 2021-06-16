package resources;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {
	public WebDriver driver;
	public WebDriver initializeDriver() throws IOException
	{
		
		Properties prop=new Properties();
		FileInputStream fis=new FileInputStream("C:\\Users\\Rahul\\workspace\\Wingify\\src\\main\\java\\resources\\data.properties");
        prop.load(fis);
        String browsername=prop.getProperty("browser");
        if(browsername.equals("chrome"))
        {
        	System.setProperty("webdriver.chrome.driver","./exe/chromedriver.exe");
    		driver=new ChromeDriver();
    		driver.manage().window().maximize();
        }
	    
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        return driver;
	}

}
