package project.PageEvents;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import project.Utilities.ReusableActions.ActionDriver.Action;
import project.base.BaseClass;

public class PaymentPage extends BaseClass {
    public PaymentPage()
    {
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//span[contains(text(),'Place Order')]")
    WebElement confirmOrderBtn;

    public OrderConfirmationPage OrderPaymentAndConfirm(){
        Action.click(driver,confirmOrderBtn);
        return new OrderConfirmationPage();
    }
}
