Feature: Create opportunities in the salesforce
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
When Click the New button
And Enter the opportunity name
And Enter the date
When Click the stage bar
When Click the need analysis
When Click the save button
Then Verify the Create opportunities  page
