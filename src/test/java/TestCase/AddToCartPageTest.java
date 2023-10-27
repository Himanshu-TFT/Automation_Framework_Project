package TestCase;

import TestData.DataProvider1;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import project.PageEvents.AddToCartPage;
import project.PageEvents.IndexPage;
import project.PageEvents.SearchResultPage;
import project.base.BaseClass;

public class AddToCartPageTest extends BaseClass {
    IndexPage indexPage;
    SearchResultPage searchResultPage;
    AddToCartPage addToCartPage;

//    @Test(dataProviderClass = DataProvider1.class , dataProvider = "productDataProvider")
    @Test
    public void addToCartTest(){
        indexPage= new IndexPage(driver);
        searchResultPage = new SearchResultPage(driver);
        addToCartPage = new AddToCartPage(driver);
        indexPage.searchProduct("t-shirt");
        searchResultPage.clickProduct();
        addToCartPage.setSize("m");
        addToCartPage.setColor("blue");
        addToCartPage.enterQuantity("3");
        addToCartPage.clickOnAddToCart();
        boolean result = addToCartPage.validateAddToCart();
        Assert.assertTrue(result);
    }
}
