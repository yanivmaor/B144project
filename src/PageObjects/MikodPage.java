package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MikodPage extends BasePage {

	@FindBy(css = "#Cities")
	private WebElement cityField;
	@FindBy(css = "#Streets")
	private WebElement streetField;
	@FindBy(css = "#FloatingSearch_houseNumInput__Z35fb")
	private WebElement houseNumField;
	@FindBy(xpath = "//*[@id=\"ZipcodePage_searchMainSection__bI82U\"]/section/div[2]/div/div/div[2]/form/div[4]/button")
	private WebElement SerchBtn;
	@FindBy(css = ".mikud-result-item.card")
	private WebElement MikodNum;

	public MikodPage(WebDriver driver) {
		super(driver);

	}

	public void MikodSearch(String city, String street, String num) {
		fillText(cityField, city);
		fillText(streetField, street);
		fillText(houseNumField, num);
		click(SerchBtn);
		sleep(3000);
	}

	public String MikodNum() {
		return (getText(MikodNum));
	}
}
