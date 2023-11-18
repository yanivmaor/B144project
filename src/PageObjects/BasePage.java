package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class BasePage {
	WebDriver driver;

	public BasePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void fillText(WebElement el, String text) {
		el.clear();
		el.sendKeys(text);

	}

	public void click(WebElement el) {
		el.click();
	}

	public String getText(WebElement el) {
		return el.getText();

	}

	public void alert(String text) {
		driver.switchTo().alert().sendKeys(text);
		driver.switchTo().alert().accept();

	}

	public void sleep(long mills) {
		try {
			Thread.sleep(mills);
		} catch (InterruptedException e) {
			// ToDo Auto-generated catch block
			e.printStackTrace();
		}
	}
	

		

}
