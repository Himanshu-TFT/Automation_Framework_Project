package TestCase;

import org.testng.Assert;
import org.testng.annotations.Test;
import project.PageEvents.IndexPage;
import project.base.BaseClass;

public class IndexPageTest extends BaseClass {
    IndexPage indexPage;

    @Test
    public void verifyLogo(){
        indexPage = new IndexPage(driver);
        boolean result =indexPage.validateLogo();
        Assert.assertTrue(result);
    }

    @Test
    public void verifyTitle(){
        indexPage = new IndexPage(driver);
        String expectedTitle = "Home Page";
        String actualTitle=indexPage.getMyStoreTitle();
        Assert.assertEquals(actualTitle,expectedTitle);
    }
}
