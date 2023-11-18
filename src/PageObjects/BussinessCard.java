package PageObjects;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class BussinessCard extends BasePage{
	@FindBy (xpath = "//*[@id=\"desktopMenu\"]/div/ul/li[2]")
	private WebElement HavatDaatBtn;
	
	@FindBy (css = ".flex.cursor-pointer.items-center.justify-center.gap-4.p-\\[6px\\]]")
	private WebElement AddCommentBtn;

	public BussinessCard(WebDriver driver) {
		super(driver);
		
	}
	
	


	public void MoveToHavatDaatBtn() {
		sleep(3000);
	    Actions a = new Actions(driver);
	    a.moveToElement(HavatDaatBtn).click().build().perform();
	}
	    
	    public void ClickOnCommentBtn() {
	    sleep(4000);
	    Actions a = new Actions(driver);
	    a.moveToElement(AddCommentBtn).click().build().perform();
}

}
