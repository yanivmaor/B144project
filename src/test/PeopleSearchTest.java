package test;

import org.testng.annotations.Test;

import PageObjects.HomePage;
import PageObjects.PrivateCard;
import PageObjects.peopleResults;

public class PeopleSearchTest extends BaseTest{

    @Test
    public void tc01_popup() {
        HomePage hp = new HomePage(driver);
        hp.PopUp();
        hp.PrivateSearch("אבי לוי", "חולון");
    }
    @Test
    public void tc02_privateResults() {
    peopleResults pr= new peopleResults(driver);
    pr.PopUp();
    pr.title();
    System.out.println(pr.title());
    

}
    @Test
    public void tc03_privateCart() {
    peopleResults pr= new peopleResults(driver);
    pr.privateCart();
}
    @Test
    public void tc04_contactDetails() {
    PrivateCard pc= new PrivateCard(driver);
    pc.ContactDetails();
    System.out.println(pc.ContactDetails());
}
}
