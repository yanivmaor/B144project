package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class NewLoginPage extends BasePage {
	@FindBy(xpath = "//*[@id=\"root\"]/ion-app/div/ion-content/form/ion-grid/ion-row[1]/ion-col/ion-item/ion-input/input")
	private WebElement PhoneNumfield;
	@FindBy(xpath = "//*[@id=\"root\"]/ion-app/div/ion-content/form/ion-grid/ion-row[2]/ion-col/ion-button")
	private WebElement CodeBtn;
	@FindBy(xpath = "//*[@id=\"root\"]/ion-app/div/ion-content/form/ion-grid/ion-row[1]/ion-col/ion-item/ion-input/input")
	private WebElement codefield;
	@FindBy(xpath = "//*[@id=\"root\"]/ion-app/div/ion-content/form/ion-grid/ion-row[2]/ion-col/ion-button")
	private WebElement sendBtn;
	@FindBy(css = "#ion-overlay-4 > div.modal-wrapper.ion-overlay-wrapper.sc-ion-modal-md > div > ion-content > ion-grid:nth-child(1) > ion-row > ion-col > div > h1.ion-no-margin")
	private WebElement PopUp;;

	public NewLoginPage(WebDriver driver) {
		super(driver);
	}

	public void userInformation(String PhoneNum, String password) {
		fillText(PhoneNumfield, PhoneNum);
		click(CodeBtn);
		sleep(3000);
		fillText(codefield, password);
		click(sendBtn);
		sleep(5000);

	}

	public String title() {
		return (getText(PopUp));
	}

}
