package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class OldLoginPage extends BasePage {
	@FindBy(css = "#txtUserName")
	private WebElement userfield;
	@FindBy(css = "#txtPassword")
	private WebElement Passwordfield;
	@FindBy(css = "#BtnLoginMbtn")
	private WebElement loginBtn;
	@FindBy(css = ".page_title")
	private WebElement title;
	@FindBy(css = "#Navigation_UserName")
	private WebElement userName;
	@FindBy(css = "#Navigation_BtnLogout")
	private WebElement LogOutBtn;

	public OldLoginPage(WebDriver driver) {
		super(driver);

	}

	public void userInformation(String user, String password) {
		fillText(userfield, user);
		fillText(Passwordfield, password);
		click(loginBtn);
		sleep(9000);
		click(userName);
		Actions a = new Actions(driver);
		a.moveToElement(LogOutBtn).click().build().perform();

	}

	public String title() {
		return (getText(title));
	}

}
