Feature: Creating Leads functionality check in LeafTaps application
Scenario Outline: TC001_Creating multiple leads for positive functionality test
Given Click on 'Create Lead' link
And Enter the Company name as <CompanyName>
And Enter the First name as <FirstName>
And Enter the Last name as <LastName>
And Enter the Phone number as <PhoneNumber>
When Click on 'Create Lead' button
Then Verify the 'Port let' Name is displayed 

Examples:
|CompanyName|FirstName|LastName|PhoneNumber|
|'TestLeaf'|'Hari'|'R'|'99'|
|'TestLeaf'|'Sheriba'|'T'|'98'|
|'TestLeaf'|'Vidya'|'B'|'97'|

Scenario: TC001_Creating lead without any data for negative functionality test
Given Click on 'Create Lead' link
When Click on 'Create Lead' button
But Should display error message

 
