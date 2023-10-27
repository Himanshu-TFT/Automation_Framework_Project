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

public class AddToCartPage{

    WebDriver driver;
    public AddToCartPage(WebDriver driver)
    {
        this.driver= driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//input[@id='qty']")
    WebElement quantity;
    @FindBy(xpath = "//div[@id='option-label-size-143-item-166']")
    WebElement XsSize;
    @FindBy(xpath = "//div[@id='option-label-size-143-item-167']")
    WebElement SSize;
    @FindBy(xpath = "//div[@id='option-label-size-143-item-168']")
    WebElement MSize;
    @FindBy(xpath = "//div[@id='option-label-size-143-item-169']")
    WebElement LSize;
    @FindBy(xpath = "//div[@id='option-label-size-143-item-170']")
    WebElement XlSize;
    @FindBy(xpath = "//div[@id='option-label-color-93-item-50']")
    WebElement blueColor;
    @FindBy(xpath = "//div[@id='option-label-color-93-item-56']")
    WebElement orangeColor;
    @FindBy(xpath = "//div[@id='option-label-color-93-item-57']")
    WebElement pinkColor;
    @FindBy(xpath = "//span[contains(text(),'Add to Cart')]")
    WebElement addToCartBtn;
    @FindBy(xpath = "//div[@data-bind='html: $parent.prepareMessageForHtml(message.text)']")
    WebElement addToCartMessage;

    @FindBy(xpath = "//span[@class='counter-number']")
    WebElement cartBtn;

    @FindBy(xpath = "//button[@id='top-cart-btn-checkout']")
    WebElement proceedToCheckoutBtn;

    public void enterQuantity(String number) {
        Action.type(quantity, number);
    }

    public void setSize(String size) {
        if (size.equalsIgnoreCase("xs")) {
            Action.click(driver, XsSize);
        } else if (size.equalsIgnoreCase("s")) {
            Action.click(driver, SSize);
        } else if (size.equalsIgnoreCase("m")) {
            Action.click(driver, MSize);
        } else if (size.equalsIgnoreCase("l")) {
            Action.click(driver, LSize);
        } else if (size.equalsIgnoreCase("xl")) {
            Action.click(driver, XlSize);
        }

    }

    public void setColor(String color) {
        if (color.equalsIgnoreCase("blue")) {
            Action.click(driver, blueColor);
        } else if (color.equalsIgnoreCase("orange")) {
            Action.click(driver, orangeColor);
        } else if (color.equalsIgnoreCase("pink")) {
            Action.click(driver, pinkColor);
        }
    }

    public void clickOnAddToCart() {
        Action.click(driver, addToCartBtn);
    }

    public boolean validateAddToCart() {
        return Action.isDisplayed(driver, addToCartMessage);
    }

    public void clickOnCheckout() throws InterruptedException {
        Thread.sleep(5000);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
        wait.until(ExpectedConditions.elementToBeClickable(cartBtn)).click();
        Action.JSClick(driver, proceedToCheckoutBtn);
    }

}
