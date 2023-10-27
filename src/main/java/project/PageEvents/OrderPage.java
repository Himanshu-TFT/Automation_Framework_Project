package project.PageEvents;

import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import project.Utilities.ReusableActions.ActionDriver.Action;
import project.base.BaseClass;

import java.time.Duration;

public class OrderPage  {

    WebDriver driver;
    public OrderPage(WebDriver driver){
        this.driver= driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//div[@class='control _with-tooltip']//input[@id='customer-email']")
    WebElement emailAddressField;

    @FindBy(id="customer-password")
    WebElement passwordField;

    @FindBy(xpath = "//span[normalize-space()='Login']")
    WebElement signInBtn;

    @FindBy(xpath = "(//input[@name='ko_unique_1'])[1]")
    WebElement shippingCostRadioBtn;

    @FindBy(xpath = "//button[@class='button action continue primary']")
    WebElement nextBtn;


    public void SignInAndProceed(String Username, String Password) throws InterruptedException {


        Action.type(emailAddressField, Username);
        emailAddressField.sendKeys(Keys.ENTER);
        Action.type(passwordField, Password);
        signInBtn.click();

//        JavascriptExecutor js = (JavascriptExecutor)driver;
//        js.executeScript("document.querySelector('button[data-role=\"opc-continue\"].button.action.continue.primary').click");

        Thread.sleep(10000);


        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
        wait.until(ExpectedConditions.elementToBeClickable(shippingCostRadioBtn)).click();
        wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//span[contains(text(),'Next')]")))).click();



//        Action.click(driver, signInBtn);

//        Action.click(driver, shippingCostRadioBtn);
//        Action.click(driver,nextBtn);

//        shippingCostRadioBtn.click();
//        nextBtn.click();

    }

    public void alreadySignedInJustProceed() throws InterruptedException {
        Thread.sleep(10000);
        Action.click(driver,nextBtn);
    }

}
