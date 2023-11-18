package PageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class MagazinePage extends BasePage{
	@FindBy (css = ".MagazinePage_headerTitle__YSeQX")
	private WebElement magazineTitle;
	@FindBy (css = "#categoryInput")
	private WebElement SearchField;
	@FindBy (css = "#b_MagazineSearch")
	private WebElement SearchBtn;
	@FindBy (css = ".MagazineSearchPage_headerTitle__OAHMY")
	private WebElement magazineCategoryTitle;
	

	public MagazinePage(WebDriver driver) {
		super(driver);
	
	}
	
	public String title() {
		sleep(3000);
		return(getText(magazineTitle));
	}
	
	public void SearchCaterory (String name) {
		fillText(SearchField, name);
		click(SearchBtn);
		sleep(3000);
	
}
	public String title2() {
		sleep(3000);
		return(getText(magazineCategoryTitle));
	
	}
	
		
	
}
		

