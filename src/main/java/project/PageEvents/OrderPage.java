package project.PageEvents;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import project.Utilities.ReusableActions.ActionDriver.Action;
import project.base.BaseClass;

public class OrderPage extends BaseClass {

    public OrderPage(){
        PageFactory.initElements(driver,this);
    }

    @FindBy(id = "email")
    WebElement emailAddressField;

    @FindBy(id="pass")
    WebElement passwordField;

    @FindBy(name = "send")
    WebElement signInBtn;

    @FindBy(xpath = "//span[normalize-space()='Next']")
    WebElement nextBtn;


    public PaymentPage SignInAndProceed(String Username, String Password){
        Action.type(emailAddressField, Username);
        Action.type(passwordField, Password);
        Action.click(driver, signInBtn);
        Action.click(driver,nextBtn);
        return new PaymentPage();
    }

    public PaymentPage alredySignedInJustProceed(){
        Action.click(driver,nextBtn);
        return new PaymentPage();
    }

}
