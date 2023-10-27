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

public class HomePage {

    WebDriver driver;
    public HomePage(WebDriver driver)
    {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//li[@class='nav item']//a[normalize-space()='My Wish List']")
    WebElement myWishList;

    @FindBy(xpath = "//a[normalize-space()='My Orders']")
    WebElement myOrdersHistory;

    @FindBy(xpath = "//span[@class='customer-name']")
    WebElement myProfileLink;

    @FindBy(xpath = "//div[@aria-hidden='false']//a[normalize-space()='My Account']")
    WebElement myAccountLink;


    public boolean validateMyWishList()
    {
        WebDriverWait wait =new WebDriverWait(driver, Duration.ofSeconds(60));
        wait.until(ExpectedConditions.elementToBeClickable(myProfileLink)).click();
        wait.until(ExpectedConditions.elementToBeClickable(myAccountLink)).click();
        return Action.isDisplayed(driver, myWishList);
    }

    public boolean validateMyOrdersHistory()
    {
        WebDriverWait wait =new WebDriverWait(driver, Duration.ofSeconds(60));
        wait.until(ExpectedConditions.elementToBeClickable(myProfileLink)).click();
        wait.until(ExpectedConditions.elementToBeClickable(myAccountLink)).click();
        return Action.isDisplayed(driver, myOrdersHistory);
    }

    public String getCurrentURL(){
        return driver.getCurrentUrl();
    }
}
