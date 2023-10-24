package project.PageEvents;

import org.testng.Assert;
import project.PageObjects.LoginPageElements;
import project.Utilities.ElementFetch;

public class LoginPageEvents {
    ElementFetch ele = new ElementFetch();
    public void verifyLoginPageIsLoaded(){
        String actualText= ele.getWebElement("XPATH", LoginPageElements.loginText).getText();
        String expectedText="Customer Login";
        Assert.assertEquals(actualText, expectedText);
    }

    public void enterLoginCredentials(){
        ele.getWebElement("ID", LoginPageElements.emailAddress).sendKeys("hjadoun9@gmail.com");
        ele.getWebElement("ID", LoginPageElements.password).sendKeys("Hianshu@123");
    }
}