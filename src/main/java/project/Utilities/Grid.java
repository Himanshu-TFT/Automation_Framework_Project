package project.Utilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import java.net.MalformedURLException;
import java.net.URL;

public class Grid {
    public static WebDriver initializeBrowser(String browserName) throws MalformedURLException {
        WebDriver driver;
        DesiredCapabilities dc =new DesiredCapabilities();

        switch (browserName) {
            case "firefox":
                dc.setBrowserName("firefox");
                break;
            case "edge":
                dc.setBrowserName("MicrosoftEdge");
                break;
            case "ie":
                dc.setBrowserName("internet explorer");
                break;
            case "opera":
                dc.setBrowserName("opera");
                break;
            case "safari":
                dc.setBrowserName("safari");
                break;
            default:
                dc.setBrowserName("chrome");
                break;
        }

        driver = new RemoteWebDriver(new URL("http://localhost:4444"),dc);

        return driver;
    }
}
