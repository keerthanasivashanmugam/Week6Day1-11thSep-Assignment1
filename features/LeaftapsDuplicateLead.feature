Feature: Dupliacte Leads functionality check in LeafTaps application
Scenario Outline: TC006_Creating Duplicate leads for positive functionality test 

Given Click on 'Find Leads'
And Click on Phone tab and enter the <PhoneNumber>
And Click on Find Leads button and select the first row value
When Click on Submit
Then Verify the Portlet name

Examples:
|PhoneNumber|
|'99'|
|'98'|
