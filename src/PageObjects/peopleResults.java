package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class peopleResults extends BasePage{
	@FindBy(css = "[class='text-[15px] underline']")
	private WebElement cancelPopUp;
    
	@FindBy(css = "#titleHdr")
	private WebElement Title;
	
	@FindBy(xpath  = "//*[@id=\"BusinessResults_div_ListResult__dAJ3P\"]/div/div/div/div[2]/div/article/div[6]")
	private WebElement PrivateCard;


	public peopleResults(WebDriver driver) {
		super(driver);
		
	}
	public void PopUp() {
		sleep(2000);
		click(cancelPopUp);

}
	
	public String title() {
		return(getText(Title));
	}
	public void privateCart() {
		Actions a= new Actions(driver);
		a.moveToElement(PrivateCard).click().build().perform();
	}
	}
