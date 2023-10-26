package project.PageEvents;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import project.Utilities.ReusableActions.ActionDriver.Action;
import project.base.BaseClass;

public class OrderConfirmationPage extends BaseClass {

    public OrderConfirmationPage(){
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//span[@class='base']")
    WebElement confirmMessage;

    public String validateConfirmMessage(){
        String confirmMessageText =confirmMessage.getText();
        return confirmMessageText;
    }
}
