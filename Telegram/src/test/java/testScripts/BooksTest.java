package testScripts;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import genericLibrary.BaseClass;
import objectRepository.BooksPage;
import objectRepository.WelcomePage;

public class BooksTest extends BaseClass {

	@Test(groups = "smoke")
	public void books_001() {
		WelcomePage welcomePage=new WelcomePage(driver);
		BooksPage booksPage=new BooksPage(driver);
		//Click on Books link
		welcomePage.getBooksLink().click();
		String actualResult=booksPage.getPageTitle().getText();
		//Verify Books page is displayed
		//HardAssert
//		Assert.assertEquals(actualResult, "Computers");
		
		//SoftAssert
		SoftAssert soft=new SoftAssert();
		//soft.assertEquals(booksPage.getPageTitle().isDisplayed(), false);		
		
		//soft.fail();
		
		soft.assertFalse(booksPage.getPageTitle().isDisplayed(),"Books page title is not displayed");
		//soft.assertFalse(booksPage.getPageTitle().isDisplayed());
		
		System.out.println("Test case completed");
		
		soft.assertAll();
		
	}
}
