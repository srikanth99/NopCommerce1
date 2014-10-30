Feature: GiftCard

  As a Consumer
  I want to use gift card
  so that amount is deducted

  @giftcard
  Scenario: Consumer adding gift card

    Given Consumer is in shopping cart page
    When Consumer enters gift card code
    Then Message should be displayed










