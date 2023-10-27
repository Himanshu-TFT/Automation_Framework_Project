package project.PageEvents;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import project.Utilities.ReusableActions.ActionDriver.Action;
import project.base.BaseClass;

import java.time.Duration;

public class PaymentPage  {

    WebDriver driver;
    public PaymentPage(WebDriver driver)
    {
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//span[contains(text(),'Place')]")
    WebElement confirmOrderBtn;

    public void OrderPaymentAndConfirm() throws InterruptedException {
        Thread.sleep(5000);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
        wait.until(ExpectedConditions.elementToBeClickable(confirmOrderBtn)).click();
    }
}
