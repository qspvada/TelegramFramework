package testScripts;

import org.testng.annotations.Test;

import genericLibrary.BaseClass;
import genericLibrary.UtilityMethods;
import objectRepository.JewelryPage;
import objectRepository.WelcomePage;

public class JewelryTest extends BaseClass {

	
	@Test
	public void jewelry_001() throws InterruptedException {
		WelcomePage welcome=new WelcomePage(driver);
		JewelryPage jewelry=new JewelryPage(driver);
		welcome.getJewelryLink().click();
		
		// Get the jewery page screenshot
		getWebPageScreenshot(driver);
		
		//Get the screenshot of add to cart button
		getWebElementScreenshot(jewelry.getDiamondHeartAddToCartButton());
		
		//Get the screenshot of Sort by dropdown
		getWebElementScreenshot(jewelry.getSortByDropdown());
		
		selectOptionByIndex(jewelry.getSortByDropdown(), 2);
		
		Thread.sleep(2000);
		
//		//selectOptionbyValue(jewelry.getViewAsDropdown(),"https://demowebshop.tricentis.com/jewelry?viewmode=list");
//		Thread.sleep(2000);
		
		
		selectOptionByVisibleText(jewelry.getDisplayDropdown(), "12");
		Thread.sleep(2000);
//		switchToWindowByTitle(driver, "filpkart");
//		
//		switchToWindowByUrl(driver, "https:flipakart.com");
	}
	
}
