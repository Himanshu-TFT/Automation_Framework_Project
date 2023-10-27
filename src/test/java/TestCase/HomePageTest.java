package TestCase;

import org.testng.Assert;
import org.testng.annotations.Test;
import project.PageEvents.HomePage;
import project.PageEvents.IndexPage;
import project.PageEvents.LoginPage;
import project.base.BaseClass;

public class HomePageTest extends BaseClass {
    IndexPage indexPage;
    LoginPage loginPage;
    HomePage homePage;

    @Test
    public void wishListTest(){
        indexPage = new IndexPage(driver);
        loginPage= new LoginPage(driver);
        homePage = new HomePage(driver);
        indexPage.clickOnSignInLink();
        loginPage.login(Username, Password);
        boolean result=homePage.validateMyWishList();
        Assert.assertTrue(result);
    }

    @Test
    public void orderHistoryAndDetailsTest(){
        indexPage = new IndexPage(driver);
        loginPage= new LoginPage(driver);
        homePage= new HomePage(driver);
        indexPage.clickOnSignInLink();
        loginPage.login(Username, Password);
        boolean result=homePage.validateMyOrdersHistory();
        Assert.assertTrue(result);
    }
}
