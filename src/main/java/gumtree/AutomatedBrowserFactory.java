package gumtree;

import gumtree.decorators.ChromeDecorator;
import gumtree.decorators.FirefoxDecorator;
import gumtree.decorators.WebDriverDecorator;

public class AutomatedBrowserFactory {
    public AutomatedBrowser getAutomatedBrowser(final String browser) {

        if ("Chrome".equalsIgnoreCase(browser)) {
            return getChromeBrowser();
        }

        if ("Firefox".equalsIgnoreCase(browser)) {
            return getFirefoxBrowser();
        }

        throw new IllegalArgumentException("Unknown browser " + browser);

    }

    private AutomatedBrowser getChromeBrowser() {
        return new ChromeDecorator(
                new WebDriverDecorator()
        );
    }

    private AutomatedBrowser getFirefoxBrowser() {
        return new FirefoxDecorator(
                new WebDriverDecorator()
        );
    }


}
