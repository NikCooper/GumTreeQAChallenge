package gumtree;

import org.openqa.selenium.WebDriver;

public interface AutomatedBrowser {

    WebDriver getWebDriver();

    void setWebDriver(WebDriver webDriver);

    void init();

    void destroy();

    void goTo(String url);

    void clickElementWithId(String id);

    void selectOptionByTextFromSelectWithId(String optionText, String id);

    void populateElementWithId(String id, String text);

    void clearTextElementWithId(String id);

    String getTextFromElementWithId(String id);

    void clickElementWithCSS(String css);

    void clickElementWithXPath(String xpath);

    String getTextFromElementWithCSS(String css);
}
