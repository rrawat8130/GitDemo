package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LandPage {

	public WebDriver driver;
	
	By click1=By.xpath("//div[text()=' View heatmap ']");
	By tabclick= By.xpath("//span[text()='Element List']");
	By elelist= By.xpath("//div[@class='element-list--header']");
	By email=By.xpath("//table[@id='element-list--content']/tr[1]/td[1]");
	By highlight=By.id("_vwo_glass");
	By frame=By.id("heatmap-iframe");
	By email_frame=By.id("element-list-iframe");
	public LandPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}

	public WebElement getClick()
	{
		return driver.findElement(click1);
	}
	
	public WebElement tabclick()
	{
		return driver.findElement(tabclick);
	}
	
	public WebElement tabDisplay()
	{
		return driver.findElement(elelist);
	}
	
	public WebElement emailClick()
	{
		return driver.findElement(email);
	}
	
	public WebElement emailHighlight()
	{
		return driver.findElement(highlight);
	}
	
	public void frame_switch()
	{
		driver.switchTo().frame(driver.findElement(frame));
	}
	
	public void default_frame()
	{
		driver.switchTo().defaultContent();
	}
     
	public void frame_email()
	{
		driver.switchTo().frame(driver.findElement(email_frame));
	}
	

}


