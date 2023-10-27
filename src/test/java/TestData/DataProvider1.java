package TestData;

import org.testng.annotations.DataProvider;

public class DataProvider1 {

    @DataProvider(name = "productDataProvider")
    public Object[][] productDataProvider() {
        return new Object[][]{
                {"Small", "Red", 1},
                {"Medium", "Blue", 2},
                {"Large", "Green", 3}
        };
    }
}
