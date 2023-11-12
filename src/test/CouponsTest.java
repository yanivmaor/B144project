package test;

import org.testng.annotations.Test;

import PageObjects.CouponsPage;
import PageObjects.HomePage;

public class CouponsTest extends BaseTest {

	@Test
	public void tc01_popup() {
		HomePage hp = new HomePage(driver);
		hp.PopUp();
	}

	@Test
	public void tc02_MoveToKoponPage() {
		HomePage hp = new HomePage(driver);
		hp.KoponPage();

	}

	@Test
	public void tc03_getTitle() {
		CouponsPage cp = new CouponsPage(driver);
		if (cp.title().equalsIgnoreCase("עולם הקופונים והמבצעים של B144")) {
			System.out.println("test passed" + cp.title());
		} else
			System.out.println("test failed");
	}

	@Test
	public void tc04_Searvhcategory() {
		CouponsPage cp = new CouponsPage(driver);
		cp.SearchCategory("ציוד והלבשת ספורט", "");

	}

	@Test
	public void tc05_BuyCoupon() {
		CouponsPage cp = new CouponsPage(driver);
		cp.BuyCoupon("0508571999");

	}

	@Test
	public void tc03_getCodeMsg() {
		CouponsPage cp = new CouponsPage(driver);
		if (cp.CouponCodeMsg().equalsIgnoreCase("קוד הקופון שלך:")) {
			System.out.println("test passed" + cp.CouponCodeMsg());
		} else
			System.out.println("test failed");

	}
}
