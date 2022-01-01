Feature: One Dimension Test
Scenario: One Dimension

Given Browser launch
When Page title matches
Then Enter the Login details
|Name|Mail|Password|Phone|
|Mani|Rajan|mnrajan|909090909090|
|Mani1|Rajan1|mnrajan1|909090909091|
|Mani2|Rajan2|mnrajan2|909090909092|
Then Close the browser