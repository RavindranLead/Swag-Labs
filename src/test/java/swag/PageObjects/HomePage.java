package swag.PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage {
	private static HomePage homePageInstance;

	public HomePage() {
		// TODO Auto-generated constructor stub
	}

	@FindBy(xpath = "//select[@class='product_sort_container']")
	private static WebElement dropdown;
	@FindBy(xpath = "//div[text()='Sauce Labs Onesie']")
	private static WebElement Oniese;
	@FindBy(xpath = "//div[text()='Sauce Labs Backpack']")
	private static WebElement backPack;
	@FindBy(xpath = "//div[text()='Sauce Labs Fleece Jacket']")
	private static WebElement jacket;
	@FindBy(xpath = "//button[@id='add-to-cart-sauce-labs-backpack']")
	private static WebElement backPackCartBtn;
	@FindBy(xpath = "//button[@id='add-to-cart-sauce-labs-onesie']")
	private static WebElement onieseCartBtn;
	@FindBy(xpath = "//button[@id='add-to-cart-sauce-labs-fleece-jacket']")
	private static WebElement jacketCartBtn;
	@FindBy(xpath = "//a[@class='shopping_cart_link']")
	private static WebElement cartBadge;
	
	@FindBy(xpath="//div[@class='footer_copy']")
	private static WebElement coprightText;

	public  WebElement getCoprightText() {
		return coprightText;
	}

	public  WebElement getDropdown() {
		return dropdown;
	}

	public  WebElement getOniese() {
		return Oniese;
	}

	public  WebElement getBackPack() {
		return backPack;
	}

	public  WebElement getJacket() {
		return jacket;
	}

	public  WebElement getBackPackCartBtn() {
		return backPackCartBtn;
	}

	public  WebElement getOnieseCartBtn() {
		return onieseCartBtn;
	}

	public  WebElement getJacketCartBtn() {
		return jacketCartBtn;
	}

	public  WebElement getCartBadge() {
		return cartBadge;
	}

	public static HomePage getInstance() {
		if (homePageInstance == null) {
			homePageInstance = new HomePage();

		}

		return homePageInstance;
	}
}
