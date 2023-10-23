package project.PageEvents;

import project.PageObjects.HomePageElements;
import project.Utilities.ElementFetch;

public class HomePageEvents {

    ElementFetch ele = new ElementFetch();
    public void signInButton(){
        ele.getWebElement("XPATH", HomePageElements.signInButtonText).click();
    }
}
