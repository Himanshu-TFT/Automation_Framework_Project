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
        indexPage = new IndexPage();
        searchResultPage = indexPage.searchProduct("t-shirt");
        addToCartPage = searchResultPage.clickProduct();
        addToCartPage.setSize();
        addToCartPage.setColor();
        addToCartPage.enterQuantity("2");
        addToCartPage.clickOnAddToCart();
        orderPage = addToCartPage.clickOnCheckout();
        paymentPage = orderPage.SignInAndProceed(orderPage.Username, orderPage.Password);
        orderConfirmationPage = paymentPage.OrderPaymentAndConfirm();
        String actualMessage = orderConfirmationPage.validateConfirmMessage();
        String expectedMessage = "Thank you for your purchase!";
        Assert.assertEquals(expectedMessage, actualMessage);
    }
}
