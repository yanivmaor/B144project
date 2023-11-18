package test;

import org.checkerframework.checker.units.qual.mPERs;
import org.testng.annotations.Test;

import PageObjects.ArticlePage;
import PageObjects.HomePage;
import PageObjects.MagazinePage;
import PageObjects.MagazineResultSearch;

public class MagazineTest extends BaseTest{
	
	@Test
	public void tc01_popup () {
		HomePage hp=new HomePage(driver);
		hp.PopUp();
	}
	
	@Test
	public void tc02_Magazine () {
		HomePage hp=new HomePage(driver);
		hp.Magazine();
	}
	
	@Test
	public void tc03_MagazinePage () {
		MagazinePage mp = new MagazinePage(driver);
		mp.title();
		System.out.println("you are on the right page" + mp.title());
	}
	
	@Test
	public void tc04_SearchCategory () {
		MagazinePage mp = new MagazinePage(driver);
		mp.SearchCaterory("צמיגים מכירה ותיקון - פנצ'ריות");
		mp.title2();
		System.out.println("you are on the right page" + mp.title2());
	
	}
	@Test
	public void tc05_clickOnArticle () {
		MagazineResultSearch mrs = new MagazineResultSearch(driver);
		mrs.MoveToArticle("איך מחליפים גלגל באוטו?");
	}
	@Test
	public void tc06_url () {
		ArticlePage ap = new ArticlePage(driver);
		ap.url();
	System.out.println(ap.url());
				
	}
	
	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	




