Feature: This is Adactin Login page

  Scenario Outline: This is login scenario
    Given user goes to login page
    When User enters correct "<username>"  and "<password>"
    And Clicks the login button
    And Select the "<Location>"
    And we can Select the "<Hotels>"
    And we  Select the "<RoomType>"
    And we can  Select the "<NoOfRooms>"
    And we  can Select the "<Adults Room>"
    And we want to select "<ChildrensRoom>"
    And Click the Search Btn
    And Select the hotel button
    And Click the Continue button
    And Enter the "<First Name>" and "<Last Name>"
    And User Enter the address "<Billing Address>"
    And User Enter credit number  "<Credit card Number>"
    And Select the credit card  "<Credit Card Type>"
    And user enter the expiry month and year"<Expiry Month>" and "<Year>"
    And User Enter the cvv "<Cvv Number>"
    And User wants to click the book button
    And click My iternary Page
    And click the check box
    And Cancel the booking
    And Handle the alert
   
   
    Examples: 
      | username     | password      | Location | Hotels        | RoomType     | NoOfRooms | Adults Room | ChildrensRoom | First Name | Billing Address | Expiry Month | Year | Last Name | Credit card Number | Credit Card Type | Cvv Number |
      | surendhar123 | Surendhar@007 | Adelaide | Hotel Cornice | Super Deluxe |         4 |           3 |             2 | Hari       | 356,chennai     |            4 | 2015 | Raveen    |   1234567890123458 | MAST             |        567 |
