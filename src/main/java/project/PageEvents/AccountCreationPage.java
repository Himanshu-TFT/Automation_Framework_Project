package project.PageEvents;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import project.Utilities.ReusableActions.ActionDriver.Action;
import project.base.BaseClass;

public class AccountCreationPage extends BaseClass {
    public AccountCreationPage(){
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//span[@class='base']")
    WebElement SignUpPageTitle;

    public boolean validateAccountCreatePage(){
        return SignUpPageTitle.isDisplayed();
    }

}
