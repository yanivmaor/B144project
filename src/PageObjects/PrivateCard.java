package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PrivateCard extends BasePage{
	
	@FindBy (css  = ".PrivateCardPage_privateCard__PDEYd.md\\:shadow-defaultShadow")
	private WebElement contactDetails;

	public PrivateCard(WebDriver driver) {
		super(driver);
		
	}
	
	public String ContactDetails () {
		sleep(5000);
		return (getText( contactDetails));
		
	}

}
