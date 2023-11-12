package test;

import org.testng.annotations.Test;

import PageObjects.HomePage;
import PageObjects.MikodPage;

public class MikodTest extends BaseTest {

	@Test
	public void tc01_popup() {
		HomePage hp = new HomePage(driver);
		hp.PopUp();
	}

	@Test
	public void tc02_MoveToMikodSearch() {
		HomePage hp = new HomePage(driver);
		hp.MikodPage();

	}

	@Test
	public void tc03_MikodSearch() {
		MikodPage mp = new MikodPage(driver);
		mp.MikodSearch("ראשון לציון", "הנחשול", "40");

	}

	@Test
	public void tc04_MikodNum() {
		MikodPage mp = new MikodPage(driver);
		mp.MikodNum();
		System.out.println("test passed" + mp.MikodNum());

	}
}
