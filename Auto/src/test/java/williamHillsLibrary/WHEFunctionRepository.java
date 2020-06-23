package williamHillsLibrary;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import elementPath.AgeGateScreen;



public class WHEFunctionRepository {
	WebDriver driver=null;
	WHECommonFunctions obj=new WHECommonFunctions();
	
	@Test(priority=1)
	public void OpenWilliamHillsWebsite()
	{
		obj.openbrowser("chrome");
		driver=obj.ClickElement(AgeGateScreen.YesLocator);
		Actions act=new Actions(driver);
		act.moveToElement(driver.findElement(By.xpath("//a[contains(text(),'Wines')]"))).perform();
		act.moveToElement(driver.findElement(By.xpath("//a[contains(text(),'Napa Valley')]"))).click().build().perform();
		act.moveToElement(driver.findElement(By.xpath("//li[@class='quickshop-item js-quickshop-item']/a[contains(text(),'2015 Napa Valley Bench Blend')]"))).click().perform();
		driver.findElement(By.xpath("//button[@class='btn product-controls-add add-to-cart-btn']/child::span[2]")).click();
		Select slct= new Select(driver.findElement(By.xpath("//select[@class='ng-pristine ng-valid ng-touched']"))); 
		slct.selectByVisibleText("California");
		
		
		
	}
	
	
	
	
	
	
}
