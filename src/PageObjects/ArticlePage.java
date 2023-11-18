package PageObjects;

import org.openqa.selenium.WebDriver;

public class ArticlePage extends BasePage {

	public ArticlePage(WebDriver driver) {
		super(driver);
		
	}
	
	public String url () {
		return(driver.getCurrentUrl());
		
		}
}
		
	
	
	
	
	
	


