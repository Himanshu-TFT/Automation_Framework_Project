package TestCase;

import org.testng.Assert;
import org.testng.annotations.Test;
import project.PageEvents.IndexPage;
import project.PageEvents.SearchResultPage;
import project.base.BaseClass;

public class SearchResultPageTest extends BaseClass {

    IndexPage indexPage;

    SearchResultPage searchResultPage;

    @Test
    public void productAvailabilityTest(){
        indexPage= new IndexPage(driver);
        searchResultPage= new SearchResultPage(driver);
        indexPage.searchProduct("t-shirt");
        boolean result = searchResultPage.isProductAvailable();
        Assert.assertTrue(result);
    }

}
