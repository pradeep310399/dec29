Feature: Edit opportunities in salesforce
Scenario: Test with positive credentials
Given Open the browser
And Load the url as 'https://login.salesforce.com'
And Enter the username as 'earth@testleaf.com'
And Enter the password as 'Bootcamp@123'
When Click the login button
When Click the toggle button
When Click the view all button
When Click the  Sales option
When Click the opportunities tab
When Search the name in search bar
When Click the dropdown
When Click the edit option
Given Edit the date
And Edit the analysis
And Enter the delivery status
And Enter the description
When Click the savebutton
Then Verify the perception analysis 
