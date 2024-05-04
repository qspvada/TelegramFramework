package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPage {

	public RegisterPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id = "FirstName")
	private WebElement firstNameTF;
	
	
	@FindBy(id = "LastName")
	private WebElement lastNameTF;
	
	
	@FindBy(id = "Email")
	private WebElement emailTF;
	
	@FindBy(id = "Password")
	private WebElement passwordTF;
	
	
	@FindBy(id = "ConfirmPassword")
	private WebElement confirmPasswordTF;
	
	
	@FindBy(id = "register-button")
	private WebElement registerButton;
	
	@FindBy(id = "gender-male")
	private WebElement maleradioButton;
	
	public WebElement getRegisterButton() {
		return registerButton;
	}

	public WebElement getMaleradioButton() {
		return maleradioButton;
	}

	public WebElement getFirstNameTF() {
		return firstNameTF;
	}

	public WebElement getLastNameTF() {
		return lastNameTF;
	}

	public WebElement getEmailTF() {
		return emailTF;
	}

	public WebElement getPasswordTF() {
		return passwordTF;
	}

	public WebElement getConfirmPasswordTF() {
		return confirmPasswordTF;
	}


}
