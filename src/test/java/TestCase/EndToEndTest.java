package TestCase;

import org.testng.Assert;
import org.testng.annotations.Test;
import project.PageEvents.*;
import project.base.BaseClass;

public class EndToEndTest extends BaseClass {
    IndexPage indexPage;
    SearchResultPage searchResultPage;

    AddToCartPage addToCartPage;

    OrderPage orderPage;

    PaymentPage paymentPage;

    OrderConfirmationPage orderConfirmationPage;

    @Test
    public void endToEndTest() throws InterruptedException {
        indexPage = new IndexPage(driver);
        searchResultPage = new SearchResultPage(driver);
        addToCartPage =new AddToCartPage(driver);
        orderPage = new OrderPage(driver);
        paymentPage = new PaymentPage(driver);
        orderConfirmationPage = new OrderConfirmationPage(driver);

        indexPage.searchProduct("t-shirt");
        searchResultPage.clickProduct();
        addToCartPage.setSize("m");
        addToCartPage.setColor("blue");
        addToCartPage.enterQuantity("2");
        addToCartPage.clickOnAddToCart();
        addToCartPage.clickOnCheckout();
        orderPage.SignInAndProceed(Username, Password);
        paymentPage.OrderPaymentAndConfirm();
        String actualMessage = orderConfirmationPage.validateConfirmMessage();
        String expectedMessage = "Thank you for your purchase!";
        Assert.assertEquals(expectedMessage, actualMessage);
    }
}
