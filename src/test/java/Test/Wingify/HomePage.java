package Test.Wingify;

import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.LandPage;
import resources.Base;

public class HomePage extends Base{

	@Test
	public void HomepageNav() throws IOException
	{
		String ExpTitle="VWO | #1 A/B Testing Tool in the World";
		driver=initializeDriver();
		driver.get("https://app.vwo.com/#/analyze/heatmap/129/reports?token=eyJhY2NvdW50X2lkIjo2LCJleHBlc%20mltZW50X2lkIjoxMjksImNyZWF0ZWRfb24iOjE1MDc3ODk0ODcsInR5cGUiOiJjYW1wYWlnbiIsI%20nZlcnNpb24iOjEsImhhc2giOiJiMzlmMTQ4MWE0ZDMyN2Q4MDllNTM1YzVlNWFjOGVlMCJ9");
		Actions a=new Actions(driver);
		a.moveToElement(driver.findElement(By.xpath("//img[@class='screenshot-thumb__img']"))).perform();
	    
		LandPage l=new LandPage(driver);
		l.getClick().click();
		Set<String> window = driver.getWindowHandles();
	    Iterator<String> itr = window.iterator();	
	    String parent = itr.next();
	    String child = itr.next();
	    
	    driver.switchTo().window(child);
	    String ActTitle = driver.getTitle();
	    Assert.assertEquals(ActTitle, ExpTitle);
	    l.frame_switch();
	    l.tabclick().click();
	    l.default_frame();
	    l.frame_email();
	    boolean WebTable = l.tabDisplay().isDisplayed();
	    if(WebTable)
	    {
	    	System.out.println("Element List Panel is open and Displayed");
	    }
	    l.emailClick().click();
	    l.default_frame();
	    
	    if(l.emailHighlight().getCssValue("left").contains("385px"))
		{
			System.out.println("Button is Highlighted");
		}
	    
	}
	
}
