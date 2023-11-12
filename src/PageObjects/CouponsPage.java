package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CouponsPage extends BasePage {
	@FindBy(css = ".header-title.text-center")
	private WebElement title;
	@FindBy(css = ".categories-list-wrapper ")
	private WebElement CategoryBar;
	@FindBy(css = "#Categories")
	private WebElement NameField;
	@FindBy(css = "#Cities")
	private WebElement cityField;
	@FindBy(css = "#coupon_b_BusinessSearch")
	private WebElement SearchBtn;
	@FindBy(xpath = "//*[@id=\"CouponsPage_couponsListSection__AlCih\"]/ul/li[2]/div[1]/div[2]/button")
	private WebElement BuyCouponBtn;
	@FindBy(css = "#popUpNotificationInput")
	private WebElement numField;
	@FindBy(css = "#CustomPopUpNotificationInput_sendInputData__x5dVS")
	private WebElement sendBtn;
	@FindBy(css = "cp-coupon-code.mb-\\[22px\\].font-bold")
	private WebElement CodeMsg;

	public CouponsPage(WebDriver driver) {
		super(driver);

	}

	public String title() {
		sleep(4000);
		return getText(title);

	}

	public void SearchCategory(String name, String city) {
		fillText(NameField, name);
		fillText(cityField, city);
		click(SearchBtn);
		sleep(4000);

	}

	public void BuyCoupon(String number) {
		click(BuyCouponBtn);
		fillText(numField, number);
		click(sendBtn);
		sleep(5000);
		getText(CodeMsg);
		sleep(4000);
	}

	public String CouponCodeMsg() {
		return (getText(CodeMsg));
	}

}
