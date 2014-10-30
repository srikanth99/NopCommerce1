Feature: Shopping Cart

  As a Consumer
  I want to buy books
  So that shopping cart is updated with list of Items



    @Items
    Scenario Outline: logging into nopCommerce

      Given Consumer is in login page
      When Consumer enters user id as"roopaworld@yahoo.com"
      And Consumer enters password as"roopakris"
      And Consumer Selects login option
      Then Message should be displayed






       Given Consumer is in home page
       When Consumer selects '<book>'
       And Selects '<laptop>'
       Then Book and laptop should be in shopping cart

     Examples:
       |book|laptop|
       |CHERRY BOOK|Liju's Laptop|