package project.PageEvents;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import project.Utilities.PropertiesFile;
import project.Utilities.ReusableActions.ActionDriver.Action;
import project.base.BaseClass;



public class LoginPage extends BaseClass{


    public LoginPage(){
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//span[@class='base']")
    WebElement loginText;

    @FindBy(id = "email")
    WebElement emailAddressField;

    @FindBy(id="pass")
    WebElement passwordField;

    @FindBy(name = "send")
    WebElement signInBtn;

    @FindBy(xpath = "//a[@class='action create primary']//span[contains(text(),'Create an Account')]")
    WebElement createNewAccountBtn;

    public void verifyLoginPageIsLoaded(){
        String actualText= loginText.getText();
        String expectedText="Customer Login";
        Assert.assertEquals(actualText, expectedText);
    }

    public HomePage login(String Username, String Password){
        Action.type(emailAddressField, Username);
        Action.type(passwordField, Password);
        Action.click(driver, signInBtn);
        return new HomePage();
    }

    public AccountCreationPage createNewAccount(){
        Action.click(driver, signInBtn);
        return new AccountCreationPage();
    }

}