# GumTreeQAChallenge

This is a fairly straightforward automation framework set up in intelliJ using maven. 

The framework includes a test page separate from the functions so that these may only need to be updated once if needed.
There is a interface class which serves as the base of the automation functions. The AutomatedBrowserBase implements this interface to form the functions and then 'decorators' are created for the webdriver commands which are directly called in the test. 

Please import the pom.xml file when initiating the project. 

The only setup needed is to specify the location of the chromedriver and/or the firefox driver. This can be found in the pom.xml -> plugins -> systemPropertyVariables and update accordingly. 

Please note the action taken in the questionnaire stated to send a message but due to the login barrier I have made a few differences. 
The actions in order are:
- Open url
- Clear text from message box 
- Enter custom message
- Select button to send
- Login window pops up
- Enter username and password (not real credentials)
- Close this box and navigate to homepage 
- Verify an element is available on the homepage
- Close browser
