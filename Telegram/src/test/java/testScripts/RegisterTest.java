package testScripts;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import fileUtility.ExcelUtility;
import genericLibrary.BaseClass;
import objectRepository.RegisterPage;
import objectRepository.WelcomePage;

public class RegisterTest  {

	
	@DataProvider(parallel = true,name = "regdata")
	public String[][] registerData() throws EncryptedDocumentException, IOException{
		return ExcelUtility.readExcelData("register");
	}
	
	
	@Test(dataProvider = "regdata")
	public void register_001(String firstName, String lastName, String email, String password, String confirmPassword) throws InterruptedException{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WelcomePage welcome=new WelcomePage(driver);
		RegisterPage register=new RegisterPage(driver);
		
		welcome.getRegisterLink().click();
		
		register.getMaleradioButton().click();
		
		register.getFirstNameTF().sendKeys(firstName);
		
		register.getLastNameTF().sendKeys(lastName);
		
		register.getEmailTF().sendKeys(email);
		
		register.getPasswordTF().sendKeys(password);
		
		register.getConfirmPasswordTF().sendKeys(confirmPassword);
		
		register.getRegisterButton().click();
		
		driver.quit();
		
	}
	
	
	
	
}
