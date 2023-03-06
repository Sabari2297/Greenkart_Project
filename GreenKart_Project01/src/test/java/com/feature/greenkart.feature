Feature: Online shopping demo site

Scenario: User buy some vegetables

Given User launch the url
When User search the vegetables
And User click the add to cart button
And User click the items button
And User click the proceed to checkout button
Then User see the next page

Scenario: User place the order

When User enter the promo code
And User click the apply button
And user click the place order button

Scenario: Last page

When User Select a Country
And User click a agree button
And User click the proceed button



