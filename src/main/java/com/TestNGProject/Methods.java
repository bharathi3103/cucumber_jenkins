package com.TestNGProject;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Methods {
 
	public static WebDriver driver;
	
	
    // 1 Launch Browser
    public static  WebDriver launchBrowser(String browsername) {    
    if (browsername.equalsIgnoreCase("chrome")) {
                
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
    }
    else if (browsername.equalsIgnoreCase("firefox")) {
                
        WebDriverManager.firefoxdriver().setup();
        driver = new FirefoxDriver();
    }    
    else if (browsername.equalsIgnoreCase("edge")) {
        
        WebDriverManager.edgedriver().setup();
        driver = new EdgeDriver();
    }    
    driver.manage().window().maximize();
    return driver;
    }
	
 public static void getUrl(String url) {
	 driver.get(url);
	
 }
 
 public static void elementToBeClick(WebElement element){
		element.click();
	 
 }
 public static void inputToElement(WebElement element,String value) {
		element.sendKeys(value);
	
	}
	public static void implicityWait(long time, int i) {
	driver.manage().timeouts().implicitlyWait(time, TimeUnit.SECONDS);
}

//public void visibilityOfWebelement(long time,WebElement element) {
//	WebDriverWait wait= new WebDriverWait(driver,time);
//	wait.until(ExpectedConditions.visibilityOf(element)).click();
//}

	public static void SwitchToFrame(String option,String value) {
		if(option.equalsIgnoreCase("index")) {
			int index = Integer.parseInt(value);
		driver.switchTo().frame(index);
	}
		else if (option.equalsIgnoreCase("idorName")) {
		driver.switchTo().frame(value);
		}
	}
	public static void SwitchToFrameUsingElement(WebElement element){
		driver.switchTo().frame(element); 
			
		}
	public static void dropDown(WebElement element,String option,String data) {
			Select select=new Select(element);
			if(option.equalsIgnoreCase("value")) {
				select.selectByValue(data);
				}else if(option.equalsIgnoreCase("text")) {
					select.selectByVisibleText(data);
					
				}else if(option .equalsIgnoreCase("index")) {
					int parseInt=Integer.parseInt(data);
					select.selectByIndex(parseInt);
				}
		}
			public static void TakeScreenshot(String name) throws IOException {
			
				TakesScreenshot ts=(TakesScreenshot)driver;
		        File Src=ts.getScreenshotAs(OutputType.FILE);
		        Date d= new Date();
		    	String filename=d.toString().replace(":","-").replace(",","-")+".png";
		        File desc= new File("C:\\Users\\Bhara\\eclipse-workspace\\cucumber\\TestNGProject\\ScreenShot"+filename);
		        //File desc1= new File("C:\\Users\\Bhara\\eclipse-workspace\\MavenPro\\screenshot"+filename+"timestamp+extension");
		        FileHandler.copy(Src, desc);
			}
			public void Action(WebElement element) {
				Actions action = new Actions (driver);
				action.moveToElement(element).click().perform();
			}


public static void alert(String value,String text) {
	if(value.equalsIgnoreCase("accept")) {
		driver.switchTo().alert().accept();
	}
	else if (value.equalsIgnoreCase("dismiss")) {
			driver.switchTo().alert().dismiss();
		}
	else if(value.equalsIgnoreCase("getText")) {
			System.out.println(driver.switchTo().alert().getText());
		}
}
public static void SwitchWindow(int index) {
  Set<String>all_tab=driver.getWindowHandles();
  List<String>tab_list=new ArrayList<>(all_tab);
  
driver.switchTo().window(tab_list.get(index));
}
public static void SwitchToWindow(String tab_id) {
	Set<String> set=driver.getWindowHandles();
	Iterator<String> it = set.iterator();
	while(it.hasNext()) {
		String id =it.next();
		if(id==tab_id) {
			driver.switchTo().window(id);
		}
	}
}
}





		       
		       

