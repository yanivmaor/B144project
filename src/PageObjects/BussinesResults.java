package PageObjects;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class BussinesResults extends BasePage{
	@FindBy (css = ".titleHdrWrapper.flex.gap-x-\\[6px\\].text-darkBlue")
	private WebElement TitleAndNum;
	
	@FindBy (css = "[for='0_chxFilter_4776_588']")
	private WebElement BtnFilterBar;
	
	@FindBy (xpath = "//*[@id=\"mainPage\"]/div/div/div/div[2]/div/div[2]/div")
	private WebElement TitleAndNum2;
	
	@FindBy (xpath = "//*[@id=\"desktopMenu\"]/div/ul/li[2]")
	private WebElement HavatDaatBtn;
	
	@FindBy (css = ".flex.cursor-pointer.items-center.justify-center.gap-4.p-\\[6px\\]]")
	private WebElement AddCommentBtn;
	
	

	public BussinesResults(WebDriver driver) {
		super(driver);
		
	}
	public String titleAndNum () {
		sleep(3000);
		return(getText(TitleAndNum));
	}
	
	public void FilterBar() {
		click(BtnFilterBar);
		sleep(3000);
	}
	public String titleAndNum2 () {
		sleep(3000);
		return(getText(TitleAndNum2));
	}
	
	 
	public void BussinesList (String name) {
		List<WebElement> list = driver.findElements(By.cssSelector(".truncate.pl-5"));
		for (WebElement el : list) {
			if(el.getText().equalsIgnoreCase(name)) {
				click(el);
				sleep(3000);
				break;
				
	
}
}
	}

	
	public void BussinesList2 (String name) {
		List<WebElement> list = driver.findElements(By.cssSelector(".truncate.pl-5"));
		for (WebElement el : list) {
			if(el.getText().equalsIgnoreCase(name)) {
				click(el);
				sleep(5000);
				driver.getWindowHandle();
					Set<String>	list1 = driver.getWindowHandles();
					for (String win: list1) {
					driver.switchTo().window(win);
					sleep(3000);
					 Actions a = new Actions(driver);
					    a.moveToElement(HavatDaatBtn).click().build();
					    sleep(5000);
					    Actions a1 = new Actions(driver);
					    a1.moveToElement(AddCommentBtn).click().build().perform();
			}
		
	
		}
    }
	
}
}
    
	
		
		  	   
				
				
		
  
		       
		     
		       
				
				
			
		

	
	
		
	
		
		
	
	  
	 
	
	
	
			
				
				
	
	
	
	



	
	
	
	
	
