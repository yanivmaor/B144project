package test;

import org.testng.annotations.Test;
import PageObjects.BussinesResults;
import PageObjects.HomePage;

public class BussinesSerarchTest extends BaseTest {
	

  @Test
  public void tc01_popup() {
  HomePage hp = new HomePage(driver);
  hp.PopUp();
 }
	        
 @Test
 public void tc02_bussinesSearch() {
 HomePage hp = new HomePage(driver);
 hp.BussinesSearch("אינסטלטורים חולון");
	
}
 @Test
 public void tc03_bussinesResults() {
 BussinesResults br = new BussinesResults(driver);
 br.titleAndNum();
 System.out.println(br.titleAndNum());
 }
 
 @Test
 public void tc04_filterBar() {
 BussinesResults br = new BussinesResults(driver);
 br.FilterBar();
 }
 
 @Test
 public void tc05_BussinesResults() {
 BussinesResults br = new BussinesResults(driver);	 
 br.titleAndNum2();
 System.out.println(br.titleAndNum2());
 }
 
 @Test
 public void tc06_bussinesList() {
 BussinesResults br = new BussinesResults(driver);
 br.BussinesList("שקוף שירותי אינסטלציה");



 } 
}
	
	

	





