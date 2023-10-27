package TestCase;

import org.testng.Assert;
import org.testng.annotations.Test;
import project.PageEvents.AddToCartPage;
import project.PageEvents.IndexPage;
import project.PageEvents.SearchResultPage;
import project.base.BaseClass;

public class AddToCartPageTest extends BaseClass {
    IndexPage indexPage;
    SearchResultPage searchResultPage;

    AddToCartPage addToCartPage;

    @Test
    public void addToCartTest(){
        indexPage= new IndexPage();
        searchResultPage=indexPage.searchProduct("t-shirt");
        addToCartPage=searchResultPage.clickProduct();
        addToCartPage.setSize();
        addToCartPage.setColor();
        addToCartPage.enterQuantity("2");
        addToCartPage.clickOnAddToCart();
        boolean result = addToCartPage.validateAddToCart();
        Assert.assertTrue(result);
    }
}
