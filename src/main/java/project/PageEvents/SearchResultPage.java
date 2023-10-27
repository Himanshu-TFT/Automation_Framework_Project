package project.PageEvents;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import project.Utilities.ReusableActions.ActionDriver.Action;
import project.base.BaseClass;

public class SearchResultPage {
    WebDriver driver;
    public SearchResultPage(WebDriver driver){
        this.driver =driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//img[@alt='Radiant Tee']")
    WebElement productResult;

    public boolean isProductAvailable(){
        return Action.isDisplayed(driver,productResult);
    }

    public void clickProduct(){
        Action.click(driver,productResult);
    }

}
