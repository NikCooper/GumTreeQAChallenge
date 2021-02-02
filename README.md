# GumTreeQAChallenge

This is a fairly straightforward automation framework set up in intelliJ using maven. 

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
