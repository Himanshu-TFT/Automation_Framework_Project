package project.PageEvents;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import project.Utilities.ReusableActions.ActionDriver.Action;
import project.base.BaseClass;

public class SearchResultPage extends BaseClass {

    public SearchResultPage(){
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//img[@alt='Radiant Tee']")
    WebElement productResult;

    public boolean isProductAvailable(){
        return Action.isDisplayed(driver,productResult);
    }

    public AddToCartPage clickProduct(){
        Action.click(driver,productResult);
        return new AddToCartPage();
    }

}
