package TestCase;

import org.testng.Assert;
import org.testng.annotations.Test;
import project.PageEvents.HomePage;
import project.PageEvents.IndexPage;
import project.PageEvents.LoginPage;
import project.base.BaseClass;

public class LoginPageTest extends BaseClass {
    IndexPage indexPage;
    LoginPage loginPage;
    HomePage homePage;

    @Test
    public void loginTest() {
        indexPage = new IndexPage(driver);
        loginPage = new LoginPage(driver);
        homePage= new HomePage(driver);
        indexPage.clickOnSignInLink();
        loginPage.login(Username, Password);
        String actualURL= homePage.getCurrentURL();
        String expectedURL ="https://magento.softwaretestingboard.com/";
        Assert.assertEquals(expectedURL, actualURL);
    }
}
