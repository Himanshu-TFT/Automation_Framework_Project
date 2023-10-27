package TestCase;

import org.testng.Assert;
import org.testng.annotations.Test;
import project.PageEvents.AccountCreationPage;
import project.PageEvents.HomePage;
import project.PageEvents.IndexPage;
import project.PageEvents.LoginPage;
import project.base.BaseClass;

public class AccountCreationPageTest extends BaseClass {

    IndexPage indexPage;
    LoginPage loginPage;
    AccountCreationPage accountCreationPage;

    @Test
    public void verifyCreateAccountPageTest(){
        indexPage= new IndexPage(driver);
        loginPage = new LoginPage(driver);

        accountCreationPage = new AccountCreationPage(driver);
        indexPage.clickOnSignInLink();
        loginPage.createNewAccount();
        boolean result= accountCreationPage.validateAccountCreatePage();
        Assert.assertTrue(result);
    }

}
