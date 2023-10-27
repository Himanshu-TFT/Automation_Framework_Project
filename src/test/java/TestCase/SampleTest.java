package TestCase;

import org.testng.Assert;
import org.testng.annotations.Test;
import project.PageEvents.IndexPage;
import project.PageEvents.LoginPage;
import project.base.BaseClass;

public class SampleTest extends BaseClass {

 IndexPage indexPage;

 LoginPage loginPage;

    @Test()
    public void sampleLogin(){

        indexPage= new IndexPage(driver);
        loginPage = new LoginPage(driver);

//        logger.info("Signin into LoginPage");
        indexPage.clickOnSignInLink();
//        logger.info("Verifying if LoginPage load successfully");
        loginPage.verifyLoginPageIsLoaded();
//        logger.info("Entering the loginCredentials");
        loginPage.login(Username, Password);

    }





}