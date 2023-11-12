package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;

public class BaseTest {
	WebDriver driver;

	@BeforeClass
	public void setUp() {
		// System.setProperty("webdriver.chrome.driver",
		// "C:\\automation\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.b144.co.il/");

	}

	// @AfterClass
	// public void tearnDown () {
	// driver.quit();
}
//}
