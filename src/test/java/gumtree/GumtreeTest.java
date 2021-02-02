package gumtree;

import org.junit.Test;
import static org.junit.Assert.*;

public class GumtreeTest {

    private static final AutomatedBrowserFactory AUTOMATED_BROWSER_FACTORY
            = new AutomatedBrowserFactory();

    @Test
    public void gumtreeTest() {
        final AutomatedBrowser automatedBrowser = AUTOMATED_BROWSER_FACTORY.getAutomatedBrowser("Chrome");
        try
        {
            automatedBrowser.init();
            automatedBrowser.goTo("https://www.gumtree.com.au/s-ad/1266454340");
            automatedBrowser.clearTextElementWithId("input-reply-widget-form-message");
            assertEquals("Sign in to message", automatedBrowser.getTextFromElementWithId("contact-seller-button"));
            String message = " Hey I’m interested in this item. Could you share what’s the colour of the bag please?";
            automatedBrowser.populateElementWithId("input-reply-widget-form-message", message);
            automatedBrowser.clickElementWithId("contact-seller-button");
            automatedBrowser.populateElementWithId("input-gumtree-sign-in-email-field", "email");
            automatedBrowser.populateElementWithId("input-gumtree-sign-in-password-field", "password");
            automatedBrowser.clickElementWithCSS("span[class*='icon-close']");
            automatedBrowser.clickElementWithCSS("img[class*='header-lower-deck__logo']");
            assertEquals("Post an ad", automatedBrowser.getTextFromElementWithCSS("a[class*='header__post-ad-button']"));
        }
        finally
        {
            automatedBrowser.destroy();
        }

    }
}
