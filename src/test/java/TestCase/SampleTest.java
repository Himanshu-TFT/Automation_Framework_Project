package TestCase;

import org.testng.annotations.Test;
import project.PageEvents.IndexPage;
import project.PageEvents.LoginPage;
import project.base.BaseClass;

public class SampleTest extends BaseClass {

 IndexPage homePage;
 LoginPage loginPage;

    @Test()
    public void sampleLogin(){

        homePage= new IndexPage();
        loginPage = new LoginPage();

        logger.info("Signin into LoginPage");
        homePage.clickOnSignInLink();
        logger.info("Verifying if LoginPage load successfully");
        loginPage.verifyLoginPageIsLoaded();
        logger.info("Entering the loginCredentials");
        loginPage.login(Username, Password);


    }



    }