package project.PageEvents;

import project.PageObjects.HomePageElements;
import project.Utilities.ElementFetch;

import static project.base.BaseTest.driver;

public class HomePageEvents {

    ElementFetch ele = new ElementFetch();
    public void signInButton(){
        ele.getWebElement("XPATH", HomePageElements.signInButtonText).click();
    }
}
