package genericLibrary;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.Set;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

public class UtilityMethods {

	public static String getWebPageScreenshot(WebDriver driver) {
		
		String imagePath="./Screenshots/" + getTime() + ".png";
		// Step 1
		TakesScreenshot ts = (TakesScreenshot) driver;

		// Step 2
		File temp = ts.getScreenshotAs(OutputType.FILE);

		// Step 3
		File permanent = new File(imagePath);

		// Step 4
		try {
			FileHandler.copy(temp, permanent);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return "."+imagePath;

	}

	public static String getWebElementScreenshot(WebElement element) {
		
		String imagePath="./Screenshots/" + getTime() + ".png";
		// Step 1
		File temp = element.getScreenshotAs(OutputType.FILE);

		// Step 2
		File permanent = new File(imagePath);

		// Step 3
		try {
			FileHandler.copy(temp, permanent);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return "."+imagePath;
	}

	
	public static void switchToWindowByTitle(WebDriver driver,String title) {
		Set<String> allWindows = driver.getWindowHandles();
		
		for(String window:allWindows) {
			driver.switchTo().window(window);
			String actualTitle=driver.getTitle();
			
			if(actualTitle.contains(title)) {
				break;
			}
		}
	}
	
	public static void switchToWindowByUrl(WebDriver driver,String url) {
		Set<String> allWindows = driver.getWindowHandles();
		
		for(String window:allWindows) {
			driver.switchTo().window(window);
			String actualUrl=driver.getCurrentUrl();
			
			if(actualUrl.contains(url)) {
				break;
			}
		}
	}
	
	
	
	public static void selectOptionByIndex(WebElement dropdown,int index) {
		Select select=new Select(dropdown);
		select.selectByIndex(index);
	}
	
	public static void selectOptionbyValue(WebElement dropdown, String value) {
		Select select=new Select(dropdown);
		select.selectByValue(value);
	}
	
	public static void selectOptionByVisibleText(WebElement dropdown, String visibleText) {
		Select select=new Select(dropdown);
		select.selectByVisibleText(visibleText);
	}
	
	
	public static String getTime() {
		return LocalDateTime.now().toString().replace(":", "_").replace("-", "_");
	}
}
