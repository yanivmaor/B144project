package PageObjects;

import java.util.List;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MagazineResultSearch extends BasePage {

	public MagazineResultSearch(WebDriver driver) {
		super(driver);
	}
	public void MoveToArticle (String name) {
		List<WebElement> list = driver.findElements(By.cssSelector(".CustomArticle_header__RLClG"));
		for (WebElement el : list) {
			if(el.getText().equalsIgnoreCase(name)) {
				sleep(4000);
				click(el);
				break;
	
}
}
}



      
     
   
}

		
		
		
	
	


