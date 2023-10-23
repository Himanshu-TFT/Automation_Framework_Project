package TestCase;

import org.testng.annotations.Test;
import project.PageEvents.HomePageEvents;
import project.PageEvents.LoginPageEvents;
import project.PageObjects.HomePageElements;
import project.PageObjects.LoginPageElements;
import project.Utilities.ElementFetch;
import project.base.BaseTest;

public class SampleTest extends BaseTest {

 ElementFetch ele = new ElementFetch();
 HomePageEvents homePage= new HomePageEvents();
 LoginPageEvents loginPage= new LoginPageEvents();

    @Test
    public void sampleLogin(){
        logger.info("Signin into LoginPage");
        homePage.signInButton();
        logger.info("Verifying if LoginPage load successfully");
        loginPage.verifyLoginPageIsLoaded();
        logger.info("Entering the loginCredentials");
        loginPage.enterLoginCredentials();
    }

    }