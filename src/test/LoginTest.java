package test;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import PageObjects.HomePage;
import PageObjects.NewLoginPage;

public class LoginTest extends BaseTest {

	@Test
	public void tc01_popup() {
		HomePage hp = new HomePage(driver);
		hp.PopUp();
	}

	@Test
	public void tc02_OpenMenu() {
		HomePage hp = new HomePage(driver);
		hp.loginPage();

	}

	/*
	 * @Test public void tc03_DeshbordOld () { OldLoginPage olp = new
	 * OldLoginPage(driver); olp.userInformation("023332556", "qwe123"); String
	 * actual = "דשבורד"; String expected = olp.title(); assertEquals(actual,
	 * expected);
	 * 
	 * }
	 */

	@Test
	public void tc04_DeshbordNew() {
		NewLoginPage nlp = new NewLoginPage(driver);
		nlp.userInformation("0526609200", "9999");
		String actual = "התחדשנו בממשק חדש!";

		String expected = nlp.title();
		assertEquals(actual, expected);

	}
}