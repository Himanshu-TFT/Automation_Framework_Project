package project.base;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.*;
import project.Utilities.Constants;
import project.Utilities.Grid;
import project.Utilities.PropertiesFile;
import project.Utilities.ReusableActions.ActionDriver.Action;

import java.io.File;
import java.lang.reflect.Method;
import java.net.MalformedURLException;
import java.time.Duration;

public class BaseClass {

    public static WebDriver driver;
//    public ExtentSparkReporter sparkReporter;
//    public ExtentReports extent;
//    public ExtentTest logger;

    public PropertiesFile prop=new PropertiesFile();
    public String URL = prop.getURL();
    public String Username= prop.getUserName();
    public String Password= prop.getPassword();



    @BeforeTest
    public void beforeTestMethod() {
//        sparkReporter = new ExtentSparkReporter(System.getProperty("user.dir") + File.separator + "reports" + File.separator + "ExtentReport.html");
//        extent = new ExtentReports();
//        extent.attachReporter(sparkReporter);
//        sparkReporter.config().setTheme(Theme.STANDARD);
//        extent.setSystemInfo("HostName", "Himanshu's LocalMachine");
//        extent.setSystemInfo("UserName", "Himanshu");
//        sparkReporter.config().setDocumentTitle("Automation Report");
//        sparkReporter.config().setReportName("Automation Tests Results by Himanshu");
    }

    @BeforeMethod
    @Parameters("browser")
    public void beforeMethod(String browser, Method testMethod) throws MalformedURLException {
//        logger = extent.createTest(testMethod.getName());

        driver = Grid.initializeBrowser(browser);
        Action.implicitWait(driver, 10);
        driver.manage().window().maximize();
        driver.get(URL);

    }

    @AfterMethod
    public void afterMethod(ITestResult result) throws Exception {
//        if (result.getStatus() == ITestResult.FAILURE) {
//            logger.log(Status.FAIL, MarkupHelper.createLabel(result.getName() + " - Test Case Failed", ExtentColor.RED));
//            logger.log(Status.FAIL, MarkupHelper.createLabel(result.getThrowable() + " - Test Case Failed", ExtentColor.RED));
//        } else if (result.getStatus() == ITestResult.SKIP) {
//            logger.log(Status.SKIP, MarkupHelper.createLabel(result.getName() + " - Test Case Skipped", ExtentColor.ORANGE));
//        } else if (result.getStatus() == ITestResult.SUCCESS) {
//            logger.log(Status.PASS, MarkupHelper.createLabel(result.getName() + " Test Case PASSED", ExtentColor.GREEN));
//        }
        driver.quit();
    }

    @AfterTest
    public void afterTest() {

//        extent.flush();
    }

}
