package test;

import org.testng.annotations.Test;

import PageObjects.ContactPage;
import PageObjects.HomePage;

public class ContactUsTest extends BaseTest {

	@Test
	public void tc01_popup() {
		HomePage hp = new HomePage(driver);
		hp.PopUp();

	}

	@Test
	public void tc02_OpenContactPage() {
		HomePage hp = new HomePage(driver);
		hp.ContactPage();
	}

	@Test
	public void tc03_General() {
		ContactPage cp = new ContactPage(driver);
		cp.General();
	}

	@Test
	public void tc04ContatUs() {
		ContactPage cp = new ContactPage(driver);
		cp.ContactUs("בדיקה לא להתקשר", "0500000000", "yy@mm.com", "", "בדיקה בדיקה בדיקה");

	}

	@Test
	public void tc05FinishMsg() {
		ContactPage cp = new ContactPage(driver);
		cp.FinishMsg();
		System.out.println("test passed" + cp.FinishMsg());
	}
}
