Feature: Harry Potter search in Amazon UK

  Scenario: TC01 - Search for Harry Potter and the Cursed Child in Books section

    Given I start the browser
    When I navigate to home page
    And I navigate to Book section
    And I search for Harry Potter and the Cursed Child - Parts One and Two
    Then I verify the first search result:
      | Title | Harry Potter and the Cursed Child - Parts One and Two |
      | Badge | true |
      | Type | Paperback |
      | Price | £4.00 |
    When I navigate to the book details
    Then I verify the book details page:
      | Title | Harry Potter and the Cursed Child - Parts One and Two |
      | Badge | true |
      | Type | Paperback |
      | Price | £4.00 |
    When I add the book to the basket
    Then I verify that the notification is shown with title Added to Basket and there is 1 item in the basket
    When I select Go to basket button
    Then I verify the book in the Shopping Basket list:
      | Title | Harry Potter and the Cursed Child - Parts One and Two |
      | Type | Paperback |
      | Price | £4.00 |
      | Quantity | 1 |
      | Total price | £4.00 |
    And I stop the browser