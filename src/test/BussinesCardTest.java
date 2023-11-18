package test;

import org.testng.annotations.Test;
import PageObjects.BussinesResults;
import PageObjects.BussinessCard;
import PageObjects.HomePage;

public class BussinesCardTest extends BaseTest {
	

  @Test
  public void tc01_popup() {
  HomePage hp = new HomePage(driver);
  hp.PopUp();
 }
	        
 @Test
 public void tc02_bussinesSearch() {
 HomePage hp = new HomePage(driver);
 hp.BussinesSearch("ביסופט");
	
}
 
 @Test
 public void tc03_bussinesList() {
 BussinesResults br = new BussinesResults(driver);
 br.BussinesList2("ביסופט תוכנה בע\"מ");


 }
 
 
 
 }

 

 

	
 

 



	
	

	





