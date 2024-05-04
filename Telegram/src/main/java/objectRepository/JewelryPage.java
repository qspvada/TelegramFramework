package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class JewelryPage {

	public JewelryPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id = "products-orderby")
	private WebElement sortByDropdown;
	
	
	@FindBy(id = "products-pagesize")
	private WebElement displayDropdown;
	
	public WebElement getDisplayDropdown() {
		return displayDropdown;
	}

	@FindBy(id = "products-viewmode")
	private WebElement viewAsDropdown;
	
	public WebElement getViewAsDropdown() {
		return viewAsDropdown;
	}

	public WebElement getSortByDropdown() {
		return sortByDropdown;
	}

	public WebElement getDiamondHeartAddToCartButton() {
		return diamondHeartAddToCartButton;
	}

	@FindBy(xpath = "//a[.='Black & White Diamond Heart']/../..//input")
	private WebElement diamondHeartAddToCartButton;
}
