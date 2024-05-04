package testScripts;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import genericLibrary.BaseClass;
import objectRepository.WelcomePage;

public class ElectronicsTest extends BaseClass {

	@Test(groups = "regression")//(invocationCount = 5,threadPoolSize = 6,enabled = true,groups = "")//(priority = 0)
	public void electronic_001() throws InterruptedException {
		WelcomePage welcome=new WelcomePage(driver);
		welcome.getElectronicsLink().click();
		Thread.sleep(2000);
	}
	
	@Test(groups = {"smoke","FT"})//(priority = 1)
	public void apparel() throws InterruptedException {
		WelcomePage welcome=new WelcomePage(driver);
		welcome.getApparelLink().click();
		Thread.sleep(2000);
	}
	
	@Test(groups = "smoke")//(priority = 2)
	public void computer() throws InterruptedException {
		WelcomePage welcome=new WelcomePage(driver);
		welcome.getComputersLink().click();
		Thread.sleep(2000);
	}
	
	@Test(groups = "regression")//(priority = 3)
	public void giftCard() throws InterruptedException {
		WelcomePage welcome=new WelcomePage(driver);
		welcome.getGiftCardsLink().click();
		Thread.sleep(2000);
	}
	
	@Test( groups = "FT")//(priority = 4)
	public void confirmOrder() throws InterruptedException {
		WelcomePage welcome=new WelcomePage(driver);
		welcome.getJewelryLink().click();
		Thread.sleep(2000);
	}
	
}
