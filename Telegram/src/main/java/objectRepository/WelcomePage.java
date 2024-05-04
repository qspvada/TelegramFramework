package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WelcomePage {

	public WelcomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(linkText = "BOOKS")
	private WebElement booksLink;

	@FindBy(linkText = "Log in")
	private WebElement loginLink;
	
	
	@FindBy(linkText = "Log out")
	private WebElement logoutLink;
	
	@FindBy(linkText = "ELECTRONICS")
	private WebElement electronicsLink;
	
	@FindBy(linkText = "JEWELRY")
	private WebElement jewelryLink;
	
	
	@FindBy(linkText = "Gift Cards")
	private WebElement giftCardsLink;
	
	@FindBy(linkText = "Apparel & Shoes")
	private WebElement apparelLink;
	
	@FindBy(linkText = "COMPUTERS")
	private WebElement computersLink;

	@FindBy(linkText = "Register")
	private WebElement registerLink;
	
		public WebElement getRegisterLink() {
		return registerLink;
	}

	public WebElement getJewelryLink() {
		return jewelryLink;
	}

	public WebElement getGiftCardsLink() {
		return giftCardsLink;
	}

	public WebElement getApparelLink() {
		return apparelLink;
	}

	public WebElement getComputersLink() {
		return computersLink;
	}

	public WebElement getElectronicsLink() {
		return electronicsLink;
	}

	public WebElement getLogoutLink() {
		return logoutLink;
	}

	public WebElement getLoginLink() {
		return loginLink;
	}

	public WebElement getBooksLink() {
		return booksLink;
	}
	
	
}
