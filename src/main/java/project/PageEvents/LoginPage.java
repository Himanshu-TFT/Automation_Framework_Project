package project.PageEvents;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import project.Utilities.PropertiesFile;
import project.base.BaseClass;



public class LoginPage {

    WebDriver driver;

    public LoginPage(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//span[@class='base']")
    WebElement loginText;

    @FindBy(id = "email")
    WebElement emailAddressField;

    @FindBy(id="pass")
    WebElement passwordField;

    public void verifyLoginPageIsLoaded(){
        String actualText= loginText.getText();
        String expectedText="Customer Login";
        Assert.assertEquals(actualText, expectedText);
    }

    public void enterLoginCredentials(String Username, String Password){

        emailAddressField.sendKeys(Username);
        passwordField.sendKeys(Password);
    }
}