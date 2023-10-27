package project.PageEvents;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import project.Utilities.ReusableActions.ActionDriver.Action;
import project.base.BaseClass;

public class OrderConfirmationPage {

    WebDriver driver;
    public OrderConfirmationPage(WebDriver driver){
        this.driver= driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//span[@class='base']")
    WebElement confirmMessage;

    public String validateConfirmMessage() throws InterruptedException {
        Thread.sleep(10000);
        return confirmMessage.getText();
    }
}
