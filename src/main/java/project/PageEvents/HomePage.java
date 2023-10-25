package project.PageEvents;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import project.Utilities.ReusableActions.ActionDriver.Action;
import project.base.BaseClass;

public class HomePage extends BaseClass {

    public HomePage()
    {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//li[@class='nav item']//a[normalize-space()='My Wish List']")
    WebElement myWishList;

    @FindBy(xpath = "//a[normalize-space()='My Orders']")
    WebElement myOrdersHistory;

    public boolean validateMyWishList()
    {
        return Action.isDisplayed(driver, myWishList);
    }

    public boolean validateMyOrdersHistory()
    {
        return Action.isDisplayed(driver, myOrdersHistory);
    }
}
