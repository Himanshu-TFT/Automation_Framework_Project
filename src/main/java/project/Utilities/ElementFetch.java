package project.Utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

import static project.base.BaseTest.driver;


public class ElementFetch {


    public WebElement getWebElement(String identifierType, String identifierValue) {
        switch (identifierType) {
            case "XPATH":
                return driver.findElement(By.xpath(identifierValue));

            case "CSS":
                return driver.findElement(By.cssSelector(identifierValue));

            case "ID":
                return driver.findElement(By.id(identifierValue));

            case "NAME":
                return driver.findElement(By.name(identifierValue));

            case "TAGNAME":
                return driver.findElement(By.tagName(identifierValue));

                case "CLASSNAME":
                    return driver.findElement(By.className(identifierValue));

            case "LINKTEXT":
                        return driver.findElement(By.linkText(identifierValue));
            case "PARTIALLINKTEXT":
                return driver.findElement(By.partialLinkText(identifierValue));

            default:
                return null;
        }
    }

    public List<WebElement> getWebElements (String identifierType, String identifierValue){
        switch (identifierType) {
            case "XPATH":
                return driver.findElements(By.xpath(identifierValue));

            case "CSS":
                return driver.findElements(By.cssSelector(identifierValue));

            case "ID":
                return driver.findElements(By.id(identifierValue));

            case "NAME":
                return driver.findElements(By.name(identifierValue));

            case "TAGNAME":
                return driver.findElements(By.tagName(identifierValue));

            case "CLASSNAME":
                return driver.findElements(By.className(identifierValue));

            case "LINKTEXT":
                return driver.findElements(By.linkText(identifierValue));
            case "PARTIALLINKTEXT":
                return driver.findElements(By.partialLinkText(identifierValue));

            default:
                return null;
        }
    }
}
