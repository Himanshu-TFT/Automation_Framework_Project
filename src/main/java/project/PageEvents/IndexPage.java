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

public class IndexPage extends BaseClass {

//    WebDriver driver;
    public IndexPage(){
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//div[@class='panel header']//a[contains(text(),'Sign In')]")
    WebElement signInLink;

    @FindBy(xpath = "//a[@aria-label='store logo']")
    WebElement lumaLogo;

    @FindBy(id="search")
    WebElement searchProductBox;

    @FindBy(xpath = "//button[@title='Search']")
    WebElement searchButton;





    public LoginPage clickOnSignInLink(){
        Action.click(driver, signInLink);
//        signInLink.click();
        return new LoginPage();
    }



    public boolean validateLogo(){
        return Action.isDisplayed(driver,lumaLogo);
    }

    public String getMyStoreTitle(){
        return driver.getTitle();
    }

    public SearchResultPage searchProduct(String productName){
        Action.type(searchProductBox, productName);
        Action.click(driver,searchButton);
        return new SearchResultPage();
    }
}
