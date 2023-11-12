package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {
	@FindBy(css = "[class='text-[15px] underline']")
	private WebElement cancelPopUp;
	@FindBy(xpath = "//*[@id=\"header_menu__5RWFD\"]/div[4]/span")
	private WebElement BusinessServiceBtn;
	@FindBy(xpath = "//*[@id=\"header_menu__5RWFD\"]/div[4]/div[2]/a[1]")
	private WebElement LogingBtn;
	@FindBy(xpath = "//*[@id=\"header_menu__5RWFD\"]/div[3]/span")
	private WebElement IntrestingBtn;
	@FindBy(xpath = "//*[@id=\"header_menu__5RWFD\"]/div[1]/span")
	private WebElement SearchBtn;
	@FindBy(xpath = "//*[@id=\"header_menu__5RWFD\"]/div[3]/div[2]/a[3]")
	private WebElement KoponBtn;
	@FindBy(xpath = "//*[@id=\"header_menu__5RWFD\"]/div[4]/div[2]/a[5]")
	private WebElement ContactBtn;
	@FindBy(css = "#header_menu__5RWFD > div:nth-child(1) > div.header_dropdownWrapper__GY_2d > a:nth-child(4)")
	private WebElement MikodBtn;

	public HomePage(WebDriver driver) {
		super(driver);

	}

	public void PopUp() {
		sleep(6000);
		click(cancelPopUp);
	}

	public void loginPage() {
		click(BusinessServiceBtn);
		Actions a = new Actions(driver);
		a.moveToElement(LogingBtn).click().build().perform();

	}

	public void KoponPage() {
		click(IntrestingBtn);
		Actions a = new Actions(driver);
		a.moveToElement(KoponBtn).click().build().perform();

	}

	public void ContactPage() {
		click(BusinessServiceBtn);
		Actions a = new Actions(driver);
		a.moveToElement(ContactBtn).click().build().perform();
	}

	public void MikodPage() {
		click(SearchBtn);
		Actions a = new Actions(driver);
		a.moveToElement(MikodBtn).click().build().perform();
		sleep(3000);

	}

}