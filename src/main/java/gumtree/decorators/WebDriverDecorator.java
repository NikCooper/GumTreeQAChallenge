package gumtree.decorators;

import gumtree.AutomatedBrowser;
import gumtree.decoratorbase.AutomatedBrowserBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;

public class WebDriverDecorator extends AutomatedBrowserBase {

    private WebDriver webDriver;

    public WebDriverDecorator() {

    }

    public WebDriverDecorator(final AutomatedBrowser automatedBrowser) {
        super(automatedBrowser);
    }

    @Override
    public WebDriver getWebDriver() {
        return webDriver;
    }

    @Override
    public void setWebDriver(final WebDriver webDriver) {
        this.webDriver = webDriver;
    }

    @Override
    public void destroy() {
        if (webDriver != null) {
            webDriver.quit();
        }
    }

    @Override
    public void goTo(final String url) {
        webDriver.get(url);
    }

    @Override
    public void clickElementWithId(final String id) {
        webDriver.findElement(By.id(id)).click();
    }

    @Override
    public String getTextFromElementWithId(final String id) {
        return webDriver.findElement(By.id(id)).getText();
    }

    @Override
    public void populateElementWithId(String id, String text) {
        webDriver.findElement(By.id(id)).sendKeys(text);
    }

    @Override
    public void clearTextElementWithId(String id) {
        webDriver.findElement(By.id(id)).clear();
    }

    @Override
    public void clickElementWithCSS(String css) {
        webDriver.findElement(By.cssSelector(css)).click();
    }

    @Override
    public void clickElementWithXPath(String xpath) {
        webDriver.findElement(By.xpath(xpath)).click();
    }

    @Override
    public String getTextFromElementWithCSS(final String css) {
        return webDriver.findElement(By.cssSelector(css)).getText();
    }
}