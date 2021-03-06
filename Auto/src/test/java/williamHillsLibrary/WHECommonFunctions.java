package williamHillsLibrary;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class WHECommonFunctions {
	
	WebDriver driver;
    
	   // @Parameters("browser")
		public  void openbrowser(String BrowserName)
		{
		if(BrowserName.equalsIgnoreCase("chrome"))	
		   {
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\Local_Drivers\\chromedriver.exe");
	           driver=new ChromeDriver();		
		   }
			
		else if(BrowserName.equalsIgnoreCase("firefox"))
		   {
			System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+"\\Local_Drivers\\geckodriver.exe");
	           driver=new FirefoxDriver();		
		   }
			
		else if(BrowserName.equalsIgnoreCase("IE"))
		   {
			System.setProperty("webdriver.ie.driver", System.getProperty("user.dir")+"\\Local_Drivers\\IEDriverServer.exe");
	           driver=new InternetExplorerDriver();		
		   }
			
			driver.get("https://acc.williamhillestate.com");
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			
			
		}
		
		  //-----------------------------------------------------------
		public WebDriver ClickElement(String path)
		{
			WebElement a = driver.findElement(By.xpath(path));
			a.click();
			return driver;
		}
		
		  //------------------------------------------------------------
		public void ScrollToElement(By obj)
		{
		  WebElement a=driver.findElement(obj);	
				 try {
				  ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);",a); 
				     }
				 catch(Exception e)
				 {
					 e.printStackTrace();
				 }
		 }
		
		   //------------------------------------------------------------
		public void ScrollVertical(int a)
		{
		 ((JavascriptExecutor)driver).executeScript("scroll(0,a);"); 
		}
		
		   //-------------------------------------------------------------
		public void ScrollHorizontal(int a)
		{
		 ((JavascriptExecutor)driver).executeScript("scroll(a,0);"); 
		}
		
		   //-------------------------------------------------------------
		
		public void SendKeyValue(By obj,String value)
		{
			WebElement b=driver.findElement(obj);
			b.clear();
		    b.sendKeys(value);
		}
		
		   //-------------------------------------------------------------
		
		public void SelectDropdownText(By obj,String value)
		{
			Select select=new Select(driver.findElement(obj));
			select.selectByVisibleText(value);
	    }
		
		//-----------------------------------------------------------------
		
		public void HoverToElement(By obj)
		{
			Actions action=new Actions(driver);
			action.moveToElement(driver.findElement(obj)).perform();
		}
		
		//-------------------------------------------------------------------
		
		public String GetPlaceHolderText(By obj)
		{
			WebElement b=driver.findElement(obj);
			String text=b.getAttribute("placeholder");
			return text;
		}
		
		//-------------------------------------------------------------------
		
		public String GetText(By obj)
		{
			WebElement b=driver.findElement(obj);
			String text=b.getText();
			return text;
		}
		
		public void CompareText(String Webtext,String ExcelText)
		{
			if(ExcelText.equalsIgnoreCase(Webtext))
			{
				System.out.println("PASS");
			}
			
			else
			{
				System.out.println("FAIL");
			}
			
		}
	
	

}
