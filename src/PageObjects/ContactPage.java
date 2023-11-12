package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class ContactPage extends BasePage {
	@FindBy(xpath = "//*[@id=\"contactTabPanel\"]/div/div/div[2]")
	private WebElement general;
	@FindBy(css = "#baseMasterContent_Content_txtSurferName")
	private WebElement NameField;
	@FindBy(css = "#baseMasterContent_Content_txtSurferPhone")
	private WebElement PhoneField;
	@FindBy(css = "#baseMasterContent_Content_txtSurferEmail")
	private WebElement EmailField;
	// @FindBy (css = "#baseMasterContent_Content_drpSurferSubject")
	// private WebElement SubjectField;
	@FindBy(css = "#baseMasterContent_Content_txtSurferComment")
	private WebElement CommentField;
	@FindBy(css = "#baseMasterContent_Content_btnSurferSubmit")
	private WebElement SubmitBtn;
	@FindBy(xpath = "//*[@id=\"contact_general\"]/div/div/div/h4")
	private WebElement FinishMsg;

	public ContactPage(WebDriver driver) {
		super(driver);
	}

	public void General() {
		sleep(4000);
		click(general);
	}

	public void ContactUs(String Name, String Phone, String Email, String Subject, String Comment) {

		fillText(NameField, Name);
		fillText(PhoneField, Phone);
		fillText(EmailField, Email);
		Select selectSubject = new Select(
				driver.findElement(By.cssSelector("#baseMasterContent_Content_drpSurferSubject")));
		selectSubject.selectByIndex(4);
		fillText(CommentField, Comment);
		click(SubmitBtn);
		sleep(4000);

	}

	public String FinishMsg() {
		return (getText(FinishMsg));

	}
}