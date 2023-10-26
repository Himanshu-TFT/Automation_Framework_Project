package project.PageEvents;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import project.Utilities.ReusableActions.ActionDriver.Action;
import project.base.BaseClass;

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

    @FindBy(xpath = "//a[@class='action showcart']")
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

    public OrderPage clickOnCheckout(){
        Action.click(driver,cartBtn);
        Action.JSClick(driver,proceedToCheckoutBtn);
        return new OrderPage();
    }

}
