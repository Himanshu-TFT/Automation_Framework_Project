package project.PageEvents;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import project.Utilities.ReusableActions.ActionDriver.Action;
import project.base.BaseClass;

import java.time.Duration;

public class AddToCartPage  extends BaseClass {
    public AddToCartPage(){
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//input[@id='qty']")
    WebElement quantity;

    @FindBy(xpath = "//div[@id='option-label-size-143-item-168']")
    WebElement size;

    @FindBy(xpath = "//div[@id='option-label-color-93-item-50']")
    WebElement color;

    @FindBy(xpath = "//span[contains(text(),'Add to Cart')]")
    WebElement addToCartBtn;

    @FindBy(xpath = "//div[@data-bind='html: $parent.prepareMessageForHtml(message.text)']")
    WebElement addToCartMessage;

//    @FindBy(xpath = "//a[@class='action showcart']")
//    WebElement cartBtn;
    @FindBy(xpath = "//span[@class='counter-number']")
    WebElement cartBtn;

    @FindBy(xpath = "//button[@id='top-cart-btn-checkout']")
    WebElement proceedToCheckoutBtn;

    public void enterQuantity(String number){
        Action.type(quantity,number);
    }

    public void setSize(){
        Action.click(driver,size);
    }

    public void setColor()
    {
        Action.click(driver,color);
    }

    public void clickOnAddToCart(){
        Action.click(driver,addToCartBtn);
    }

    public boolean validateAddToCart(){
        return Action.isDisplayed(driver,addToCartMessage);
    }

    public OrderPage clickOnCheckout() throws InterruptedException {
        Thread.sleep(5000);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.elementToBeClickable(cartBtn)).click();
        Action.JSClick(driver,proceedToCheckoutBtn);
        return new OrderPage();
    }

}
